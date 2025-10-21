package MultiThreading;

class ATM {

    synchronized void checkBalance(String name) {

        System.out.println("Balance is 10000.00 for " + name);
        try{Thread.sleep(1000);}catch (Exception e){}
    }

    synchronized void withdrawAmount(String name, int amount) {
        System.out.println("Amount withdrawn for " + name + " is " + amount);
        try{Thread.sleep(1000);}catch (Exception e){}
    }
}

class Customer extends Thread {

    ATM atm;
    String name;
    int amount;
    Customer(String name, ATM a,int amount){
        this.name = name;
        this.amount= amount;
        this.atm= a;
    }

    public void run() {
        useATM();
    }

    void useATM() {
        atm.checkBalance(name);
        atm.withdrawAmount(name, amount);


    }

}

public class Test {
    public static void main(String args[]) {
        ATM a= new ATM();

        Customer c1 = new Customer("John",a,100);
        Customer c2 = new Customer("Thara",a,40);
        Customer c3 = new Customer("Vivek",a,90);
        Customer c4 = new Customer("Divya",a,90);
        Customer c5 = new Customer("Smith",a,90);
        Customer c6 = new Customer("Meena",a,90);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();


    }
}
