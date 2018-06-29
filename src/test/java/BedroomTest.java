import Rooms.Bedroom;
import Parent.Room;
import Guests.Guest;
import Rooms.BedroomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
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
        bedroom = new Bedroom("1", 45, BedroomType.FAMILY);
    }

    @Test
    public void hasName(){
        assertEquals("1", bedroom.getName());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(45, bedroom.getNightlyRate(), 0);
    }

    @Test
    public void hasType(){
        assertEquals(BedroomType.FAMILY, bedroom.getType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, bedroom.getValueFromEnum());
    }

    @Test
    public void initiallyNoGuests(){
        assertEquals(0, bedroom.getGuests());
    }



}