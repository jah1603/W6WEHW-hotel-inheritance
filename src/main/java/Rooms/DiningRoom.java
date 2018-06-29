package Rooms;
import Parent.Room;
import Guests.Guest;

import java.util.ArrayList;

public class DiningRoom extends Room {

    private int capacity;

    public DiningRoom (String name, int capacity){
        super(name);
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }


}