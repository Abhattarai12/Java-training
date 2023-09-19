package Learning_2;


// Github For Groupwork with Alex

public class Drivercar {
    public static void main(String[] args) {
        Car c1 = new Car("Black","ABC","Duke","Nissan",20000);
        Driver Dan = new Driver();

        Dan.setMyCar(c1);
        System.out.println(Dan.drive(20000));


    }
}