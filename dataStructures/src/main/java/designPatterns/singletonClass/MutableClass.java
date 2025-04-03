package designPatterns.singletonClass;

public class MutableClass {

    private String state;
    private String city;

    public MutableClass(String state, String city) {
        this.state = state;
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "MutableClass{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
