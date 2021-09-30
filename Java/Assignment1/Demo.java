import java.io.File;
import java.util.Scanner;
public class Demo{

	private void getFile()
	{
		
		File file = new File("/krishnavamsig-zemoso-training/java/Assignment1");
		String str ;
		Scanner sc = new Scanner(System.in);
		do{
			int flag =0;
			System.out.println("Enter the name of the folder");
			str =sc.nextLine();
			 String[] files = file.list();
			for (String string : files){
				 Boolean str1 = str.equals(string);
				if (str1){
				flag = 1;
               // System.out.println("The file named"+string+"is found and the path is"+ file.getAbsolutePath());
				System.out.println("File Found : ");
				System.out.println(string);
				System.out.println("Path : "+ file.getAbsolutePath());
				}			
			}
				if(flag == 0)
				{
					System.out.println("File not find.Try again.");
				}
			} while(true);
	}

		public static void main(String[] args){
			Demo obj =new Demo();
			obj.getFile();
		}	
}