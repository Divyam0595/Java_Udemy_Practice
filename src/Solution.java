import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        //displayMultiplicationTable();
        //sumOfnNumbers();
        //factorial();
        //displayDigitsofNumber();
        //countDigitsofNumber();
        //armstrongNumber();
        //reverseNumber();
        //Palindrome();
        //displayNumberInWords();
        //displayArithmeticProgressionSeries();
        //displayGeometricProgressionSeries();
        fibonaciSeries();
        //System.out.println(factorial_Recursion(5));

    }

    public static void displayMultiplicationTable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int k = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }

        while (k <= 10) {
            System.out.println(n * k);
            k++;

        }
    }

    public static void sumOfnNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }

    public static int factorial_Recursion(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial_Recursion(n - 1);

    }

    public static void displayDigitsofNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        while (n > 0) {

            System.out.println(n % 10);
            n = n / 10;
        }
    }

    public static void countDigitsofNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }

    public static void armstrongNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int result = 0;
        int k = n;
        int r = 0;
        while (n > 0) {
            r = n % 10;
            //result = result + (int) Math.pow(n % 10, 3);    OR
            result = result + r * r * r;
            n /= 10;
        }
        if (result == k) {
            System.out.println("Armstorng");
        } else {
            System.out.println("Not Armstorng");
        }
    }

    public static void reverseNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int result = 0;

        while (n > 0) {
            result = result * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(result);

    }

    public static void Palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int k = n;
        int result = 0;

        while (n > 0) {
            result = result * 10 + n % 10;
            n = n / 10;
        }
        if (k == result)
            System.out.println("Palindrome");
        else {
            System.out.println("Not Palindrome");
        }

    }

    public static void displayNumberInWords() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        String str = "";

        while (n > 0) {
            str = str + n % 10;
            n /= 10;
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            switch (c) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
            }

        }
    }

    public static void displayArithmeticProgressionSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int f = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(f);
            f += d;
        }

    }

    public static void displayGeometricProgressionSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int f = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println(f);
            f *= d;
        }
    }

    public static void fibonaciSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        System.out.println(fib1);
        System.out.println(fib2);
        for (int i = 1; i < n; i++) {

            int fib3 = fib1 + fib2;
            System.out.println(fib3);
            fib1 = fib2;
            fib2 = fib3;

        }


    }
}
