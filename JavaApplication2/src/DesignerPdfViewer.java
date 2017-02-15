
import java.util.OptionalInt;
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
public class DesignerPdfViewer {

    public static void main(String args[]) {
         int height[]= new int[26];
        Scanner s=new Scanner(System.in);
        
        //taking height of letters
        for (int i = 0; i <26; i++) {
            height[i] = s.nextInt();
        }
        String given=s.next();
        OptionalInt a=given.chars()
                .map(e->height[(int)e-97])
                .max();
        int maximum=a.getAsInt();
        System.out.println(maximum*given.length());
                
              

    }
    

}
