public class Solution_String {
    public static void main(String args[]) {
        //printmethodFormats();
        //stringmethods();
        //RegularExpressions();
        RegularExpressions_2();
    }

    public static void printmethodFormats() {
        int x = -10;
        float y = 5.0f;
        char z = 'T';
        //format specifier
        System.out.printf("Hello %d %f %c\n", x, y, z);//Hello 10 5.000000 T
        //Argument index
        System.out.printf("Hello %2$f %1$d %2$f %2$f %1$d %3$c %1$d\n", x, y, z);//Hello 5.000000 10 5.000000 5.000000 10 T 10
        //width spaces
        System.out.printf("Hello %5d %2f %3c\n", x, y, z);//Hello    10 5.000000   T
        //flag
        System.out.printf("Hello %05d %2f %3c\n", x, y, z);//Hello 00010 5.000000   T
        int k = -10;
        System.out.printf("Hello %(5d %2f %3c\n", k, y, z);//Hello  (10) 5.000000   T
        System.out.printf("Hello %+5d %2f %3c\n", k, y, z);//Hello   -10 5.000000   T
        System.out.printf("Hello %-5d %2f %3c\n", k, y, z);//Hello -10   5.000000   T
        float j = 7.5f;
        System.out.printf("Hello %f \n", j);//Hello 7.500000
        System.out.printf("Hello %5.2f \n", j);//Hello  7.50
        float u = 7324342324234.5f;
        System.out.printf("Hello %5.2f \n", u);//Hello 7324342157312.00
    }

    public static void stringmethods() {
        String str = "divyamadhava@gmail.co";
        if (str.substring(str.indexOf('@'), str.length()).equals("@gmail.com")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println("Username : " + str.substring(0, str.indexOf("@")));
        System.out.println("domain : " + str.substring(str.indexOf(".") + 1, str.length()));
    }

    public static void RegularExpressions() {
        //Binary
        int b = 1011;
        String str = b + "";
        if (str.matches("[01]*")) {
            System.out.println("Binary-Yes");
        } else {
            System.out.println("Binary-No");
        }

        //Hexadecimal
        int a = 0x143A;
        String str2 = a + "";
        if (str2.matches("[1-9A-F]*")) {
            System.out.println("Hexa-Yes");
        } else {
            System.out.println("Hexa-No");
        }

        //Octal
        int l = 051;
        String str3 = a + "";
        if (str2.matches("[1-7]*")) {
            System.out.println("Octal-Yes");
        } else {
            System.out.println("Octal-No");
        }

        //Date Format

        String str4 = "09/12/1995";
        if (str4.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}")) {
            System.out.println("Date-Yes");
        } else {
            System.out.println("Date-No");

        }
    }
    public static void RegularExpressions_2(){
        //Remove special characters
        String str="@@#T &@)#EMDMYF2y83f#E#@()E#";
        System.out.println(str.replaceAll("\\W",""));

        //Remove space characters
        String str2="@@#T &@)#EMDMYdfa   t4F rtw   2 y    83   f#E#@()E#";
        System.out.println(str2.replaceAll("\\s+"," "));

        //find number of words in string
        String str3="Thara is the best daughter in the whole wide world and i love her so much.";

                String st[]=str3.split("\\s+");
        System.out.println(st.length);




    }

}
