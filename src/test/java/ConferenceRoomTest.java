import Rooms.ConferenceRoom;
import Parent.Room;
import Guests.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
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
        conferenceRoom = new ConferenceRoom("Commercial Consultation Zone A", 75, 12);
    }

    @Test
    public void hasName() {
        assertEquals("Expansive Skies Dining Area", conferenceRoom.getName());
    }

    @Test
    public void hasDailyRate(){
        assertEquals(75, conferenceRoom.getDailyRate(), 0);
    }

    @Test
    public void hasCapacity() {
        assertEquals(12, conferenceRoom.getCapacity());
    }

}