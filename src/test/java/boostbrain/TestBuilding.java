package boostbrain;

import java.util.LinkedList;
import java.util.List;
import org.junit.Before;
import org.junit.*;

public class TestBuilding {
	
	private Building building;
	@Before
	public void run() {
		 building = new Building();
	}

	@Test
	public void testAddPeopleToQueue(){
		List<Person>[] arr = new LinkedList[3];
		Assert.assertNotNull(building.addPeopleToQueue(arr));
	}
	
}
