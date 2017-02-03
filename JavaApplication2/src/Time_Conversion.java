
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
public class Time_Conversion {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char[] ch=str.toCharArray();
        int length=ch.length;
         String[] string=str.split(":");
         
        if(ch[8]=='P'){
            String hours;
           
            int hour=Integer.parseInt(string[0]);
            
                hour+=12;
                if(hour==24)
                    hours="12";
                else
                hours=String.valueOf(hour);
                
            
            System.out.print(hours+":"+string[1]+":"+ch[6]+ch[7]);
            
            
        }
        else{
            if(string[0].equals("12"))
                string[0]="00";
            System.out.print(string[0]+":"+string[1]+":"+ch[6]+ch[7]);
        }
    }
}
