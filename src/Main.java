import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable initializations
        int n, r, nFactorial = 1, rFactorial = 1, nMinusRFactorial = 1, result;

        //scanner initialization and user inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of objects: ");
        n = scanner.nextInt();

        System.out.print("Enter the number of objects to be chosen: ");
        r = scanner.nextInt();

        //The combination formula is: C(n,r) = n! / (r! * (n-r)!)

        //calculating the n! part of the formula
        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        //calculating the r! part of the formula
        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        //calculating the (n-r)! part of the formula
        for (int i = 1; i <= (n - r); i++) {
            nMinusRFactorial *= i;
        }

        //print the result of the combination to the user
        System.out.println("This combination's result is " + nFactorial / (rFactorial * nMinusRFactorial));
    }
}