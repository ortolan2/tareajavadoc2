package figuras;
import java.awt.Color;
/**
 * almacena informacion de figura
 * @author ALUMNO
 * @version 1.0
 */
public abstract class Figura{
	/* almacena la posicion del centro de la figura respecto a un eje x e y */
private Punto centro;
	/*  almecena el color de la figura */
private Color color;
	/**
	 * constructor de la clase
	 * @param x : donde va a estar centrado el cuadrado respecto a x
	 * @param y : donde va a estar centrado el cuadrado respecto a y
	 * @param color : color de la figura
	 */
	
public Figura(double x, double y, Color color){
centro = new Punto (x, y);
this.color = color;
}
	/**
	 * @return the centro x
	 */
public double getXCentro(){
return centro.getX();
}
	/**
	 * @return the centro y
	 */

public double getYCentro(){
return centro.getY();
}
	/**
	 * @return the color
	 */
public Color getColor(){
return color;
}
	/**
	 * @param x the x to set
	 */
public void setXCentro(double x){
centro.setX (x);
}
	/**
	 * @param y the y to set
	 */

public void setYCentro(double y){
centro.setY (y);
}
	/**
	 * @param color the color to set
	 */
public void setColor(Color color){
this.color = color;
}

	/**
	 * funcion abstracta para calcular perimetro
	 * @return variable con el valor del perimetro
	 */
public abstract double perimetro();  

	/**
	 * funcion absracta para calcular area
	 * @return variable con el valor del area
	 */

public abstract double area();  

	/**
	 * funcion que compara dos figuras
	 * @param otraFigura recogemos el area de otra figura
	 * @return nos devuelve 1 si la figura que recibimos es menor, -1 si la figura que recibimos es mayor, 0 si la figura es igual
	 */

public int esMayorQue (Figura otraFigura) {
	   if (this.area() > otraFigura.area())
		   return 1;
	   else
		   if (this.area() < otraFigura.area())
			   return -1;
		   else
			   return 0;
	}

}
