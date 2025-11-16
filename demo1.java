import java.util.*;

class demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the value of a:");
        a=sc.nextInt();
        System.out.print("Enter the value of b:");
        b=sc.nextInt();
        try {
            c=a/b;
            System.out.println(c);
        }

        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}