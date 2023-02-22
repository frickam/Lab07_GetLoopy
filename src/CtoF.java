import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int tempFahrenheit = 0;
        int tempCelsius = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("Enter the temperature in fahrenheit: ");
            if (in.hasNextInt())
            {
                tempFahrenheit = in.nextInt();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("ERROR!");
                System.out.println("Enter a valid value for temperature! Not: " + trash);
            }
        }
        while (!done);

        tempCelsius = (tempFahrenheit - 32) * 5/9;

        System.out.println("The temperature " + tempFahrenheit + " degrees fahrenheit is equal to " + tempCelsius + " degrees celsius.");
    }
}
