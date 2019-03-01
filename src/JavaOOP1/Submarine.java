package JavaOOP1;

public class Submarine extends Water {
    private int maxWeightSubmarine = 2000;
    private int maxSpeedSubmarine = 20;
    private int accelerationSubmarine = 4;

    public void setAcceleration(){
        super.acceleration = accelerationSubmarine;
    }

    public void setMaxSpeed(){
        super.maxSpeed = maxSpeedSubmarine;
    }

    public void setMaxWeight(){
        super.maxWeight = maxWeightSubmarine;
    }

    public void move (){
        System.out.println("Я подлодка, я плыву, буль-буль");
    }
}