package krishnavamsi.assignment.Main;
import krishnavamsi.assignment.java.classA;
import krishnavamsi.assignment.singleton.classB;

public class Main {

	public static void main(String[] args) {
		classA obj =new classA();
		//global variables which can get default values.
		obj.display();
		//local variables which are not initialized but does not get any default values.
		obj.show();
		//static methods can only access static variables.
		classB obj1 = new classB("str");
		obj1.B_method("str");
		obj1.print();
		
	}

}