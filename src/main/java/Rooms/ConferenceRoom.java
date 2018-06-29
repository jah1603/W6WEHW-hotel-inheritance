package Rooms;
import Parent.Room;
import Guests.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private double dailyRate;
    private int capacity;

    public ConferenceRoom (String name, double hourlyRate, int capacity){
        super(name);
        this.dailyRate = dailyRate;
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public double getDailyRate(){
        return this.dailyRate;
    }


}
