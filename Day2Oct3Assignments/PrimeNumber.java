package Day2Oct3Assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=3;
		boolean flag= true;
		 
		 for (int i=3;i<=number/3;i++) {
			 if (number%i ==0) {
				 flag=false;
				 break;
			 }
			 
		 }
		 
		 if(flag) {
			 System.out.println("Prime");
		 }
		 else {
			 System.out.println("Not Prime");
		 }
	}

}
