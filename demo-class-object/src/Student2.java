public class Student2 {
  private int score;
  private Candy2[] candies;
  private long id;

  public Student2(long id, int score) {
    this.id = id;
    this.score = score;
    this.candies = new Candy2[0];
  }

  public void receiveCandy(Candy2 candy) {
    // new Array
    Candy2[] candies = new Candy2[this.candies.length + 1];
    // for loop to copy
    for (int i = 0; i < this.candies.length; i++) {
      candies[i] = this.candies[i];
    }
    // place candy at the tail
    candies[candies.length - 1] = candy;
    // replace the reference
    this.candies = candies;
  }
  

  public long getId() {
    return this.id;
  }
  
  public int getScore() {
    return this.score;
  }

  public Candy2[] getCandies() {
    return this.candies;
  }

  public String getCandiesInfo() {
    String info = "";
    for (Candy2 candy : this.candies) {
      info += "[" + candy.getColor() + ",";
    }
    return info.substring((0, info.length()) + "]");
  }

  public int getCandyCount() {
    return this.candies.length;
  }


}
