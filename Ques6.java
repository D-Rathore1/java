
/*6. The problem to rearrange positive and negative numbers in an array . 
Method: This approach moves all negative numbers to the beginning and positive numbers to the end but changes the order of appearance 
of the elements of the array. 
Steps:
1. Declare an array and input the array elements.
2. Start traversing the array and if the current element is negative,
   swap the current element with the first positive element and continue traversing until all the elements have been encountered.
3. Print the rearranged array. Test case:
• Input: 1 -1 2 -2 3 -3
• Output: -1 -2 -3 1 3 2 */

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Size : ");
        int n = ip.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }
        // int arr2[];
        int temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                for (int j = 0; j < n; j++) {
                    if (arr[j] >= 0) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        ip.close();
    }
}
