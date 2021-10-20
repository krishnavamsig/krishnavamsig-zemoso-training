public class OverloadedConstructor{
    String name;
    int rollNo;
    public OverloadedConstructor(String name)
    {
        this.name=name;
        System.out.println(this.name);
    }
    public OverloadedConstructor(int rollNo)
    {
        this("abc");
        this.rollNo=rollNo;
    }

    public static void main(String[] args)
    {
        OverloadedConstructor example=new OverloadedConstructor(45);
      //  System.out.println(example.name);
       // System.out.println(example.rollNo);
        OverloadedConstructor[] array=new OverloadedConstructor[3];
        array[0]=new OverloadedConstructor("Krishnavamsi");

    }
}
