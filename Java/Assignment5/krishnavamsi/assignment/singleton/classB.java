package krishnavamsi.assignment.singleton;
import java.lang.String;
public class classB{
	String str;
		public classB(String otherStr)
		{
		str=otherStr;
		}
	
	public static String B_method(String s) {
		//static methods can only access static variables;
		//str=s;
		classB sc = new classB(s);
		return s;
	}
	public void print() {
		System.out.println(str);
	}

	public static void main(String[] args)
	{
	String str = "ABCD";
	classB obj = new classB(str);
	obj.B_method(str);
	obj.print();
	}

}