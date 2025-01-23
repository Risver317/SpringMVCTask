package web.model;

public class Car {

    private String model;

    private Integer year;

    private Long speed;

    public Car(String model, Integer year, Long speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public Long getSpeed() {
        return speed;
    }
}
