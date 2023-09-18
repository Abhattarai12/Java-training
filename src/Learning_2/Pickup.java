package Learning_2;

public class Pickup extends Car{
    public Pickup(String a, String b, String c, String d, double e) {
        super(a, b, c, d, e);
    }
    private String realWheel;

    public void setRealWheel(String a) {
        this.realWheel = a;
    }

    public String getRealWheel() {
        return realWheel;
    }
}
