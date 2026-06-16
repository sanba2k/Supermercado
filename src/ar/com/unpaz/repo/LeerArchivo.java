package ar.com.unpaz.repo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

import ar.com.unpaz.model.Venta;
import ar.com.unpaz.model.VentaPremium;
import ar.com.unpaz.model.VentaSimple;
import ar.com.unpaz.service.IServiceLeerArchivo;

public class LeerArchivo implements IServiceLeerArchivo{

	@Override
	public HashMap<Integer, Venta> Lectura() {
		
		HashMap<Integer, Venta> mapa = new HashMap<Integer, Venta>();
		
		File sfile = new File("src/ventas.txt");
	try {
		FileReader fiRe = new FileReader(sfile);
		BufferedReader buffer= new BufferedReader(fiRe);
		String linea = "";
		while((linea = buffer.readLine()) != null) {
			String [] array = linea.split(";");
			String tipo = array[0];
			int codigo = Integer.parseInt(array[1]);
			String cliente = array[2];
			String producto = array[3];
			double cantidad = Double.parseDouble(array[4]);
			double precioUnitario = Double.parseDouble(array[5]);
			
			switch(tipo) {
			case "S":
				VentaSimple simple = new VentaSimple(tipo, codigo, cliente, producto, cantidad, precioUnitario);
				mapa.put(codigo, simple);
				break;
				
			case "P":
				double costoEnvio = Double.parseDouble(array[6]);
				VentaPremium premium= new VentaPremium(tipo, codigo, cliente, producto, cantidad, precioUnitario, costoEnvio);
				mapa.put(codigo, premium);
				break;
				
			
			}
			
		}
		
	} 
		catch(Exception e) 
	{e.printStackTrace();}
		
		
		return mapa;
	}

}
