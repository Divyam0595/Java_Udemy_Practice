public class Car {

    public void start() {
        System.out.println("Car Start");
    }

    public void accelerate() {
        System.out.println("Car accelerate");
    }

    public void changeGear() {
        System.out.println("Car change Gear");
    }
}
class LuxuryCar extends Car{
    public void changeGear() {
        System.out.println("Luxury Car change Gear");
    }
    public void GPS() {
        System.out.println("Luxury Car GPS");
    }
}

class CarTest{
    public static void main(String args[]){
        LuxuryCar c= new LuxuryCar();
        c.accelerate();
        c.start();c.changeGear();c.GPS();
    }
}

