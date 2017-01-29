
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naveen
 */
public class TwoCharcters {
   public static void main(String args[]){
     String str;
     Scanner s=new Scanner(System.in);
     s.nextInt();
     str=s.next();
     HashMap<Character,ArrayList<Integer>> hm= computeCount(str);
     
     Set<Character> keychain=hm.keySet();
     Object[] keys=keychain.toArray();
     int max=0;
     for(int i=0;i<hm.size()-1;i++){
         for(int j=i+1;j<hm.size();j++){
             int len=check(keys[i].toString().charAt(0),keys[j].toString().charAt(0),str,hm);
             if(max<len){
                 max=len;
             }
         }
         
     }
     System.out.println(max);
     
     
     
     
     
   } 

    private static HashMap<Character, ArrayList<Integer>> computeCount(String str) {
       HashMap<Character,ArrayList<Integer>> hm=new HashMap();
        for(int i=0;i<str.length();i++){
            if(hm.containsKey(str.charAt(i))){
                ArrayList<Integer> list=hm.get(str.charAt(i));
                list.add(i);
                hm.replace(str.charAt(i), list);
            }
            else{
               ArrayList<Integer> list=new ArrayList();
               list.add(i);
                hm.put(str.charAt(i),list);
            }
        }
        return hm;
    }

    private static int check(char firstchar, char secondchar, String str, HashMap<Character, ArrayList<Integer>> hm) {
        int count=0;
        StringBuilder string=new StringBuilder();
        ArrayList<Integer> indexs=hm.get(firstchar);
        ArrayList<Integer> secindexs=hm.get(secondchar);
        for(int i=0;i<str.length();i++){
         if(indexs.contains(i)||secindexs.contains(i)){
             string.append(str.charAt(i));
         }   
         else
         {
             
         }
        }
        int i;
        for( i=0;i<string.length()-1;i++){
        if(string.charAt(i)==string.charAt(i+1)){
            break;
        }    
        }
        if(i==string.length()-1)
        {
            return string.length();
        }
        
        return count;
    }

    
}
