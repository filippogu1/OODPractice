package OODBasics;

//abstract parent class
abstract class Animal{
    public abstract void sound();
    public void eat() {
        System.out.println("Eat!");
    }
}
//Dog class extends Animal class
class Dog extends Animal{
    public void sound(){
        System.out.println("Woof");
    }
}

//Cat class extends Animal class
class Cat extends Animal{
    public void sound(){
        System.out.println("Meow");
    }
}

public class AbstractClass1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();
        dog.eat();
        cat.sound();
        cat.eat();
    }
}
