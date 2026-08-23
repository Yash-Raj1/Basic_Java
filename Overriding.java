class A{
    public void show(){
        System.out.println("This is A class ");
    
    }
}

class B extends A{
    //Overriding of the method show in class A Which is Overriding concept and A.K.A Runtime Polymorphism
    public void show(){
        System.out.println("This is B Show which is Overriding the method of Super class(A) show method");
    }
}
public class Overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }    
}
