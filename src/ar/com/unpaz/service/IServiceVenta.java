package ar.com.unpaz.service;

public interface IServiceVenta {

	double recaudacionTotal();
	
	void mostrarTodasLasVentas();
	
	void buscarVenta(int id);
	
	double ventaMayorImporte();
	
	double promedioVentaSimple();
	
	void clientesPremium();
	
	double cantidadProductosVendidos();
}
