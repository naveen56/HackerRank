
import java.math.BigInteger;
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
public class SeperateTheNumbers {

    public static void main(String args[]) {
        int t;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        while (t-- != 0) {
            String str = s.next();
            int flag=0;
            int maxiteration=0;
            if(str.charAt(0)=='0')
                maxiteration=2;
            else
                maxiteration=str.length();
            
            firstlabel:
            for (int i = 1; i < maxiteration; i++) {
                String str2 = str.substring(0, i);
                BigInteger first = new BigInteger(str2);
                BigInteger firstelemnt = first;
                
                while (str2.length() <str.length()) {
                    first=first.add(BigInteger.valueOf(1));
                    str2 = str2.concat(String.valueOf(first));
                    
                }
                
                 if (str.equals(str2)) {
                    flag=1;
                    System.out.println("YES " + firstelemnt);
                    break firstlabel;
                }
            
          
                
        }
              if(flag==0)
                System.out.println("NO");
            }
    }

}
