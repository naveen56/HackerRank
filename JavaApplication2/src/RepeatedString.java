
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naveen
 */
public class RepeatedString {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        long n=s.nextLong();
        long num1=0,num2=0;
        long balance=n%str.length();
        for(int i=1;i<=str.length();i++){
            if(str.charAt(i-1)=='a')
            {
                num1++;
                if(i<=balance)
                {
                    num2++;
                }
                
                
        }
        }
        System.out.println((n/str.length())*num1+num2);
    }
    
}
