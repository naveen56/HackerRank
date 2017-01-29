/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author naveen
 */
public class SuperReducedString {

    /**
     * @param args the command line arguments
     */
    static char[] ip;
    static int flag=0;
    public static void main(String[] args) {
     String inputstring;
     Scanner s=new Scanner(System.in);
     inputstring=s.next();
     StringBuilder ip=new StringBuilder(inputstring);
     for(int i=1;i<ip.length();i++){
         if(ip.charAt(i)==ip.charAt(i-1)){
             ip.delete(i-1,i+1);
             
             i=0;
         }
     }
     if(ip.length()==0){
         System.out.println("Empty String");
     }
     else
         System.out.println(ip);
     
    }

    
        
    
    
}
