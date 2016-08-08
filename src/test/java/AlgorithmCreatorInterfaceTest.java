import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by alfredo on 04-08-16.
 */
public class AlgorithmCreatorInterfaceTest {

    AlgorithmCreatorInterface algorithmCreator;
    
    @Before
    public void setUp(){
        algorithmCreator = new FirstAlgorithmCreatorImpl();
    }
    
    @Test
    public void testArrayIntegerRotate() throws Exception {
        int rotation = 3;
        int [] evaluation = {1,2,3,4,5,6,7};
        int [] resultExpected = {5,6,7,1,2,3,4};
        
        int [] result = algorithmCreator.arrayIntegerRotate(evaluation, rotation);
        assertArrayEquals("The array must be the same",  resultExpected, result);

        rotation = 10;
        evaluation = new int[]{2,3,42,4,56,2,34};
        resultExpected = new int[]{56,2,34,2,3,42,4};

        result = algorithmCreator.arrayIntegerRotate(evaluation, rotation);
        assertArrayEquals("The array must be the same",  resultExpected, result);
    }
    
    @Test
    public void testwordsReverser(){
        assertEquals("The result is not as expected", "blue is sky the", algorithmCreator.wordsReverser("the sky is blue"));
        assertEquals("The result is not as expected", "blue is sky the", algorithmCreator.wordsReverser("the sky is blue"));
        assertEquals("The result is not as expected", "asd", algorithmCreator.wordsReverser("asd"));
    }

    @Test
    public void palindromeEvaluatorTest(){
        assertTrue("The result should be true", algorithmCreator.palindromeEvaluator("Anita Lava La Tina"));
        assertFalse("The result should be false", algorithmCreator.palindromeEvaluator("This is not a palindrome"));
    }

}