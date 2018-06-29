import Accommodation.Hotel;
import Rooms.BedroomType;
import Rooms.DiningRoom;
import Rooms.ConferenceRoom;
import Rooms.Bedroom;
import Parent.Room;
import Guests.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private ArrayList<Room> bedrooms;

    Hotel hotel;
    DiningRoom diningRoom1;
    ConferenceRoom conferenceRoom1;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    Bedroom bedroom5;
    Bedroom bedroom6;
    Bedroom bedroom7;
    Bedroom bedroom8;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    Guest guest5;
    Guest guest6;
    Guest guest7;

    @Before
    public void before() {

        bedrooms = new ArrayList<>();

        hotel = new Hotel("Magnolia Grange Bay Overview Lodge");
        guest1 = new Guest("James");
        guest2 = new Guest("Alexander");
        guest3 = new Guest("Carole");
        guest4 = new Guest("Reuben");
        guest5 = new Guest("Donald Trump");
        guest6 = new Guest("Vladimir");
        guest7 = new Guest("Angela Merkel");
        diningRoom1 = new DiningRoom("Expansive Skies Dining Area", 25);
        conferenceRoom1 = new ConferenceRoom("Commercial Consultation Zone A", 75, 12);
        bedroom1 = new Bedroom("1", BedroomType.FAMILY.getValue(), 45, BedroomType.FAMILY);
        bedroom2 = new Bedroom("2", BedroomType.APARTMENT.getValue(), 60, BedroomType.APARTMENT);
        bedroom3 = new Bedroom("3", BedroomType.SINGLE.getValue(),30, BedroomType.SINGLE);
        bedroom4 = new Bedroom("4", BedroomType.SINGLE.getValue(),30, BedroomType.SINGLE);
        bedroom5 = new Bedroom("5", BedroomType.SINGLE.getValue(), 30, BedroomType.SINGLE);
        bedroom6 = new Bedroom("6", BedroomType.DOUBLE.getValue(), 40, BedroomType.DOUBLE);
        bedroom7 = new Bedroom("7", BedroomType.DOUBLE.getValue(), 40, BedroomType.DOUBLE);
        bedroom8 = new Bedroom("8", BedroomType.DOUBLE.getValue(), 40, BedroomType.DOUBLE);

        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        bedrooms.add(bedroom4);
        bedrooms.add(bedroom5);
        bedrooms.add(bedroom6);
        bedrooms.add(bedroom7);
        bedrooms.add(bedroom8);
    }

    @Test
    public void hasName(){
        assertEquals("Magnolia Grange Bay Overview Lodge", hotel.getName());
    }

    @Test
    public void hasBedrooms(){
        assertEquals(8, hotel.countRooms(bedrooms));
    }


    @Test
    public void findIndex(){
        assertEquals(1, hotel.getRoomIndex(bedroom2, bedrooms));
    }

    @Test
    public void canFindItem(){
        assertEquals(bedroom1, hotel.canGetRoom(bedrooms, 0));
    }

    @Test
    public void canCheckIn(){
        hotel.checkInGuestToRoom(bedroom1, guest1);
        assertEquals(1, bedroom1.getGuests());
    }

    @Test
    public void canCheckOut(){
        hotel.checkInGuestToRoom(diningRoom1, guest1);
        hotel.checkGuestOutOfRoom(diningRoom1, guest1);
        assertEquals(0, diningRoom1.getGuests());
    }

    @Test
    public void canListGuests(){
        hotel.checkInGuestToRoom(diningRoom1, guest1);
        hotel.checkInGuestToRoom(conferenceRoom1, guest4);
        hotel.checkInGuestToRoom(bedroom6, guest3);
        System.out.println(hotel.getGuestNames(bedroom6));
    }

}