//An interface in Java is a contract that defines a set of behaviors that implementing classes must provide. A class implements an interface using the implements keyword. Interfaces support abstraction, polymorphism, and multiple inheritance of type.

// class - class => extends
// class - interface => implements
// interface - interface => extends

// Interface methods are by default - public abstract
// Interface variables or members are by default - public final and static

interface Payments{
    void pay();
}

interface Payments_mode{
    void mode();
}

interface Billing extends Payments,Payments_mode{
    //void billing();
} 

class UPI implements Payments{

    @Override
    public void pay() {
        // TODO Auto-generated method stub
        System.out.println("Pay using UPI");    
    }
}

class Mode implements Payments_mode, Payments{

    @Override
    public void mode() {
        // TODO Auto-generated method stub
        System.out.println("Online mode");

    }

    @Override
    public void pay() {
        // TODO Auto-generated method stub
        System.out.println("Pay using UPI");    
    }
}

class Purchasing implements Billing{

    @Override
    public void pay() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'pay'");
        System.out.println("Through the UPI");
    }

    @Override
    public void mode() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mode'");
        System.out.println("Online mode Done");
    }

}



public class Interface {
    public static void main(String[] args) {
        Payments p = new UPI();
        p.pay();

        Payments m = new Mode();
        m.pay();
        //m.mode(); //Wrong interface reference 
    
        Payments_mode pm = new Mode();
        pm.mode();

        Billing b = new Purchasing();
        b.mode();
        b.pay();
        // Here the reference that b holds are of Billing class which are implementing the both Payment and Payment_methods


        // To hamne dekha ki hrr class apne apne hisaab se interface methods ko use kr rha thats why interface class aaya 
    }
}
