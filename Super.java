class A{
    public A(){
        System.out.println("In constructor");
    }
    public A(int n){
        //super();
        System.out.println("In A Int");
    }
}

class B extends A{
    public B(){
        super(5);
        System.out.println("In constructor");
    }
    public B(int n){
        super(n);
        System.out.println("In B Int");
    }
}


public class Super{
    public static void main(String [] args){
       //B obj = new B(); //Calls the default constructor of B and super call the default constructor of super class i.e, A but also if super method is taking integer as parameter then it will call that constructor of super class which is accepting the parameter (parameterized constructor)
        B obj =new B(5); //calls the parameterized constructor of B but firstly call the constructor of super class i.e, A
        System.out.println(obj);
    }
}