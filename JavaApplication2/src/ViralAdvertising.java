
import java.util.Scanner;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naveen
 */
public class ViralAdvertising {
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.println(Stream.iterate(5, e->(e/2)*3)
              . mapToInt(e->e/2)
                .limit(n)
                .sum());
    }
    
}
