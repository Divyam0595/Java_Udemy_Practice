package LocalStaticAnnonymousInnerClass;


class Outer{
    static int x= 5;
    static class Inner{
        void display(){
            int y=5;
            System.out.println(x + y);
        }
    }
}


public class StaticClass {
    public static void main(String args[]){
        //Outer.Inner i= new Outer.Inner();
        //i.display();

        final int k;
        k=8;
        System.out.println(k);

        System.out.println(k);

    }
}
