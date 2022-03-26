package rzd.company.car;

public class Body {
    private String title;
    private String colour;
    private String type;

    public Body(String title,String colour, String type){
        this.title = title;
        this.colour = colour;
        this.type = type;
    }

    public String getTitle(){
        return title;
    }

    public String getColour(){
        return colour;
    }

    public String getType(){
        return type;
    }
}
