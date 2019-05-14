import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int val = input.nextInt();
            list.add(val);
        }
        int queries = input.nextInt();
        for(int i=0;i<queries;i++){
            String operation = input.next();
            if(operation.equals("Insert")){
                int x = input.nextInt();
                int y = input.nextInt();
                list.add(x, y);
            }else{
                int x = input.nextInt();
                list.remove(x);
            }
        }
        for(int num: list){
            System.out.print(num + " ");
        }
    }
}

