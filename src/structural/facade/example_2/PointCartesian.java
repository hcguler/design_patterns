package structural.facade.example_2;

public class PointCartesian {
  public double x, y;

  public PointCartesian(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void move(double x,double y) {
    this.x += x;
    this.y += y;
  }

  public String toString() {
    return "(" + x + "," + y + ")";
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
}
