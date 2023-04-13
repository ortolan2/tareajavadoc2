package figuras;
/**
 * clase que almacena la el valor del centro de cada figura
 * @author ALUMNO
 * @version 1.0
 */
public class Punto {
	/* variables que almacenan el centro en un eje x */
private double x;
	/* variables que almacenan el centro en un eje y */
private double y;
	/**
	 * constructor que incializa las variables a 0
	 */
public Punto(){
x = 0;
y= 0;
}
	/**
	 * constructor de la clase
	 * @param x : valor donde va a estar centrado respecto a eje x
	 * @param y : valor donde va a estar centrado respecto a eje y
	 */
public Punto(double x, double y){
this.x = x;
this.y = y;
}
	/**
	 * contructor 
	 * @param p : punto con las dos coordenadas
	 */

public Punto(Punto p){
x = p.x;
y = p.y;
}
	/**
	 * 
	 * @return the x
	 */
public double getX(){
return x;
}
	/**
	 * 
	 * @return the y
	 */

public double getY(){
return y;
}
	/**
	 * 
	 * @param x the x to set
	 */

public void setX(double x){
this.x = x;
}
	/**
	 * 
	 * @param y the y to set
	 */

public void setY(double y){
this.y = y;
}

	/**
	 * funcion que mide la distancia de un punto a otro punto
	 * @param p recibe los dos puntos
	 * @return variable que nos indica la distancia de un punto a otro
	 */
public double distancia(Punto p){
return Math.sqrt (Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
}
	/**
	 * funcion que nos indica la posicion espejo respecto al eje y
	 * @return nueva posicion espejo respecto al eje y
	 */
public Punto simetrico(){
Punto nuevoP = new Punto (this.x * -1, this.y);	
return nuevoP ;
}
	/**
	 * funcion que nos indca si el valor de punto p es igual al que teniamos en origen
	 * @param p recibe los dos puntos
	 * @return nos indica true o false si es igual o no
	 */
public boolean compara(Punto p){
if (p.x == x && p.y == y)
   return true;
else
   return false;
}
	/**
	 * funcion que nos indica el valor de la posicion
	 */
public String toString() {
	return "(" + getX() + "," + getY() + ")";
}
}
