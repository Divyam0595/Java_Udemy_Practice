import java.util.Scanner;

public class Solution_Pattern {
    public static void main(String[] args) {
        //pattern1();
        //pattern2();
        //pattern3();
        //pattern4();
        //pattern5();
       // pattern6();
        //pattern7();
        //pattern8();
        pattern9();
    }


    //1 2 3
    //1 2 3
    //1 2 3
    public static void pattern1() {
        System.out.println("Enter the count");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }

    //1 2 3
    //4 5 6
    //7 8 9
    public static void pattern2() {
        System.out.println("Enter the count");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                counter++;
                System.out.format("%02d ",counter);
            }
            System.out.println("");
        }
    }

    //1
    //1 2
    //1 2 3
    public static void pattern3() {
        System.out.println("Enter the count");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.format(j+ " ");
            }
            System.out.println("");
        }
    }


    //1
    //2 3
    //4 5 6
    public static void pattern4() {
        System.out.println("Enter the count");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int counter=1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.format("%02d ",counter++);
            }
            System.out.println("");
        }
    }

    //*
    //* *
    //* * *
    public static void pattern5() {
        System.out.println("Enter the count");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.format("* ");
            }
            System.out.println("");
        }
    }

    //1 2 3
    //1 2
    //1
    public static void pattern6() {
        System.out.println("Enter the count");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <=n ; i++) {
            for (int j = n; j>=i; j--) {

                System.out.format(j+ " ");
            }
            System.out.println("");
        }
    }

    //* * *
    //  * *
    //    *
    public static void pattern7() {
        System.out.println("Enter the count");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if(j<=i){
                    System.out.format("  ");
                }
                else{
                    System.out.format("* ");
                }
            }
            System.out.println("");
        }
    }

    //    *
    //  * *
    //* * *
    public static void pattern8() {
        System.out.println("Enter the count");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if(j+i>n){
                    System.out.format("* ");
                }
                else{
                    System.out.format("  ");


                }
            }
            System.out.println("");
        }
    }

    //    *
    //  * * *
    //* * * * *
    public static void pattern9() {
        System.out.println("Enter the count");
        Scanner sc = new Scanner(System.in);
        int n = 3;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (j + i > n) {
                    System.out.format("* ");
                } else {
                    System.out.format("  ");
                }

            }
            for (int j = 2; j <= i; j++) {
                System.out.format("* ");
            }
            System.out.println("");
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if(j<=i){
                    System.out.format("  ");
                }
                else{
                    System.out.format("* ");
                }
            }
            for (int j = n-2; j >=i ; j--) {
                System.out.format("* ");
            }
            System.out.println("");
        }

    }
}