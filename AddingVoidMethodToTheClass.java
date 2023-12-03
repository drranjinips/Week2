package creatingClass_assigning_cassobjects;

public class AddingVoidMethodToTheClass {
	int length;
	int width;
	int bredth;
	void volume() {
		System.out.println("The volume is "+ (length*width*bredth));
	}
	public static void main(String[] args) {
		AddingVoidMethodToTheClass Box1 = new AddingVoidMethodToTheClass();
		AddingVoidMethodToTheClass Box2 = new AddingVoidMethodToTheClass();
		//With the above code we have created two Box objects for the class.
		Box1.length=12;
		Box2.length=6;
		Box1.width=3;
		Box2.width=20;
		Box1.bredth=7;
		Box2.bredth=8;
		Box1.volume();
		Box2.volume();
		
	}

}
