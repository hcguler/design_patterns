package behavioral.observer.example_1;

/**
 * State bilgisinin binary karşılığını ele alır.
 */
public class BinObserver extends Observer {
  public BinObserver(Subject subject) {
    this.subject = subject;
    this.subject.add(this);
  }

  public void update() {
    System.out.print(" " + Integer.toBinaryString(subject.getState()));
  }
}