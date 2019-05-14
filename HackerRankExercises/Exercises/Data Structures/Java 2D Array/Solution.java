import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    static int hourglassSum(int[][] arr) {
        int res = Integer.MIN_VALUE;
        int limit = 4;
        for (int x = 0; x < limit; x++) {
            for (int y = 0; y < limit; y++) {
                int sum = 0;
                sum = arr[x][y] + arr[x][y + 1] + arr[x][y + 2];
                sum += arr[x + 1][y + 1];
                sum += arr[x + 2][y] + arr[x + 2][y + 1] + arr[x + 2][y + 2];
                res = (sum > res) ? sum : res;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println(hourglassSum(arr));

        scanner.close();
    }
}
