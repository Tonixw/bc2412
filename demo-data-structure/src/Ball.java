import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Ball implements Comparable<Ball> {
  public static final String Color = null;
  private Color color;
  private int value;

  public Ball(Color color, int value) {
    this.color = color;
    this.value = value;
  }

  public Color getColor() {
    return this.color;
  }

  public int getValue() {
    return this.value;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public int compareTo(Ball ball) {
    // Compare two balls
    // this.ball (-1), ball (1)
    // Our Task, lower value, return first
    // order by color: RED, BLUE, YELLOW. For same color, decending order of value.
    if ( this.color == ball.getColor()) {
      if ( this.value > ball.getValue())
      return -1;
      else
      return 1;
    }
    /*if (this.color == Color.RED)
    return -1;
    if (ball.getColor() == Color.RED)
    return 1;
    if (this.color == Color.BLUE)
    return -1;
    return 1;
  }*/
  }
  public static enum Color {
    RED, YELLOW, BLUE,;
  }

  @Override
  public String toString() {
    return "Ball [" //
        + " color = " + this.color //
        + " value = " + this.value //
        + "]";
  }

  public static void main(String[] args) {

    // Ball List
    // RED 1
    // YELLOW 9
    // BLUE 7
    // YELLOW 3
    // RED 8
    ArrayList<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Ball.Color.RED, 1));
    balls.add(new Ball(Ball.Color.YELLOW, 9));
    balls.add(new Ball(Ball.Color.BLUE, 7));
    balls.add(new Ball(Ball.Color.YELLOW, 3));
    balls.add(new Ball(Ball.Color.RED, 8));
    // System.out.println(balls);

    // Sort by values
    // Approach 1: Comparable<ball> (Disadvantage: One Rule for Sort)
    Collections.sort(balls);// Ball Class comply with the contract of Collections.sort()
    System.out.println(balls);

    // Approach 2: 
    Comparator<Ball> sortFormula;
    if () {
      sortFormula = new SortByColor();
    } else {
      sortFormula = 
    }
    Collections.sort(balls, new SortByColor());
  }
  

}