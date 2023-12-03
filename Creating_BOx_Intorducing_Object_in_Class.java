package creatingClass_assigning_cassobjects;

public class Creating_BOx_Intorducing_Object_in_Class {
	double length;
	double  breadth;
	double thickness;
	double volume;
	void volumecalculation()
	{
		volume=length *breadth*thickness;
		System.out.println("The volume of the box is " + volume);
	}

	public static void main(String[] args) {
		Creating_BOx_Intorducing_Object_in_Class box1= new Creating_BOx_Intorducing_Object_in_Class();
		Creating_BOx_Intorducing_Object_in_Class box2= new Creating_BOx_Intorducing_Object_in_Class();
		Creating_BOx_Intorducing_Object_in_Class box3= new Creating_BOx_Intorducing_Object_in_Class();
		box1.length=20;
		box2.length=23;
		box3.length=24;
		box1.breadth=27;
		box2.breadth=25;
		box3.breadth=27;
		box1.thickness=27;
		box2.thickness=25;
		box3.thickness=27;
		box1.volumecalculation();
		box2.volumecalculation();
		box3.volumecalculation();
		
	}

}
