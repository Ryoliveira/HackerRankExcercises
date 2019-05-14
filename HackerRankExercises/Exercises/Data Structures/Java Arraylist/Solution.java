
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> row = new ArrayList<>();
            int items = input.nextInt();
            for(int j=0;j<items;j++){
                int val = input.nextInt();
                row.add(val);
            }
            list.add(row);
        }
        int queries = input.nextInt();
        for(int i=0;i<queries;i++){
            int x = input.nextInt();
            int y = input.nextInt();
            try{
                int value = list.get(x-1).get(y-1);
                System.out.println(value);
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}

