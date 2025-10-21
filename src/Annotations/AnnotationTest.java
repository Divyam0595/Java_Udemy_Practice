package Annotations;

import java.util.List;

@FunctionalInterface
interface hi{
    public void display();

}

class Annotate<T>{
    @Deprecated
    public void userName(){
System.out.println("Hi");
    }
@SafeVarargs
    private void multiple(T ...A){

    }
}
@mustHaves(name="Divya", date = "9/2025")
public class AnnotationTest implements hi {
    static List l;
    @Override
    public void display() {
        System.out.println("J");
    }

    @SuppressWarnings("deprecation")
    public static void main(@mustHaves(name="Divya", date = "9/2025")String args[]) {
AnnotationTest t= new AnnotationTest();
        Annotate a = new Annotate();
        a.userName();
        ///l.add(1);
        t.display();
    }


}
//metadata
@interface mustHaves{
    String name();
    String date();
}
