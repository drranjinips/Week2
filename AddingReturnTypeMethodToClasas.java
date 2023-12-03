package creatingClass_assigning_cassobjects;

public class AddingReturnTypeMethodToClasas {
	//Since we are storing a value inside the method we will not use void method
	int length;
	int width;
	int bredth;
	int volume()
	{ return (length*width*bredth);
			
	}
	
	
	public static void main(String[] args) {
		AddingReturnTypeMethodToClasas Box1= new AddingReturnTypeMethodToClasas(); //creating an object in the classs
		AddingReturnTypeMethodToClasas Box2= new AddingReturnTypeMethodToClasas();
		Box1.length=3;
		Box1.width=3;
		Box1.bredth=3;
		Box2.length=2;
		Box2.width=4;
		Box2.bredth=5;
		System.out.println("The volume of first box is " +  Box1.volume());
		System.out.println("The volume of second box is " +Box2.volume() );


	}

}
