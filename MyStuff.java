package mystuff;

public class MyStuff {

	public static void main(String[] args) {
		 Driver myDriver = new Driver();
		    myDriver.brandName = "Nissan";
		    myDriver.vehicleName = "Altima";
		    myDriver.year = 2021;              
		    myDriver.yespreowned = false;      
		    myDriver.mileage = 21231;          
		    myDriver.yestinted = true;          
		    myDriver.color = "white";   
		    
		    Driver myDriver2 = new Driver();
		    myDriver2.brandName = "Ford";
		    myDriver2.vehicleName = "Fiesta";
		    myDriver2.year = 2015;              
		    myDriver2.yespreowned = true;      
		    myDriver2.mileage = 34482;          
		    myDriver2.yestinted = false;          
		    myDriver2.color = "blue";   
		    
		    System.out.println(myDriver.brandName);
		    System.out.println(myDriver.vehicleName);
		    System.out.println(myDriver.year);
		    System.out.println(myDriver.yespreowned);
		    System.out.println(myDriver.mileage);
		    System.out.println(myDriver.yestinted);
		    System.out.println(myDriver.color);
		    
		    
		    System.out.println(myDriver2.brandName);
		    System.out.println(myDriver2.vehicleName);
		    System.out.println(myDriver2.year);
		    System.out.println(myDriver2.yespreowned);
		    System.out.println(myDriver2.mileage);
		    System.out.println(myDriver2.yestinted);
		    System.out.println(myDriver2.color);


	
	}

}
