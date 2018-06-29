package Parent;
import Guests.Guest;

import java.util.ArrayList;

public abstract class Room {
    private String name;
    private ArrayList<Guest> guests;

    public Room(String name){
        this.name = name;
        this.guests = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
    this.name = name;
    }

    public int getGuests(){
        return guests.size();
    }


}
