package project4;

public class TestCircleWidthPrivateDataFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleWidthPrivateDataFields mycircle=new CircleWidthPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius "+mycircle.getRadius()+" is "+mycircle.getArea());
	    
		mycircle.setRadius(mycircle.getRadius()*1.1);
		System.out.println("The area of the circle of radius "+mycircle.getRadius()+" is "+mycircle.getArea());
	    
		System.out.println("The number of objects created is "+CircleWidthPrivateDataFields.getNUmberOfObjects());
	    
	}

}
