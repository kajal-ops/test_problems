public class HybridInheritanceDemo {
    public static void main(String[] args) {
        Tuna tuna = new Tuna();
        tuna.eat();
        tuna.swim();
        tuna.type();

        System.out.println();

        Peacock peacock = new Peacock();
        peacock.eat();
        peacock.fly();
        peacock.display();

        System.out.println();

        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.bark();

        System.out.println();

        Human human = new Human();
        human.eat();
        human.walk();
        human.speak();
    }
}
// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Derived class of Animal
class Fish extends Animal {
    void swim() {
        System.out.println("Fish swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird flies");
    }
}
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

// Further derived from Fish
class Tuna extends Fish {
    void type() {
        System.out.println("Tuna is a small fish");
    }
}

class Shark extends Fish {
    void type() {
        System.out.println("Shark is a large fish");
    }
}
// Further derived from Bird
class Peacock extends Bird {
    void display() {
        System.out.println("Peacock displays feathers");
    }
}

// Further derived from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Mammal {
    void meow() {
        System.out.println("Cat meows");
    }
}
class Human extends Mammal {
    void speak() {
        System.out.println("Human speaks");
    }
}
