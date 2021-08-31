package studios.controlflow;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExercise {
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 32, 12, 14, 23, 4, 56, 12, 542));
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Greg", "George", "Frank", "Asdf", "Bill", "Josephine", "Annie"));
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> convertList = new ArrayList<>(Arrays.asList(sentence.split(" ")));

        System.out.println(ArrayListActions.sum(numList));
        ArrayListActions.fiveLetterWords(stringList);
        ArrayListActions.fiveLetterWords(convertList);
    }
}
