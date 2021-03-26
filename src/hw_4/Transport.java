package hw_4;


public abstract class Transport {

    protected int power; //horsepower
    protected short maxSpeed; // km/h
    protected short weight; //kg
    protected String model;

    public Transport(int power, int maxSpeed, int weight, String model) {
        this.power = power;
        this.maxSpeed = (short) maxSpeed;
        this.weight = (short) weight;
        this.model = model;
    }


}