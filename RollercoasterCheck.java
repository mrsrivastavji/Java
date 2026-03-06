import java.util.Scanner;

public class RollercoasterCheck {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            System.out.print("Enter your height in cm: ");
            int height = scanner.nextInt();
            
            if (age < 12) {
                System.out.println("Sorry, you're too young");
            }
            
            else if (height <= 150) {
                System.out.println("Sorry, you're not tall enough");
            }
            
            else if (age < 15) {
                System.out.print("Do you have an adult with you? (yes/no): ");
                String adult = scanner.next();
                
                if (adult.equalsIgnoreCase("yes")) {
                    System.out.println("You can ride with adult supervision!");
                }
                
                else {
                    System.out.println("Sorry, you need an adult with you");
                }
                
            }
            
            else {
                System.out.println("You can ride by yourself!");
            }
        }
    }
}