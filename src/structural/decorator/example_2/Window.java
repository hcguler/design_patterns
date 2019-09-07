package structural.decorator.example_2;

public class Window implements LCD {
  @Override
  public void draw() {
    System.out.println("Create window");
  }
}
