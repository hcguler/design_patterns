package structural.decorator.example_4;

public class DecoratorDemo {
  public static void main(String[] args) {
    Widget textField = new ScrollDecorator(new BorderDecorator(new TextField(40,120)));
    textField.draw();
  }
}
