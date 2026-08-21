class A{
    public A(){
        System.out.println("Object is created");
    }
    public void show(){
        System.out.println("In A showe");
    }
}
public class AnonyObject{
    public static void main(String[] args) {
        A obj;  //Reference is created in main stack
        obj=new A();//object is created and assigned to obj- Hence, Regular object
        obj.show();

        //Anonymous object
        new A(); //object is created and have been not assigned(Also can't be used again)
    }
}