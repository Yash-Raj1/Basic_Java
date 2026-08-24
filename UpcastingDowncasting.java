class Animal{
    public void sound(){
        System.out.println("Animal is making sound");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking");
    }
}



class UpcastingDowncasting{
    public static void main(String[] args) {
        Animal a = new Dog(); //Here reference is created of type Animal i.e, a which is not knowing the B rather it is getting the reference of subclass(i.e, Dog) - It is called Upcasting
        a.sound(); //Correct
        // a.bark(); //error because a is the reference of type Animal class hence not knowing the dog class

        Dog d = (Dog) a; //Here we explicity passing the reference of Animal class(i.e, Parent class ) to child class(i.e, Dog Class) - This is called Downcasting
        d.bark();
        d.sound(); //Here passing the reference of Animal also so Dog knows the sound method also
    }
}