import java.io.File;
import java.util.Scanner;
public class Demo{

	private void getFile()
	{ 			
		File file = new File("/home/krishg/abc");
		String firstString ;
		Scanner scanner = new Scanner(System.in);
		do{
			Boolean flag =false;
			System.out.println("Enter the name of the folder");
			firstString =scanner.nextLine();
			 String[] files = file.list();
			for (String string : files){
				 Boolean secondString = firstString.equals(string);
				if (secondString){
				flag = true;
				System.out.println("File Found : ");
				System.out.println(string);
				System.out.println("Path : "+ file.getAbsolutePath());
				}			
			}
				if(flag == false)
				{
					System.out.println("File not find.Try again.");
				}
			}
			 while(true);
			
	}

		public static void main(String[] args){
			Demo obj =new Demo();
			obj.getFile();
		}	
		
}
//str1 and str chane names
//use boolean for flag
//path for home
//remove comments