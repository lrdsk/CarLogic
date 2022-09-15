package vehicles;
import  professions.Driver;
import  details.Engine;
public class Car {
    private Double weight;
    private String mark;
    private String _class;
    private Driver driver = new Driver();
    private Engine engine = new Engine();

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public String get_class() {
        return _class;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
    public void start(){
        System.out.println("Поездка началась");
    }
    public void stop(){
        System.out.println("Остановка");
    }
    public void turnleft(){
        System.out.println("Поворот налево");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public Car(Double weight,String mark,String _class,Driver driver,Engine engine){
        this.weight = weight;
        this.mark = mark;
        this._class = _class;
        this.driver = driver;
        this.engine = engine;
    }
    public Car(){}

    public void getInfo(){
        System.out.println("Информация об авто: \n" + "Марка авто: " + mark + "\n" + "Класс авто: " + _class);
        System.out.println("Вес автомобиля: " + weight + "(кг)");
        System.out.println("Информация о водителе: *ФИО* - " + driver.getInitials() + " *Стаж* - " + driver.getExperience());
        System.out.println("Информация о моторе: *Мощность* - " + engine.getPower() + " *Производитель* - " + engine.getManufacturer());
    }
}
