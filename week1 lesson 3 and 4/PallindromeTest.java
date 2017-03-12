package week1lesson4q1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PallindromeTest {

	@Test
	public void testPallindrome() {
		boolean test=Pallindrome.isPalindrome("Yonas");
		assertEquals(true,test);
	}

}
