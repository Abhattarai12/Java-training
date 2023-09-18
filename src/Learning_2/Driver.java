package Learning_2;

public class Driver {
    private Car myCar;
    public void drive(double driveDistance) {
        myCar.increaseMiles(driveDistance);
    }

    public Car getMyCar() {
        return myCar;
    }

    public void setMyCar(Car myCar) {
        this.myCar = myCar;
    }
}
