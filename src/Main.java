import data.Circle;
import data.Rectangle;
import data.Triangle;
import method.Input;


public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("=====Calculator Shape Program=====");
        // Input a Rectangle
        System.out.println("=====Rectangle=====");
        Rectangle rec = input.inputRec();
        System.out.println("=====Circle=====");
        // Input a Circle
        Circle circle = input.inputCircle();
        System.out.println("=====Triangle=====");
        // Input a Triangle
        Triangle tri = input.inputTri();

        // Display the results
        input.display(tri, rec, circle);
    }
}

