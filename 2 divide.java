import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("1st number : ");
        double num1 = input.nextDouble();
        
        System.out.print("2nd number : ");
        double num2 = input.nextDouble();
        
        if (num2 == 0) {
            System.out.println("Cannot divide  with zero !");
        } else {
            double result = num1 / num2;
            System.out.println(num1 + " divided by " + num2 + " is " + result);
        }
        
        input.close();
    }
}
