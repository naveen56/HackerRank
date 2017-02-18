import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HappyLadyBugs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
            char ar[]=b.toCharArray();
            int flag=0;
            first:
            for(int i=0;i<b.length();i++){
                if(ar[i]=='_'){
                    
                }
                else
                    {
                    
                    int count=0;
                    for(int j=i;j<b.length();j++){
                        
                        if(ar[i]==ar[j]){
                            count++;
                            ar[j]='_';    
                        }
                    }
                    if(count==1)
                        {
                        
                        flag=1;
                        break first;
                        
                    }
                }
            }
            if(flag==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
