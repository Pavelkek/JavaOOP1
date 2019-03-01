package JavaOOP1;

public class Horse extends Ground{
    private int maxWeightHorse = 200;
    private int maxSpeedHorse = 10;
    private int accelerationHorse = 2;

    public void setAcceleration(){
        super.acceleration = accelerationHorse;
    }

    public void setMaxSpeed(){
        super.maxSpeed = maxSpeedHorse;
    }

    public void setMaxWeight(){
        super.maxWeight = maxWeightHorse;
    }

    public void move (){
        System.out.println("Я лошадь, я бегу, иго-го");
    }
}
