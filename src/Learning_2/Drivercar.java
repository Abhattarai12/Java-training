package Learning_2;

public class Drivercar {
    public static void main(String[] args) {

        Car c1 = new Car("Black","A12B","Micra","Nissan",2000);
        Driver Dan = new Driver();
        Dan.setMyCar(c1);
        System.out.println(Dan.getMyCar().getColour());




    }
}