
/*3.
  Program to find the given numbers are Friendly pair or not (Amicable or not). Friendly Pair are two or more numbers with a common abundance. 
  Input & Output format:
  • Input consists of 2 integers.
  • The first integer corresponds to number 1 and the second integer corresponds to number 2.
  • If it is a Friendly Pair display Friendly Pair or displays Not Friendly Pair. 
  For example,6 and 28 are Friendly Pair. (Sum of divisors of 6)/6 = (Sum of divisors of 28)/28. 
  Steps to check whether the given numbers are friendly pair or not
  • Input the numbers num1 and num2.
  • Initialize sum1 = sum2 = 0.
  • sum1 = sum of all divisors of num1.
  • sum2 = sum of all divisors of num2.
  • If (sum1 == num1) and (sum2 == num2), then print "Abundant Numbers".
  • Else, print "Not Abundant Numbers". 
  Program to check whether the given numbers are friendly pair or not.
 */

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num1 = ip.nextInt();
        int num2 = ip.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                sum1 = sum1 + i;
            }
        }
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                sum2 = sum2 + i;
            }
        }
        if ((sum1 / num1) == (sum2 / num2)) {
            System.out.println("Friendly Pair");
        } else {
            System.out.println("Not Friendly Pair");
        }
        ip.close();
    }
}
