import java.util.ArrayList;
import java.util.List;





public class EventPlanning {

  public List<Object> runEventPlanning(int howManyPeople, String howMuchDrink, String howMuchFood, String howMuchEntertainment, int howLong){
    List<Object> result = new ArrayList<Object>();
    if (howManyPeople == 1) {
      result.add(0);
    } else if (howManyPeople > 1 && howManyPeople < 30) {
      result.add(0);
    } else if (howManyPeople >= 30 && howManyPeople < 80) {
      result.add((80*howLong));
    } else if (howManyPeople >= 80 && howManyPeople < 300) {
      result.add(1000);
    } else if (howManyPeople >= 300) {
      result.add(10000);
    }

    if (howMuchDrink == "none") {
      result.add(0);
    } else if (howMuchDrink == "beer") {
      result.add((10*howManyPeople));
    } else if (howMuchDrink == "paid bar") {
      result.add((100*howLong));
    } else if (howMuchDrink == "open bar") {
      result.add(((100)+(25*howManyPeople)));
    }

    if (howMuchFood == "none") {
      result.add(0);
    } else if (howMuchFood == "snacks") {
      result.add((30+(2*howManyPeople)));
    } else if (howMuchFood == "appetizers") {
      result.add((50+(5*howManyPeople)));
    } else if (howMuchFood == "dinner") {
      result.add((100+(10*howManyPeople)));
    } else if (howMuchFood == "buffet") {
      result.add((250+(15*howManyPeople)));
    }

    if (howMuchEntertainment == "self") {
      result.add(0);
    } else if (howMuchEntertainment == "dj") {
      result.add((80*howLong));
    } else if (howMuchEntertainment == "local music") {
      result.add((100*howLong));
    } else if (howMuchEntertainment == "big name band") {
      result.add((5000+(10*howLong)));
    }
    return result;

  }
}
