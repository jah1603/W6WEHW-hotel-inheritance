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

    Hotel hotel;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;
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

        hotel = new Hotel("Magnolia Grange Bay Overview Lodge");
        guest1 = new Guest("James");
        guest2 = new Guest("Alexander");
        guest3 = new Guest("Carole");
        guest4 = new Guest("Reuben");
        guest5 = new Guest("Donald Trump");
        guest6 = new Guest("Vladimir");
        guest7 = new Guest("Angela Merkel");
        diningRoom = new DiningRoom("Expansive Skies Dining Area", 25);
        conferenceRoom = new ConferenceRoom("Commercial Consultation Zone A", 75, 12);
        bedroom1 = new Bedroom("1", 45, BedroomType.FAMILY);
        bedroom2 = new Bedroom("2", 60, BedroomType.APARTMENT);
        bedroom3 = new Bedroom("3", 30, BedroomType.SINGLE);
        bedroom4 = new Bedroom("4", 30, BedroomType.SINGLE);
        bedroom5 = new Bedroom("5", 30, BedroomType.SINGLE);
        bedroom6 = new Bedroom("6", 40, BedroomType.DOUBLE);
        bedroom7 = new Bedroom("7", 40, BedroomType.DOUBLE);
        bedroom8 = new Bedroom("8", 40, BedroomType.DOUBLE);
    }

    @Test
    public void hasName(){
        assertEquals("Magnolia Grange Bay Overview Lodge", hotel.getName());
    }

    @Test
    public void hasRooms(){
        assertEquals(10, hotel.countRooms());
    }

}