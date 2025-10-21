package LambdaExpression;

interface MyLambda{
    public void display(String s);
}
interface MyLambda1{
    public int display(int a,int b);
}

interface MyLambda2{
    public int display(String a,String b);
}

public class LambdaTest {
    public static void main(String agrs[]){
        MyLambda m=System.out::println;
        MyLambda1 m1 = (a,b)->a+b;
        MyLambda2 m2 = String::compareTo;
        System.out.println(m1.display(8,9));
        m.display("hi");
        System.out.println(m2.display("hi","hii"));



    }
}
