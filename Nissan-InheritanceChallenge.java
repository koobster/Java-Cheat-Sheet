/**
 * Created by Dan K on 1/3/2016.
 */
public class Nissan extends Car {

    //You will want to decide where to put the appropriate state and behaviors (fields and methods)
    //as mentioned above, changing gears, increasing/decreasing speed should be included.
    //for your specific type of vehicle you will want to add something specific for that type of car

    private String model;
    private String color;
    private int displacement;

    public Nissan(int speed, int engine, String model, String color, int displacement) {
        super(1, speed, 5, 4, 2, engine);
        this.model = model;
        this.color = color;
        this.displacement = displacement;
    }

    private void changeGears()
    {

    }
    private void increaseSpeed()
    {

    }
    private void decreaseSpeed()
    {

    }
    private void seatWarmers()
    {

    }
}
