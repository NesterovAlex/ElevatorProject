package boostbrain;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestElevator {
	
	private Elevator el;
	
	@Before
	public void run() {
		el = new Elevator();
	}

	@Test
	public void testPassToElevatorUp() {
		Person[] elevator = {new Person(), new Person()};
		List<Person>[] stage = new LinkedList[4];
		Assert.assertNotNull(el.passToElevatorUp(elevator, stage, 3));
	}
	
	@Test
	public void TestPassToElevatorDown() {
		Person[] elevator = {new Person(), new Person()};
		List<Person>[] stage = new LinkedList[4];
		Assert.assertNotNull(el.passToElevatorDown(elevator, stage, 3));
	}
	
	@Test
	public void TestPassFromElevator() {
		Person[] elevator = {new Person(), new Person()};
		List<Person> stage = new LinkedList();
		Assert.assertNotNull(el.passfromElevator(elevator, stage, 3));
	}
}
