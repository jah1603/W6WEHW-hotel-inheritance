package Accommodation;
import Guests.Guest;
import Rooms.Bedroom;
import Rooms.BedroomType;
import Rooms.ConferenceRoom;
import Rooms.DiningRoom;
import Parent.Room;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Room> rooms;

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    Bedroom bedroom5;
    Bedroom bedroom6;
    Bedroom bedroom7;
    Bedroom bedroom8;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;

    public Hotel(String name){

        bedroom1 = new Bedroom("1", 45, BedroomType.FAMILY);
        bedroom1 = new Bedroom("1", 45, BedroomType.FAMILY);
        bedroom2 = new Bedroom("2", 60, BedroomType.APARTMENT);
        bedroom3 = new Bedroom("3", 30, BedroomType.SINGLE);
        bedroom4 = new Bedroom("4", 30, BedroomType.SINGLE);
        bedroom5 = new Bedroom("5", 30, BedroomType.SINGLE);
        bedroom6 = new Bedroom("6", 40, BedroomType.DOUBLE);
        bedroom7 = new Bedroom("7", 40, BedroomType.DOUBLE);
        bedroom8 = new Bedroom("8", 40, BedroomType.DOUBLE);
        conferenceRoom = new ConferenceRoom("Commercial Consultation Zone A", 75, 12);
        diningRoom = new DiningRoom("Expansive Skies Dining Area", 25);
        this.name = name;
        this.rooms = new ArrayList<>();
        rooms.add(bedroom1);
        rooms.add(bedroom2);
        rooms.add(bedroom3);
        rooms.add(bedroom4);
        rooms.add(bedroom5);
        rooms.add(bedroom6);
        rooms.add(bedroom7);
        rooms.add(bedroom8);
        rooms.add(diningRoom);
        rooms.add(conferenceRoom);
    }

    public String getName(){
        return this.name;
    }

    public int countRooms(){
        return rooms.size();
    }
}
