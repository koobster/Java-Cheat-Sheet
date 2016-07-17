/**
 * Created by Dan K on 1/3/2016.
 */
public class Vehicle {

    private int speed;
    private int steering;
    private int gears;

    public Vehicle(int steering, int speed, int gears) {
        this.steering = steering;
        this.speed = speed;
        this.gears = gears;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSteering() {
        return steering;
    }

    public int getGears() {
        return gears;
    }
}
