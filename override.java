class Animal {
    void eat() {//method
        System.out.println("eats anything");
    }
}
class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }

}
public class override {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
} 


