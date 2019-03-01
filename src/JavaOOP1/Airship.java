package JavaOOP1;

public class Airship extends Air{
    private int maxWeightAirship = 2500;
    private int maxSpeedAirship = 80;
    private int accelerationAirship = 20;

    public void setAcceleration(){
        super.acceleration = accelerationAirship;
    }

    public void setMaxSpeed(){
        super.maxSpeed = maxSpeedAirship;
    }

    public void setMaxWeight(){
        super.maxWeight = maxWeightAirship;
    }

    public void move (){
        System.out.println("Я дирижабль, я лечу, ...");
    }
}
