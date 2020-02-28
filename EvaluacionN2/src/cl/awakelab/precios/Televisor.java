package cl.awakelab.precios;
/**
 *  Esta es la clase Televisor que hereda de la clase Electrodomestico. Se le asignan los atributos
 * pulgadas y sintonizador, además de los que hereda de la clase padre. Se crean constantes para asignar
 * un valor por defecto a los atributos de esta clase. Se declaran sus constructores, su metodo get y
 * el metodo que modifica el precio final del objeto de esta clase.
 * 
 * @author mariatrinidadgaetemella
 * @version 28/02/2020
 * 
 */

public class Televisor extends Electrodomestico {
	
	//Atributos
	/**
	 * Se definen los atributos propios de esta clase.
	 */
	
	private double pulgadas;
	private boolean sintonizador;
	
	//Constantes
	/**
	 * Se crean constantes para asignar un valor por defecto a los atributos de esta clase.
	 */
	
	private final static double PULGADAS_POR_DEFECTO = 20;
	private final static boolean SINTONIZADOR_TDT = false;
	
	//Constructores
	/**
	 * Se crean los contructores: uno por defecto,otro que recibe los parametros de precioBase y peso,
	 * y un constructor que recibe los parametros heredados de la clase padre.
	 */
		
	public Televisor() {
		this(PRECIO_BASE_POR_DEFECTO, PESO_POR_DEFECTO, CONSUMO_POR_DEFECTO,
				COLOR_POR_DEFECTO, PULGADAS_POR_DEFECTO, SINTONIZADOR_TDT);
	}
	
	public Televisor(double precioBase, double peso) {
		this(precioBase, peso, CONSUMO_POR_DEFECTO, COLOR_POR_DEFECTO,
				PULGADAS_POR_DEFECTO, SINTONIZADOR_TDT);
	}
	
	public Televisor(double precioBase, double peso, char consumoE, String color,
			double pulgadas, boolean sintonizador) {
		super(precioBase, peso, consumoE, color);
		this.pulgadas = pulgadas;
		this.sintonizador = sintonizador;	
	}
	
	//Getters
	/**
	 * Este es el metodo get para el atributo pulgadas.
	 * @return retorna el valor de la variable pulgadas.
	 */

	public double getPulgadas() {
		return pulgadas;
	}
	/**
	 * Este es el metodo get para el atributo sintonizador.
	 * @return retorna el valor de la variable booleana sintonizador.
	 */

	public boolean isSintonizador() {
		return sintonizador;
	}
	
	//Metodos
	/**
	 * Se crea el metodo precioFinal() para esta clase. Cumple la mision de modificar el precio
	 * de un objeto de esta clase, tomando el metodo precioFinal() de la clase padre. El precio 
	 * se modifica si el objeto supera las 40 pulgadas y si posee un sintonizador. 
	 * @return Retorna el precio modificado del metodo padre.
	 */
	
	public double precioFinal() {
		double precioTelevisor = super.precioFinal();
		
		if (this.pulgadas > 40) {
			precioTelevisor =+ precioBase * 0.3;
		}
		if (sintonizador) {
			precioTelevisor =+ 50;
		} 
		return precioTelevisor;
	}
	
}
