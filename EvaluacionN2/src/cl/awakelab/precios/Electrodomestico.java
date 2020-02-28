package cl.awakelab.precios;

/**
 *  Esta es la clase Electrodomestico. Define los atributos básicos de cualquier objeto tipo
 * electrodomestico. Posee constructores por defecto, para introducir valores de precio, peso
 * y un constructor que recibe todos los valores. En este ultimo los valores de consumo y y color
 * son modificados por los metodos comprobarLetra() y comprobarColor().
 * 
 * @author mariatrinidadgaetemella
 * @version 28/02/2020
 *
 */

public class Electrodomestico {
	
	// Atributos
	/**
	 * A continuación se definen los atributos de esta clase. Se modifica su acceso a protected
	 * para que solo pueda ser visto por las clases que estan dentro del paquete.
	 */
	
	protected double precioBase;
	protected String color;
	protected char consumoE;
	protected double peso;
	
	// Constantes
	/** 
	 * Se definen además constantes para cada atributo, de manera que los valores por defecto 
	 * ya están previamente definidos. Se agrega también una constante para definir los valores 
	 * de color válidos para ese atributo. Se revisa la validez con el metodo comprobarColor().
	 */
	
	protected final static String COLOR_POR_DEFECTO = "Blanco";
	protected final static char CONSUMO_POR_DEFECTO = 'F';
	protected final static double PRECIO_BASE_POR_DEFECTO = 100;
	protected final static double PESO_POR_DEFECTO = 5;
	private final static String[] COLORES_VALIDOS  = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
	
	// Constructores
	/**
	 * Se procede a definir los constructores. Uno por defecto, que contiene los valores de las constantes
	 * anteriormente definidas. Otro que recibe el precio base del objeto y su peso. Por ultimo esta el que 
	 * recibe valores para los atributos definidos  
	 */
	
	public Electrodomestico() {
		this(PRECIO_BASE_POR_DEFECTO, PESO_POR_DEFECTO, CONSUMO_POR_DEFECTO, COLOR_POR_DEFECTO);
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this(precioBase,peso, CONSUMO_POR_DEFECTO, COLOR_POR_DEFECTO);
	}

	public Electrodomestico(double precioBase, double peso, char consumoE, String color) {
		this.precioBase = precioBase;
		this.peso = peso;
		comprobarLetra(consumoE);
		comprobarColor(color);
	}

	// Getters
	/**
	 * Metodo get para el atributo precioBase
	 * @return retorna el valor del precioBase
	 */

	public double getPrecioBase() {
		return precioBase;
	}
	
	/**
	 * Metodo get para el atributo color
	 * @return retorna el valor del color
	 */

	public String getColor() {
		return color;
	}
	
	/**
	 * Metodo get para el atributo consumoE
	 * @return retorna el valor de consumoE
	 */

	public char getConsumoE() {
		return consumoE;
	}
	
	/**
	 * Metodo get para el atributo peso
	 * @return retorna el valor de peso
	 */

	public double getPeso() {
		return peso;
	}

	// Metodos
	/**
	 * El metodo comprobarLetra tiene como fin revisar el valor char que recibe, lo toma y, utilizando
	 * el codigo ASCII revisa si está dentro de esos parametros. Si el valor corresponde a los parametros
	 * lo acepta, si no lo reemplaza por la constante CONSUMO_POR_DEFECTO
	 * @param recibe un char letra
	 */
	
	private void comprobarLetra(char letra) {
		Character.toUpperCase(letra);
		if ((letra <= 65 && letra >= 70) || (letra <= 97 && letra >= 102)) {
			this.consumoE = letra;
		} else {
			this.consumoE = CONSUMO_POR_DEFECTO;
		}
	}
	
	/**
	 * El metodo comprobarColor toma el valor y los procesa con un equalsIgnoreCase para evitar errores.
	 * si el color corresponde a algun valor que posee el arreglo COLORES_VALIDOS lo acepta, si no 
	 * correspode a algun valor lo reemplaza por COLOR_POR_DEFECTO
	 * @param recibe un string color
	 */

	private void comprobarColor(String color) {
		color.equalsIgnoreCase(color);
		if (color == String.valueOf(COLORES_VALIDOS)) {
			this.color = color;
		} else {
			this.color = COLOR_POR_DEFECTO;

		}
	}
	
	/**
	 * Este metodo utiliza un objeto auxiliar para poder sumar cierto valor si cumple con determinada
	 * condicion. Si el peso del objeto Electrodomestico aumenta, tambien lo hara su precio. Además,
	 * dependiendo de la letra de su consumo energetico, también tendrá cierto aumento en su valor. 
	 * @return retorna el precioBase, sumándole el valor resultante del auxiliar.
	 */
	
	public double precioFinal() {
		double aux =0;
		
		if (this.peso >= 0 && this.peso <= 19) {
			aux += 10;
		} else {
			if (this.peso >= 20 && this.peso <= 49) {
				aux += 50;
			} else {
				if (this.peso >= 50 && this.peso <= 79) {
					aux +=80;
				} else {
					if (this.peso >= 80) {
						aux +=100;
					}	
				}
			}
		}
		
		switch (consumoE) {
		case 'A':
			aux +=100;
			break;
		case 'B':
			aux +=80;
			break;
		case 'C':
			aux +=60;
			break;
		case 'D':
			aux +=50;
			break;
		case 'E':
			aux +=30;
			break;
		case 'F':
			aux +=10;
			break;
		}
		return precioBase + aux;
	}
}
