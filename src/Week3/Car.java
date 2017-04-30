package Week3;

/**
 * Created by User on 004 04.02.17.
 */
public class Car {
    public String model;
    public String number;
    public int maxSpeed;
    public float engineSize;
    public int currentSpeed;
    public static Car createCar (String someModel, String someNumber, int maxSpeed, float engineSize){
        Car tempCar = new Car();
        tempCar.model = someModel;
        tempCar.number = someNumber;
        tempCar.maxSpeed = maxSpeed;
        tempCar.engineSize = engineSize;

        return tempCar;

    }

    public void incSpeed (){
        if (this.currentSpeed < this.maxSpeed){
            this.currentSpeed += 10;
            System.out.println(this.model + " New curent speed is "
            +this.currentSpeed);
        }else{
            System.out.println(this.model + ":My speed is max now "  + this.maxSpeed);

        }
    }

    public static Car changeModel(Car car){
        car.model = "cahngeModel";
        return null;
    }

}
