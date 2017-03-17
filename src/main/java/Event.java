import java.util.ArrayList;
import java.util.List;

public class Event {
  private int mNumberOfGuests;
  private String mFood;
  private String mBeverages;
  private String mEntertainment;

  public Event(int numberOfGuests, String food, String beverages, String entertainment) {
    mNumberOfGuests = numberOfGuests;
    mFood = food;
    mBeverages = beverages;
    mEntertainment = entertainment;
  }

    public String getFood() {
      return mFood;
    }

  // public int getNumberOfGuests() {
  //   return mNumberOfGuests;
  // }

}
