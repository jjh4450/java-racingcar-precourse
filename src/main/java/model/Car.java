package model;

public class Car {
    private final String name;
    private int position;
    private Integer fixedRandomNumber = null;

    public Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
        this.name = name;
        this.position = 0;
    }

    public void setFixedRandomNumber(int number) {
        this.fixedRandomNumber = number;
    }

    public void move() {
        if (getRandomNumber() >= 4) {
            this.position++;
        }
    }

    protected int getRandomNumber() {
        if (fixedRandomNumber != null) {
            return fixedRandomNumber;
        }
        return (int) (Math.random() * 10);
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
