import java.io.File;
import java.util.Scanner;
public class findMatchingFiles {
    private void matchFile()
    {
        
        File file=new File("/home/Downloads");
        String S;
        Scanner in=new Scanner(System.in);
        do{
            int flag=0;
            System.out.println("Enter the name of the file");
            S=in.nextLine();
            String[] files=file.list();
            for(String string: files)
            {
                Boolean S1=S.equals(string);
                if(S1)
                {
                    flag=1;
                    System.out.println("The file named"+string+"is found and path is "+file.getAbsolutePath());

                }
            }
            if(flag==0)
            {
                System.out.println("File not found");
            }
        }
        while(true);
    }
    public static void main(String[] args)
    {
        findMatchingFiles obj=new findMatchingFiles();
        obj.matchFile();
    }
}
