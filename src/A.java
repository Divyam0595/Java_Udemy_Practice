class A {
    public B display(){
        System.out.println("A");
        return new B();
    }
    public String toString(){
        return "A String";
    }
}

class B extends A{
    public B display(){
        System.out.println("B");
        return new B();
    }

    public String toString(){
        return "B String";
    }
}
class TestAB{
    public static void main(String args[]){
        A obj1 = new A();
        System.out.println("Returned: " + obj1.display());

        A obj2 = new B();
        System.out.println("Returned: " + obj2.display());
    }
}
