/**
 * Clase Calculadora que tiene dos variables enteras privadas
 * @author Jos� Vicente Falc�
 * @version 1.0
 */
public class Calculadora {
	private int num1;
	private int num2;
	
	/**
	 * Constructor de la clase Calculadora que recibe dos par�metros
	 * @param a N�mero entero para operaciones matem�ticas
	 * @param b N�mero entero para operaciones matem�ticas
	 */
	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
	}

	/**
	 * M�todo suma que realiza la suma de dos n�meros
	 * @return Devuelve el resultado de la suma de dos n�meros
	 */
	public int suma() {
		int resul = num1 + num2;
		return resul;
	}

	/**
	 * M�todo resta que realiza la resta de dos n�meros
	 * @return Devuelve el resultado de la operaci�n de restar dos n�meros
	 */
	public int resta() {
		int resul = num1 - num2;
		return resul;
	}

	/**
	 * M�todo multiplica que realiza la operaci�n de multiplicar dos n�meros
	 * @return Devuelve el resultado de la multiplicaci�n de dos n�meros
	 */
	public int multiplica() {
		int resul = num1 * num2;
		return resul;
	}

	/**
	 * M�todo divide que realiza la operaci�n de dividir dos n�meros
	 * @return Devuleve el resultado de la divisi�n de dos n�meros
	 */
	public int divide() {
		int resul = num1 / num2;
		return resul;
	}
}
