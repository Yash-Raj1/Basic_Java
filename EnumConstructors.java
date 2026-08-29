enum Laptop{
    Gaming(45000),  Vivobook(65000), Macbook(100000); 

    private int price;

    private Laptop(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}


public class EnumConstructors {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap.getPrice());
    }
}
