package behavioral.state.example_1;

public class StateDemo {
  public static void main(String[] args) {
    Engine engine = new Engine();
    engine.stop();
    engine.start();
    engine.start();
  }
}
