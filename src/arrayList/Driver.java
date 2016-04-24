package arrayList;

import java.util.*;
import java.io.*;
import static java.lang.System.*;
import arrayList.Polynomial;
import arrayList.Term;

public class Driver {
	public static void main(String[] args) {
		//			FileWriter fw = new FileWriter("numbers.txt");
		//			PrintWriter pw  = new PrintWriter(fw);
		//			pw.println("1,2,13,14,5,6");
		//			pw.close();
		//			
		//			FileReader fr = new FileReader("numbers.txt");
		//			BufferedReader br = new BufferedReader(fr);
		//			
		//			String str;
		//			while ((str = br.readLine()) != null){
		//				System.out.println(str + "\n");;
		//			}	
		//			
		//			Polynomial poly1 = new Polynomial();
		//			
		//			String parts = str.split(",");
		//			System.out.println(parts);
					Polynomial poly1 = new Polynomial();
					Term term1 = new Term(11,3);
					Term term2 = new Term(3,14);
					Term term3 = new Term(6,5);
					poly1.insert(term1);
					poly1.insert(term2);
					poly1.insert(term3);
					
					//deleting the term
					poly1.delete(term2);
					
					//reversing the polynomial and printing 
					poly1.reverse();
					
					//did this due to misunderstanding of the question
					//takes the value of x as input to give the total value of the polynomial
					System.out.println("product using the value of X: " + poly1.product(3));
					
					//finding the product of the terms
					//did this also due to misunderstanding 
					System.out.println("Products of the terms (multiplying the cof and adding exponents): " + poly1.productOfTerms());
					
					//printing the polynomial is normal order
					//I think this is the calls the method which was meant to be product
					String a = poly1.getPolynomial();
					System.out.println("Polynomial " + a);
					
					
	}
}
