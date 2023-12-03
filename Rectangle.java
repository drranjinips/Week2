package creatingClass_assigning_cassobjects;

public class Rectangle {
	int lenght;
	int breadth;
	public static void main(String[] args) {
		// DEMONSTRATION OF - CREATE 3 RECTANGLES UNDER THE CLASS RECTANGLE AND CALCULATE THEIR AREA
		
		Rectangle Rectangle1= new Rectangle();
		Rectangle Rectangle2= new Rectangle();
		Rectangle Rectangle3= new Rectangle();
		Rectangle1.lenght=15;
		Rectangle2.lenght=30;
		Rectangle3.lenght=450;
		Rectangle1.breadth=30;
		Rectangle2.breadth=20;
		Rectangle3.breadth=30;
		System.out.println("The Area of Rectangle1 is   " + (Rectangle1.lenght * Rectangle1.breadth));
		System.out.println("The Area of Rectangle2 is   " + (Rectangle2.lenght * Rectangle2.breadth));
		System.out.println("The Area of Rectangle1 is   " + (Rectangle3.lenght * Rectangle3.breadth));
		//DEMONSTRATION OF ASSIGNMENT OPERATOR FOR AN OBJECT REFERENCE VARIABLE
		//All the length and breadth of rectangle1 will be assigned to Rectangle4  and Rectangle1 length and breadth  will remain empty
		Rectangle Rectangle4 = Rectangle1;
		
		System.out.println("The Length  of   Rectangle4  is "  + Rectangle4.lenght);
		

	}

}
