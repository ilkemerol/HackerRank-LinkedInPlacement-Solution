import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public  static void find_lex(String s){
        int largestI=-1;
        int largestJ= 0;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) < s.charAt(i+1)){
                largestI=i;    
            }
        }
        if(largestI==-1){
            System.out.println("no answer");
            return;
        }

        for(int j=0;j<s.length();j++){
            if(s.charAt(j) > s.charAt(largestI)){
                largestJ=j;    
            }
        }

        char[] characters=s.toCharArray();
        characters[largestI]=s.charAt(largestJ);
        characters[largestJ]=s.charAt(largestI);
        s=String.valueOf(characters);

        String s1=s.substring(largestI+1);
        s=s.substring(0,largestI+1);   
        StringBuilder sb= new StringBuilder(s1);
        sb=sb.reverse(); 
        System.out.println(s.concat(sb.toString()));    

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner myScan = new Scanner(System.in);
        int count = myScan.nextInt();
        for(int i = 0; i < count; i++){
            String str = myScan.next();
            //System.out.println(str);
            find_lex(str);
        }
    }
}
