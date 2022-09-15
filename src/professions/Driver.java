package professions;

public class Driver {
    private String initials;
    private Integer experience;

    public String getInitials() {
        return initials;
    }
    public void setInitials(String initials) {
        this.initials = initials;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getExperience() {
        return experience;
    }
    public Driver(String initials, Integer experience){
        this.initials = initials;
        this.experience = experience;
    }
    public Driver(){

    }
}
