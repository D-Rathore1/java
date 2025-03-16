
/*4
Program to replace all 0's with 1 in a given integer. Given an integer as an input, all the 0's in the number has to be replaced with 1.
For example, consider the following number
Input: 102405
Output: 112415
Input: 56004
Output: 56114
Steps to replace all 0's with 1 in a given integer
• Input the integer from the user.
• Traverse the integer digit by digit.
• If a '0' is encountered, replace it by '1'.
• Print the integer. */

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int result = 0, multiplier = 1;

        while (num > 0) {
            int digit = num % 10;

            if (digit == 0) {
                digit = 1;
            }

            result += digit * multiplier;

            multiplier *= 10;
            num /= 10;
        }

        System.out.println("Output: " + result);
        scanner.close();
    }

}