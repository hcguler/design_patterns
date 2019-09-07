package structural.decorator.example_3;

public class Z extends D{
  public Z(I inner) {
    super(inner);
  }

  @Override
  public void doIt() {
    super.doIt();
    doZ();
  }

  private void doZ() {
    System.out.print("Z");
  }
}
