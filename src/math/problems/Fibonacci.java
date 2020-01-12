package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

int limit = 40;
for (int i = 1; i < limit; i++){
    System.out.println(findFibonacci(i) + ", ");
}
    }
    public static int findFibonacci (int number){
        if (number == 0){
            return 1;
        }
        if (number == 1){
            return 1;
        }if (number == 2){
            return 3;
        }
        return findFibonacci(number-1) + findFibonacci(number-2);
    }
}
