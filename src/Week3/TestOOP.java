package Week3;

/**
 * Created by User on 004 04.02.17.
 */
public class TestOOP {
    public static void main(String[] args) throws InterruptedException {
        Car opelCar = Car.createCar("Opel", "777", 150, 1.5f);
        Car bmwCar = new Car();
        bmwCar.model = "BMW";
        bmwCar.number = "1234";
        bmwCar.engineSize = 2.3f;
        bmwCar.maxSpeed = 220;

        while (bmwCar.currentSpeed <= bmwCar.maxSpeed) {
            bmwCar.incSpeed();
            Thread.sleep(1000);
        }
        while (opelCar.currentSpeed <= opelCar.maxSpeed) {
            opelCar.incSpeed();
            Thread.sleep(1000);
        }
    }
    }

