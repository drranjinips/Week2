package creatingClass_assigning_cassobjects;

public class ClassCreationUsingConstroctor {
	int length;
	int width;
	int breadth;
	int volume;
	ClassCreationUsingConstroctor() {
		length=2;
		 width=3;
		 breadth=5;
		}
	int Volume() {
		return (length*width*breadth);
	}

	public static void main(String[] args) {
		ClassCreationUsingConstroctor Box1=new ClassCreationUsingConstroctor();
		ClassCreationUsingConstroctor Box2=new ClassCreationUsingConstroctor();
		System.out.println("Volume of Box1 is "+ Box1.Volume());
		System.out.println("Volume of Box2 is "+ Box2.Volume());
		
	 }

}
/* Here the class called "ClassCreationUsingConstroctor" itselt is acting as a method to do the job
 * Here we have created two boxes  with same dimension.
 
 */

