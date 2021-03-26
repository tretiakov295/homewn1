package hw_4;

public abstract class AirTransport extends Transport {

    protected short wingspan; //meter
    protected short minimumRunwayLength; //meter


    public AirTransport(int power, int weight, String model, int wingspan, int minimumRunwayLength, int maxSpeed) {
        super(power, maxSpeed, weight, model);
        this.wingspan = (short) wingspan;
        this.minimumRunwayLength = (short) minimumRunwayLength;

    }
}

