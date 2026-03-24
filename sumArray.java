import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Read the number of elements
            int n = scanner.nextInt();
            List<Integer> numbers = new ArrayList<>(n);

            // Read the array elements
            for (int i = 0; i < n; i++) {
                numbers.add(scanner.nextInt());
            }

            // Process the list to handle duplicates by incrementing
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (numbers.get(i).equals(numbers.get(j))) {
                        // Increment the current element to resolve duplicate
                        numbers.set(i, numbers.get(i) + 1);
                    }
                }
            }

            // Calculate the sum using Java 8 streams for efficiency
            int sum = numbers.stream().mapToInt(Integer::intValue).sum();

            // Output the result
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}