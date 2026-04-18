enum Laptop{
    DELL(1000),HP(2000),MAC(3000);
    private int price;
    Laptop(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
}
public class Enumwithmethods {
    public static void main(String[] args) {
       Laptop[] lap=Laptop.values();                            //values() method returns an array of all the constants of the enum type in the order they are declared
         for(Laptop l:lap){
              System.out.println(l+" laptop price is: "+l.getPrice());
         }
    }
}
