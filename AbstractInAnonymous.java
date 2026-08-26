abstract class Car{
    public abstract void drive();
    public abstract void engine();
}



public class AbstractInAnonymous {
    public static void main(String[] args) {
        //we can't create the object for abstract class but if we declare the abstract methods in anonymous class then it is possible that but but it is not the creation of abstract class but the creation of anonymous class
        Car obj= new Car(){
            //So here we have implemented the methods of anonymous class by creating the objects of anonymous class
            
            public void drive(){
                System.out.println("Driving");
            }
            public void engine(){
                System.out.println("V8 Engine");
            }
        };
        obj.drive();
        obj.engine();
    }
}
