package JavaOOP1;

public class Train extends Ground{
    private int maxWeightTrain = 100000;
    private int maxSpeedTrain = 25;
    private int accelerationTrain = 5;

    public void setAcceleration(){
        super.acceleration = accelerationTrain;
    }

    public void setMaxSpeed(){
        super.maxSpeed = maxSpeedTrain;
    }

    public void setMaxWeight(){
        super.maxWeight = maxWeightTrain;
    }

    public void move (){
        System.out.println("Я байдарка, я еду, чух-чух");
    }
}
