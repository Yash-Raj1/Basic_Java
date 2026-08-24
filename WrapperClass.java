public class WrapperClass {
    public static void main(String[] args) {
        int num=9;   //Primitive Datatypes
        Integer num1= num; //Here i am creating a reference of Integer type i.e., Objects and if we assign the Primitive value to objects i.e, Auto-Boxing
        System.out.println(num1);
        
        int num2=num1; //Auto-Unboxing - Assigning of object value to primitive type
        System.out.println(num2);

        String val="18";
        int num3=Integer.parseInt(val); //Here Wrapper class are providing method to convert value into primitive types

        System.out.println(num3);
        
    }
}
