package studios.controlflow;
import java.util.Arrays;

public class Array {

    public static void main(String[] args){
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitStringSpace = sentence.split(" ");
        String[] splitStringPeriod = sentence.split("\\.");

        int[] values = {1, 1, 2, 3, 5, 8};

        for(int value: values){
            if(value % 2 == 1){
                System.out.println(value);
            }
        }

        System.out.println(Arrays.toString(splitStringSpace));
        System.out.println(Arrays.toString(splitStringPeriod));

    }

}
