package Rooms;
import Parent.Room;
import Guests.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private double nightlyRate;
    public BedroomType type;

    public Bedroom (String name, int capacity, double nightlyRate, BedroomType type){
        super(name, capacity);
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
