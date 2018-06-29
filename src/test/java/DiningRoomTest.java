import Rooms.DiningRoom;
import Parent.Room;
import Guests.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    @Before
    public void before() {
        guest1 = new Guest("James");
        guest2 = new Guest("Alexander");
        guest3 = new Guest("Carole");
        guest4 = new Guest("Reuben");
        diningRoom = new DiningRoom("Expansive Skies Dining Area", 25);
    }

    @Test
    public void hasName() {
        assertEquals("Expansive Skies Dining Area", diningRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(25, diningRoom.getCapacity());
    }

    @Test
    public void countGuests(){
        diningRoom.guests.add(guest1);
        assertEquals(1, diningRoom.getGuests());
    }

}