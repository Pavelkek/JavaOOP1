package JavaOOP1;

public class Bicycle extends Ground{
    private int maxWeightBicycle = 120;
    private int maxSpeedBicycle = 5;
    private int accelerationBicycle = 1;

    private class Wheel {
        private int diameter;
        private String rubber;
        private Wheel (int diameter,String rubber){
            this.diameter = diameter;
            this.rubber = rubber;
        }
    }
    private Wheel Circle = new Wheel(5, "Michelin");


    public void setAcceleration(){
        super.acceleration = accelerationBicycle;
    }

    public void setMaxSpeed(){
        super.maxSpeed = maxSpeedBicycle;
    }

    public void setMaxWeight(){
        super.maxWeight = maxWeightBicycle;
    }

    public void move (){
        System.out.println("Я велосипед, я еду, дрынь-дрынь");
    }
}
