class Mobile{
    String brand;
    int price;
    static String name;

    //static block is called once and static block , we can initiate only static variable
    static{
        name="phone";
        System.out.println("in static");
    }

    public Mobile(){
        brand="";
        price=200;
        System.out.print("In constructor");
    }

    public void show(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Name: "+name);
    }


}

public class Static_block{
    public static void main(String[] args){
        //At this time the class mobile is loaded in class loader(First time the object is creted of Mobile class) and it automatically call the static block first time but what if when the object is not created then how we call the static block - there is one method that is class of class
        
        Mobile m1=new Mobile();
        m1.brand="Samsung";
        m1.price=20000;
        Mobile.name="Samrtphone"; //Static variable is accessed by class name and also shared betwwen the different objects
        

        Mobile m2=new Mobile();
        m2.show();
    }
}