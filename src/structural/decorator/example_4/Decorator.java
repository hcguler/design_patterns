package structural.decorator.example_4;

public abstract class Decorator implements Widget{
  private Widget textFied;

  public Decorator(Widget textFied) {
    this.textFied = textFied;
  }

  @Override
  public void draw() {
    textFied.draw();
  }
}
