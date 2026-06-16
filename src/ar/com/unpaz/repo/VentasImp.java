package ar.com.unpaz.repo;

import java.util.HashMap;
import java.util.List;

import ar.com.unpaz.model.Venta;
import ar.com.unpaz.service.IServiceVenta;

public class VentasImp implements IServiceVenta{

	LeerArchivo lectura = new LeerArchivo();
	HashMap<Integer,Venta> mapa = lectura.Lectura();
	
	@Override
	public double recaudacionTotal() {
		double total = mapa.values().stream().mapToDouble(a -> a.PrecioFinal()).sum();
		
		return total;
		
	}

	@Override
	public void mostrarTodasLasVentas() {
		for(Venta c: mapa.values()) {
			System.out.println(c);
			System.out.println(c.PrecioFinal());
		}
	}

	@Override
	public void buscarVenta(int id) {
		for(Venta c : mapa.values()) {
			if(c.getCodigo() == id) {
				System.out.println(c);
				return;
			} 
		} 
		
	}

	@Override
	public double ventaMayorImporte() {
		double total = mapa.values().stream().mapToDouble(a -> a.PrecioFinal()).max().orElse(0.0);

		return total;
	}

	@Override
	public double promedioVentaSimple() {
		double promedio = mapa.values().stream().filter(a -> a.getTipo().equals("S")).mapToDouble(a -> a.PrecioFinal()).average().orElse(0.0);

		return promedio;
	}

	@Override
	public void clientesPremium() {
		List<String> lista = mapa.values().stream().filter(a -> a.getTipo().equals("P")).map(a -> a.getCliente()).toList();
		
		lista.forEach(a -> System.out.println(a));
	}

	@Override
	public double cantidadProductosVendidos() {
		double productos = mapa.values().stream().mapToDouble(a -> a.getCantidad()).sum();
		
		return productos;
	}

}
