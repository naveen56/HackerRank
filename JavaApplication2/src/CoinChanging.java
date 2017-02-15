
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
public class CoinChanging {
    public static void main(String args[]){
        int amount,noofcoins;
        Scanner s=new Scanner(System.in);
        amount=s.nextInt();
        noofcoins=s.nextInt();
        // input of coins
        int coins[]=new int[noofcoins];
        for(int i=0;i<noofcoins;i++){
            coins[i]=s.nextInt();
        }
        //sort the coins
        Arrays.sort(coins);
        
        long matrix[][]=new long[noofcoins][amount+1];
        //creating first array
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0)
            matrix[0][i]=1;
        }
        
        //creating change matrix
        for(int i=1;i<noofcoins;i++){
            
            for(int j=0;j<=amount;j++){
                if(j<coins[i]){
                matrix[i][j]=matrix[i-1][j];
                }
                else 
                {
                 matrix[i][j]=matrix[i-1][j]+matrix[i][j-coins[i]];   
                }
            }
            
        }
        System.out.println(matrix[noofcoins-1][amount]);
    }
}
