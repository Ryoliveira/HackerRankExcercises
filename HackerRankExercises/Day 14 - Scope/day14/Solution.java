package day14;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//Day 14: Scope
public class Solution {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int[] arr){
        maximumDifference = Integer.MIN_VALUE;
        elements = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            elements[i] = arr[i];
        }
    }

    public void computeDifference(){
        for(int a : elements){
            for(int b : elements){
                maximumDifference = Math.abs(a-b) > maximumDifference ? Math.abs(a-b) : maximumDifference;
                
            }
        }
    }

} // End of Difference class

