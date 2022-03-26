package rzd.company.car;
/*
- Создать объект класса Автомобиль у которого есть два составляющих его элемента - это кузов и двигатель,
а также свойство isStart - которое отвечает за запуск двигателя. У класса Car два метода - запустить авто
и заглушить. Вывести информацию о свойствах автомобиля (цвет кузова, объем двигателя и др.),
а также о его состоянии.
 */
public class Car {
    boolean isStart = false;
    Body body;
    Engine engine;
    Transmission transmission;

    public Car(Body body,Engine engine,Transmission transmission){
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
    }

    void on(){
        isStart = true;
    }
    void off() {
        isStart = false;
    }

    @Override
    public String toString() {
        String info = "Автомобиль " + body.getTitle();
        StringBuilder builder = new StringBuilder(info);
        if (isStart){
            builder.append("\nСостояние автомобиля: двигатель заведён").
                    append("\nТип кузова: ").append(body.getType()).
                    append("\nЦвет кузова: ").append(body.getColour()).
                    append("\nТип коробки передач: ").append(transmission.getTransmission()).
                    append("\nОбъем двигателя: ").append(engine.getCapacity());}
        else {
            builder.append("\nСостояние автомобиля: двигатель не заведён");}
        return builder.toString();
    }
}

