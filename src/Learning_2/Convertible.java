package Learning_2;

public class Convertible extends Car {
    public Convertible(String a, String b, String c, String d, double e) {
        super(a, b, c, d, e);
    }
    private boolean IsRoofOpen = false;

    public boolean GetIsRoofOpen() {
        return this.IsRoofOpen;
    }

    public void ToggleRoof(){
        this.IsRoofOpen = !this.IsRoofOpen;
    }
    @Override
    public String toString() {
        return super.toString()+this.IsRoofOpen;
    }

}
