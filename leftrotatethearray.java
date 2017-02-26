import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] myList = new int[n];
        for(int i = 0; i < n; i++){
            int take = in.nextInt();
            myList[i] = take;
        }
        /*for(int i = 0; i < n; i++){
            System.out.println(myList[i]);
        }*/
        int[] _newmyList = new int[n];
        for(int i = 0; i < n; i++){
            int new_pos = i - k;
            if(new_pos < 0){
                new_pos = new_pos + n;
            }
            _newmyList[new_pos] = myList[i];
        }
        for(int i = 0; i < n; i++){
            System.out.print(_newmyList[i] + " " );
        }
    }
}
