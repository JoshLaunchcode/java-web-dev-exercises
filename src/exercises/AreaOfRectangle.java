package exercises;

public class AreaOfRectangle {
    public static void main(String[] args){
        int height;
        int width;

        height = GetInput.getInput("What is the height of your rectangle? ");
        width = GetInput.getInput("What is the width of your rectangle?");
        System.out.println("The area of your rectangle is " + height * width);
    }
}
