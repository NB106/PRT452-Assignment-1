package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class equation {

	@Test
public void testEquation() {
			JunitTesting test=new JunitTesting();
			double output = test.equation(4, 2, 2, 5);
			assertEquals(6.5,output,0.0);
	}
}
