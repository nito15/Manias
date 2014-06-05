package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import codigo.primero;

public class testeo {

	primero suma = new primero();
	
	@Before
	public void setUp() throws Exception {
		suma.setprimero(10);
		suma.setprimero2(20);
	}

	@Test
	public void test() {
		
		assertEquals (40,suma.suma());

	}

}
