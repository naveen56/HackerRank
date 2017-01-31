/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naveen
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
       int count=0;
        for(int apple_i=0; apple_i < m; apple_i++){
            int apple=in.nextInt();
            if(a+apple>=s&&a+apple<=t){
                count++;
            }
        }
        System.out.println(count);
        count=0;
        int orange;
        for(int orange_i=0; orange_i < n; orange_i++){
            orange =in.nextInt();
            if(orange+b<=t&&orange+b>=s)
                count++;
        }
        System.out.println(count);
    }
}