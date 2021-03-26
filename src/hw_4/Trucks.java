package hw_4;

public class Trucks extends Road {

    private short capasity; //ton

    public Trucks(int power, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption, int capacity) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.capasity = (short) capacity;
    }

    public void displayInfo() {
        System.out.println("Мощность: " + power + " Максимальная скорость: " + maxSpeed + " Масса: " + weight + " Модель: " + model + " Количество пассажиров: " + numberOfWheels +
                " Расход топлива: " + fuelConsumption + " Грузоподьемность: " + capasity);
    }
}
