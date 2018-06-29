package Rooms;
import Parent.Room;
import Guests.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private double dailyRate;

    public ConferenceRoom (String name, double dailyRate, int capacity){
        super(name, capacity);
        this.dailyRate = dailyRate;
    }


    public double getDailyRate(){
        return this.dailyRate;
    }


}
