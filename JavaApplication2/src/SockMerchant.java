
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naveen
 */
public class SockMerchant {
    public static void main(String args[]){
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    List<Integer> array=new ArrayList();
        for(int i=0;i<n;i++)
            array.add(s.nextInt());

        


        Map<Integer, Long> counted;
        counted = array.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        
        
        List<Long> pairs= counted.values()
                .stream()
                .map(e->e/2)
                .collect(Collectors.toList());
        int sum=0;
        for(int i=0;i<pairs.size();i++){
            sum+=pairs.get(i);
        }
        System.out.println(sum);
    }
}
