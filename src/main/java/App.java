import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Welcome to your Event/Party Outline! Let's get your party underway!");

    System.out.println("How many people will be attending your Event?");
    String stringNumberOfGuests = myConsole.readLine();

  }
}
