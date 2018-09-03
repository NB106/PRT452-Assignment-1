package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class distance {

	@Test
		public void testDistance() {
			JunitTesting test=new JunitTesting();
			double output = test.distance(1, 1, 1, 2);
			assertEquals(1.0,output,0.0);
	}

}
