class Animal {

    String name;
    public void eat() {
        System.out.println("I can eat");
    }
}

// inherit from Animal
class Dog extends Animal {
    public void display() {
        System.out.println("My name is " + name);
    }
}
public class Singleinheritance {
    public static void main(String[] args) {

        Dog labrador = new Dog();       //object of subclass


        labrador.name = "Rohu";
        labrador.display();
        labrador.eat();
    }
}
