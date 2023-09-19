package Learning_2;

public class Vehicle implements IFly{

    private Position position = new Position (0,0);

    public Position getPosition(){
        return position;
    }

    protected void setPosition (double x, double y){
        this.setPosition(this.getPosition().getX(), this.getPosition().getY());
    }
}
