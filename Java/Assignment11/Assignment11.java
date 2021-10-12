import java.util.*;
import java.io.File;
import java.io.*;
class Assignment11{
    HashMap< Character,Integer > Map=new HashMap< Character,Integer >();
    public void readfile()
    {
        try{
            FileReader f=new FileReader("/Home/Desktop/Zemoso1/krishnavamsig-zemoso-training/Java/Assignment11/1.txt");
            int index;
            while((index=f.read())!=-1)
            {
                if(!Character.isWhitespace((char)index))
                {
                    if(Map.containsKey((char) index))
                    {
                        Map.put((char)index,Map.get((char)index)+1);
                    }
                    else
                    {
                        Map.put((char)index,1);
                    }
                }
            }
            f.close();
            writefile();
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void writefile()
    {
        try{
            FileWriter f=new FileWriter("/Home/Desktop/Zemoso1/krishnavamsig-zemoso-training/Java/Assignment11/2.txt");
            f.write(Map.toString());
            f.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        Assignment11 r=new Assignment11();
        r.readfile();
        r.writefile();
    }
}