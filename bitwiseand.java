import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            //!!!!!!!
            int[] myList = new int[n];
            for(int i = 0; i < n; i++){
                myList[i] = i+1;
            }
            /*for(int i = 0; i < n; i++){
                System.out.println(myList[i]);
            }*/
            int f_max = 0;
            for(int f = 0; f < n-1; f++){
                for(int s = f+1; s < n; s++){
                    int op = myList[f] & myList[s];
                    if(op > f_max && op < k){
                        f_max = op;
                    }
                }
            }
            System.out.println(f_max);
        }
    }
}
