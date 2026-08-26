//An inner class is a class defined inside another class, allowing the inner class to logically group related functionality and access members of its enclosing class.
class A{
    int x=10;


    class B{
        public void config(){
            System.out.println(x);
        }
    }

    //Static inner Class which doesn't need any object of outer class to create the object
    static class C{
        public void display(){
            System.out.println("Hello !");
        }
    }
}


public class Inner {
    public static void main(String[] args) {
        A obj = new A(); //Object creation of Outer class
        

        //By the help of object of outer class we can create the object of inner class because the inner class is static which needs the object of outer class or the class which is the outer and also Inner class can access the members of outer class
        A.B o = obj.new B();
        System.out.println(obj.x);
        o.config();
        //int r=o.x;

        //Object creation of static inner class
        A.C s = new A.C(); // This not works for non-static class
        s.display();
        //note :- The outer class is not made to be Static
    }
}
