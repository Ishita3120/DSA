package OOPs;

public class mypolymorphism {
    public static class Dog {
        void speak() {
            System.out.println("bark");
        }
    }

    public static class Cat {
        void speak() {
            System.out.println("meow meow");
        }
    }

    public static class pikachu {
        void speak() {
            System.out.println("pika pika");
        }
    }

    public static void main(String args[]) {
        Dog d = new Dog();
        d.speak();
        Cat c = new Cat();
        c.speak();
        pikachu p = new pikachu();
        p.speak();

    }

}
