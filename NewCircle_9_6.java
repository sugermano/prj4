package project4;

public class NewCircle_9_6 {
    double radius;
    static int numberOfObjects=0;
    NewCircle_9_6(){
    	radius=1;
    	numberOfObjects++;
    }
    NewCircle_9_6(double newRadius){
    	radius=newRadius;
    	numberOfObjects++;
    }
    static int getNUmberOfObjects() {
    	return numberOfObjects;
    }
    double getArea() {
    	return radius*radius*Math.PI;
    }
}
