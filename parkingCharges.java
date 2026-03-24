import java.util.Scanner;

public class parkingCharges {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int hour=sc.nextInt();
            int charge;

            if(hour<2) {
                charge=100;
            }
            else if(hour<5) {
                charge=50;
            }

            else {
                charge=20;
            }

            System.out.println(charge);
        }

    }
}