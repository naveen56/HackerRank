
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
public class GridlandMetro {
    public static void main(String args[]){
        int n,m,k;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        k=s.nextInt();
        int a[][]=new int[n][m];
        int count=0;
        for(int i=0;i<k;i++){
            int row=s.nextInt();
            int c1=s.nextInt();
            int c2=s.nextInt();
            for(int j=c1;j<=c2;j++){
                if(a[row-1][j-1]!=1){
                    count++;
                    a[row-1][j-1]=1;
                }
                else
                a[row-1][j-1]=1;
                
            }
           
        }
      
        System.out.println((n*m)-count);
        
    }
    
}
