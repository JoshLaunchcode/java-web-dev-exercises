package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        double radius;
        boolean verified = false;

        while(!verified) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is the radius of your circle?");
            if(input.hasNextDouble()) {
                radius = input.nextDouble();
                if(radius > 0){
                    verified = true;
                    System.out.println("Area is " + Circle.getArea(radius));
                } else {
                    Error.msg();
                }
            } else {
                Error.msg();
            }

        }

    }

}
