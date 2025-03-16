
/*8. Program to find all the patterns of 0(1+)0 in the given string. 
Given a string containing 0's and 1's, find the total number of 0(1+)0 patterns in the string and output it. 
0(1+)0 - There should be at least one '1' between the two 0's. 
For example, consider the following string. 
Input: 01101111010 
Output: 3 
Explanation: 01101111010 - count = 1 
             01101111010 - count = 2 
             01101111010 - count = 3 
Step to find all the patterns of 0(1+)0 in the given string
• Input the given string.
• Scan the string, character by character.
• If the given pattern is encountered, increment count.
• Print count. Program to find all the patterns of 0(1+)0 */
import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int count = 0;
        int i = 0;
        int start;
        int end;
        while (i < str.length() - 1) {
            if (str.charAt(i) == '0') {
                i++;
                start = i;
                while (str.charAt(i) == '1') {
                    i++;
                }
                end = i;
                for (int k = start - 1; k < end + 1; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.print(" ");
                System.out.println(++count);
            }
        }
        scanner.close();
    }
}
// regex,tokenizer,string functions