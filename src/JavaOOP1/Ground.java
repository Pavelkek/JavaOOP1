package JavaOOP1;

public abstract class Ground implements Vehicles{
    public int maxWeight;
    private int currentWeight = 0;
    private int currentSpeed = 0;
    public  int maxSpeed;
    public int acceleration;

    public abstract void setMaxWeight();
    public abstract void setMaxSpeed();
    public abstract void setAcceleration();

    public void carry (int weight){
        setMaxWeight();
        if(maxWeight >= currentWeight + weight){
            currentWeight += weight;
            System.out.println("Везу: " + currentWeight + " кг");
        } else {
            System.out.println("Не могу перевозить такой вес");
        }
    }

    public void accelerate(){
        setMaxSpeed();
        setAcceleration();
        if(maxSpeed >= currentSpeed + acceleration){
            currentSpeed += acceleration;
            System.out.println("Текущая скорость: " + currentSpeed);
        } else {
            System.out.println("Мчу на максималке, быстрее не могу");
        }
    }

    public void slowDown(){
        setMaxSpeed();
        setAcceleration();
        if(currentSpeed != 0){
            currentSpeed -= acceleration;
            System.out.println("Текущая скорость: " + currentSpeed);
        } else {
            System.out.println("Стою, никуда не двигаюсь");
        }
    }
}
