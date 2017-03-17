import org.junit.*;
import static org.junit.Assert.*;
import java.lang.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(0, "", "", "", "");
    assertEquals(true, testEvent instanceof Event);
  }
  @Test
  public void newEvent_initialPrice() {
    Event testEvent = new Event(0, "", "", "", "");
    assertEquals(0, testEvent.getPrice());
  }
  @Test
  public void newEvent_higherPriceWithMoreGuests() {
    int numberOfGuests = 10;
    Event testEvent = new Event(numberOfGuests, "", "", "", "");
    assertEquals(100, testEvent.getPrice());
  }
  @Test
  public void newEvent_higherPriceWithFood() {
   int numberOfGuests = 10;
   String food = "pizza";
   Event testEvent = new Event(numberOfGuests, "pizza", "", "", "");
   assertEquals(150, testEvent.getPrice());
  }
  @Test
  public void newEvent_higherPriceWithDrinks() {
    int numberOfGuests = 10;
    String food = "pizza";
    String drink = "soda";
    Event testEvent = new Event(numberOfGuests, "pizza", "soda", "", "");
    assertEquals(175, testEvent.getPrice());
  }
}
