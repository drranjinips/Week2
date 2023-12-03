package creatingClass_assigning_cassobjects;

public class ClassConstructionBySettingValuesThroughParameters {
	int length;
	int breadth;
	int width;
	int volume() {
		return (length* width*breadth);
	}
	//In the beneath line we have to use void since there is no return answer in the method
	void SetDim(int l, int b,int h) {
		length=l;
		breadth=b;
		width= h;
	}

	public static void main(String[] args) {
		ClassConstructionBySettingValuesThroughParameters Box1=new ClassConstructionBySettingValuesThroughParameters();
		ClassConstructionBySettingValuesThroughParameters Box2=new ClassConstructionBySettingValuesThroughParameters();
		Box1.SetDim(3,4,6);
		Box2.SetDim(12,14,16);
		System.out.println("The volume of First Box Is  "+ Box1.volume());
		System.out.println("The volume of Second Box Is  "+ Box2.volume());

	}

}
