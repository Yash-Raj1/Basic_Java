class Human{
    private int age; //Not accessible outside the class
    private String name; //Not accessible outside the class

    public void setAge(int a){
        this.age=a;
    }
    public int getAge(){
        return age;
    }

    public void setName(String a){
        this.name=a;
    }

    public String getName(){
        return name;
    }
}


public class Encaps {
    public static void main(String[] args){
        Human h1= new Human();
        h1.setAge(23);
        h1.setName("Yash Raj");
        System.out.println("Name: "+h1.getName());  
        System.out.println("Age: "+h1.getAge());    
    }
}
