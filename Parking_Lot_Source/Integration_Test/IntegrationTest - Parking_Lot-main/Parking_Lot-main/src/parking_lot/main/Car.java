package parking_lot.main;

public class Car {

    public String NumberPlate;
    public String CarColor; //red, yellow, green, etc..
    public String CarType;

    public Car(){
        
    }
    // Constructor dengan parameter
    public Car(String numberPlate, String carColor, String carType) {
        this.NumberPlate = numberPlate;
        this.CarColor = carColor;
        this.CarType = carType;
    }

    public String getNumberPlate() {
        return NumberPlate;
    }

    public void setNumberPlate(String NumberPlate) {
        this.NumberPlate = NumberPlate;
    }

    public String getCarColor() {
        return CarColor;
    }

    public void setCarColor(String CarColor) {
        this.CarColor = CarColor;
    }

    public String getCarType() {
        return CarType;
    }

    public void setCarType(String CarType) {
        this.CarType = CarType;
    }
}
