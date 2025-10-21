package InnerClass;

public class Outer {
    public static void main(String args[]){
        Outer o= new Outer();
        o.displayouter();
        Outer.Inner i= new Outer().new Inner();
        i.display();

    }
    int x= 10;
    void displayouter(){
        System.out.println("Outer Display");
        Inner i= new Inner();
        System.out.println("Inner Display in outer "+i.y);
    }

    class Inner{
        int y= 20;
        void display(){
            System.out.println("Inner Display "+x);
            System.out.println("Inner Display "+y);
            displayouter();
        }
    }

}


