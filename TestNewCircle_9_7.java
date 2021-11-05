package project4;

public class TestNewCircle_9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before createing objects");
		System.out.println("The number of Circle objects is "+NewCircle_9_6.numberOfObjects);
		
		NewCircle_9_6 c1=new NewCircle_9_6();
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius("+c1.radius+") and number of NewCircle_9_6 objects ("+c1.numberOfObjects+")");
		
		NewCircle_9_6 c2=new NewCircle_9_6(5);
		c1.radius=9;
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius("+c1.radius+") and number of NewCircle_9_6 objects ("+c1.numberOfObjects+")");
		System.out.println("c1: radius("+c2.radius+") and number of NewCircle_9_6 objects ("+c2.numberOfObjects+")");
	}

}
