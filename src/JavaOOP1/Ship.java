package JavaOOP1;

public class Ship extends Water {
    private int maxWeightShip = 10000;
    private int maxSpeedShip = 25;
    private int accelerationShip = 5;

    public void setAcceleration(){
        super.acceleration = accelerationShip;
    }

    public void setMaxSpeed(){
        super.maxSpeed = maxSpeedShip;
    }

    public void setMaxWeight(){
        super.maxWeight = maxWeightShip;
    }

    public void move (){
        System.out.println("Я корабль, я плыву, бр-бр");
    }
}