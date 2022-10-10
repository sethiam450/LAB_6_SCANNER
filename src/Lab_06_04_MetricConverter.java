import java.util.Scanner;
public class Lab_06_04_MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your measurement in meters ");
        if (in.hasNextInt()) {
            int meters = in.nextInt();
            double miles = meters * .000621;
            double feet = meters * 3.28084;
            double inches = meters * 39.3701;
            System.out.println(" You input in miles is " +miles+", in feet is " +feet+" and in inches it is " +inches);



        }
        else {
            System.out.println("You entered an incorrect input, please try again!");
        }

    }
}