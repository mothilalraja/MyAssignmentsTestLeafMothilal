package week1.day2;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
Car obj = new Car();
obj.PrintCarName();
int getRegNumber = obj.GetRegNumber();
System.out.println(getRegNumber);

	}
	
	
	
public void PrintCarName() {
	System.out.println("Benz");
}


public int GetRegNumber() {
	int regnumber=98765234;
	return regnumber;
			
}


}
