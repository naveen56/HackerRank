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
public class GameOfTwoStacks {
    static long memory[][];

    private static long counter(long[] a, long[] b, int first, int second, long count,long sum) {
        if(a.length>first&&b.length>second&&memory[first][second]>0){
            return memory[first][second];
        }
        long countfirst=0,countsecond=0,max=count;
        if(a.length>first&&(sum-a[first])>0){
            //System.out.println((first+1)+" "+second+" "+(count+1)+" "+(sum-a[first]));
            countfirst=counter(a, b, first+1, second, count+1, (sum-a[first]));
        }
        if(max<countfirst){
            max=countfirst;
        }
        if(b.length>second&&(sum-b[second])>0)
        {
            //System.out.println((first)+" "+(second+1)+" "+(count+1)+" "+(sum-b[second]));
            countsecond=counter(a, b, first, second+1, count+1, (sum-b[second]));
        }
        
        if(max<countsecond){
            max=countsecond;
        }
        memory[first][second]=max;
        for(int i=0;i<a.length;i++)
            for(int j=0;j<b.length;j++)
                System.out.print(memory[i][j]+" ");
          System.out.println("");
        return memory[first][second];
    }
    
    public static void main(String args[]){
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        while(t--!=0){
            int m,n;
            long x;
            m=s.nextInt();
            n=s.nextInt();
            x=s.nextLong();
            
            long a[]=new long[m];
            long b[]=new long[n];
            memory=new long[m][n];
            for(int i=0;i<m;i++)
                a[i]=s.nextLong();
            for(int j=0;j<n;j++)
                b[j]=s.nextLong();
            System.out.println(counter(a,b,0,0,0,x));
        }
    }
    
}
