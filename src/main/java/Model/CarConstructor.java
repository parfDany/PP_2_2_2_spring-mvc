package Model;

public class CarConstructor {
    private String modelCar;
    private String colorCar;
    private int power;

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", colorCar='" + colorCar + '\'' +
                ", power=" + power +
                '}';
    }

    public CarConstructor(String modelCar, String colorCar, int power) {
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.power = power;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
