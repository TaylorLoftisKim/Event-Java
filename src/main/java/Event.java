import java.util.ArrayList;
import java.util.List;

public class Event {
  private int mCost;
  private int mNumberOfGuests;
  private String mFood;
  private String mDrink;
  private String mEntertainment;
  private String mCoupon;

  public Event(int numberOfGuests, String food, String drink, String entertainment, String coupon) {
    mCost = 0;
    mNumberOfGuests = numberOfGuests;
    mFood = food;
    mDrink = drink;
    mEntertainment = entertainment;
    mCoupon = coupon;
  }
  public int getPrice() {
    return mCost = (mNumberOfGuests * 10);
  }
}
