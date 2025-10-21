public class Solution_Methods {

    public static void main(String args[]) {
        //primeNumber();
        //GCD();
        //GCD_Modulo();
        //GCD_Recursion(15,25);
        //reverseInteger();
        //variableArguments_Sum(10, 30, 40);
        //variableArguments_Sum(10);
        //variableArguments_Sum(1, 1, 11);
        //variableArguments_Sum(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
        //variableArguments_max(10, 30, 40);
        //variableArguments_max(10);
        // variableArguments_max(1, 1, 11);
        //variableArguments_max(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
        variableArguments_discount(2500.0, 500.0, 567.0, 99.95);
        variableArguments_discount(100, 1005, 100);
        variableArguments_discount(66.3425, 24.254, 65, 7809);


    }

    public static void primeNumber() {
        int k = 75;
        boolean primeflag = false;
        for (int i = 2; i < k / 2; i++) {
            if (k % i == 0)
                primeflag = true;
        }
        if (!primeflag) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    //Subtract each number with eachother until same to get GCD - Euclidean Algorithm
    public static void GCD() {
        int m = 26, n = 15;

        while (m != n) {
            if (m > n) m -= n;
            else {
                n -= m;
            }

        }
        System.out.println(m);
    }

    //modulo one number with another until the first number is zero
    public static void GCD_Modulo() {
        int m = 25, n = 15;
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        System.out.println(m);

    }

    public static int GCD_Recursion(int m, int n) {
        if (n == 0) {
            System.out.println(m);
        }
        return GCD_Recursion(n, m % n);
    }

    public static void reverseInteger() {
        int l = 9895;
        int reverse = 0;
        while (l > 0) {
            reverse = reverse * 10 + l % 10;
            l = l / 10;
        }
        System.out.println(reverse);
    }


    public static void variableArguments_Sum(int... A) {
        int sum = 0;
        for (int x : A) {
            sum += x;
        }
        System.out.println(sum);
    }

    public static void variableArguments_max(int... A) {
        int max = Integer.MIN_VALUE;
        for (int x : A) {
            if (max < x) {
                max = x;
            }
        }
        System.out.println(max);
    }

    public static void variableArguments_discount(double... priceList) {
        double discountedPrice = 0;
        for (double x : priceList) {
            //10%
            if (x < 500) {
                double discount = x * 0.1;
                discountedPrice = x - discount;
                System.out.println("discountedPrice :" + discountedPrice);
            } else if (x >= 500 && x <= 1000) {
                double discount = x * 0.2;
                discountedPrice = x - discount;
                System.out.println("discountedPrice :" + discountedPrice);
            }
            else{
                double discount = x * 0.5;
                discountedPrice = x - discount;
                System.out.println("discountedPrice :" + discountedPrice);
            }
        }

    }

}
