package ENUM;

enum Banks {
    SCOTIA, RBC, NBC, TD;

    private Banks(){
        System.out.println(this.name());
    }


}

public class EnumTest {

    public static void main(String args[]){
        Banks b =Banks.SCOTIA;

        System.out.println(b);

    }
}
