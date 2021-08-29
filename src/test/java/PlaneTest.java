import Enums.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane("The Margaret", PlaneType.BOEING747);
    }

    @Test
    public void hasName(){
        assertEquals( "The Margaret", plane.getName());
    }
    @Test
    public void hasPlaneType(){
        assertEquals( PlaneType.BOEING747, plane.getPlaneType());
    }
    @Test
    public void hasCapacity(){
        assertEquals(100, plane.getCapacityFromEnum());
    }

    @Test
    public void hasWeight(){
        assertEquals(350, plane.getWeightFromEnum());
    }

}
