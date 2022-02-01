package beforerefactor;

public class Refactor3 {
    public class Car {
        int carDoors;
        double maxSpeed;
        double carPrice;
        String color;

        public Car(int number, double speed, double salePrice, String color) {
            this.carDoors = number;
            this.maxSpeed = speed;
            this.carPrice = salePrice;
            this.color = color;
        }

        public int getCarDoors() {
            return carDoors;
        }

        public double getMaxSpeed() {
            return maxSpeed;
        }

        public double getCarPrice() {
            return carPrice;
        }

        public String getColor() {
            return color;
        }
    }
}
