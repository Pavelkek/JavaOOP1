package JavaOOP1;

public class Main {
        public static void main(String[] args) {
            Vehicles ar = new Ship();
            ar.move();
            int i = 0;
            while (i < 3){
                i++;
                ar.carry(5000);
            }
            i = 0;
            while (i < 6){
                i++;
                ar.accelerate();
            }
            i = 0;
            while (i < 6){
                i++;
                ar.slowDown();
            }
    }
}
