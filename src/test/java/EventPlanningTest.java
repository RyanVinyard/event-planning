import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventPlanningTest {

  @Test
  public void eventPlanning_instantiatesCorrectly_True() {
    EventPlanning testEventPlanning = new EventPlanning(30, " ", " ", " ", 1);
    assertEquals(true, testEventPlanning instanceof EventPlanning);
  }

  @Test
  public void getPeople_returnNumberOfPeople_int() {
    EventPlanning testEventPlanning = new EventPlanning(30, "snacks", "beer", "dj", 1);
    assertEquals((Integer)30, testEventPlanning.getPeople());
  }

  @Test
  public void getPeople_returnFood_String() {
    EventPlanning testEventPlanning = new EventPlanning(30, "snacks", "beer", "dj", 1);
    assertEquals("snacks", testEventPlanning.getFood());
  }

  @Test
  public void getPeople_returnDrinks_String() {
    EventPlanning testEventPlanning = new EventPlanning(30, "snacks", "beer", "dj", 1);
    assertEquals("beer", testEventPlanning.getDrinks());
  }

  @Test
  public void getPeople_returnNumberEntertainment_String() {
    EventPlanning testEventPlanning = new EventPlanning(30, "snacks", "beer", "dj", 1);
    assertEquals("dj", testEventPlanning.getEntertainment());
  }

  @Test
  public void totalPrice_returnCorrectMathOnPeople_int() {
    EventPlanning testEventPlanning = new EventPlanning(50, "none", "none", "self", 2);
    assertEquals(160, testEventPlanning.totalCost());
  }

  @Test
  public void totalPrice_returnCorrectMathOnFood_int() {
    EventPlanning testEventPlanning = new EventPlanning(50, "snacks", "none", "self", 2);
    assertEquals(290, testEventPlanning.totalCost());
  }

  @Test
  public void totalPrice_returnCorrectMathOnDrinks_int() {
    EventPlanning testEventPlanning = new EventPlanning(50, "snacks", "beer", "self", 2);
    assertEquals(790, testEventPlanning.totalCost());
  }

  @Test
  public void totalPrice_returnCorrectmathOnEntertainment_int() {
    EventPlanning testEventPlanning = new EventPlanning(50, "snacks", "beer", "dj", 2);
    assertEquals(950, testEventPlanning.totalCost());
  }

  // @Test
  // public void runEventPlanning_displaySoloParty_ArrayList() {
  //   EventPlanning testEventPlanning = new EventPlanning();
  //   List<Object> expectedOutput = new ArrayList<Object>();
  //   expectedOutput.add(0);
  //   expectedOutput.add(0);
  //   expectedOutput.add(0);
  //   expectedOutput.add(0);
  //   assertEquals(expectedOutput, testEventPlanning.runEventPlanning(1, "none", "none", "self", 1));
  // }

  //I commonly found myself going back and changing these tests after each step, which I don't think is right. How do I assure these tests still pass if I'm changing the number of inputs from one int, to an int and a string, etc?

  // @Test
  // public void runEventPlanning_displayHouseParty_ArrayList() {
  //   EventPlanning testEventPlanning = new EventPlanning();
  //   List<Object> expectedOutput = new ArrayList<Object>();
  //   expectedOutput.add(0);
  //   expectedOutput.add(0);
  //   expectedOutput.add(0);
  //   expectedOutput.add(0);
  //   assertEquals(expectedOutput, testEventPlanning.runEventPlanning(20, "none", "none", "self", 1));
  // }
  //
  // @Test
  // public void runEventPlanning_displayLargeParty_ArrayList() {
  //   EventPlanning testEventPlanning = new EventPlanning();
  //   List<Object> expectedOutput = new ArrayList<Object>();
  //   expectedOutput.add(80);
  //   expectedOutput.add(0);
  //   expectedOutput.add(0);
  //   expectedOutput.add(0);
  //   assertEquals(expectedOutput, testEventPlanning.runEventPlanning(50, "none", "none", "self", 1));
  // }
  //
  // @Test
  // public void runEventPlanning_displayHugeParty_ArrayList() {
  //   EventPlanning testEventPlanning = new EventPlanning();
  //   List<Object> expectedOutput = new ArrayList<Object>();
  //   expectedOutput.add(1000);
  //   expectedOutput.add(0);
  //   expectedOutput.add(0);
  //   expectedOutput.add(0);
  //   assertEquals(expectedOutput, testEventPlanning.runEventPlanning(100, "none", "none", "self", 1));
  // }
  //
  // @Test
  // public void runEventPlanning_displayGiganticParty_ArrayList() {
  //   EventPlanning testEventPlanning = new EventPlanning();
  //   List<Object> expectedOutput = new ArrayList<Object>();
  //   expectedOutput.add(10000);
  //   expectedOutput.add(0);
  //   expectedOutput.add(0);
  //   expectedOutput.add(0);
  //   assertEquals(expectedOutput, testEventPlanning.runEventPlanning(500, "none", "none", "self", 1));
  // }
  //
  // @Test
  // public void runEventPlanning_displayDrinkCostMath_ArrayList() {
  //   EventPlanning testEventPlanning = new EventPlanning();
  //   List<Object> expectedOutput = new ArrayList<Object>();
  //   expectedOutput.add(80);
  //   expectedOutput.add(500);
  //   expectedOutput.add(0);
  //   expectedOutput.add(0);
  //   assertEquals(expectedOutput, testEventPlanning.runEventPlanning(50, "beer", "none", "self", 1));
  // }
  //
  // @Test
  // public void runEventPlanning_displayFoodCostMath_ArrayList() {
  //   EventPlanning testEventPlanning = new EventPlanning();
  //   List<Object> expectedOutput = new ArrayList<Object>();
  //   expectedOutput.add(80);
  //   expectedOutput.add(500);
  //   expectedOutput.add(130);
  //   expectedOutput.add(0);
  //   assertEquals(expectedOutput, testEventPlanning.runEventPlanning(50, "beer", "snacks", "self", 1));
  // }
  //
  // @Test
  // public void runEventPlanning_displayEntertainmentCostMath_ArrayList() {
  //   EventPlanning testEventPlanning = new EventPlanning();
  //   List<Object> expectedOutput = new ArrayList<Object>();
  //   expectedOutput.add(160);
  //   expectedOutput.add(500);
  //   expectedOutput.add(130);
  //   expectedOutput.add(160);
  //   assertEquals(expectedOutput, testEventPlanning.runEventPlanning(50, "beer", "snacks", "dj", 2));
  // }
  // @Test
  // public void runEventPlanning_displayExtraNoFood_int() {
  //   EventPlanning testEventPlanning = new EventPlanning();
  //   int expected = 0;
  //   assertEquals(expected, testEventPlanning.runEventPlanning(1, "none"));
  // }
}
