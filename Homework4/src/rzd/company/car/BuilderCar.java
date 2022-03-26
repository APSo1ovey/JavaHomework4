package rzd.company.car;

public class BuilderCar {
    Body buildBody(String title,String colour, String type){
        return new Body(title,colour,type);
    }
    Engine buildEngine(Double capacity){
        return new Engine(capacity);
    }
    Transmission buildTransmission(String transmission){
        return new Transmission(transmission);
    }

    Car createBuilder(String cartitle, String colour, String type, Double capacity, String typetransmission){
        var body = buildBody(cartitle,colour,type);
        var engine = buildEngine(capacity);
        var transmission = buildTransmission(typetransmission);
        return new Car(body,engine,transmission);
    }
}
