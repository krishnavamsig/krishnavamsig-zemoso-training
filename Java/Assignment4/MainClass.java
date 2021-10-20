import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

class KycDate{
	 Date signUpDate, currentDate;
	 String stringStartDate, stringEndDate;
	 Date startDate, endDate;
	 public void rangeKyc(String inputSignUpDate, String inputCurrentDate) {
		 Boolean flag=true;
		try {
			SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
			signUpDate = dateFormatter.parse(inputSignUpDate);
			currentDate= dateFormatter.parse(inputCurrentDate);
			if(signUpDate.after(currentDate)) {
				flag=false;
			}
			else {
				startDate = signUpDate;
				startDate.setYear(currentDate.getYear());
				Calendar calendar = Calendar.getInstance();
 				calendar.setTime(startDate);
				calendar.add(Calendar.DATE, -30);
				startDate=calendar.getTime();
				calendar.add(Calendar.DATE, 60);
				endDate=calendar.getTime();
				if(endDate.after(currentDate)) {
					endDate=currentDate;
				}
			}
			if(flag==false)
				System.out.println("No range");
			else
			{
			stringStartDate=dateFormatter.format(startDate);
			stringEndDate=dateFormatter.format(endDate);
			System.out.print(stringStartDate);
			System.out.print("	");
			System.out.println(stringEndDate);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
};

class MainClass {

	public static void main(String[] args) {
		KycDate object =new KycDate();
		 object.rangeKyc("16-07-1998", "27-06-2017");
		 object.rangeKyc("04-02-2016", "04-04-2017");
		 object.rangeKyc("04-05-2017", "04-04-2017");
		 object.rangeKyc("04-04-2015", "04-04-2016");
		 object.rangeKyc("04-04-2015", "15-03-2016");
         object.rangeKyc("04-05-2017", "04-01-2017");

	}

}
