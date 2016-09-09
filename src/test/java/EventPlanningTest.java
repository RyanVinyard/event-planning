import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventPlanningTest {

  @Test
  public void runEventPlanning_displaySoloParty_ArrayList() {
    EventPlanning testEventPlanning = new EventPlanning();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(0);
    expectedOutput.add(0);
    expectedOutput.add(0);
    expectedOutput.add(0);
    assertEquals(expectedOutput, testEventPlanning.runEventPlanning(1, "none", "none", "self", 1));
  }

  //I commonly found myself going back and changing these tests after each step, which I don't think is right. How do I assure these tests still pass if I'm changing the number of inputs from one int, to an int and a string, etc?

  @Test
  public void runEventPlanning_displayHouseParty_ArrayList() {
    EventPlanning testEventPlanning = new EventPlanning();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(0);
    expectedOutput.add(0);
    expectedOutput.add(0);
    expectedOutput.add(0);
    assertEquals(expectedOutput, testEventPlanning.runEventPlanning(20, "none", "none", "self", 1));
  }

  @Test
  public void runEventPlanning_displayLargeParty_ArrayList() {
    EventPlanning testEventPlanning = new EventPlanning();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(80);
    expectedOutput.add(0);
    expectedOutput.add(0);
    expectedOutput.add(0);
    assertEquals(expectedOutput, testEventPlanning.runEventPlanning(50, "none", "none", "self", 1));
  }

  @Test
  public void runEventPlanning_displayHugeParty_ArrayList() {
    EventPlanning testEventPlanning = new EventPlanning();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1000);
    expectedOutput.add(0);
    expectedOutput.add(0);
    expectedOutput.add(0);
    assertEquals(expectedOutput, testEventPlanning.runEventPlanning(100, "none", "none", "self", 1));
  }

  @Test
  public void runEventPlanning_displayGiganticParty_ArrayList() {
    EventPlanning testEventPlanning = new EventPlanning();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(10000);
    expectedOutput.add(0);
    expectedOutput.add(0);
    expectedOutput.add(0);
    assertEquals(expectedOutput, testEventPlanning.runEventPlanning(500, "none", "none", "self", 1));
  }

  @Test
  public void runEventPlanning_displayDrinkCostMath_ArrayList() {
    EventPlanning testEventPlanning = new EventPlanning();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(80);
    expectedOutput.add(500);
    expectedOutput.add(0);
    expectedOutput.add(0);
    assertEquals(expectedOutput, testEventPlanning.runEventPlanning(50, "beer", "none", "self", 1));
  }

  @Test
  public void runEventPlanning_displayFoodCostMath_ArrayList() {
    EventPlanning testEventPlanning = new EventPlanning();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(80);
    expectedOutput.add(500);
    expectedOutput.add(130);
    expectedOutput.add(0);
    assertEquals(expectedOutput, testEventPlanning.runEventPlanning(50, "beer", "snacks", "self", 1));
  }

  @Test
  public void runEventPlanning_displayEntertainmentCostMath_ArrayList() {
    EventPlanning testEventPlanning = new EventPlanning();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(160);
    expectedOutput.add(500);
    expectedOutput.add(130);
    expectedOutput.add(160);
    assertEquals(expectedOutput, testEventPlanning.runEventPlanning(50, "beer", "snacks", "dj", 2));
  }
  // @Test
  // public void runEventPlanning_displayExtraNoFood_int() {
  //   EventPlanning testEventPlanning = new EventPlanning();
  //   int expected = 0;
  //   assertEquals(expected, testEventPlanning.runEventPlanning(1, "none"));
  // }
}
