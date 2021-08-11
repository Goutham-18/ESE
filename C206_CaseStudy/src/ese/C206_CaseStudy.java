package ese;
import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<appointment> appList= new ArrayList<appointment>();
		
		System.out.println("Add appointment");
		String name= Helper.readString("Enter name > ");
		String day=Helper.readString("Enter day > ");
		String date= Helper.readString("Enter date > ");
		
		appointment a =new appointment(name, day, date);
		appList.add(a);
		
		System.out.println("");
		
		for (int i=0; i<appList.size(); i++) {
			appList.get(i).display();
		}
		
	}

}
