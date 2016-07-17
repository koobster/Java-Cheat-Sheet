/**
 * Created by Dan K on 1/3/2016.
 */
public class Car extends Vehicle {

    //You will want to decide where to put the appropriate state and behaviors (fields and methods)
    //as mentioned above, changing gears, increasing/decreasing speed should be included.
    //for your specific type of vehicle you will want to add something specific for that type of car

    private int wheels;
    private int doors;
    private int engine;

    public Car(int steering, int speed, int gears, int wheels, int doors, int engine) {
        super(steering, speed, gears);
        this.wheels = wheels;
        this.doors = doors;
        this.engine = engine;
    }


}
