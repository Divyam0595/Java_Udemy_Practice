package SingletonPractice;

public class CoffeeMachine {

    private int coffeeQuantity;
    private int sugarQuantity;
    private int milkQuantity;

    static private CoffeeMachine objCount = null;


    private CoffeeMachine(int coffee, int sugar, int milk) {
        setCoffeeQuantity(coffee);
        setSugarQuantity(sugar);
        setMilkQuantity(milk);
    }

    public int getCoffeeQuantity() {
        return coffeeQuantity;
    }

    public void setCoffeeQuantity(int coffee) {
        coffeeQuantity = coffee;
    }

    public int getSugarQuantity() {
        return sugarQuantity;
    }

    public void setSugarQuantity(int sugar) {
        sugarQuantity = sugar;
    }

    public int getMilkQuantity() {
        return milkQuantity;
    }

    public void setMilkQuantity(int milk) {
        milkQuantity = milk;
    }

    public String toString() {
        return "Initial SetUp: " + "\nCoffee:" + coffeeQuantity + "\nSugar:" + sugarQuantity + "\nMilk:" + milkQuantity;
    }

    static CoffeeMachine getInstance(int coffee, int sugar, int milk) {
        if (objCount==null){
            objCount = new CoffeeMachine(coffee,sugar,milk);
        }
        return objCount;
    }

}

class Test{
    public static void main(String args[]){
        CoffeeMachine c1= CoffeeMachine.getInstance(5,5,10);
        System.out.println(c1);
        System.out.println(c1.getCoffeeQuantity());

        CoffeeMachine c2= CoffeeMachine.getInstance(4,4,160);
        System.out.println(c2);

        CoffeeMachine c3= CoffeeMachine.getInstance(1,1,2);
        System.out.println(c3);

        CoffeeMachine c4= CoffeeMachine.getInstance(6,6,7);
        System.out.println(c4);
    }
}
