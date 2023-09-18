package Learning_2;

public class Driver {
    public Driver(){}
    private Car myCar;
    public double drive(double driveDistance) {

        return this.myCar.increaseMiles(driveDistance);
    }

    public Car getMyCar() {
        return myCar;
    }

    public void setMyCar(Car myCar) {
        this.myCar = myCar;
    }
}
