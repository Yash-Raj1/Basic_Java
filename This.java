class A{
    public A(){
        System.out.println("In constructor");
    }
    public A(int n){
        //super();
        this();
        System.out.println("In A Int");
    }
}

class B extends A{
    public B(){
        super(5);
        System.out.println("In constructor");
    }
    public B(int n){
        this();
        
        System.out.println("In B Int");
    }
}

public class This {
    public static void main(String[] args) {
        B obj =new B(5);
    }
}
