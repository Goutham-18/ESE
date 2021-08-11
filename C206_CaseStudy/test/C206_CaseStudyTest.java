import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ese.appointment;
//
public class C206_CaseStudyTest {
	private appointment app1;
	private appointment app2;
	private ArrayList <appointment> appList;
	
	@Before
	public void setUp() throws Exception {
	app1= new appointment("bob", "Monday", "11/9/21");
	app2= new appointment("gab", "Tuesday", "12/10/21");
	appList= new ArrayList<appointment>(); 
	}

	@Test
	public void addTest() {
		assertNotNull("Test if there is valid appointment arraylist to add to", appList);
		
		appList.add(app1);
		assertSame(app1, appList.get(0));
		assertEquals(1, appList.size());
		//
	}
	
}
