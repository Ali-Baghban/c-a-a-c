import javax.swing.*;
import java.util.*;
// > Ali Baghban | Hourieh T.
public class Main {
    public static void main(String args[]) {
        int men_count = 0;
        int men_val = 0;
        int women_count = 0;
        int women_val = 0;
        float men_avg = 0;
        float women_avg = 0;
        int sex;
        String str;
        int counter = 0;
        try {
            String s = JOptionPane.showInputDialog("Hur många personers medelålder vill du beräkna?");
            int count = Integer.parseInt(s);
            while (count != counter) {
                counter++;
                sex = JOptionPane.showConfirmDialog(null, "Kvinna ?");

                if (sex == 0) {
                    men_count++;
                    str = JOptionPane.showInputDialog("Man ålder ?");
                    men_val += Integer.parseInt(str);
                } else {
                    women_count++;
                    str = JOptionPane.showInputDialog("Kvinna ålder");
                    women_val += Integer.parseInt(str);
                }
            }
            men_avg = men_val / men_count;
            women_avg = women_val / women_count;
            JOptionPane.showMessageDialog(null, "Genomsnittsålder för män : " + men_avg + " " +
                    "Genomsnittsålder för kvinnor : " + women_avg);


        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
    }
}
