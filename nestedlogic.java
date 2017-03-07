import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner myScan = new Scanner(System.in);
        int act_day = myScan.nextInt();
        int act_month = myScan.nextInt();
        int act_year = myScan.nextInt();
        
        int exp_day = myScan.nextInt();
        int exp_month = myScan.nextInt();
        int exp_year = myScan.nextInt();
        
        //System.out.println(act_day + " " + act_month + " " + act_year + " " + exp_day + " " + exp_month + " " + exp_year);
        int total_point = 0;
        boolean disable_day = false;
        boolean disable_month = false;
        //First check year,
        if(act_year >= exp_year){
            if(act_month >= exp_month){
                if(act_day >exp_day){
                    total_point = (act_day - exp_day) * 15;
                }
                if(act_month > exp_month){
                    total_point = (act_month - exp_month) * 500;
                }
            }
            if(act_year > exp_year){
                total_point = 10000;
            }
        }
        else{
            total_point = 0;
        }
        System.out.println(total_point);
    }
}
