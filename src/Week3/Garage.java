package Week3;

/**
 * Created by User on 004 04.02.17.
 */
public class Garage {
    public Car parkedCar;

    public void parkcar(Car car) {
        this.parkedCar = car;
    }

    public Car unPark() {
        if (this.Car != null) {
            System.out.println(this.currentCar.model);
            Car tempCar = this.currentCar;
            currentCar = null;
            return tempCar;
        } else {
            return null;
        }
    }
}
