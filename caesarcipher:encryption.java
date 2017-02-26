import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//char count
        String s = in.next();
        int k = in.nextInt();//shift count
        for(int i = 0; i < n; i++){
            char _c = s.charAt(i);
            if(Character.isLetter(_c)){
                int _ascii = (int)_c;
                int shifted_ascii = _ascii + k;
                //lower letter
                while(_ascii > 96 && _ascii < 123 && shifted_ascii > 122){
                    shifted_ascii = 96 + (shifted_ascii - 122);
                }
                //capital letter
                while(_ascii > 64 && _ascii < 91 && shifted_ascii > 90){
                    shifted_ascii = 64 + (shifted_ascii - 90);
                }
                System.out.print((char)shifted_ascii);   
            }
            else{
                System.out.print(_c);
            }
        }
    }
}
