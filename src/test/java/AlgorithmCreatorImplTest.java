import org.junit.Before;
import org.junit.Test;


/**
 * Created by alfredo on 04-08-16.
 */
public class AlgorithmCreatorImplTest {

    @Before
    public void setUp(){

    }

    @Test
    public void testArrayIntegerRotate() throws Exception {
        int [] firstEvaluation = {1,2,3,4,5,7};
        int firstRotation = 2;
        int [] firstResult = {5,7,1,2,3,4};
        AlgorithmCreatorInterface algorithmCreator = new AlgorithmCreatorImpl();

        int [] result = algorithmCreator.arrayIntegerRotate();

        AssertEquals.

    }
}