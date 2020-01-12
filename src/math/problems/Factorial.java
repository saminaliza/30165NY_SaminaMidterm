package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int givenNumber = 5; //using iteration
        int factorial = 1;
        //int number=5;//It is the number to calculate factorial
        for (int i = 1; i <= givenNumber; i++) {
            factorial = factorial * i;

        }
        System.out.println("______Factorial using Iteration______");
        System.out.println("Factorial of " + givenNumber + " is: " + factorial);
        System.out.println("______Factorial using Recursion______");
        System.out.println("Factorial of the given number is: " + findFactorial(5));
    }
//using recursion
    static int findFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * findFactorial(n - 1));
    }

}



