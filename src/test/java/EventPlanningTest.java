import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventPlanningTest {

  @Test
  public void runEventPlanning_displaySoloParty_ArrayList() {
    EventPlanning testEventPlanning = new EventPlanning();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add("You're looking at a solo party with the estimated cost of a cheap bottle of wine!");
    assertEquals(expectedOutput, testEventPlanning.runEventPlanning(1));
  }

  @Test
  public void runEventPlanning_displayHouseParty_ArrayList() {
    EventPlanning testEventPlanning = new EventPlanning();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add("You're looking at a standard house party, just like when you were in college! It won't cost anything to hold it in your own house.");
    assertEquals(expectedOutput, testEventPlanning.runEventPlanning(20));
  }

  @Test
  public void runEventPlanning_displayLargeParty_ArrayList() {
    EventPlanning testEventPlanning = new EventPlanning();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add("You're looking at a large wedding-style party you can't hold in your house! Renting out a place is going to cost you in the ballpark of $80 per hour.");
    assertEquals(expectedOutput, testEventPlanning.runEventPlanning(50));
  }

  @Test
  public void runEventPlanning_displayHugeParty_ArrayList() {
    EventPlanning testEventPlanning = new EventPlanning();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add("This looks like a big corporate party, which is going to require you to rent out a large indoor or outdoor area to hold everyone. I hope you're working off company funds, because this is probably going to cost $1000 at minimum.");
    assertEquals(expectedOutput, testEventPlanning.runEventPlanning(100));
  }

  @Test
  public void runEventPlanning_displayGiganticParty_ArrayList() {
    EventPlanning testEventPlanning = new EventPlanning();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add("What you're trying to do here is have an event open to the public. You're going to have to rent out a city block for certain. You'll need to talk to the local government, and it's probably going to cost at least $10,000.");
    assertEquals(expectedOutput, testEventPlanning.runEventPlanning(500));
  }
  // @Test
  // public void runEventPlanning_displayExtraNoFood_int() {
  //   EventPlanning testEventPlanning = new EventPlanning();
  //   int expected = 0;
  //   assertEquals(expected, testEventPlanning.runEventPlanning(1, "none"));
  // }
}
