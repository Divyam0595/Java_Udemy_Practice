public class Solution_OOPS {


}

class Test {
    public static void main(String args[]) {
        Cylinder c = new Cylinder();
        c.radius = 3;
        c.height = 4;

        System.out.printf("circumference  %.2f\n",c.circumference());
        System.out.println("lidArea  " + c.lidArea());
        System.out.printf("totalSurfaceArea %1.2f\n",c.totalSurfaceArea());
    }
}

class Cylinder {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius * radius;
    }

    public double totalSurfaceArea() {
        return 2 * lidArea() + circumference() * height;
    }
}

