package arrayList;

import java.util.*;
import java.io.*;
import static java.lang.System.*;
import arrayList.Polynomial;
import arrayList.Term;

public class Driver {
	public static void main(String[] args) throws IOException {
			
		//array containing all the polinomials read fro the file
			ArrayList<Polynomial> allPolynomial = new ArrayList<Polynomial>();
		
					//creating a file with the values for coefficient and exponent
					FileWriter fw = new FileWriter("numbers.txt");
					PrintWriter pw  = new PrintWriter(fw);
					
					//adding values to the file
					pw.println("P1;1;2;13;16;5;6");
					pw.println("P2;15;25;13;26;5;64");
					pw.println("P3;1;23;13;16;11;23");
					pw.close();
					
					//reading from the file
					FileReader fr = new FileReader("numbers.txt");
					BufferedReader br = new BufferedReader(fr);
					
					String str = br.readLine();
						
					//iterating the file
					while (str != null){
						Polynomial poly1 = new Polynomial();
						
//						System.out.println(str + "\n");
						
						String[] parts = str.split(";");
						
						for (int i = 1; i < parts.length-1; i+= 2){
//							System.out.println(parts[i]);
							Term term = new Term(Integer.parseInt(parts[i]),Integer.parseInt(parts[i+1]));
							poly1.insert(term);
							
						}
						
						//adding the polynomial in an array
						allPolynomial.add(poly1);
						
						//printing the polynomial is normal order
						//I think this is the calls the method which was meant to be product
						String a = poly1.getPolynomial();
						System.out.println("Polynomial after taking input from file:  " + parts[0] + ": " + a + "\n");
						
						str = br.readLine();

					}
					
//					//making some manual changes 
					
					System.out.println("making some changes to P3" + "\n");
					
					Polynomial poly1 = allPolynomial.get(2);
					
					System.out.println("Original Polynomial: " + poly1.getPolynomial() + "\n");
				
					//adding terms manually
					Term term1 = new Term(11,3);
					poly1.insert(term1);
					
					String a = poly1.getPolynomial();
					System.out.println("Polynomial after adding 11,3 3,14 and 16,5 manually:  " + a + "\n");
									
					//deleting the term
					poly1.delete(term1);
					
					a = poly1.getPolynomial();
					System.out.println("Polynomial after deleting 3,14:  " + a + "\n");
					
					//reversing the polynomial and printing 
					poly1.reverse();
					
					//did this due to misunderstanding of the question
					//takes the value of x as input to give the total value of the polynomial
					System.out.println("solving the polynomial using the value of X=3: " + poly1.product(3)+ "\n");
					
					//finding the product of the terms
					//did this also due to misunderstanding 
					System.out.println("Products of the terms (multiplying the cof and adding exponents): " + poly1.productOfTerms()+ "\n");
					
					


					
					
	}
}
