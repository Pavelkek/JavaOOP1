package JavaOOP1;

public class Helicopter extends Air{
    private int maxWeightHelecopter = 3000;
    private int maxSpeedHelecopter = 90;
    private int accelerationHelecopter = 15;

    public void setAcceleration(){
        super.acceleration = accelerationHelecopter;
    }

    public void setMaxSpeed(){
        super.maxSpeed = maxSpeedHelecopter;
    }

    public void setMaxWeight(){
        super.maxWeight = maxWeightHelecopter;
    }

    public void move (){
        System.out.println("Я вертолет, я лечу, др-др");
    }
}
