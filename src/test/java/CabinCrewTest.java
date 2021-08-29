import Crew.CabinCrew;
import Enums.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew =new CabinCrew("Joan", RankType.FLIGHTATTENDANT);
    }
    @Test
    public void hasName(){
        assertEquals("Joan", cabinCrew.getName());
    }
    @Test
    public void hasRank(){
        assertEquals(RankType.FLIGHTATTENDANT, cabinCrew.getRankType());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("The Captain says Yuo should all Jump" , cabinCrew.RelayCaptainMessage("Jump"));
    }
}
