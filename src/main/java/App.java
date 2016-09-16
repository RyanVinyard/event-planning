import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Hello there! Glad to see you're planning a fancy event!");
    System.out.println("First, I'll need to get some info from you to estimate a cost.");
    System.out.println("How many people do you expect to attend?");
    int howManyPeople = Integer.parseInt(myConsole.readLine());
    System.out.println("What kind of food are you going to provide? 'none', 'snacks', 'appetizers', 'dinner', or 'buffet'?");
    String howMuchFood = myConsole.readLine();
    System.out.println("What sort of drinks are you planning to provide? 'none', 'beer', 'paid bar', or 'open bar'?");
    String howMuchDrink = myConsole.readLine();
    System.out.println("What kind of entertainment are you going to provide? 'self', 'dj', 'local music', or 'big band'?");
    String howMuchEntertainment = myConsole.readLine();
    System.out.println("Finally, how long do you expect this to go on for (in hours)?");
    int howLong = Integer.parseInt(myConsole.readLine());
    EventPlanning Event = new EventPlanning(howManyPeople, howMuchFood, howMuchDrink, howMuchEntertainment, howLong);

    System.out.println("It looks like this fancy party is going to cost you in the ballpark of $" + Event.totalCost() + "!");
  }
}
