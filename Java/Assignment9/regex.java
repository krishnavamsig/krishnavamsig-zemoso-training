import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public void regexMatcher() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-Z][^.]*\\.$");
        Matcher matcher = pattern.matcher(input);
        if(matcher.find())
            System.out.println("Match found");
        else
            System.out.println("No match");
        scanner.close();
    }

    public static void main(String[] args)
    {
        regex obj=new regex();
        while(true)
        obj.regexMatcher();
    }
}