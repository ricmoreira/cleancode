package afterrefactor;

public class Refactor3 {
    public class Car {
        int doors;
        double maxSpeed;
        double salePrice;
        String color;

        public Car(int doors, double maxSpeed, double salePrice, String color) {
            this.doors = doors;
            this.maxSpeed = maxSpeed;
            this.salePrice = salePrice;
            this.color = color;
        }

        public int getDoors() {
            return doors;
        }

        public double getMaxSpeed() {
            return maxSpeed;
        }

        public double getSalePrice() {
            return salePrice;
        }

        public String getColor() {
            return color;
        }
    }
}
