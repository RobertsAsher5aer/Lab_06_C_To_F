import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        double celsius = 0.0;
        boolean validInput = false;

        do {
           System.out.print("Enter a Celsius Temperature: ");
           if (in.hasNextDouble()) {
               celsius = in.nextDouble();
               validInput = true;
           } else {
               System.out.println("Please enter a valid numeric value. ");
               in.next();
           }
        } while (!validInput);

        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("The temperature " + celsius + " Celsius in Fahrenheit is: " + fahrenheit + " Fahrenheit.");



    }
}