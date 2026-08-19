class Human{
    private int age; //Not accessible outside the class
    private String name; //Not accessible outside the class
    

    public Human(){
        age=12;
        name="Kanha";
    }

    public Human(String n1, int a1){
        this.name=n1;
        this.age=a1;
    }

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


public class Constr {
    public static void main(String[] args){
        Human h=new Human();
        System.out.println("Name: "+h.getName());
        System.out.println("Age: "+h.getAge());

        Human h1= new Human("yash raj", 19); 
        System.out.println("Name: "+h1.getName());  
        System.out.println("Age: "+h1.getAge());
        
        h1.setAge(23);
        h1.setName("Yash Raj");
        System.out.println("Name: "+h1.getName());  
        System.out.println("Age: "+h1.getAge());    
    }
}
