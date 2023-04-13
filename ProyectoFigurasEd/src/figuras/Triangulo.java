package figuras;

import java.awt.Color;

/**
 * esta es una clase que almacena informacion de un triangulo que hereda de figura
 * @author ALUMNO
 * @version 1.0
 */

public class Triangulo extends Figura{
	/* variable que almacenan el valor de cada lado del triangulo */
private double lado1;
	/* variable que almacenan el valor de cada lado del triangulo */
private double lado2;
	/* variable que almacenan el valor de cada lado del triangulo */
private double lado3;
	/**
	 * constructor de la clase
	 * @param x : donde va a estar centrado el cuadrado respecto a x
	 * @param y : donde va a estar centrado el cuadrado respecto a y
	 * @param color : informa del color del triangulo
	 * @param lado1 : informa del valor de lado1
	 * @param lado2 : infroma del valor de lado2
	 * @param lado3 : informa del valor de lado3
	 */

public Triangulo(double x, double y, Color color, double lado1, double lado2, double lado3){
super (x, y, color);
this.lado1 = lado1;
this.lado2 = lado2;
this.lado3 = lado3;
}
	/**
	 * @return the lado1
	 */
public double getLado1(){
return lado1;
}
	/**
	 * @return the lado2
	 */

public double getLado2(){
return lado2;
}
	/**
	 * @return the lado3
	 */

public double getLado3(){
return lado3;
}

	/**
	 * @param lado1 the lado1 to set
	 */
public void setLado1(double lado1){
this.lado1 = lado1;
}
	/**
	 * @param lado2 the lado2 to set
	 */

public void setLado2(double lado2){
this.lado2 = lado2;
}
	/**
	 * 
	 * @param lado3 the lado3 to set
	 */

public void setLado3(double lado3){
this.lado3 = lado3;
}
	/**
	 * funcion que calcula el perimetro del triangulo
	 */
public double perimetro (){
   return lado1 + lado2 + lado3;
}
	/**
	 * funcion que calcula el area del triangulo
	 *  @return devuelve el area del triangulo
	 */
public double area (){ 
   double sp = perimetro() / 2;
   return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3)); 
}
}
