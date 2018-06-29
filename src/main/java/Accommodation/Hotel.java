package Accommodation;
import Guests.Guest;
import Rooms.Bedroom;
import Rooms.BedroomType;
import Rooms.ConferenceRoom;
import Rooms.DiningRoom;
import Parent.Room;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Hotel {

    private String name;
    public ArrayList<Room> bedrooms;
    private ArrayList<Room> diningRooms;
    private ArrayList<Room> conferenceRooms;

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    Bedroom bedroom5;
    Bedroom bedroom6;
    Bedroom bedroom7;
    Bedroom bedroom8;
    DiningRoom diningRoom1;
    ConferenceRoom conferenceRoom1;

    public Hotel(String name) {

        bedroom1 = new Bedroom("1", BedroomType.FAMILY.getValue(), 45, BedroomType.FAMILY);
        bedroom2 = new Bedroom("2", BedroomType.APARTMENT.getValue(), 60, BedroomType.APARTMENT);
        bedroom3 = new Bedroom("3", BedroomType.SINGLE.getValue(), 30, BedroomType.SINGLE);
        bedroom4 = new Bedroom("4", BedroomType.SINGLE.getValue(), 30, BedroomType.SINGLE);
        bedroom5 = new Bedroom("5", BedroomType.SINGLE.getValue(), 30, BedroomType.SINGLE);
        bedroom6 = new Bedroom("6", BedroomType.DOUBLE.getValue(), 40, BedroomType.DOUBLE);
        bedroom7 = new Bedroom("7", BedroomType.DOUBLE.getValue(), 40, BedroomType.DOUBLE);
        bedroom8 = new Bedroom("8", BedroomType.DOUBLE.getValue(), 40, BedroomType.DOUBLE);

        conferenceRoom1 = new ConferenceRoom("Commercial Consultation Zone A", 75, 12);

        diningRoom1 = new DiningRoom("Expansive Skies Dining Area", 25);

        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();

        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        bedrooms.add(bedroom4);
        bedrooms.add(bedroom5);
        bedrooms.add(bedroom6);
        bedrooms.add(bedroom7);
        bedrooms.add(bedroom8);
        diningRooms.add(diningRoom1);
        conferenceRooms.add(conferenceRoom1);
    }

    public String getName() {
        return this.name;
    }

    public int countRooms(ArrayList rooms) {
        return rooms.size();
    }

    public int getRoomIndex(Room room, ArrayList rooms) {
        return rooms.indexOf(room);
    }

    public Object canGetRoom(ArrayList rooms, int index) {
        return rooms.get(index);
    }


    public void checkInGuestToRoom(Room room, Guest guest) {
        if (room.capacity > room.guests.size()) {
            room.guests.add(guest);
        }
    }

    public void checkGuestOutOfRoom(Room room, Guest guest) {
        room.guests.remove(guest);
    }

    public ArrayList getGuestNames(Room room) {
        ArrayList names = new ArrayList<>();
        for (Guest guest : room.guests) {
            String name = guest.name;
            names.add(name);
        }
        return names;
    }


}



