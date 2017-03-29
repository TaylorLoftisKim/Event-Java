import org.junit.*;
import java.lang.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(0, "", "", "");
    assertEquals(true, testEvent instanceof Event);
  }
  @Test
  public void newEvent_getUserNumberOfGuests_Int() {
    Event testEvent = new Event(5, "crackers", "water", "dj");
    assertEquals(5, testEvent.getUserNumberOfGuests());
  }

  @Test
  public void newEvent_getsFood_String() {
    Event testEvent = new Event(5, "crackers", "water", "dj");
    assertEquals("crackers", testEvent.getFood());
  }

  @Test
  public void newEvent_getsDrink_String() {
    Event testEvent = new Event(5, "crackers", "water", "dj");
    assertEquals("water", testEvent.getDrink());
  }

  @Test
  public void newEvent_getEntertainment_String() {
    Event testEvent = new Event(5, "crackers", "water", "dj");
    assertEquals("dj", testEvent.getEntertainment());
  }

  @Test
  public void newEvent_calculateTotalCost_Int() {
    Event testEvent = new Event(5, "crackers", "water", "dj");
    assertEquals(230, testEvent.totalCost(5, "crackers", "water", "dj"));
  }
}
