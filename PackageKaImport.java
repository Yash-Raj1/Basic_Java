import Other.tools.Calc1;
import Other.tools.AdvCalc1;
//import Other.*;//Here after adding * it will not importing Calc1 or AdvCalc1 because * is used to import files directly not folder(And Calc1 and AdvCalc1 is in folder directly not a filess)

public class PackageKaImport {
    public static void main(String[] args) {
        Calc1 ob=new Calc1();
        int r=ob.add(2, 6);
        System.out.println(r);
        AdvCalc1 ob1=new AdvCalc1();
        int r2=ob1.mul(2, 6);
        System.out.println(r2);
    }
}
