import java.util.ArrayList;
import java.util.List;


public class EventPlanning {
  private Integer mPeople;
  private String mFood;
  private String mDrinks;
  private String mEntertainment;

  public EventPlanning(Integer people, String food, String drinks, String entertainment) {
    mPeople = people;
    mFood = food;
    mDrinks = drinks;
    mEntertainment = entertainment;
  }

  public Integer getPeople() {
    return mPeople;
  }

  public String getFood() {
    return mFood;
  }

  public String getDrinks() {
    return mDrinks;
  }

  public String getEntertainment() {
    return mEntertainment;
  }


}

// public class EventPlanning {
//
//   public List<Object> runEventPlanning(Integer howManyPeople, String howMuchDrink, String howMuchFood, String howMuchEntertainment, int howLong){
//     List<Object> result = new ArrayList<Object>();
//     if (howManyPeople.equals(1)) {
//       result.add(0);
//     } else if (howManyPeople > 1 && howManyPeople < 30) {
//       result.add(0);
//     } else if (howManyPeople >= 30 && howManyPeople < 80) {
//       result.add((80*howLong));
//     } else if (howManyPeople >= 80 && howManyPeople < 300) {
//       result.add(1000);
//     } else if (howManyPeople >= 300) {
//       result.add(10000);
//     }
//
//     if (howMuchDrink.equals("none")) {
//       result.add(0);
//     } else if (howMuchDrink.equals("beer")) {
//       result.add((10*howManyPeople));
//     } else if (howMuchDrink.equals("paid bar")) {
//       result.add((100*howLong));
//     } else if (howMuchDrink.equals("open bar")) {
//       result.add(((100)+(25*howManyPeople)));
//     }
//
//     if (howMuchFood.equals("none")) {
//       result.add(0);
//     } else if (howMuchFood.equals("snacks")) {
//       result.add((30+(2*howManyPeople)));
//     } else if (howMuchFood.equals("appetizers")) {
//       result.add((50+(5*howManyPeople)));
//     } else if (howMuchFood.equals("dinner")) {
//       result.add((100+(10*howManyPeople)));
//     } else if (howMuchFood.equals("buffet")) {
//       result.add((250+(15*howManyPeople)));
//     }
//
//     if (howMuchEntertainment.equals("self")) {
//       result.add(0);
//     } else if (howMuchEntertainment.equals("dj")) {
//       result.add((80*howLong));
//     } else if (howMuchEntertainment.equals("local music")) {
//       result.add((100*howLong));
//     } else if (howMuchEntertainment.equals("big name band")) {
//       result.add((5000+(10*howLong)));
//     }
//     return result;
//
//   }
// }
