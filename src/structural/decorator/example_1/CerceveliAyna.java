package structural.decorator.example_1;

public class CerceveliAyna extends AynaDecorator {
  @Override
  public void produce() {
    getAyna().produce();
    addBorder();
  }

  public void addBorder() {
    System.out.println("Aynaya çerçeve eklendi.");
  }
}
