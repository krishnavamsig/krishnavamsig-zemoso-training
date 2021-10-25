import java.util.*;
import java.io.File;
import java.io.*;
class Assignment11{
    HashMap< Character,Integer > Map=new HashMap< Character,Integer >();
    public void readfile()
    {

		try {
            FileReader f=new FileReader("/home/krishg/abc/qwerty");
            int index;
            while((index=f.read())!=-1) {
                if(!Character.isWhitespace((char)index)) {
                    if(Map.containsKey((char)index)) {
                        Map.put((char)index, Map.get((char)index)+1);
                    }
                    else {
                        Map.put((char)index, 1);
                    }
                }
            }
            f.close();
            writefile();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    public void writefile()
    {
        try {
			File file =new File("/home/krishg/abc/output");
			FileWriter fwrite=new FileWriter(file);
			fwrite.write(Map.toString());
			fwrite.close();
			
		}catch (Exception e) {
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