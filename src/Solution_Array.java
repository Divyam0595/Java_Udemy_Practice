import java.util.Scanner;

public class Solution_Array {
    public static void main(String[] args) {
        //sumOfAllElements();
        //System.out.println(searchElement());
        //findMaxNumber();
        //findSecondLargestNumber();
        //RotateArray_UsingIndex();
        //RotateArray_UsingTempArray();
        //RotateArray_JugglingAlgo();
        //CopyArray_ReverseArray_increaseSize();
       // addition_matrix();
        multiplication_matrix();
    }

    public static void sumOfAllElements() {
        int a[] = {2, 3, 4, 5};
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        System.out.println(sum);
    }

    public static String searchElement() {
        int a[] = {2, 3, 4, 5};
        int element = 9;
        boolean f = false;
        for (int x : a) {
            if (x == element) {
                f = true;
            }
        }
        return f ? "found" : "Not found";

    }

    public static void findMaxNumber() {
        int a[] = {2, 3, 9, 5};
        int max = Integer.MIN_VALUE;
        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println(max);

    }

    public static void findSecondLargestNumber() {
        int a[] = {2, 3, 9, 5, 13};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int x : a) {
            if (x > max1 && x > max2) {

                max2 = max1;
                max1 = x;
            } else if (x > max2 && x < max1) {
                max2 = x;
            }
        }
        System.out.println(max2);

    }

    public static void RotateArray_UsingIndex() {
        int a[] = {2, 3, 4, 5};
        int k = 4;
        if (k < a.length) {

            for (int i = 0; i < k; i++) {
                int firstElement = a[0];
                for (int j = 1; j < a.length; j++) {
                    a[j - 1] = a[j];
                }
                a[a.length - 1] = firstElement;
            }
            System.out.println(a);
        }
    }

    public static void RotateArray_UsingTempArray() {
        int a[] = {2, 3, 4, 5};
        int k = 3;

        k %= a.length;

        int temp[] = new int[a.length];

        for (int i = 0; i < a.length - k; i++) {
            temp[i] = a[i + k];
        }
        for (int i = 0; i < k; i++) {
            temp[a.length - k + i] = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = temp[i];
            System.out.println(a[i]);
        }


    }

    public static void RotateArray_JugglingAlgo() {
        int a[] = {2, 3, 4, 5};
        int k = 9;
        k %= a.length;
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
        reverse(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }

    public static void reverse(int a[], int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }


    }

    public static void CopyArray_ReverseArray_increaseSize() {
        int a[] = {2, 3, 4, 5};
        int b[] = new int[a.length];
        //int c[]=
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            b[a.length - 1 - i] = a[i];
        }
        int j = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            b[j--] = a[i];
        }

        for (int i = a.length - 1, h = 0; i > 0; i--, h++) {
            b[h] = a[i];
        }

        int c[] = new int[2 * a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        a = c;
        c = null;
    }

    public static void addition_matrix(){
        int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int b[][]= {{0,0,0},{0,0,0},{0,0,0}};
        int c[][]=new int [a.length][a[0].length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int[] x: c){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }

    public static void multiplication_matrix(){
        int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int b[][]= {{1,0,0},{0,1,0},{0,0,1}};
        int c[][]=new int [a.length][a[0].length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                for(int k=0;k<a.length;k++){
                    c[i][j]+=a[i][k]*b[k][j];

                }
            }
        }

        for(int[] x: c){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }

    }
}
