import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alfredo on 04-08-16.
 */
public class AlgorithmCreatorInterfaceTest {

    @Test
    public void testArrayIntegerRotate() throws Exception {
        int rotation = 3;
        int [] evaluation = {1,2,3,4,5,6,7};
        int [] resultExpected = {5,6,7,1,2,3,4};

        AlgorithmCreatorInterface algorithmCreator = new FirstAlgorithmCreatorImpl();
        int [] result = algorithmCreator.arrayIntegerRotate(evaluation, rotation);
        assertArrayEquals("The array must be the same",  resultExpected, result);

        rotation = 10;
        evaluation = new int[]{2,3,42,4,56,2,34};
        resultExpected = new int[]{56,2,34,2,3,42,4};

        result = algorithmCreator.arrayIntegerRotate(evaluation, rotation);
        assertArrayEquals("The array must be the same",  resultExpected, result);
    }

}