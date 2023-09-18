package Learning_2;

public class Driver {
    Car myCar = new Car("Red","FG90","Sriracha", "Spicy", 20);
    public void drive(double driveDistance) {
        myCar.increaseMiles(driveDistance);
    }
}
