package ar.com.unpaz.model;

public class VentaSimple extends Venta{

	public VentaSimple(String tipo, int codigo, String cliente, String producto, double cantidad,
			double precioUnitario) {
		super(tipo, codigo, cliente, producto, cantidad, precioUnitario);
		
	}

	@Override
	public double PrecioFinal() {
		double total = getCantidad() * getPrecioUnitario(); 
		
		return total;
	}

}
