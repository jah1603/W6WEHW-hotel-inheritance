package Rooms;
import Parent.Room;

public class Bedroom extends Room {

    private double nightlyRate;
    private BedroomType type;

    public Bedroom (String name, double nightlyRate,  BedroomType type){
        super(name);
        this.nightlyRate = nightlyRate;
        this.type = type;
    }

    public BedroomType getType(){
        return this.type;
    }

    public double getNightlyRate(){
        return this.nightlyRate;
    }

    public int getValueFromEnum() {
        return this.type.getValue();
    }

}
