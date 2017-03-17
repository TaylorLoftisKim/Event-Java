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
}
