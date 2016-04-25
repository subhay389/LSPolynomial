package arrayList;

import java.util.ArrayList;
import arrayList.Term;

public class Polynomial {
	private
	
		ArrayList<Term> polynomial;
		ArrayList<Term> reverse;
		String polynomialString;
		String reversePolynomial = "";
		String product = "";
	
	//constructor
	public Polynomial(){
		polynomial = new ArrayList<Term>();
	}
	
	/**
	 * adding the Term to the polynomial in sorted order
	 * @param a
	 */
	
	public void insert (Term a){
		int exp;
		exp = a.getExponent();
		
		if (polynomial.size() == 0){
			polynomial.add(a);
		}
		
		else {
			for(int i = 0; i < polynomial.size(); i++){
				if (polynomial.get(i).getExponent() > exp){
				    	polynomial.add(i, a);
				    	return;
			    }
			    else if(i == polynomial.size() - 1){
			    	polynomial.add(i+1, a);
			    	return; 
			    	
			    }
			}
		}
		
	}
	
	/**
	 * returns the whole polynomial expression
	 * @return
	 */
	
	public String getPolynomial (){
		this.polynomialString = polynomial.get(0).toString();
		for(int i = 1; i < polynomial.size(); i++){
			String x = polynomial.get(i).toString();
			this.polynomialString = polynomialString + " + " + x;
		}
		return polynomialString;
	}
	
	/**
	 * deleting a specific term
	 * @param a
	 */
	
	public void delete (Term a){
		int exp, cof;
		cof = a.getCoefficient();
		exp = a.getExponent();
		for(int i = 0; i < polynomial.size(); i++){
			if (polynomial.get(i).getCoefficient() == cof && polynomial.get(i).getExponent() == exp){
				polynomial.remove(i);
		    }
		}
	}
	
	/**
	 * finding the product with a value of a
	 * @param x
	 */
	public int product (int x){
		int total = 0;
		for(int i = 0; i < polynomial.size(); i++){
			int a = polynomial.get(i).getCoefficient();
			int b = (int) Math.pow(polynomial.get(i).getExponent() , x);
			total += a + b;
		}
		return total;
	}
	
	/**
	 * prints the polynomial in reverse order
	 */
	
	public void reverse (){
		
		
		for (int i = 1; i < polynomial.size(); i++){
			String x = polynomial.get(i).toString();
			
			if (x != null){
				this.reversePolynomial = x + " + " + reversePolynomial; 
	//			reverse.add(i, polynomial.get(i));
	//			this.polynomialString = x + " + " + polynomialString;
			}
		}
		this.reversePolynomial = reversePolynomial + polynomial.get(0).toString();
		System.out.println("Printing the reverse polynomial: " + reversePolynomial + "\n");
	}
	
	/**
	 * find the products of the terms
	 * @return 
	 */
	
	public String productOfTerms(){
		int productOfCo = 1, productOfExp= 0;
		for(int i = 0; i < polynomial.size(); i++){
			productOfCo = productOfCo * polynomial.get(i).getCoefficient();
			productOfExp += polynomial.get(i).getExponent();
			
		}
		return Integer.toString(productOfCo) + "x^" + Integer.toString(productOfExp);
//		System.out.println(product);
	}
	
	
	
	
	


}	


