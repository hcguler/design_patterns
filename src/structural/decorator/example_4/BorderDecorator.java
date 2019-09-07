package structural.decorator.example_4;

public class BorderDecorator extends Decorator {
  public BorderDecorator(Widget textFied) {
    super(textFied);
  }

  @Override
  public void draw() {
    super.draw();
    System.out.println("Draw border");
  }
}
