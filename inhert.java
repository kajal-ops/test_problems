public class inhert {
    public static void main(String[] args) {
        Fish nemo = new Fish();
        nemo.eat();
        nemo.swim();

        // Bird (inherits from Animal)
        Bird sparrow = new Bird();
        sparrow.fly();
     }
}
// base class 
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}
class Memmal  extends Animal {
    void walk() {
        System.out.println("walks");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}
class Bird  extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

