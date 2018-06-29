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

    Bedroom bedroom1;
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
        bedroom1 = new Bedroom("1", BedroomType.FAMILY.getValue() , 45, BedroomType.FAMILY);
    }

    @Test
    public void hasName(){
        assertEquals("1", bedroom1.getName());
    }

    @Test
    public void hasACapacity() { assertEquals(4, bedroom1.getCapacity());}

    @Test
    public void hasNightlyRate(){
        assertEquals(45, bedroom1.getNightlyRate(), 0);
    }

    @Test
    public void hasType(){
        assertEquals(BedroomType.FAMILY, bedroom1.getType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, bedroom1.getValueFromEnum());
    }

    @Test
    public void initiallyNoGuests(){
        assertEquals(0, bedroom1.getGuests());
    }



}