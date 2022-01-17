/**
 * Clase Calculadora que tiene dos variables enteras privadas
 * @author José Vicente Falcó
 * @version 1.0
 */
public class Calculadora {
	private int num1;
	private int num2;
	
	/**
	 * Constructor de la clase Calculadora que recibe dos parámetros
	 * @param a Número entero para operaciones matemáticas
	 * @param b Número entero para operaciones matemáticas
	 */
	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
	}

	/**
	 * Método suma que realiza la suma de dos números
	 * @return Devuelve el resultado de la suma de dos números
	 */
	public int suma() {
		int resul = num1 + num2;
		return resul;
	}

	/**
	 * Método resta que realiza la resta de dos números
	 * @return Devuelve el resultado de la operación de restar dos números
	 */
	public int resta() {
		int resul = num1 - num2;
		return resul;
	}

	/**
	 * Método multiplica que realiza la operación de multiplicar dos números
	 * @return Devuelve el resultado de la multiplicación de dos números
	 */
	public int multiplica() {
		int resul = num1 * num2;
		return resul;
	}

	/**
	 * Método divide que realiza la operación de dividir dos números
	 * @return Devuleve el resultado de la división de dos números
	 */
	public int divide() {
		int resul = num1 / num2;
		return resul;
	}
}
