package rzd.company.car;

public class Main {
    public static void main(String[] args) {
        var car = new BuilderCar().createBuilder("Лада","баклажановый","седан",1.2,"ручная");
        car.on();
        System.out.println(car);
    }
}
