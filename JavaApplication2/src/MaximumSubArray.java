
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
public class MaximumSubArray {
    static int sum=0,max=0,flag=0;
    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t--!=0){
            sum=0;flag=0;
         int n=s.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++){
             a[i]=s.nextInt();
         }
         int val=0;
         if(n>0){
        if(a[0]>=0){
            sum+=a[0];
        flag=1;
        }
        
        max=a[0];
          val=f(a[0],1,a);
         if(flag==0)
             sum=max;
         }
         System.out.println(val+" "+sum);
        }
    }

    private static int f(int countsofar, int current, int[] a) {
    if(current==a.length){
        return countsofar;
    }
    
    if(a[current]>=0){
        sum+=a[current];
    flag=1;
    }
    
    if(max<a[current])
        max=a[current];
    int val=countsofar+a[current];
    int functionvalue=f(val>a[current]?countsofar+a[current]:a[current],current+1,a);
    int returnvalue= max(countsofar,a[current],functionvalue);
    
    return returnvalue;
    }

    private static int max(int countsofar, int i, int f) {
        int max=countsofar;
        if(countsofar<i)
            max=i;
        if(max<f)
            max=f;
        return max;
        
    }
    
}
