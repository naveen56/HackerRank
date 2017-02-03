
import java.util.Scanner;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naveen
 */
public class RichieRich {
    static String str;
    static int k;
    public static void main(String args[]){
       
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        k=s.nextInt();
         str=s.next();
        System.out.println(value(k,str));
        
    }
    

    private static String value(Integer var,String string) {
        
        char ch[]=string.toCharArray();
         if(palindrome()){
             if(k==1&&string.length()%2!=0)
             {
                 
                 ch[(string.length()/2)+1]='9';
                 return ch.toString();
             }
             else{
                for(int i=0;i<string.length();i++){
                    if(ch[i]!='9'){
                        ch[i]='9';
                        
                    }
                }
             }
            
        }
            
            return string;
        
    }

    private static boolean palindrome() {
           String string=new StringBuilder(str).reverse().toString();
           if(str.equals(string))
               return true;
           else
               return false;
                 
    }
    
}
