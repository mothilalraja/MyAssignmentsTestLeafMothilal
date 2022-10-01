package week1.day1;

public class Factorial {

	
/*
 * Goal:Find the Factorial of a given number
 * 
 *input:5 output:5*4*3*2*1=120
 *
 *shortcuts:
 *1)Print:type:syso,followed by:ctrl+space+enter
 *2)To create a 'for'loop:type 'for',followed by ctrl+space+down arrow+enter
 *
 *what are my learnings from this code?
 *1)
 *2)
 *3)
 *
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare your input as 5
		int input = 5;
		int fact = 1;
		for(int j=1; j<=5; j++) {
			fact= fact*j;
		}
		System.out.println("Factorial of "+5+"is:"+fact);
	}
	

}
