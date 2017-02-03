
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
public class Max {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n,k;
        n=s.nextInt();
        k=s.nextInt();
        int max=0;
        for(int i=0;i<n;i++){
            int var=s.nextInt();
            if(var>max)
                max=var;
        }
        if((max-k)<0)
            System.out.println("0");
        else
            System.out.println(max-k);
    }
    
}
