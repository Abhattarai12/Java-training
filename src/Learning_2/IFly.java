package Learning_2;

public interface IFly {

    public default double Fly(double miles) {
        return miles;
    }

}
