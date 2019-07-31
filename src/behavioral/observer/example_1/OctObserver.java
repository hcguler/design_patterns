package behavioral.observer.example_1;

/**
 * State bilgisinin octal karşılığını alır.
 */
public class OctObserver extends Observer {
  public OctObserver(Subject subject) {
    this.subject = subject;
    this.subject.add( this );
  }

  public void update() {
    System.out.print(" " + Integer.toOctalString(subject.getState()));
  }
}