package structural.decorator.example_2;

public abstract class Decorator implements LCD {

  private LCD window = new Window();

  public LCD getWindow() {
    return window;
  }

  public void setWindow(LCD window) {
    this.window = window;
  }
}
