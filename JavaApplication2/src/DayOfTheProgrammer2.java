
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
public class DayOfTheProgrammer2 {
    public static void main(String args[]){
     Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int year[] = new int[12];
        year[0] = 31;
        year[1] = 28;
        year[2] = 31;
        year[3] = 30;
        year[4] = 31;
        year[5] = 30;
        year[6] = 31;
        year[7] = 31;
        year[8] = 30;
        year[9] = 31;
        year[10] = 30;
        year[11] = 31;
        if(y!=1918){
        int flag=0;
        if(y<1918){
            if (y % 4 == 0) {
                flag=1;
            }
            
        }
        else if(y>1918){
            if (y % 400 == 0 || y % 4 == 0 && (y % 100 != 0)) {
                year[1] = 29;
                flag=1;
            }
            
        }
        int day;
        if(flag==0)
            day=13;
        else 
            day=12;
        System.out.println(day+".09."+y);
        }
        else
        {
         System.out.println("26.09.1918");   
        }
    }
}
