package ar.com.unpaz.inicio;

import java.util.Scanner;

import ar.com.unpaz.repo.VentasImp;
import ar.com.unpaz.service.IServiceVenta;

public class Inicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        IServiceVenta servicio = new VentasImp();

        int opcion;

        do {
            System.out.println(" INICIANDO SISTEMA DE VENTAS ");
            System.out.println("1 Mostrar todas las ventas");
            System.out.println("2 Buscar venta por código");
            System.out.println("3 Recaudación total");
            System.out.println("4 Venta con mayor importe");
            System.out.println("5 Promedio ventas simples");
            System.out.println("6 Clientes premium");
            System.out.println("7 Cantidad de productos vendidos");
            System.out.println("8 Salir");
            System.out.print("Elegir opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    servicio.mostrarTodasLasVentas();
                    break;

                case 2:
                    System.out.print("Ingrese código de venta: ");
                    int id = scanner.nextInt();
                    servicio.buscarVenta(id);
                    break;

                case 3:
                    System.out.println("Recaudación total: $" + servicio.recaudacionTotal());
                    break;

                case 4:
                    System.out.println("Mayor importe: $" + servicio.ventaMayorImporte());
                    break;

                case 5:
                    System.out.println("Promedio ventas simples: $" + servicio.promedioVentaSimple());
                    break;

                case 6:
                    System.out.println("Clientes premium:");
                    servicio.clientesPremium();
                    break;

                case 7:
                    System.out.println("Cantidad de productos vendidos: " + servicio.cantidadProductosVendidos());
                    break;

                case 8:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 8);

        scanner.close();
    }
}