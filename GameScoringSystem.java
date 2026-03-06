public class GameScoringSystem {
    public static void main(String[] args) {
        // Initial values
        int points = 5;
        int bonus = 10;
        int lives = 3;

        // Sequences of operations
        int result1 = points++; // Post-increment: result1 = 5, points = 6
        int result2 = ++bonus;  // Pre-increment: bonus = 11, result2 = 11
        int result3 = --lives;  // Pre-decrement: lives = 2, result3 = 2
        int result4 = lives--;  // Post-decrement: result4 = 2, lives = 1

        // Verification code to check predictions
        boolean checkResult1 = (result1 == 5);
        boolean checkResult2 = (result2 == 11);
        boolean checkResult3 = (result3 == 2);
        boolean checkResult4 = (result4 == 2);

        boolean checkPoints = (points == 6);
        boolean checkBonus = (bonus == 11);
        boolean checkLives = (lives == 1);

        // Output results
        System.out.println("result1: " + result1 + " (expected: 5) - " + (checkResult1 ? "Correct" : "Incorrect"));
        System.out.println("result2: " + result2 + " (expected: 11) - " + (checkResult2 ? "Correct" : "Incorrect"));
        System.out.println("result3: " + result3 + " (expected: 2) - " + (checkResult3 ? "Correct" : "Incorrect"));
        System.out.println("result4: " + result4 + " (expected: 2) - " + (checkResult4 ? "Correct" : "Incorrect"));
        System.out.println("Final points: " + points + " (expected: 6) - " + (checkPoints ? "Correct" : "Incorrect"));
        System.out.println("Final bonus: " + bonus + " (expected: 11) - " + (checkBonus ? "Correct" : "Incorrect"));
        System.out.println("Final lives: " + lives + " (expected: 1) - " + (checkLives ? "Correct" : "Incorrect"));

        if (checkResult1 && checkResult2 && checkResult3 && checkResult4 && checkPoints && checkBonus && checkLives) {
            System.out.println("\nAll predictions are correct! You understand pre/post increment/decrement.");
        } else {
            System.out.println("\nSome predictions are incorrect. Review the rules:");
            System.out.println("- Post-increment (x++): use current value, then increment");
            System.out.println("- Pre-increment (++x): increment first, then use new value");
            System.out.println("- Post-decrement (x--): use current value, then decrement");
            System.out.println("- Pre-decrement (--x): decrement first, then use new value");
        }
    }
}