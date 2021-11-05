package project4;

public class TotalArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleWidthPrivateDataFields[] circleArray;
		circleArray=createCircleArray();
		printCircleArray(circleArray);
		
	}
	public static CircleWidthPrivateDataFields[] createCircleArray() {
		CircleWidthPrivateDataFields[] circleArray=new CircleWidthPrivateDataFields[5];
		for(int i=0;i<circleArray.length;i++) {
			circleArray[i]=new CircleWidthPrivateDataFields(Math.random()*100);
		}
		return circleArray;
	}
	public static void printCircleArray(CircleWidthPrivateDataFields[] circleArray) {
		System.out.printf("%-30s%-15s\n","Radius","Area");
		for(int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30s%-15s\n",circleArray[i].getRadius(),circleArray[i].getArea());
		}
		System.out.println("__________________________________________________");
		System.out.printf("%-30s%-15s\n","The total area of circles is",sum(circleArray));
	}
	public static double sum(CircleWidthPrivateDataFields[] circleArray) {
		double sum=0;
		for(int i=0;i<circleArray.length;i++) {
			sum+=circleArray[i].getArea();
		}
		return sum;
	}

}
