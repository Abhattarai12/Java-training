package Learning_2;

public class Driver implements IDrivable, IFly{
    public Driver(){
    }
    private Car myCar;
    private Plane myPlane;

    public void drivecar(double a, double x, double y){
        this.drive(a);
        this.myCar.setPosition(x,y);

    }
    public double drive(double driveDistance){
        return this.myCar.getMiles()+IDrive(driveDistance);
    }
    public double Fly(double miles) {
        return this.myPlane.getPosition().setY(miles);
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

    public Plane getMyPlane() {
        return myPlane;
    }
    public void setMyPlane(Plane myPlane) {
        this.myPlane = myPlane;
    }
}
