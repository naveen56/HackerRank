
import java.util.Scanner;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naveen
 */
public class Mini_Max {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        TreeSet<Long> tr=new TreeSet();
       long sum=0;
        for(int i=0;i<5;i++){
            long element=s.nextLong();
            tr.add(element);
            sum+=element;
        }
        System.out.println((sum-tr.last())+" "+(sum-tr.first()));
        
    }
    
}
