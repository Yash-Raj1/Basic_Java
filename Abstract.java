//An abstract class is a class declared with the abstract keyword that cannot be instantiated directly and can contain both abstract methods and concrete methods. It is mainly used to provide a common base and enforce certain behavior in subclasses.
abstract class Car{
    //This is abstract class which have abstract and concrete method as well
    public abstract void drive();   //Abstract Method    

    public void playmusic(){
        System.out.println("Music Is Playing");
    }
}


class WagonR extends Car{
    //Every subclass which are extending the abstract class must override the abstract method present in abstract class
    public void drive(){
        System.out.println("WagonR is driving");

    }
}
public class Abstract {
    public static void main(String[] args) {
    //Object is not created for the abstract class , object should created for subclass or concrete class
    Car obj = new WagonR();
    obj.drive();
    }
}
