package studios.controlflow;

import java.util.ArrayList;

public class ArrayListActions {
    public static Integer sum(ArrayList list){
        int sum = 0;
        for(Object number : list){
            int thisNum = (Integer)number;
            if(thisNum % 2 == 0 ) {
                sum += thisNum;
            }
        }
        return sum;
    }

    public static void fiveLetterWords(ArrayList list){
        for(Object word : list){
            String thisWord = (String)word;
            if(thisWord.length() == 5){
                System.out.println(thisWord);
            }
        }
    }
}
