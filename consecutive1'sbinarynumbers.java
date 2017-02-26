import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //System.out.println(Integer.toBinaryString(n));
        String _bin = Integer.toBinaryString(n);
        char[] _binarr = _bin.toCharArray();
        
        int length_ofcons = 1;
        int printable = 1;
        int check = 0;
        for(int i = 0; i < _binarr.length-1; i++){
            if(_binarr[i] == '1' && _binarr[i+1] == '1'){
                length_ofcons++;
                if(length_ofcons > check){
                    printable = length_ofcons;
                    check = length_ofcons;
                }
                //System.out.println("found");
            }
            else{
                length_ofcons = 1;
            }
        }
        System.out.println(printable);
        /*for (char output : _binarr) {
			System.out.println(output);
		}*/
    }
}
