package advanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author naveen 16mcmb16
 */
public class Advanced {

    static ArrayList<String> x = new ArrayList();
    static ArrayList<ArrayList<String>> s = new ArrayList();

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("/home/naveen/Downloads/retail.dat"))) {
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i <= n; i++) {
                x.add(String.valueOf(i));
            }

            br.readLine();
            String line = br.readLine();
            while (line != null) {

                String items[] = line.split(" ");
                ArrayList<String> set = new ArrayList();
                for (int i = 0; i < items.length; i++) {

                    set.add(items[i]);
                }

                s.add(set);
                line = br.readLine();

            }
            long count = 0;
            while (x.size() != 0) {
                count++;
                int max_uncvrd = Integer.MIN_VALUE, slctd_set_indx = Integer.MIN_VALUE;
                for (int i = 0; i < s.size(); i++) {
                    ArrayList<String> set = s.get(i);
                    if (max_uncvrd < set.size()) {
                        max_uncvrd = set.size();
                        slctd_set_indx = i;
                    }
                }
                
                System.out.println(s.get(slctd_set_indx));
                ArrayList<String> slctd_set = s.get(slctd_set_indx);
                s.remove(slctd_set_indx);

                for (int i = 0; i < slctd_set.size(); i++) {
                    String element = slctd_set.get(i);
                    
                    x.remove(element);

                    for (int j = 0; j < s.size(); j++) {
                        if (s.get(j).contains(element)) {
                            
                            s.get(j).remove(element);
                        }

                    }

                }
                
            }
            System.out.println("count is" + count);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
