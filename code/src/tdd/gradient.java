package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class gradient {

	@Test
	public void testGradient() {
		JunitTesting test=new JunitTesting();
		double output = test.gradient(4, 2, 2, 5);
		assertEquals(-1.5,output,0.0);
}
}
