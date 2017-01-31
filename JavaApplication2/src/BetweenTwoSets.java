
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
public class BetweenTwoSets {
    public static void main(String args[]){
        int n,m;
        
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        int max=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
              a[i]=s.nextInt();
              if(a[i]>max)
                  max=a[i];
        }
        int b[]=new int[m];
        int min=0;
        if(m>0){
        b[0]=s.nextInt();
         min=b[0];
        }
        for(int i=1;i<m;i++){
            b[i]=s.nextInt();
            if(b[i]<min){
                min=b[i];
            }
                
        }
      
        int count=0;
        for(int j=max;j<=min;j++){
            
            if(check(j,a,b))
            {
                
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean check(int j, int[] a, int[] b) {
        
        for(int i=0;i<a.length;i++){
            if(j%a[i]==0){
                
            }
            else{
                
                return false;
            
            }
        }
        for(int i=0;i<b.length;i++){
            if(b[i]%j==0){
                
            }
            else{
                
                return false;
            }
        }
        return true;
    }

   
    
}
