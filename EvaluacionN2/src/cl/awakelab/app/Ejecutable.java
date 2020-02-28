package cl.awakelab.app;

import cl.awakelab.precios.*;

/**
 * 
 * Esta es la clase ejecutable del programa. Se importa el paquete que contiene la clase padre
 * y a sus hijas. El objetivo de esta clase es albergar un array de 10 pocisiones que contenga
 * objetos de la clase padre y las clases hijas (utilizando los distintos constructores que se
 * crearon previamente). Se recorre el arreglo para modificar el precio final de cada objeto y
 * se muestran los resultados segun el tipo de objeto.
 * 
 * @author mariatrinidadgaetemella
 * @version 28/02/2020
 */

public class Ejecutable {
	


	public static void main(String[] args) {
		
		/**
		 * Se crean variables de tipo double para almacenar los resultados de los precios finales
		 * por tipo de objeto. Se inicializan en 0.
		 */
		
		double sumaPrecioElectro = 0;
		double sumaPrecioTele = 0;
		double sumaPrecioLavadora = 0;
		
		Electrodomestico lista[] = new Electrodomestico[10];
		lista[0] = new Televisor(10, 40, 'b', "Purpura", 42.1, true);
		lista[1] = new Televisor();
		lista[2] = new Televisor(0, 20);
		lista[3] = new Lavadora();
		lista[4] = new Lavadora(50, 80);
		lista[5] = new Lavadora(70, 100, 'A', "Negro", 35);
		lista[6] = new Electrodomestico(); 
		lista[7] = new Electrodomestico(45, 10);
		lista[8] = new Electrodomestico(5, 3, 'C', "rojo");
		lista[9] = new Electrodomestico(13, 8, 'E', "Celeste");
		
		for (int i = 0; i < lista.length; i++) {
			
			if(lista[i] instanceof Televisor) {
				sumaPrecioTele += lista[i].precioFinal();
			}
			
			if(lista[i] instanceof Lavadora) {
				sumaPrecioLavadora += lista[i].precioFinal();
			}
			
			if(lista[i] instanceof Electrodomestico) {
				sumaPrecioElectro += lista[i].precioFinal();
			}
		 
		}
		
		System.out.println("El precio total de los televisores es: € " + sumaPrecioTele);
		System.out.println("El precio total de las lavadoras es: € " + sumaPrecioLavadora);
		System.out.println("El precio total de los etectrodomesticos es: € " + sumaPrecioElectro);
		

	}
	
	
	
}
