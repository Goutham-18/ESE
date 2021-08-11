import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		
		ArrayList<ControlCarParts> carPartList = new ArrayList<ControlCarParts>();
		carPartList.add(new ControlCarParts("Tyre", 4.00, "Wheels for the cars to move"));
		carPartList.add(new ControlCarParts("Suspension", 10.00, "Maximise overall performance of the car as it is being driven."));
		
		int option = -1;
		while(option != 6) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			if(option == 1) {
				C206_CaseStudy.viewVisitorRegistration();
			}else if(option == 2) {
				C206_CaseStudy.displayCar();
			}else if(option == 3) {
				C206_CaseStudy.displayCarParts();
			}else if(option == 4) {
				C206_CaseStudy.displayAppointment();
			}else if(option == 5) {
				C206_CaseStudy.displayFeedback();
			}else if(option == 6){
				System.out.println("Bye");
			}else {
				System.out.println("Invalid  option.");
			}
		}
		

	}

	private static void menu() {
		C206_CaseStudy.setHeader("RADIO CONTROL CAR");
		System.out.println("1. Display Visitor Registration");
		System.out.println("2. Display Radio Control Car Listing and Features");
		System.out.println("3. Display Radio Control Car Parts Listing and Features");
		System.out.println("4. Display Appointment");
		System.out.println("5. Display Feedback");
		Helper.line(80, "-");
		
	}

	private static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
		
	}
	
	//OPTION 1 -Display Visitor Registration
	private static void viewVisitorRegistration() {
		
		
	}
	
	//OPTION 2 -Display Radio Control Car Listing and Features
	private static void displayCar() {
		
		
	}
	
	
	//OPTION 3 -Display Radio Control Car Parts Listing and Features
	private static void displayCarParts() {
		
		
	}
	
	//OPTION 4 -Display Appointment
	private static void displayAppointment() {
		
		
	}
	
	//OPTION 5 -Display Feedback
	private static void displayFeedback() {
		
		
	}
	

}
