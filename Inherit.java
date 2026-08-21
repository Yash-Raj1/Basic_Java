class Calc{
    public void add(int n1,int n2){
        System.out.println(n1+n2);
    }
    public void sub(int n1,int n2){
        System.out.println(n1-n2);
    }
}
//Advance calculator is inheriting the properties of basic calculator
class AdvCalc extends Calc{
    public void mul(int n1,int n2){
        System.out.println(n1*n2);
    }
    public void div(int n1,int n2){
        System.out.println(n1/n2);
    }
}



public class Inherit {
    public static void main(String[] args) {
        AdvCalc obj=new AdvCalc();
        obj.add(2,3); //Here subclass - AdvCalc is using the propertiees of super class i.e, Calc
        obj.mul(2,9);
    }
}
