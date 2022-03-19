package ed.adrian;

/**
 * Serveix per a calcular operacions matemàtiques dos numeros pasats com a
 * parametres
 * <p>
 * Aquesta clase ens ofereix mètodes per a poder fer operacions matemàtiques com
 * sumes, restes, multiplicacions i divisions.
 * </p>
 * 
 * @author adrianpascualsilvestre
 * @version 2.5 (versió actual del programa)
 * @since 1.9 (la versió va ser anyadida per primera vegade en juny de 2019)
 *
 */

public class Calculadora {

	/**
	 * Fa una suma entre dos numeros pasats com a parametres
	 * 
	 * @param a (un numero per a sumar)
	 * @param b (altre numero per a sumar)
	 * @return (la suma del primer element mes el segon element)
	 */

	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Fa una resta entre dos numeros pasats com a parametres
	 * 
	 * @param a (el primer numero per a restar)
	 * @param b (el segundo numero per a restar)
	 * @return (retorna la resta del primer element menys el segon element)
	 */

	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Fa una multiplicacio entre dos numeros pasats com a parametres
	 * 
	 * @param a (el primer factor per a multiplicar)
	 * @param b (el segon factor per a multiplicar)
	 * @return (retorna la multipliació del primer element per el segon element)
	 */

	public int multiplica(int a, int b) {
		return a * b;
	}

	/**
	 * Fa una divisió entre dos numeros pasats com a parametres
	 * 
	 * @param a (el divident per a dividir)
	 * @param b (el divisor per a dividir)
	 * @return (retorna el quocient del divident entre el divisor)
	 * @throws ArithmeticException (quan es divideix un numero entre 0)
	 */

	public int diveix(int a, int b) {
		return a / b;
	}
	
	/**
	 * Eleva la un numero a un nombre de voltes
	 * 
	 * @param potencia (numero al qual nem a elevar)
	 * @param exponent (voltes que volem elevar la potencia)
	 * @return (retorna la potencia multiplicada per si mateixa el numero de voltes pasades com exponent)
	 */

	public int elevar(int potencia, int exponent) {

		int total = 1;

		for (int i = 0; i < exponent; i++) {
			total = total * potencia;
		}

		return total;

	}
	
	/**
	 * Aquesta funció ens diu si un numero pasat com a parametre es parell
	 * 
	 * @param numero (numero el qual volem comprovar si es parell)
	 * @return (retorna true si es parell y false si es senar)
	 */

	public boolean isParell(int numero) {

		boolean isPrimo;

		if (numero % 2 == 0) {
			isPrimo = true;
		} else {
			isPrimo = false;
		}

		return isPrimo;

	}

	public String oper3(int a){

	    String r = "";
	    int v = a;
	    int v1;

	    while ( v > 0) {

	        v1 = v % 2;

	        r = v1 + r;

	        v = v / 2;

	    }
	    
	    return r;
	}
	
}
