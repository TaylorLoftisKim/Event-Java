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

  public int getFoodPrice() {
    int foodPrice = 0;

    if (mFood.equals("none")) {
      foodPrice = 0;
    } else if (mFood.equals("pizza")) {
      foodPrice = 50;
    }
    return foodPrice;
  }

  public int getDrinkPrice() {
    int drinkPrice = 0;

    if  (mDrink.equals("none")) {
      drinkPrice = 0;
    } else if (mDrink.equals("soda")) {
      drinkPrice = 25;
    }
    return drinkPrice;
  }

  public int getEntertainmentPrice() {
    int entertainmentPrice = 0;

    if (mEntertainment.equals("none")) {
      entertainmentPrice = 0;
    } else if (mEntertainment.equals("dj")) {
      entertainmentPrice = 500;
    }
    return entertainmentPrice;
  }

  public int getPrice() {
    return mCost = ((mNumberOfGuests * 10) + getFoodPrice() + getDrinkPrice() + getEntertainmentPrice());
  }
}
