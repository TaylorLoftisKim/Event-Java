import java.io.Console;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import static java.util.Arrays.asList;

public class Event {
  private int userTotalCost;
  private int userNumberOfGuests;
  private String userFood;
  private String userDrink;
  private String userEntertainment;

  public Event(int numberOfGuests, String food, String drink, String entertainment) {
    userNumberOfGuests = numberOfGuests;
    userFood = food;
    userDrink = drink;
    userEntertainment = entertainment;
  }

  public int getUserNumberOfGuests() {
    return userNumberOfGuests;
  }

  public String getFood() {
    return userFood;
  }

  public String getDrink() {
    return userDrink;
  }

  public String getEntertainment() {
    return userEntertainment;
  }

  public static int totalCost(int numberOfGuests, String food, String drink, String entertainment) {
    Map<String, Integer> userInput = new HashMap<String, Integer>();
    userInput.put("crackers", 5);
    userInput.put("fruit", 8);
    userInput.put("lobster", 15);
    userInput.put("water", 1);
    userInput.put("wine", 4);
    userInput.put("liquor", 5);
    userInput.put("comedian", 50);
    userInput.put("singer", 100);
    userInput.put("dj", 200);
    userInput.put("none", 0);

    int userTotalCost = (numberOfGuests * userInput.get(food)) + (numberOfGuests * userInput.get(drink)) + userInput.get(entertainment);

    return userTotalCost;
  }
}
