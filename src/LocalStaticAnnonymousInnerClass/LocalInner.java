package LocalStaticAnnonymousInnerClass;

public class LocalInner {
    public class Outer{
        int x= 7;
        public void display(){
             class Inner{
                 int y=9;
                 public void innerDisplay(){
                     System.out.println("Inner"+x);
                     System.out.println("Inner"+y);
                 }
            }
            Inner i = new Inner();
             i.innerDisplay();
            System.out.println("Outer"+i.y);
        }

    }
    public static void main(String args[]){
        LocalInner.Outer o= new LocalInner().new Outer();
        o.display();


    }
}
