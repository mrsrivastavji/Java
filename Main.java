import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        int time;
        boolean isHoliday;
        String ticketType;
        int price;
        // Get user inputs
        try (Scanner scanner = new Scanner(System.in)) {
            // Get user inputs
            System.out.print("Customer age: ");
            age = scanner.nextInt();
            System.out.print("Show time : ");
            time = scanner.nextInt();
            System.out.print("Is it a holiday? (true/false): ");
            isHoliday = scanner.nextBoolean();
            // Your code to determine ticket type and price
            ticketType = "";
            price = 0;
            if (age < 13) {
                ticketType = "CHILD";
                price = 8;
                if (isHoliday) {
                    price += 2;
                }
            } else if (age >= 13 && age <= 17) {
                ticketType = "TEEN";
                price = 12;
                if (isHoliday) {
                    price += 3;
                }
            } else if (age >= 18 && age <= 59) {
                ticketType = "ADULT";
                price = 15;
                if (isHoliday) {
                    price += 5;
                }
                if (time <= 1700) {
                    price -= 3;
                }
            } else {
                ticketType = "SENIOR";
                price = 10;
                if (time <= 1700) {
                    price -= 2;
                }
            }
        }

        // Output results
        System.out.println("Customer Age: " + age);
        System.out.println("Show Time: " + time);
        System.out.println("Holiday? " + isHoliday);
        System.out.println("-------------------");
        System.out.println("Ticket Type: " + ticketType);
        System.out.println("Final Price: $" + price);
    }
}