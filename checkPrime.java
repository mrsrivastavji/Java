import java.util.*;

public class checkPrime {

    static boolean isPrime(int n) {
        for(int i=2; i<n/2; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the number to check: ");
        n=sc.nextInt();
        System.out.print(isPrime(n));
    }
}