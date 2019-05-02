package day25;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        for(int j=0;j<cases;j++){
            int val = input.nextInt();

            for(int i=2; i<=val/i; i++){
                if(val%i==0){
                    val=1;
                    break;
                }
            }

            System.out.println(val==1 ? "Not prime" : "Prime");
        }
    }
}

