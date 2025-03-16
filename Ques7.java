
/*7. Program to find the saddle point coordinates in a given matrix. 
A saddle point is an element of the matrix, which is the minimum element in its row and the maximum in its column. 
For example, consider the matrix given below Mat[3][3] 
1 2 3 
4 5 6 
7 8 9 
Here, 7 is the saddle point because it is the minimum element in its row and maximum element in its column. 
Steps to find the saddle point coordinates in a given matrix
1. Input the matrix from the user.
2. Use two loops, one for traversing the row and the other for traversing the column.
3. If the current element is the minimum element in its row and maximum element in its column, then return its coordinates.
4. Else, continue traversing. */
import java.util.*;

public class Ques7 {
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int n = ip.nextInt();
        System.out.println("Enter the no. of columns : ");
        int m = ip.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = ip.nextInt();

            }
        }
        int max;
        int min;
        int found = 0;
        for (int i = 0; i < n; i++) {
            min = arr[i][0];
            int colindex = 0;
            for (int j = 1; j < m; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    colindex = j;
                }
            }
            max = arr[0][colindex];
            for (int k = 1; k < n; k++) {
                if (arr[k][colindex] > max) {
                    max = arr[k][colindex];
                }
            }
            if (min == max) {
                System.out.println("Saddle point is : " + max);
                found = 1;
                break;
            }
        }
        if (found == 0) {
            System.out.println("No point found");
        }
        ip.close();
    }
}