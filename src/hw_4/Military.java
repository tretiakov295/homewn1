package hw_4;

public class Military extends AirTransport {

    private boolean ejectionSystem;
    private short missilesOnBoard;

    public Military(int power, int weight, String model, int wingspan, int minimumRunwayLength, int maxSpeed, boolean ejectionSystem, int missilesOnBoard) {
        super(power, weight, model, wingspan, minimumRunwayLength, maxSpeed);
        this.ejectionSystem = ejectionSystem;
        this.missilesOnBoard = (short) missilesOnBoard;
    }

    public void displayInfo() {
        System.out.println("Мощность: " + power + " Масса: " + weight + " Модель: " + model + " Размах крыльев: " + wingspan + " Минимальная длина взлетно-посадочной полосы для взлета: " + minimumRunwayLength +
                " Максимальная скорость: " + maxSpeed +
                " Наличие системы катапультирования : " + ejectionSystem + " Количество ракет на борту: " + missilesOnBoard);
    }
}
