package ar.com.unpaz.model;

public abstract class Venta {
	// Tipo Código de venta Nombre del cliente Cantidad de productos Precio unitario
	
	private String tipo;
	private int codigo;
	private String cliente;
	private String producto;
	private double cantidad;
	private double precioUnitario;
	
	public Venta (String tipo, int codigo, String cliente,String producto, double cantidad, double precioUnitario) {
		this.tipo = tipo;
		this.codigo = codigo;
		this.cliente = cliente;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		
	}
	
	public abstract double PrecioFinal();
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}




	@Override
	public String toString() {
		return "Venta [tipo=" + tipo + ", codigo=" + codigo + ", cliente=" + cliente + ", producto=" + producto
				+ ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + "]";
	}





	
	
	
}
