import java.util.Scanner;
import java.lang.*;

class Money{
 public static void main (String args[]){
     Scanner ip = new Scanner(System.in);
    // System.out.println("Enter the amount of money : ");
    // double amt = ip.nextDouble();
     System.out.println("1. Term Deposit");
     System.out.println("2. Recurring Deposit");
     int a = ip.nextInt();
     switch (a){
        case 1:
        System.out.println("Principal, P = ");
        double P = ip.nextDouble();
        System.out.println("Rate of Interest, R = ");
        double r = ip.nextInt();
        System.out.println("Time Period, T = ");
        int n = ip.nextInt();
        double x = P*Math.pow((1+r/100),n);
        System.out.println(x);
     break;
        case 2: 
        System.out.println("Monthly Installment, P = ");
        double p = ip.nextDouble();
        System.out.println("Rate of Interest, R = ");
        double R = ip.nextInt();
        System.out.println("Time Period, T = ");
        int T = ip.nextInt();
        double y = (p*T+p*T*(T+1)/2*R/100*1/12);
        System.out.println(y);
     }
 }
}
