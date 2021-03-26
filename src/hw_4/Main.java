package hw_4;

public class Main {
    public static void main(String[] args) {
        Cars cars = new Cars(130, 240, 2325, "Audi A8D2", 4, 12, "Седан", 4);
        cars.displayInfo();
        Civiliz civiliz = new Civiliz(111000, 560, "Airbus A380", 80, 3300, 1185, 853, true);
        civiliz.displayInfo();
        Military military = new Military(123000, 28000, "СУ-27", 15, 1500, 2430, true, 5);
        military.displayInfo();
        Trucks trucks = new Trucks(430, 69, 4480, "Studebaker US6 U3", 25, 152, 3);
        trucks.displayInfo();
    }
}
