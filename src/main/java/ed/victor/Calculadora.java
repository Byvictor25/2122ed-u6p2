package ed.victor;

/**
 * Esta clase sirve para realizar cálculos de dos números
 * <a>
 * En concreto esta clase obtiene la suma, resta, división y 
 * multiplicación de dos numeros pasados como parámetros.
 * </a>
 * @author victor perez domenech
 * @version 2.5
 * @since 0.2, juny 2019
 */
public class Calculadora {
	
	
/**
 * Realiza la suma de dos numeros pasados como parámetros.
 * @param a 1º numero de la suma
 * @param b 2º numero de la suma
 * @return el resultado de sumar el parámetro a más el parametro b
 */ 
		public int suma(int a, int b) {
		return a + b;
	}
	
/**
 * Realiza la resta de dos numeros pasados como parámetros
 * @param a 1º numero de la resta
 * @param b 2º numero de la resta
 * @return el resultado de restar el parametro a con el parametro b
 */
	public int resta(int a, int b) {
		return a - b;
	}
	
/**
 * Realiza la multiplicacion de dos numeros pasados como parámetros
 * @param a 1º numero de la multiplicacion
 * @param b 2º numero de la multiplicacion
 * @return el producto de multiplicar el parametro a con el parametro b
 */
		public int multiplica(int a, int b){
		return a*b;
	}
	
/**
 * Realiza la division de dos numeros pasados como parametros
 * @param a dividendo de la division
 * @param b divisor de la division
 * @return el cociente de la division del parametro a y el parametro b
 * @throws ArithmeticException si el divisor es 0
 */
		public int diveix(int a, int b) {
		return a/b;
	}
	
}
