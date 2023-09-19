package Learning_2;

public interface IDrivable {
    public default double IDrive(double miles){
        return miles;
    }

}
