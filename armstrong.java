mport java.util.Scanner;

public class ArmstrongNumber {

 
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = 0;

  
        while (number > 0) {
            number /= 10;
            digits++;
        }

        number = originalNumber;

       
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
    }
}
