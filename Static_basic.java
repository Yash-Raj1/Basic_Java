class Mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Name: "+name);
    }
}

public class Static_basic{
    public static void main(String[] args){
        Mobile m1=new Mobile();
        m1.brand="Samsung";
        m1.price=20000;
        Mobile.name="Samrtphone"; //Static variable is accessed by class name and also shared betwwen the different objects
        

        Mobile m2=new Mobile();
        m2.brand="Apple";
        m2.price=50000;
        Mobile.name="Yash Raj";

        Mobile.name="Phone";

        m1.show();
        m2.show();
    }
}