package structural.decorator.example_3;

public class Y extends D {
  public Y(I inner) {
    super(inner);
  }

  @Override
  public void doIt() {
    super.doIt();
    doY();
  }

  private void doY() {
    System.out.print("Y");
  }
}
