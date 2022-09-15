package details;

public class Engine {
    private Integer power;
    private String manufacturer;

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public Engine(Integer power, String manufacturer){
        this.power = power;
        this.manufacturer = manufacturer;
    }
    public Engine(){

    }
}
