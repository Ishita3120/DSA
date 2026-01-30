package OOPs;

public class passingMethods {
    public class passingObject {
        public static class Car {
            int seats;
            String name;
            double length;
            String type;
            int torque;

            void display() {
                System.out.println(seats + " " + name + " " + length + " " + type + " " + torque);
            }

        }

        public static void main(String[] args) {
            Car c = new Car();
            c.seats = 5;
            c.length = 3.99;
            c.name = "wagonr";
            c.type = "Engine";
            c.torque = 156;
            c.display();

        }
    }

}
