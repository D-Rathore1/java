
/*5.
Printing an array into Zigzag fashion. Suppose you were given an array of integers, and you are told to sort the integers in a zigzag pattern. 
In general, in a zigzag pattern, the first integer is less than the second integer, which is greater than the third integer, 
which is less than the fourth integer, and so on. Hence, the converted array should be in the form of e1 < e2 > e3 < e4 > e5 < e6.
Test cases:
Input 1:
7
4 3 7 8 6 2 1
Output 1:
3 7 4 8 2 6 1
Input 2:
4
1 4 3 2
Output 2:
1 4 2 3 */

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Size : ");
        int n = ip.nextInt();
        int arr[] = new int[n];
        int temp;
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }
        if (n % 2 == 0) {
            for (int i = 0; i < n; i = i + 2) {
                if (arr[i] < arr[i + 1] && arr[i] < arr[i - 1]) {
                    continue;
                } else if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                } else if (arr[i] > arr[i - 1]) {
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        } else {
            for (int i = 1; i < n; i = i + 2) {
                if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                    continue;
                } else if (arr[i] < arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                } else if (arr[i] < arr[i - 1]) {
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        ip.close();
    }
}
// 4 3 7 8 6 2 1
