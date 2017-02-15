
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
public class Append_and_Delete {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str,str2;
        int l1,l2,n,k;
        str=s.next();
        str2=s.next();
        //calcuating length of strings
        l1=str.length();
        l2=str2.length();
        k=s.nextInt();
        //the prefix of string to be common
        n=(l1+l2-k)/2;
        System.out.print(n);
        if(n<0)
            System.out.println("Yes");
        else if(n==0){
            
            if(str.charAt(0)==str.charAt(0))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
            
        
        else if(str.substring(0,n-1).equals(str2.substring(0,n-1)))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
