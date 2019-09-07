package structural.decorator.example_4;

public class ScrollDecorator extends Decorator {
  public ScrollDecorator(Widget textFied) {
    super(textFied);
  }

  @Override
  public void draw() {
    super.draw();
    System.out.println("Draw Scroll");
  }
}
