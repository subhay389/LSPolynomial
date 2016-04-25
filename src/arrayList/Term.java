package arrayList;
import java.util.*;

public class Term {
	private
		int coefficient;
		int exponent;
		
	public Term (int a, int b){
		this.exponent = b; 
		this.coefficient = a;
	}
	/**
	 * getting the coefficient of a specific term
	 * @return
	 */
	public int getCoefficient(){
		return coefficient;
	}

	/**
	 * Getting the exponent of a specific term
	 * @return
	 */
	public int getExponent(){
		return exponent; 
	}
	
	
	/**
	 * converting a term to string 
	 * @return
	 */
	public String toString(){
		if (exponent == 0){
			return Integer.toString(coefficient);
		}
		else if (exponent == 1){
			return Integer.toString(coefficient) + "x";
		}
		else {
			return Integer.toString(coefficient) + "x^" + Integer.toString(exponent);
		}
	}
}




