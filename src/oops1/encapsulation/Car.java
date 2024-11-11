package oops1.encapsulation;

// Encapsulation ---> Hiding of data.

class Car {
    private String brandName;
    private String modelName;
    private String color;
    private int mileage;
    private int speed;

    public void accelerate(int increment) {
        speed += increment;
    }

    public void brake(int decrement) {
        speed -= decrement;
    }

    public Car(String brandName, String modelName, String color, int mileage, int speed) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.color = color;
        this.mileage = mileage;
        this.speed = speed;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
