import org.junit.*;
import static org.junit.Assert.*;

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
}
