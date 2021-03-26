package hw_4;

public class Cars extends Road {

    private final String bodyType;
    private final short numberOfPassengers;


    public Cars(int power, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption, String bodyType, int numberOfPassengers) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = (short) numberOfPassengers;
    }

    public void displayInfo() {
        System.out.println("Мощность: " + power + " Максимальная скорость: " + maxSpeed + " Масса: " + weight + " Модель: " + model + " Количество колес: " + numberOfWheels +
                " Расход топлива: " + fuelConsumption + " Тип кузова: " + bodyType + " Количество пассажиров " + numberOfPassengers);
    }
}

