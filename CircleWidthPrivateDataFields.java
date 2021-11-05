package project4;

public class CircleWidthPrivateDataFields {
	private double radius=1;
	private static int numberOfObjects=0;
	
	public CircleWidthPrivateDataFields(){
    	numberOfObjects++;
    }
	public CircleWidthPrivateDataFields(double newRadius){
    	radius=newRadius;
    	numberOfObjects++;
    }
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newRadius) {
		radius=(newRadius>=0)?newRadius:0;
	}
    static int getNUmberOfObjects() {
    	return numberOfObjects;
    }
    double getArea() {
    	return radius*radius*Math.PI;
    }
}
