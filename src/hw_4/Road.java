package hw_4;

public abstract class Road extends Transport {

    protected short numberOfWheels;
    protected short fuelConsumption; // l/100km

    public Road(int power, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.numberOfWheels = (short) numberOfWheels;
        this.fuelConsumption = (short) fuelConsumption;
    }

}
