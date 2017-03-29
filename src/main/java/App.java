import java.io.Console;


public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("---------------------------------------------------------");
    System.out.println("Welcome to your Event/Party Outline! Let's get your party underway!");
    System.out.println("---------------------------------------------------------");
    System.out.println("How many people will be attending your Event? (Enter a number)");
    int userNumberOfGuests = Integer.parseInt(console.readLine());
    System.out.println("---------------------------------------------------------");
    System.out.println("What type of food will you be serving to your guests? Choose crackers, fruit, or lobster.");
    String userFood = console.readLine();
    System.out.println("---------------------------------------------------------");
    System.out.println("What type of drinks will you be serving to your guests? Choose water, wine, or liqour.");
    String userDrink = console.readLine();
    System.out.println("---------------------------------------------------------");
    System.out.println("What type of entertainment will you be providing for your guests? Choose comedian, singer, or dj.");
    String userEntertainment = console.readLine();

    Event userEvent = new Event(userNumberOfGuests, userFood, userDrink, userEntertainment);

    int totalCost = Event.totalCost(userEvent.getUserNumberOfGuests(), userEvent.getFood(), userEvent.getDrink(), userEvent.getEntertainment());
  }
}
