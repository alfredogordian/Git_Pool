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

    private void reverse(char[] input, int index, int lastIndex) {
        while(index<lastIndex){
            char temp= input[index];
            input[index]=input[lastIndex];
            input[lastIndex]=temp;
            index++;
            lastIndex--;
        }
    }

    public boolean palindromeEvaluator(String phrase) {

        phrase = phrase.trim();
        phrase = phrase.toLowerCase();
        char [] phraseArray = phrase.toCharArray();
        boolean isPalindrome = false;
        int indexReturn=1;
        for (int i=0; i<phraseArray.length/2;i++){

            if(!Character.isLetter(phraseArray[i])){
                i++;
            }

            if(!Character.isLetter(phraseArray[phraseArray.length - indexReturn])){
                indexReturn++;
            }

            if(phraseArray[i]==phraseArray[phraseArray.length-indexReturn]){
                isPalindrome = true;
            }else{
                return false;
            }

            indexReturn++;
        }
        return isPalindrome;

    }

    public int[] fibonacciCreator(int size) {

        int [] fibonacciSequence = new int[size];

        for(int i =0; i<size; i++) {
            if(i>1) fibonacciSequence[i]=fibonacciSequence[i-2]+fibonacciSequence[i-1];
            else if(i==1) fibonacciSequence[i]=1;
            else fibonacciSequence[i]=0;
        }
        return fibonacciSequence;
    }


}
