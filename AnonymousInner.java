//Here We will understand the concept of Anonymous inner class which is a type of inner class but with no name
class A{
    public void show(){
        System.out.println("In Show of A");
    }
    
    //Suppose i want to change the concept and logic of show (ahead) method which is should be executed only one time so why should we override the method for only one time use then we can create the Anonymous inner class for this purpose
    
}

public class AnonymousInner {
    public static void main(String[] args) {
        //Syntax of inner Anonymous class
        A obj = new A(){
            public void show(){
                System.out.println("Showing the concept of anonymous inner class");
            }
        };
        obj.show();
    }
}
