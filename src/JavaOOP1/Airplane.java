package JavaOOP1;

public class Airplane extends Air{
    private int maxWeightAiraplane = 4000;
    private int maxSpeedAiraplane = 100;
    private int accelerationAiraplane = 25;

    public void setAcceleration(){
        super.acceleration = accelerationAiraplane;
    }

    public void setMaxSpeed(){
        super.maxSpeed = maxSpeedAiraplane;
    }

    public void setMaxWeight(){
        super.maxWeight = maxWeightAiraplane;
    }

    public void move (){
        System.out.println("Я самолет, я лечу, жжж");
    }
}
