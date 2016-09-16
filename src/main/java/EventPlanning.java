import java.util.ArrayList;
import java.util.List;


public class EventPlanning {
  private Integer mPeople;
  private String mFood;
  private String mDrinks;
  private String mEntertainment;
  private Integer mLength;

  public EventPlanning(Integer people, String food, String drinks, String entertainment, Integer length) {
    mPeople = people;
    mFood = food;
    mDrinks = drinks;
    mEntertainment = entertainment;
    mLength = length;
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

  public int totalCost(){
    Integer result = 0;


    if (mPeople.equals(1)) {
      result += 0;
    } else if (mPeople > 1 && mPeople < 30) {
      result += 0;
    } else if (mPeople >= 30 && mPeople < 80) {
      result += (80*mLength);
    } else if (mPeople >= 80 && mPeople < 300) {
      result += (1000);
    } else if (mPeople >= 300) {
      result += (10000);
    }

    if (mFood.equals("none")) {
      result += 0;
    } else if (mFood.equals("snacks")) {
      result += (30+(2*mPeople));
    } else if (mFood.equals("appetizers")) {
      result += (50+(5*mPeople));
    } else if (mFood.equals("dinner")) {
      result += (100+(10*mPeople));
    } else if (mFood.equals("buffet")) {
      result += (250+(15*mPeople));
    }

    if (mDrinks.equals("none")) {
      result += 0;
    } else if (mDrinks.equals("beer")) {
      result += (10*mPeople);
    } else if (mDrinks.equals("paid bar")) {
      result += (100*mLength);
    } else if (mDrinks.equals("open bar")) {
      result += ((100)+(25*mPeople));
    }

    return result;



  }

}

// public class EventPlanning {
//
//   public List<Object> runEventPlanning(Integer howManyPeople, String howMuchDrink, String howMuchFood, String howMuchEntertainment, int howLong){
//     List<Object> result = new ArrayList<Object>();
//     if (howManyPeople.equals(1)) {
//       result.add(0);

//

//

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
