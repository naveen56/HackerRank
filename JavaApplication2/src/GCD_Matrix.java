
import java.util.HashSet;
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
public class GCD_Matrix {
    public static void main(String args[]){
        int n,m,q;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        q=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int j=0;j<m;j++){
            b[j]=s.nextInt();
        }
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               mat[i][j]=findGCD(a[i],b[j]);
               
               
            }
        }
        for(int i=0;i<q;i++){
            int r1,c1,r2,c2;
            r1=s.nextInt();
            c1=s.nextInt();
            r2=s.nextInt();
            c2=s.nextInt();
            HashSet<Integer> hm=new HashSet();
            for(int x=r1;x<=r2;x++){
                for(int y=c1;y<=c2;y++){
                    hm.add(findGCD(a[x],b[y]));
                }
            }
            System.out.println(hm.size());
        }
            
    }
     private static int findGCD(int n1, int n2) {
        //base caseint r;
             int r;
            while(n2 != 0)
            {
                r = n1 % n2;
                n1 = n2;
                n2 = r;
            }
        return n1;
    }
  
}





