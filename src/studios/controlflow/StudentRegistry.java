package studios.controlflow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRegistry {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer studentID = 1;
        String studentName;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.println("Student Name: ");
            studentName = input.nextLine();
            if(!studentName.equals("")) {
                students.put(studentID, studentName);
                studentID++;
            }

        } while(!studentName.equals(""));

        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println("Student Name: " + student.getValue() + " || ID: " + student.getKey());
        }
    }
}
