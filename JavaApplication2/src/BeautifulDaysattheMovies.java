
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naveen
 */
public class BeautifulDaysattheMovies {
   static int k;
    public static void main(String args[]){
        int m,n;
        Scanner s=new Scanner(System.in);
        m=s.nextInt();
        n=s.nextInt();
        k=s.nextInt();
        ArrayList<Integer> list=new ArrayList();
        for(int i=m;i<=n;i++){
            list.add(i);
        }
        Predicate<? super Integer> predicate;
        System.out.println(list.stream()
            .filter(BeautifulDaysattheMovies::testing)
            .count());    
    }
    public static boolean testing(Integer v){
        
        String str=String.valueOf(v);
        
        StringBuilder s=new StringBuilder(str);
        str=s.reverse().toString() ;
        int var;
        var=Integer.parseInt(str);
        if(Math.abs(v-var)%k==0)
            return true;
        return false;
    }
    
}
