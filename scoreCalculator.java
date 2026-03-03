public class scoreCalculator {
    public static void main(String[] args) {
        // Initialize your values here
        int score = 91;
        int bonus = 16;
        
        // Don't modify the code below
        String status = "Regular Score";
        
        if (score >= 80 && score <= 100 && bonus >= 10 && bonus <= 20) {
            if ((score > 90 && bonus > 15) || (score > 85 && bonus > 18)) {
                status = "High Score";
            }
        } else {
            status = "Invalid Values";
        }
        
        System.out.println("Status: " + status);
    }
}
