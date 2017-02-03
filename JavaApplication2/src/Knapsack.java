
import java.util.Arrays;
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
public class Knapsack {
    public static void main(String args[]){
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        while(t--!=0){
           int n,k;
           n=s.nextInt();
           k=s.nextInt();
           int a[]=new int[n];
           for(int i=0;i<n;i++){
               a[i]=s.nextInt();
           }
           Arrays.sort(a);
           int total=0;
           int current=k;
           while(true){
               if(total==k){
                   break;
               }
               int flag=0;
           for(int i=a.length-1;i>=0;i--){
               
               if(a[i]<=current){
                 current-=a[i];
                 total+=a[i];
                 System.out.println(total);
                 flag=1;
                 break;
               }
           }
           
           if(flag==0){
               System.out.println("sorry");
               break;
           }
           }
           System.out.println(total);
           
        }
    }
    
}
