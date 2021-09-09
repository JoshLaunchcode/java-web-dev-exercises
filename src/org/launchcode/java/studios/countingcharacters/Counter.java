package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws Exception {
        String stringToTest;
        String stringFromFile;
        String defaultString = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";

        // Import file if it exists
        File file = new File("C:\\Users\\Josh\\Desktop\\string.txt");
        Scanner scanFile = new Scanner(file);
        if(scanFile.hasNext()) {
            stringFromFile = scanFile.nextLine();
        } else {
            stringFromFile = "";
        }

        //Ask user for input
        Scanner input = new Scanner(System.in);
        System.out.println("Press Enter to use default, or enter a string below.");
        String userInput = input.nextLine();

        //If no user input or user file use default string
        stringToTest = userInput.equals("") ? (stringFromFile.equals("") ? defaultString : stringFromFile) : userInput;

        //Initialize HashMap from stringToTest
        char[] charactersInString = stringToTest.toLowerCase().toCharArray();
        HashMap<Character, Integer> charTotals = new HashMap<>();

        //Count characters
        for(Character character : charactersInString) {
            if(Character.isLetter(character)) {
                charTotals.put(character, charTotals.getOrDefault(character, 0) + 1);
            }
        }

        //Print results
        System.out.println("String to count: " + stringToTest);
        for(Map.Entry<Character, Integer> character : charTotals.entrySet()){
            System.out.println(character.getKey() + ": " + character.getValue());
        }

    }

}
