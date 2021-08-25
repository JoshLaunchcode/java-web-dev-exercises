package exercises;
import java.util.Scanner;

public class GetInput {
    public static int getInput(String question){
        int value;

        Scanner input = new Scanner(System.in);
        System.out.println(question);
        return input.nextInt();

    }
}
