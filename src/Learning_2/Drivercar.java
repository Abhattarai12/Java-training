package Learning_2;

public class Drivercar {
    public static void main(String[] args) {

        Car c1 = new Car("Black","A12B","Micra","Nissan",2000);
        Driver Dan = new Driver();
        Dan.setMyCar(c1);
        System.out.println(Dan.getMyCar().getColour());

        Convertible c2 = new Convertible("Red","ABC","A3","Audi",40000);
        System.out.println(c2.GetIsRoofOpen());
        System.out.println(c2.getMiles());
        System.out.println(c2.increaseMiles(2000));

        if (c2.getClass() == Convertible.class) {
                if (!c2.GetIsRoofOpen()) {
                    c2.ToggleRoof();
            }
        }
        System.out.println(c2.GetIsRoofOpen());


    }
}