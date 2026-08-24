// Final - Class, Variable, Method
final class Calc{
    public void show(){
        System.out.println("In A show");
    }
    public void add(int n1,int n2){
        System.out.println(n1+n2);
    }
}

//But i want that the AdvCalc is not able to extends the above Calc class then i should make Calc class as Final to prohibit the inheritance by AdvCalc
//class AdvCalc extends Calc{
    //throws an error b/c calc is final class

//}

class A{
    public void show(){
        System.out.println("In Show A");
    }
    public final void show1(){
        System.out.println("This is Final Show Of A");
    }
}

class B extends A{
    public void show(){

        System.out.println("In Show B");
    }

    //But we can't override the final method show1
}



public class Final {
    public static void main(String[] args) {
        final double pi = 3.14; 
        //pi=3.99; //Prohibited due to final variable pi
        System.out.println(pi);
    }
}
