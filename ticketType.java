public class ticketType {
    public static void main(String[] args) {
        int age = 25;
        int time = 1430;
        boolean isHoliday = true;

        String ticketType;
        int price;
        int category;

        // Determine category
        if (age < 13) {
            category = 1;
        } else if (age <= 17) {
            category = 2;
        } else if (age <= 59) {
            category = 3;
        } else {
            category = 4;
        }

        // Rule switch (modern switch)
        switch (category) {
            case 1 -> {
                ticketType = "CHILD";
                price = 8;
                if (isHoliday) price += 2;
            }
            case 2 -> {
                ticketType = "TEEN";
                price = 12;
                if (isHoliday) price += 3;
            }
            case 3 -> {
                ticketType = "ADULT";
                price = 15;
                if (isHoliday) price += 5;
                if (time <= 1700) price -= 3;
            }
            default -> {
                ticketType = "SENIOR";
                price = 10;
                if (time <= 1700) price -= 2;
            }
        }

        System.out.println("Customer Age: " + age);
        System.out.println("Show Time: " + time);
        System.out.println("Holiday? " + isHoliday);
        System.out.println("-------------------");
        System.out.println("Ticket Type: " + ticketType);
        System.out.println("Final Price: $" + price);
    }
}