
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
public class RedJohnIsBack {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        long value=0;
        while (t-- != 0) {
            int n = s.nextInt();
             value=puzzle(n);
            
        System.out.println(value);
        long count=0;
        for(int i=1;i<=value;i++){
           if(check(i))
            count++;
        }
        
        System.out.println(count);
        }
    }

    private static boolean check(int n) {
        int i;
        if(n<=1)
            return false;
        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static long puzzle(int n) {
      long result=0;
      if(n<4)
          return 1;
      else
          result=puzzle(n-1)+puzzle(n-4);
      return result;
    }

}
