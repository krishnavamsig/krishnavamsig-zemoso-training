import java.util.Scanner;
public class alpha{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter your String ");
        String str;
        str=input.nextLine();
        str=str.toLowerCase();
        boolean[] alphaList = new boolean[26];
        int index = 0;
        Boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if( str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            alphaList[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (alphaList[i] == false)
                flag = false;
        }
        System.out.print("String: " + str);
        if (flag == true)
            System.out.print("\nThe input string contains all the letters of the alphabet a-z.\n ");
        else
            System.out.print("\nThe input string does not contains all the letters of the alphabet a-z\n ");
        input.close();
    }
}
