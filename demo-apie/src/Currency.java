public enum Currency {
  // Scenario for enum
  // 1. Finite numbers of values
  // 2. Not likely to have a new value
  HKD("Hong Kong Dollar", 1),
  CNY("Chinese Yuan Renminbi", 2),
  USD("US Dollar", 3),
  ;

  private final String desc;
  private final int value;

  // private constructor in enum
  private Currency(String desc, int value) {
    this.desc = desc;
    this.value = value;
  }

  public String getDesc() {
    return this.desc;
  }

  public int getValue() {
    return this.value;
  }

  public static String getDescription(Currency currency) {
    if (currency == Currency.HKD)
      return "Hong Kong Dolloar";
    else if (currency == Currency.CNY)
      return "Chinese Yuan Renminbi";
    else if (currency == Currency.USD)
      return "US Dollar";
    return "";
  }

  public static void main(String[] args) {

    System.out.println(Currency.getDescription(Currency.USD));

    System.out.println(Currency.CNY.getDesc());
    System.out.println(Currency.CNY.getValue());

    Currency hkd = Currency.HKD;
    System.out.println(hkd.getDesc());
    System.out.println(hkd.getValue());

    Currency usd = Currency.USD;
    System.out.println(usd.getDesc());
    System.out.println(usd.getValue());
  }
}
