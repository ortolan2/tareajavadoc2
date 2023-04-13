package figuras;

import java.awt.Color;
/**
 * esta es una clase para almacenar informacion de un cuadrado que hereda de rectangulo
 * @author ALUMNO
 * @version 1.0
 */

public class Cuadrado extends Rectangulo{
	/**
	 * 
	 * @param x : donde va a estar centrado el cuadrado respecto a x
	 * @param y : donde va a estar centrado el cuadrado respecto a y
	 * @param color : color del cuadrado
	 * @param lado : valor del lador del cuadrado
	 */

public Cuadrado (double x, double y, Color color, double lado){
super (x, y, color, lado, lado);
}
}
