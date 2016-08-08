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

    public String wordsReverser(String originalPhrase) {

        char[] input= originalPhrase.toCharArray();

        int index=0;

        for(int i=0; i<input.length;i++){
           if(input[i]==' '){
                reverse(input, index, i-1);
               index = i + 1;
           }
        }
        reverse(input, index, input.length-1);
        reverse(input, 0, input.length-1);
        return String.copyValueOf(input);
    }

    public boolean palindromeEvaluator(String phrase) {
        return false;
    }

    private void reverse(char[] input, int index, int lastIndex) {
        while(index<lastIndex){
            char temp= input[index];
            input[index]=input[lastIndex];
            input[lastIndex]=temp;
            index++;
            lastIndex--;
        }
    }


}
