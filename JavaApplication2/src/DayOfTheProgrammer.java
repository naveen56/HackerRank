
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayOfTheProgrammer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int year[] = new int[12];
        year[0] = 31;
        year[1] = 28;
        year[2] = 31;
        year[3] = 30;
        year[4] = 31;
        year[5] = 30;
        year[6] = 31;
        year[7] = 31;
        year[8] = 30;
        year[9] = 31;
        year[10] = 30;
        year[11] = 31;
        if (y < 1918) {

            if (y % 4 == 0) {
                year[1] = 29;
            }

            int sum = 0;
            int i;
            int sumprev = 0;
            for (i = 0; sum <= 256; i++) {
                sumprev = sum;
                sum += year[i];
            }
            if ((256 - sumprev) == 0) {
                if(i>9)
                System.out.println(year[i] + "." + i + "." + y);
                else
                    System.out.println(year[i] + ".0" + i + "." + y);

            } else {
                if(i>9)
                System.out.println((256 - sumprev) + "." + (i + 1) + "." + y);
                else
                    System.out.println((256 - sumprev) + ".0" + (i + 1) + "." + y);
            }

        } else if (y > 1918) {
            if (y % 400 == 0 || y % 4 == 0 && (y % 100 != 0)) {
                year[1] = 29;
            }
            int sum = 0;
            int i;
            int sumprev = 0;
            for (i = 0; sum <= 256; i++) {
                sumprev = sum;
                sum += year[i];
            }
            if ((256 - sumprev) == 0) {
                if((i-1)>9)
                
                    System.out.println(year[i] + "." + (i-1) + "." + y);
                else
                    System.out.println(year[i] + ".0" + (i-1) + "." + y);

            } else {
                if((i)>9)
                System.out.println((256 - sumprev) + "." + (i) + "." + y);
                else
                    System.out.println((256 - sumprev) + ".0" + (i ) + "." + y);
            }

        } else {
            year[1] = 15;
            int sum = 0;
            int i;
            int sumprev = 0;
            for (i = 0; sum <= 256; i++) {
                sumprev = sum;
                sum += year[i];
            }
            if ((256 - sumprev) == 0) {
                if ((i-1) > 9) {
                    System.out.println(year[i] + "." + (i-1) + "." + y);
                } else {
                    System.out.println(year[i] + ".0" + (i-1) + "." + y);
                }

            } else {
                if (i == 1) {
                    if ((i+1) > 9) {
                        System.out.println((14 + (256 - sumprev)) + "." + (i + 1) + "." + y);
                    } else {
                        System.out.println((14 + (256 - sumprev)) + ".0" + (i + 1) + "." + y);
                    }
                } else {
                    if((i+1)>9)
                        System.out.println((256 - sumprev) + ".0" + (i + 1) + "." + y);
                    else
                    System.out.println((256 - sumprev) + ".0" + (i + 1) + "." + y);
                }
            }
        }
    }
}
