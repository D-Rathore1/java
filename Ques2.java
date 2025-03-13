/*
  2. Using the switch statement, write a menu-driven program to calculate the
  maturity amount of a bank deposit.
  The user is
  (i) Term Deposit
  (ii) Recurring Deposit
  For option (i) accept Principal (p), rate of interest (r) and time period in years (n).
  Calculate and output the maturity amount (a) receivable using the formula a = p[1 + r / 100]n.
  For option (ii) accept monthly installment (p), rate of interest (r) and time period in months (n).
  Calculate and output the maturity amount (a) receivable using the formula a = p * n + p * n(n + 1) / 2 * r / 100 * 1 / 12.
  For an incorrect option, an appropriate error message should be displayed.
  [ Use Scanner Class to take input]
 */

import java.util.Scanner;

public class Ques2 {
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("1. Term Deposit");
        System.out.println("2. Recurring Deposit");
        int a = ip.nextInt();
        switch (a) {
            case 1:
                System.out.println("Principal, P = ");
                double P = ip.nextDouble();
                System.out.println("Rate of Interest, R = ");
                double r = ip.nextInt();
                System.out.println("Time Period, T = ");
                int n = ip.nextInt();
                double x = P * Math.pow((1 + r / 100), n);
                System.out.println(x);
                break;
            case 2:
                System.out.println("Monthly Installment, P = ");
                double p = ip.nextDouble();
                System.out.println("Rate of Interest, R = ");
                double R = ip.nextInt();
                System.out.println("Time Period, T = ");
                int T = ip.nextInt();
                double y = (p * T + p * T * (T + 1) / 2 * R / 100 * 1 / 12);
                System.out.println(y);
        }
        ip.close();
    }
}
