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
   String food = "sampler";
   Event testEvent = new Event(numberOfGuests, "sampler", "", "", "");
   assertEquals(150, testEvent.getPrice());
  }
  @Test
  public void newEvent_higherPriceWithDrinks() {
    int numberOfGuests = 10;
    String food = "sampler";
    String drink = "alcohal";
    Event testEvent = new Event(numberOfGuests, "sampler", "alcohal", "", "");
    assertEquals(300, testEvent.getPrice());
  }
  @Test
  public void newEvent_higherPriceWithEntertainment() {
    int numberOfGuests = 10;
    String food = "sampler";
    String drink = "alcohal";
    String entertainment = "dj";
    Event testEvent = new Event(numberOfGuests, "sampler", "alcohal", "dj", "");
    assertEquals(1300, testEvent.getPrice());
  }
  // @Test
  // public void newEvent_couponGivesDiscount() {
  //   int numberOfGuests = 10;
  //   String food = "sampler";
  //   String drink = "alcohal";
  //   String entertainment = "dj";
  //   String coupon = "coupon";
  //   Event testEvent = new Event(numberOfGuests, "sampler", "alcohal", "dj", "coupon");
  //   assertEquals(340, testEvent.getPrice());
  // }
}
