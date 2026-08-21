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
        VeryAdvCalc obj=new VeryAdvCalc();
        obj.add(2,3); //Here subclass - VeryAdvCalc is using the properties of super class i.e, AdvCalc
        obj.mul(2,9);
        double r1=obj.power(2,3);
        double r2=obj.power(2,3);
        System.out.println(r1+r2);
    }
}
