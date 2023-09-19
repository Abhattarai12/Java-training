package Learning_2;

public class Driver implements IDrivable{
    public Driver(){
    }
    private Car myCar;

    public void drivecar(double a, double x, double y){
        this.drive(a);
        myCar.setPosition(x,y);

    }
    public double drive(double driveDistance){
        return this.myCar.getMiles()+IDrive(driveDistance);
    }


//    public double drive(double driveDistance) {
//
//        return this.myCar.increaseMiles(driveDistance);
//    }

    public Car getMyCar() {
        return myCar;
    }

    public void setMyCar(Car myCar) {
        this.myCar = myCar;
    }
}
