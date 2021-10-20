import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class pingHost {

  public static void runSystemCommand(String command) {

		try {
			Process process = Runtime.getRuntime().exec(command);
			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(process.getInputStream()));

			String text = "";
			while ((text = inputStream.readLine()) != null) {
				System.out.println(text);
			}

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		String ip;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ip address : ");
		ip =scanner.nextLine();
		runSystemCommand("ping " + ip);
		scanner.close();
	
	}
}
