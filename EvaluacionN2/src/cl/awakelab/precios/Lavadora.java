package cl.awakelab.precios;

/**
 * 
 *  Este es la clase Lavadora, que hereda de la clase padre Electrodomestico. Se agrega
 * un atributo carga (double), una constante para asignarle un valor por defecto, los constructores
 * por defecto, el que recibe parametros de precioBase, peso y el que recibe parametros de todos 
 * los atributos. Se agrega un metodo get y un metodo precioFinal, el que modifica el precioBase.
 * 
 * @author mariatrinidadgaetemella
 * @version 28/02/2020
 *
 */

public class Lavadora extends Electrodomestico {
	
	// Atributos
	/**
	 * Se define el atributo propio de esta clase
	 */
	
	private double carga;
	
	// Constantes 
	/**
	 * Se crea una constante para darle un valor por defecto al atributo carga.
	 */
	
	private final static double CARGA_POR_DEFECTO = 5;

	// Constructores
	/**
	 * Se definen 3 constructores, uno por defecto que posee los valores de las constantes previamente
	 * definidas en la clase padre y en la propia, otro que recibe los parametros de precioBase y peso
	 * y uno que recibe todos los parametros de la clase padre y ademas el valor del parametro carga.  
	 */
	
	public Lavadora() {
		this(PRECIO_BASE_POR_DEFECTO, PESO_POR_DEFECTO, CONSUMO_POR_DEFECTO, COLOR_POR_DEFECTO, CARGA_POR_DEFECTO);
	}
	
	public Lavadora(double precioBase, double peso) {
		this(precioBase, peso, CONSUMO_POR_DEFECTO, COLOR_POR_DEFECTO, CARGA_POR_DEFECTO);
	}
	
	
	public Lavadora(double precioBase, double peso, char consumoE, String color, double carga) {
		super(precioBase, peso, consumoE, color);
		this.carga = carga;
	}
	
	// Getters
	/*
	 * Se define un metodo Get para el atributo carga.
	 * @return Retorna el valor de carga.
	 */
	
	public double getCarga() {
		return carga;
	}	
	
	// Metodos
	/*
	 * Este metodo utiliza el metodo de su clase padre para establecer un valor inicial a la variable
	 * precioLavadora. En este caso, si la carga supera el valor 30 kg, su precio final aumentara unos € 50 más.
	 * @return Retorna el valor modificado de precio lavadora.
	 */
	
	public double precioFinal() {
		double precioLavadora = super.precioFinal();
		
		if (this.carga > 30) {
			precioLavadora =+ 50;
		} 
		return precioLavadora;
	}
	
}
