package vehicles;

import details.Engine;
import professions.Driver;

public class SportCar extends Car{
    private Integer maxSpeed;

    public SportCar(Double weight, String mark, String _class, Driver driver, Engine engine, Integer maxSpeed){
        this.setWeight(weight);
        this.setMark(mark);
        this.set_class(_class);
        this.setDriver(driver);
        this.setEngine(engine);
        this.maxSpeed = maxSpeed;
    }
    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void setWeight(Double weight) {
        super.setWeight(weight);
    }

    @Override
    public Double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setMark(String mark) {
        super.setMark(mark);
    }

    @Override
    public String getMark() {
        return super.getMark();
    }

    @Override
    public void set_class(String _class) {
        super.set_class(_class);
    }

    @Override
    public String get_class() {
        return super.get_class();
    }

    @Override
    public void setDriver(Driver driver) {
        super.setDriver(driver);
    }

    @Override
    public Driver getDriver() {
        return super.getDriver();
    }

    @Override
    public void setEngine(Engine engine) {
        super.setEngine(engine);
    }

    @Override
    public Engine getEngine() {
        return super.getEngine();
    }

    public SportCar(){}
    @Override
    public void getInfo(){
        System.out.println("*Информация об авто* \n" + "Марка авто: " + getMark() + "\n" + "Класс авто: " + get_class() +"\n"+ "Максимальная скорость: " + maxSpeed);
        System.out.println("Вес автомобиля: " + getWeight() + "(кг)");
        System.out.println("Информация о водителе: *ФИО* - " + getDriver().getInitials() + " *Стаж* - " + getDriver().getExperience());
        System.out.println("Информация о моторе: *Мощность* - " + getEngine().getPower() + " *Производитель* - " + getEngine().getManufacturer());

    }
}
