package hw_4;

public class Civiliz extends AirTransport {

    private short numberOfWheels;
    private boolean businessClass;

    public Civiliz(int power, int weight, String model, int wingspan, int minimumRunwayLength, int maxSpeed, int numberOfWheels, boolean businessClass) {
        super(power, weight, model, wingspan, minimumRunwayLength, maxSpeed);
        this.numberOfWheels = (short) numberOfWheels;
        this.businessClass = businessClass;
    }

    public void displayInfo() {
        System.out.println("Мощность: " + power + " Масса: " + weight + " Модель: " + model + " Размах крыльев: " + wingspan + " Минимальная длина взлетно-посадочной полосы для взлета: " + minimumRunwayLength + " Максимальная скорость: " + maxSpeed + " Количество пассажиров: " + numberOfWheels +
                " Наличие бизнес-класс: " + businessClass);
    }
}

