import java.util.Scanner;

public class discountCalculator {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            double amount=sc.nextDouble();

            if(amount<0) {
                System.err.println("Wrong input");
                System.exit(1);
            }
            else if(amount<1000) {
                amount-=amount*0.05;
            }

            else if(amount<5000) {
                amount-=amount*0.1;
            }

            else {
                amount-=amount*0.15;
            }

            System.out.printf("%.2f", amount);
        }

    }
}
