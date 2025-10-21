package IOStreams;

import java.io.*;

class Customer implements Serializable {
    String name;
    String phoneNumber;
     String custID;

    static int counter = 0;

    public Customer(String name, String phoneNumber) {
        custID = "CUS_" + String.format("%03d", ++counter);
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Customer Details : " + "\n ID : " + custID + "\n Name : " + name + "\n Phone : " + phoneNumber;
    }
}

public class TestSerialize {
    public static void main(String args[]) throws Exception{
 /*      Customer[] cArray = {new Customer("John", "988435480"),
                new Customer("Thara", "9884354580"), new Customer("Vivek", "945245245"),
                new Customer("Yathish", "94524524241")};

        int len= cArray.length;

        FileOutputStream fs= new FileOutputStream("/Users/vivek_ravi/Documents/Divya_automation/Customer.txt");
        ObjectOutputStream os= new ObjectOutputStream(fs);
        os.writeInt(len);
        for(Object o: cArray){
            os.writeObject(o);
            os.flush();
        }

        os.close();
        fs.close();

*/
        FileInputStream fs= new FileInputStream("/Users/vivek_ravi/Documents/Divya_automation/Customer.txt");
        ObjectInputStream os= new ObjectInputStream(fs);
        int len =os.readInt();
        for(int o=0;o<len;o++ ){
           System.out.println(os.readObject());
        }

        os.close();
        fs.close();

    }
}
