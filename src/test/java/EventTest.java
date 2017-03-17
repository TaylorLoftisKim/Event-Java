import org.junit.*;
import static org.junit.Assert.*;
import java.lang.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event("pizza");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void newEvent_getsFood_true() {
    Event testEvent = new Event("pizza");
    assertEquals("pizza", testEvent.getFood());
  }
  // @Test
  // public void newEvent_getNumberOfGuests_1() {
  //   Event testEvent = new Event(1);
  //   assertEquals(1, testEvent.getNumberOfGuests());
  // }
}
