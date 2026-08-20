class Mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Name: "+name);
    }

    //static method-Here we cannot use the nonstatic variable in static method 
    public static void show1(){
        //Error - System.out.println("Brand is" + brand + "Price is" + price + "Name is" + name ;)
        System.out.println(name);
    }

    // But another way to use nonstatic variable by just using the reference of particular object
    public static void show1(Mobile obj){
        System.out.println("Brand is" + obj.brand + "Price is" + obj.price + "Name is" + name);
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


        Mobile.show1();
        Mobile.show1(m1);//Access nonstatic variable in static method by using refernce of particular object
    }
}