import org.junit.Assert;
import org.junit.Test;

public class AllQuiztest {

    private QuizOneJunit quiz = new QuizOneJunit();

    @Test
    public void testSquareNull() {
        Assert.assertThrows(NullPointerException.class, () -> quiz.square(null));
    }

    @Test
    public void testSquareInvalid() {
        Assert.assertThrows(IllegalArgumentException.class, () -> quiz.square("abc"));
    }

    @Test
    public void testSquareEquivalencePartition() {
        assertEquals(1, quiz.square(1));
        assertEquals(4, quiz.square(2));
        assertEquals(9, quiz.square(3));
        assertEquals(16, quiz.square(4));
        assertEquals(25, quiz.square(5));
        assertEquals(0, quiz.square(0));
        assertEquals(1, quiz.square(-1));
        // Assuming you want to handle null gracefully and return null
        assertEquals(null, quiz.square(null));
    }



	//////////////////////////////////////////////F2//////////////////////////////////////////////////
    @Test
    public void testEmptyInput() {
        Assert.assertEquals(0, quiz.countLetterA(""));
    }

    @Test
    public void testA() {
        Assert.assertEquals(1, quiz.countLetterA("a"));
    }

    @Test
    public void testAA() {
        Assert.assertEquals(2, quiz.countLetterA("aa"));
    }
	@Test
    public void testAB() {
        Assert.assertEquals(1, quiz.countLetterA("AB"));
	}

///////////////////////////////////////////////F3////////////////////////////////////////////////////////////
    @Test
    public void testCountLetterANullInput() {
        Assert.assertThrows(NullPointerException.class, () -> quiz.countLetterA(null));
    }

    @Test
    public void testCheckTwoLetter() {
        Assert.assertEquals(true, quiz.checkTwoLetter("a"));
	}
		 @Test
    public void testCheckTwoLetteraa() {
        Assert.assertEquals(true, quiz.checkTwoLetter("aa"));
	}

		@Test
    public void testCheckTwoLetterbb() {
        Assert.assertEquals(true, quiz.checkTwoLetter("bb"));
	}
		@Test
    public void testCheckTwoLetterA() {
        Assert.assertEquals(false, quiz.checkTwoLetter("A"));
	}
		@Test
    public void testCheckTwoLetter1() {
        Assert.assertEquals(false, quiz.checkTwoLetter("1"));
	}
	@Test
    public void testCheckTwoLetterabcd() {
        Assert.assertEquals(false, quiz.checkTwoLetter("abcd"));
    }
}

