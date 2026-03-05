public class studentGrading {
    public static void main(String[] args) {
        int score = 85;   // Example score

        // Determine letter grade
        String grade = (score >= 90) ? "A" :
                       (score >= 80) ? "B" :
                       (score >= 70) ? "C" :
                       (score >= 60) ? "D" : "F";

        // Determine status message
        String status = grade.equals("A") ? "Excellent!" :
                        (grade.equals("B") || grade.equals("C")) ? "Good job!" :
                        grade.equals("D") ? "You need to study more" :
                        "Please see the teacher";

        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
    }
}