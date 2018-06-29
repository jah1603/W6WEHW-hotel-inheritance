package Parent;
import Guests.Guest;

import java.util.ArrayList;

public abstract class Room {
    private String name;
    public ArrayList<Guest> guests;
    public int capacity;

    public Room(String name, int capacity){
        this.name = name;
        this.guests = new ArrayList<>();
        this.capacity = capacity;
    }

    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void setName(String name){
    this.name = name;
    }

    public int getGuests(){
        return guests.size();
    }


}
