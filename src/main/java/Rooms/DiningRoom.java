package Rooms;
import Parent.Room;
import Guests.Guest;

import java.util.ArrayList;

public class DiningRoom extends Room {


    public DiningRoom (String name, int capacity){
        super(name, capacity);
        this.guests = new ArrayList<>();
    }



}