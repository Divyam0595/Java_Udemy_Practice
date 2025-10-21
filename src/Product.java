//Example for Getter Setter - Data hiding and constructors

public class Product {

    String itemno;
    String itemName;
    double price;
    int quantity;

    public String getItemno() {
        return itemno;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double itemprice) {
        price = itemprice;
    }

    public void setQuantity(int itemQuantity) {
        quantity = itemQuantity;
    }

    public Product(String itemno, String itemName, double price, int quantity){
        this.itemno = itemno;
        this.itemName= itemName;
        setPrice(price) ;
        setQuantity(quantity);
    }

    public String toString(){
        return "ItemNo: "+getItemno()+"\nItemName: "+getItemName()+"\nItemPrice: "+getPrice()+"\nItemQuantity: "+getQuantity();
    }
}
class ProductTest{
    public static void main(String args[]){
        Product p= new Product("AB123", "Television",2500.00,5);
        System.out.println(p);
    }
}
