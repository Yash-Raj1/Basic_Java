class A{
    public void show(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B Show");
    }

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();   // here At Runtime it is decided that whose reference obj is taking irrespective of type of reference 
    
        obj=new B();  //Now obj stores the refernece of object B
        obj.show(); //Hence it is Dynamic Method Dispatching which is decided At runtime.
    }
}
