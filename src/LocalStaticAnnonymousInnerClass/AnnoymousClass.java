package LocalStaticAnnonymousInnerClass;


interface iOuterInterface {
    void display();
}

class outer {
    public void show() {
        iOuterInterface a = new iOuterInterface() {
            public void display() {
                System.out.println("Hi");
            }
        };
        a.display();
    }
}

public class AnnoymousClass {
    public static void main(String args[]) {
        outer o = new outer();
        o.show();
    }
}


