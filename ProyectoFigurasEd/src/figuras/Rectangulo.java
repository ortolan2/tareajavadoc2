package figuras;

import java.awt.Color;
/**
 * esta es una clase para almacenar informacion de un rectangulo que hereda de figura
 * @author ALUMNO
 * @version 1.0
 */

public class Rectangulo extends Figura{
	
	/* variable que almacena el valor de la base*/
private double base;
	/* variable que almacena el valor de la altura*/
private double altura;
	/**
	 * constructor de la clase
	 * @param x : donde va a estar centrado el cuadrado respecto a x
	 * @param y : donde va a estar centrado el cuadrado respecto a y
	 * @param color : color del rectangulo 	
	 * @param base : valor de la base
	 * @param altura : valor de la altura
	 */

public Rectangulo (double x, double y, Color color, double base, double altura){
super (x, y, color);
this.base = base;
this.altura = altura;
}
	/**
	 * 
	 * @return the base
	 */
public double getBase(){
return base;
}
	/**
	 * 
	 * @return the altura
	 */
	
public double getAltura(){
return altura;
}
	/**
	 * 
	 * @param base the base to set
	 */

public void setBase(double base){
this.base = base;
}
	/**
	 * 
	 * @param altura the altura to set
	 */

public void setAltura(double altura){
this.altura = altura;
}
	/**
	 * funcion que  calcula el perimetro del rectangulo
	 * @return devuelve el perimetro del rectangulo
	 */

public double perimetro (){
   return 2 * base + 2 * altura;
}

	/**
	 * funcion que calcuulo el area del rectangulo
	 * @return devuelve el area del rectangulo
	 */
public double area (){ 
   return base * altura;
}
}
