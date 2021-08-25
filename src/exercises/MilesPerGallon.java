package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        int miles;
        int gallons;

        miles = GetInput.getInput("How many miles have you driven?");
        gallons = GetInput.getInput("How many gallons of fuel have you consumed?");

        System.out.println("Miles-per-gallon: " + miles/gallons);

    }
}
