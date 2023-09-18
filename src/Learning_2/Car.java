package Learning_2;

public class Car {
    private String colour;
    private String reg;
    private String model;
    private String make;
    private double miles;


    public Car (String a, String b, String c, String d, double e) {
        this.colour = a;
        this.reg = b;
        this.model =c;
        this.make = d;
        this.miles = e;

    }

    public String getColour(){
        return colour;
    }
    public String getReg(){
        return reg;
    }
    public String getModel(){
        return model;
    }
    public String getMake(){
        return make;
    }
    public double getMiles(){
        return miles;
    }
    public double increaseMiles (double milesValue){
        return miles = miles + milesValue;
    }

    public void setColour(String a ){
        this.colour = a;
    }
    public void setReg(String a ){
        this.reg = a;
    }
    public void setModel(String f ){
        this.model = f;
    }
    public void setMake(String f ){
        this.make = f;
    }

}

//    public String colour ;
//    public String reg ;
//    public String model ;
//    public String make ;
//    public double miles = 0;

//    public double increaseMiles (double milesValue){
//        return miles = miles + milesValue;
//    }
//}
