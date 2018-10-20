package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	
	@Test
	public void numberOneReturnsone() {
		Assert.assertEquals( "one", "1", numberWords.toWords( 1 ) ) ;
	}
	@Test
	public void numberOneReturnsTwo() {
		Assert.assertEquals( "two", "2", numberWords.toWords( 2 ) ) ;
	}
	@Test
	public void numberOneReturnsThree() {
		Assert.assertEquals( "three", "3", numberWords.toWords( 3 ) ) ;
	}
	
}
