class Database {
    private static Database instance = new Database();
  

    private Database()
    {

    }

    public static Database getInstance(){
       return instance;
    }
  
    public void printMessage(){
       System.out.println("You are now connected to the database.");
    }
 }
  
 public class Main {
    public static void main(String[] args) {
  

       Database object = Database.getInstance();
  
       //calling methof
       object.printMessage();
    }
 }