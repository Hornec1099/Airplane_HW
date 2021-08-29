import Crew.Pilot;
import Enums.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Sully", RankType.CAPTAIN, "123ABC");
    }

    @Test
    public void hasLicence(){
        assertEquals("123ABC", pilot.getLicence());
    }

    @Test
    public void canFly(){
        assertEquals("Im a bird mom!", pilot.flyPlane());
    }
}
