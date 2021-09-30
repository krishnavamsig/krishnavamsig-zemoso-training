import java.util.Scanner;
import java.util.*;
import java.io.*;
public class alpha{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter your String ");
        String str;
        str=in.nextLine();
        str=str.toLowerCase();
        boolean[] alphaList = new boolean[26];
        int index = 0;
        int flag = 1;
        for (int i = 0; i < str.length(); i++) {
            if( str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            alphaList[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (alphaList[i] == false)
                flag = 0;
        }
        System.out.print("String: " + str);
        if (flag == 1)
            System.out.print("\nThe input string contains all the letters of the alphabet a-z.\n ");
        else
            System.out.print("\nThe input string does not contains all the letters of the alphabet a-z\n ");
    }
}
