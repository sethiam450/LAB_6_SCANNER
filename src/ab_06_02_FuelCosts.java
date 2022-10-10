import java.util.Scanner;
public class ab_06_02_FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of gallons your car can hold. ");

        System.out.println("Next, please enter your miles per gallon. ");

        System.out.println("Finally, enter your price per gallon. ");

        if (in.hasNextInt() && in.hasNextDouble() && in.hasNextDouble()) {

            int numGal = in.nextInt();
            double doubleMpg = in.nextDouble();
            double doublePricePer = in.nextDouble();

            {
                double totMiles = doubleMpg * numGal;
                double totCost = doublePricePer * numGal;
                double cost100 = (totCost / totMiles) * 100;
                System.out.println("Your cost per 100 miles driven is $" + cost100);
            }
        }
            else if (in.hasNext() && !in.hasNextDouble()) {

                System.out.println("You entered invalid inputs, please try again! ");

            }


        }

    }
