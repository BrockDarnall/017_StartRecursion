/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg017_recursion_overload;

/**
 *
 * @author compsci
 */
/**
 * 
 * @author BrockD
 *
 */

/**
<h1>Class</h1>
* <p>
* The Start Recursion class contains an if statement.
* </p>
*/
public class Main {

	public static void main(String[] args) {
		int n = 5;
		recurse(n);
		System.out.println("");
		n = 0;
		recurseUp(n);
		System.out.println("");
		int startValue = 0;
		int stopValue = 50;
		recurseEvens(startValue, stopValue);

	}
	/**
	 * <p>Decreases the variable n each time the method is recursed.</p>
	 * @param n
	 */
	private static void recurse(int n) {
		System.out.println("recurse value is " + n + " on this recursion pass");
		n--;
		if (n>=0) {
			recurse(n);
		}
		
	}
	/**
	 * <p>Increases the variable n each time the method is recursed.</p>
	 * @param n
	 */
	private static void recurseUp(int n) {
		System.out.println("recurseUp value is " + n + " on this recursion pass");
		n++;
		if (n<=10) {
			recurseUp(n);
		}
		
	}
	/**
	 * <p>Displays all the even numbers from the startValue(inclusive) through stopValue(exclusive).</p>
	 * 
	 * @param startValue
	 * @param stopValue
	 */
	private static void recurseEvens(int startValue, int stopValue) {
		System.out.println("recurseEvens value is " + startValue);
		startValue +=2;
		if (startValue<=stopValue) {
			recurseEvens(startValue, stopValue);
		}
	}

}

