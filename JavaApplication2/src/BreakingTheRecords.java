
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
public class BreakingTheRecords {
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int val=s.nextInt();
        int max=val;
        int min=val;
        int countofmax=0;
        int countofmin=0;
        for(int i=1;i<n;i++){
             val=s.nextInt();
             
             if(max<val)
             {
                 
                 countofmax++;
                 max=val;
             }
             if(min>val){
                 
                 countofmin++;
                 min=val;
             }
        }
        System.out.println(countofmax+" "+countofmin);
    }
    
}
