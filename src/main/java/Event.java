

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
    } else if (mFood.equals("sampler")) {
      foodPrice = 50;
    } else if (mFood.equals("lobster")) {
      foodPrice = 100;
    }
    return foodPrice;
  }

  public int getDrinkPrice() {
    int drinkPrice = 0;

    if  (mDrink.equals("none")) {
      drinkPrice = 0;
    } else if (mDrink.equals("soda")) {
      drinkPrice = 25;
    } else if (mDrink.equals("alcohal")) {
      drinkPrice = 150;
    }
    return drinkPrice;
  }

  public int getEntertainmentPrice() {
    int entertainmentPrice = 0;

    if (mEntertainment.equals("none")) {
      entertainmentPrice = 0;
    } else if (mEntertainment.equals("comedian")) {
      entertainmentPrice = 500;
    } else if (mEntertainment.equals("dj")) {
      entertainmentPrice = 1000;
    }
    return entertainmentPrice;
  }

  // public int getCouponDiscount() {
  //   int coupont = 0;
  //
  //   if (mCoupon.equals("none")) {
  //     coupon = 0;
  //   } else if (mCoupon.equals("half")) {
  //     coupon = (getprice() / 2);
  //   }
  //   return coupon;
  // }

  public int getPrice() {
    return mCost = ((mNumberOfGuests * 10) + getFoodPrice() + getDrinkPrice() + getEntertainmentPrice());
  }
}
