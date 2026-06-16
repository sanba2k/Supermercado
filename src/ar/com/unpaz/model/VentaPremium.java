package ar.com.unpaz.model;

public class VentaPremium extends Venta {

	private double costoEnvio;
	
	public VentaPremium(String tipo, int codigo, String cliente, String producto, double cantidad,
			double precioUnitario, double costoEnvio) {
		super(tipo, codigo, cliente, producto, cantidad, precioUnitario);
		this.costoEnvio= costoEnvio;
	}

	@Override
	public double PrecioFinal() {
		double totalSimple = getCantidad() * getPrecioUnitario();
		double totalPremium = totalSimple + getCostoEnvio();
		
		return totalPremium;
	}
	
	
	public double getCostoEnvio() {
		return costoEnvio;
	}

	public void setCostoEnvio(double costoEnvio) {
		this.costoEnvio = costoEnvio;
	}

	
}
