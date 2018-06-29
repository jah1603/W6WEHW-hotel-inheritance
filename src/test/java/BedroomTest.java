import Rooms.Bedroom;
import Parent.Room;
import Rooms.BedroomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom ("1", 45, BedroomType.FAMILY);
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


}