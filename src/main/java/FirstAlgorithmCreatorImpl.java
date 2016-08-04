/**
 * Created by alfredo on 04-08-16.
 */
public class FirstAlgorithmCreatorImpl implements AlgorithmCreatorInterface {

    public int[] arrayIntegerRotate(int[] input, int rotation) {
        int [] result = new int[input.length];
        rotation = rotation % input.length;

        for(int i=0; i<rotation; i++){
            result[i]=input[input.length-rotation+i];
        }
        for(int j=0; j<input.length-rotation; j++){
            result[j+rotation]=input[j];
        }
        return result;
    }


}
