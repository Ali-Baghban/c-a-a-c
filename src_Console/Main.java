import java.util.*;
// Coded by Ali Baghban
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello my dear friend :)");
        int men_count = 0;
        int men_val = 0;
        int women_count = 0;
        int women_val = 0;
        int val = 0;
        System.out.print("Enter person count > ");
        int val2 = scanner.nextInt();
        while (val != val2) {

            try {
                val++;
                boolean check = true;
                while (check != false) {
                    System.out.print("Select the gender : (man|woman) > ");
                    String sex = scanner.next();
                    if (sex.equals("man")) {
                        men_count++;
                        System.out.print("Enter the man age : ");
                        men_val += scanner.nextInt();
                        check = false;
                    } else if (sex.equals("woman")) {
                        women_count++;
                        System.out.print("Enter the woman age : ");
                        women_val += scanner.nextInt();
                        check = false;
                    } else {
                        System.out.print("Wrong selection ! - ");
                        check = true;
                    }
                }

            } catch (Exception x) {
                System.out.println(x.getMessage());
            }

        }
        try {
            float men_avg = men_val / men_count;
            float women_avg = women_val / women_count;
            System.out.println("Men's age average is " + men_avg);
            System.out.println("Women's age average is " + women_avg);
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }


    }
}