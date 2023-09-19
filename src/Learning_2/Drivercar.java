package Learning_2;


// GitHub For group work with Alex

public class Drivercar {
    public static void main(String[] args) {
        Car c1 = new Car("Black","ABC","Duke","Nissan",20000);
        Driver Dan = new Driver();
        Plane p1 = new Plane(20);
        Dan.setMyPlane(p1);

//        Dan.setMyCar(c1);
//        Dan.drivecar(2,8,10);
//        System.out.println(c1.getPosition());
//        System.out.println(Dan.drive(20000));
        System.out.println(Dan.Fly(20));

    }
}