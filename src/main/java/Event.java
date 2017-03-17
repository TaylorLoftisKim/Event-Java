import java.util.ArrayList;
import java.util.List;

public class Event {
  private int mCost;
  private int mNumberOfGuests;
  private String mFood;
  private String mDrink;
  private String mEntertainment;
  private int mCoupon;

  public Event(int cost, int numberOfGuests, String food, String drink, String entertainment, int coupon) {
    mCost = cost;
    mNumberOfGuests = numberOfGuests;
    mFood = food;
    mDrink = drink;
    mEntertainment = entertainment;
    mCoupon = coupon;
  }
}
