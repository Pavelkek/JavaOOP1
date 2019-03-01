package JavaOOP1;

public class Kayak extends Water {
    private int maxWeightKayak = 250;
    private int maxSpeedKayak = 10;
    private int accelerationKayak = 2;

    public void setAcceleration(){
        super.acceleration = accelerationKayak;
    }

    public void setMaxSpeed(){
        super.maxSpeed = maxSpeedKayak;
    }

    public void setMaxWeight(){
        super.maxWeight = maxWeightKayak;
    }

    public void move (){
        System.out.println("Я байдарка, я плыву, вжух-вжух");
    }
}