package ese;
//
public class appointment {
	private String name;
	private String day;
	private String date;
	
	public appointment(String name, String day, String date) {
		this.name = name;
		this.day = day;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public String getDay() {
		return day;
	}

	public String getDate() {
		return date;
	}
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("Day: "+ day);
		System.out.println("Date: "+ date);
		System.out.println("appointment added!");
	}
}
