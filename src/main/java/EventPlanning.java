// import java.util.ArrayList;
// import java.util.List;

public class EventPlanning {

  public String runEventPlanning(int howManyPeople){
    String result = "";
    if (howManyPeople == 1) {
      result = "You're looking at a solo party with the estimated cost of a cheap bottle of wine!";
    } else if (howManyPeople > 1 && howManyPeople < 30) {
      result = "You're looking at a standard house party, just like when you were in college! It won't cost anything to hold it in your own house.";
    } else if (howManyPeople >= 30 && howManyPeople < 80) {
      result = "You're looking at a large wedding-style party you can't hold in your house! Renting out a place is going to cost you in the ballpark of $80 per hour.";
    } else if (howManyPeople >= 80 && howManyPeople < 300) {
      result = "This looks like a big corporate party, which is going to require you to rent out a large indoor or outdoor area to hold everyone. I hope you're working off company funds, because this is probably going to cost $1000 at minimum.";
    } else if (howManyPeople >= 300) {
      result = "What you're trying to do here is have an event open to the public. You're going to have to rent out a city block for certain. You'll need to talk to the local government, and it's probably going to cost at least $10,000.";
    }
    return result;

  }
}
