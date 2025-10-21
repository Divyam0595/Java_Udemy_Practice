package Collection;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Customer implements Serializable {
    String name;
    long number;
    String cusID;
    float balance;
    private static int counter = 0;

    Customer() {
    }

    Customer(String name, long number, float balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        cusID = "CUS_" + String.format("%03d", ++counter);
    }

    public String toString() {
        return "Customer Details : \nCustomerID : " + cusID + "\nName : " + name + "\nPhone Number : " + number + "\nBalance : " + balance + "\n";
    }
}

public class AccountTest {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);


        Customer acc = null;
        HashMap<String, Customer> hm = new HashMap<>();
        try {
            FileInputStream fs = new FileInputStream("/Users/vivek_ravi/Documents/UserDetails.txt");
            ObjectInputStream ois = new ObjectInputStream(fs);
            int count = ois.readInt();
            for (int i = 0; i < count; i++) {
                acc = (Customer) ois.readObject();
                System.out.println(acc);
                hm.put(acc.cusID, acc);
            }
        } catch (Exception e) {
        }

        FileOutputStream fos = new FileOutputStream("/Users/vivek_ravi/Documents/UserDetails.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        String name;
        long number;
        float balance;
        String accNo;
        int option;

        do {
            System.out.println("User Options \n1. Create Account\n2. Delete Account\n3. View Account\n4. View All Accounts\n5. Save Accounts\n6. Exit");
            System.out.println("Enter Choice");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter Name,PhoneNumber,Balance");
                    name = sc.next();
                    number = sc.nextLong();
                    balance = sc.nextFloat();
                    acc = new Customer(name, number, balance);
                    oos.writeObject(acc);
                    hm.put(acc.cusID, acc);
                    System.out.println("Account created for " + name);
                    break;
                case 2:
                    System.out.println("Enter Account ID to delete :");
                    accNo = sc.next();
                    hm.remove(accNo);
                    break;
                case 3:
                    System.out.println("Enter Account ID :");
                    accNo = sc.next();
                    acc = hm.get(accNo);
                    System.out.println(acc);
                    break;
                case 4:
                    for (Customer c : hm.values()) {
                        System.out.println(c);
                    }
                    break;
                case 5:
                case 6:
                    oos.writeObject(hm.size());
                    for (Customer c : hm.values()) {
                        oos.writeObject(c);
                    }

            }
        } while (option != 6);
        oos.flush();
        oos.close();
        fos.close();
    }


}
