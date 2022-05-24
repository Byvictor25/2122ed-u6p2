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
		
/**
 * Realiza el resultado de elevar la base al exponente
 * @param base
 * @param exponente
 * @return resultado de la operacion
 */
		public int elevar ( int base , int exponente ){

		    int resultado = 1;

		    for ( int i = 0; i < exponente ; i++ ){
		        resultado = resultado * base;
		    }

		    return resultado; 

		}
		
	/**
	 * Comprueba si el numero pasado como parametro es par		
	 * @param numeroComprobar
	 * @return un booleano diciendo si es par o no
	 */
		public boolean esPar ( int numeroComprobar ){

		    boolean esPar;

		    if ( numeroComprobar % 2 == 0) {
		        esPar = true;
		    } else {
		        esPar = false;
		    }

		    return esPar;

		}
		
	/**
	 * Realiza la conversion de un numero pasado como parametro a binario
	 * @param numero
	 * @return el binario del numero pasado como parametro
	 */
		
		public String toBinario(int numero){

			String binario = "";
		    int aux = numero;
		    int v1;

		    while ( aux > 0) {

		        v1 = aux % 2;

		        binario = v1 + binario;

		        aux = aux / 2;

		    }
		    return binario;
		}
	
}