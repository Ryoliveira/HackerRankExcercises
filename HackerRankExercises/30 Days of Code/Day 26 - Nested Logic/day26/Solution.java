package day26;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dateReturned = {input.nextInt(), input.nextInt(), input.nextInt()};
        int[] expectedDate = {input.nextInt(), input.nextInt(), input.nextInt()};

        int fee = 0;
        if(dateReturned[2] < expectedDate[2]){
            fee = 0;
        }
        else if(dateReturned[2] - expectedDate[2] != 0){//years late
            fee = 10000;
        }
        else if(dateReturned[1] - expectedDate[1] > 0){//months late
            int monthsLate = dateReturned[1] - expectedDate[1];
            fee = 500 *  monthsLate;
        }
        else if(dateReturned[0] - expectedDate[0] > 0){//days late
            int daysLate = dateReturned[0] - expectedDate[0];
            fee = 15 * daysLate;
        }
        System.out.println(fee);


    }
}
