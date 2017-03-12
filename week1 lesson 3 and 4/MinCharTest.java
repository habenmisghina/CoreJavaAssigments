package week1lesson4q1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinCharTest {
	@Test
	public void minimumChar() {
	    char charTest=Mincharacter.mincharfinder("yonas",0,4);
		assertEquals('a',charTest);
	}
	

}
