
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
public class Caesar_Cipher {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        s.nextInt();
        String str = s.next();
        int k = s.nextInt();
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (97 <= (int) ch[i] && ch[i] <= 122) {
                System.out.print(makerotatesmall(ch[i], k));
            }
            else if(65 <= (int) ch[i] && ch[i] <= 90){
                System.out.print(makerotatelarge(ch[i],k));
            }
            else
                System.out.print(ch[i]);
        }
    }

    private static char makerotatesmall(char c, int k) {

        int ch = c-'a'+k;
        int variation = 'z' - 'a' + 1;
        int character = ch % variation;
        
        
        return (char) (character + (int) 'a');
    }

    private static char makerotatelarge(char c, int k) {
        int ch = c-'A'+k;
        int variation = 'Z' - 'A' + 1;
        int character = ch % variation;
        
        
        return (char) (character + (int) 'A');
    
    }

}
