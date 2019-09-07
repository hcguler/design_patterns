package structural.decorator.example_2;

public class Border extends Decorator {
  @Override
  public void draw() {
    getWindow().draw();
    drawBorder();
  }

  private void drawBorder() {
    System.out.println("Add border");
  }
}
