    import java.util.Scanner;

    public class sumArray {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            String arr = sc.nextLine();
            int len = arr.length();
            int sum = 0;

            for (int i = 0; i < len; i += 2) {
                char ch = arr.charAt(i);
                if (Character.isDigit(ch)) {  // Validate it's a digit
                    int num = ch - '0';
                    if (num >= 0) {  // Check if the number is non-negative
                        System.out.println(num);
                        sum += num;
                    }  // Include 0 in sum (or use > 0 if intentional)
                }
            }

        System.out.println("Sum: " + sum);
        sc.close();
        }
    }