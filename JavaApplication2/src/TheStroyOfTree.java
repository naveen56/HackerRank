
import java.util.LinkedHashMap;
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
public class TheStroyOfTree {
    public static void main(String args[]){
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        while(t--!=0){
            int n=s.nextInt();
            //a[0] parent a[1] val
            int a[][]=new int[n][2];
            for(int i=0;i<n-1;i++){
                a[i][0]=s.nextInt();
                a[i][1]=s.nextInt();
            }
            
            int g=s.nextInt();
            int k=s.nextInt();
            int [][] guess=new  int[g][2];
            //
            for(int i=0;i<g;i++){
               int val=s.nextInt();
               int parent=s.nextInt();
               guess[i][0]=val;
               guess[i][1]=parent;
            }
//            System.out.println(guess.length+" size"+guess[0][0]);
            
            int countofprob=0;
            for(int i=1;i<=n;i++){
                LinkedHashMap<Integer,Integer> created=createmap(i,a,n);
               // System.out.println(created);
                int count=0;
                for(int j=0;j<g;j++){
                    
                    if(created.get(guess[j][1])==guess[j][0])
                        count++;
                    
                }
//                System.out.println(count);
                if(count>=k)
                    countofprob++;
                
            }
            int number=gcd(countofprob,n);
            
            System.out.println((countofprob/number)+"/"+(n/number));
            
            
        }
    }

    private static LinkedHashMap<Integer, Integer> createmap(int i, int[][] a,int n) {
        LinkedHashMap<Integer,Integer> created=new LinkedHashMap();
        created.put(i, -1);
        int[] queue=new int[n];
        int [] flag=new int[n+1];
        int rear=-1;
        int current=0;
        queue[++rear]=i;
        flag[i]=1;
        while(current<=rear){
            
            for(int j=0;j<n;j++){
                if(a[j][0]==queue[current])
                {
                    
                   
                   if(flag[a[j][1]]!=1){ 
                   queue[++rear]=a[j][1];
                    created.put(a[j][1],queue[current]);
                   }
                   flag[a[j][1]]=1;
                }
                else if(a[j][1]==queue[current]){
                    
                   if(flag[a[j][0]]!=1){ 
                   queue[++rear]=a[j][0];
                    created.put(a[j][0],queue[current]);
                   }
                   flag[a[j][0]]=1;
                    
                }
            }
//            for(int k=0;k<queue.length;k++)
//                System.out.print(queue[k]+" ");
//            System.out.println();
            current++;
            
        }
        return created;
    }

    private static int gcd(int number1, int number2) {
        if(number2 == 0){
            return number1;
        }
        return gcd(number2, number1%number2);




    }
    
}
