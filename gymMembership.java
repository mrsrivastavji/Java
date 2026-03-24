import java.util.Scanner;

public class gymMembership {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int months=sc.nextInt();
            int charge=0;

            if(months<0) {
                System.err.println("Wrong input");
                System.exit(1);
            }
            else if(months<2) {
                charge=2000;
            }

            else if(months<4) {
                charge=5000;
            }

            else if(months<6) {
                charge=9000;
            }

            else {
                charge=15000;
            }

            System.out.println(charge);
        }

    }
}