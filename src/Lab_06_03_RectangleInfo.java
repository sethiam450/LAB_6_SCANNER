import java.util.Scanner;
public class Lab_06_03_RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length of your rectangle. ");
        System.out.println("Please enter the width of your rectangle. ");
        if (in.hasNextInt()) {
            int length = in.nextInt();
            int width = in.nextInt();
            int area = length * width;
            int perimeter = (length * 2) + (width * 2);
            System.out.println("The perimeter of your rectangle is "  +perimeter+ " and the area of your shape is " +area );
            int diagLength1 = length^2 + width^2;
            double diaglenth2 = (diagLength1)^2;
            System.out.println("The length of your diagonal is " +diaglenth2);
        }
        else
        {
            System.out.println("You entered an incorrect input, please try again!");
        }







    }

}
