
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
public class OrganisingBalls {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t--!=0){
            int n=s.nextInt();
            int size[]=new int[n];
            int m[][]=new int[n][n];
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=0;j<n;j++){
                    m[i][j]=s.nextInt();
                    sum+=m[i][j];
                }
                size[i]=sum;
            }
            int type[]=new int[n]; 
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=0;j<n;j++){
                    sum+=m[j][i];
                }
                type[i]=sum;
            }
            int flag=1;
        for(int i=0;i<n;i++){
            flag=0;
            for(int j=0;j<n;j++){
                if(size[i]==type[j]){
                    type[j]=-1;
                    flag=1;
                    break;
                }
            }
            
            if(flag==0){
                System.out.println("Impossible");
                break;
            }
        }
        if(flag==1){
            System.out.println("Possible");
        }
        }
    }
    
}
