package structural.decorator.example_4;

public class TextField implements Widget {
  int height, width;

  public TextField(int height, int width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public void draw() {
    System.out.println("Create textfield " + this.height + ", " + this.width);
  }
}
