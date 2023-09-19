package Learning_2;

public class Plane extends Vehicle implements IFly{

    private double wingL;
    public Plane (double x){
        wingL = x;
    }
    @Override
    public String toString() {
        return "The length of this plane is" + this.wingL;
    }


}
