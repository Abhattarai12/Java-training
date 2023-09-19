package Learning_2;

public class Vehicle implements IDrivable{

    private Position position = new Position (0,0);

    public Position getPosition(){
        return position;
    }

    protected void setPosition (double x, double y){
        this.position.setX(x);
        this.position.setY(y);
    }
}
