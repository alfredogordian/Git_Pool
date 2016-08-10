
/**
 * Created by alfredo on 04-08-16.
 */
public class SecondAlgorithmCreatorImpl implements AlgorithmCreatorInterface {
    public int[] arrayIntegerRotate(int[] input, int rotation) {

        if (input==null || rotation<0){
            throw new IllegalArgumentException("Wrong Argument");
        }

        return input;
    }

    public String wordsReverser(String originalPhrase) {
        return null;
    }

    public boolean palindromeEvaluator(String phrase) {
        return false;
    }

    public int[] fibonacciCreator(int size) {
        return new int[0];
    }
}
