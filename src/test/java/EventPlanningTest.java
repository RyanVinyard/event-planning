import org.junit.*;
import static org.junit.Assert.*;
// import java.util.ArrayList;
// import java.util.List;

public class EventPlanningTest {

  @Test
  public void runEventPlanning_displaySoloParty_String() {
    EventPlanning testEventPlanning = new EventPlanning();
    String expected = "You're looking at a solo party with the estimated cost of a cheap bottle of wine!";
    assertEquals(expected, testEventPlanning.runEventPlanning(1));
  }

}
