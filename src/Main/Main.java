package Main;
import vehicles.Car;
import details.Engine;
import professions.Driver;
import vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver driverMercedes2 = new Driver("Абубакиров Роман Романович", 10);
        Driver driverMercedes1 = new Driver("Ваня", 5);
        Engine engine = new Engine(1000, "Германия");
        Car mercedes1 = new Car();
        
        SportCar mercedes2 = new SportCar();

        mercedes1.setDriver(driverMercedes1);
        mercedes2.setMark("Мерседес *c230*");
        mercedes2.setWeight(560.5);
        mercedes2.set_class("Премиум");
        mercedes2.setDriver(driverMercedes2);
        mercedes2.setEngine(engine);
        mercedes2.setMaxSpeed(500);


        mercedes2.getInfo();
    }
}
