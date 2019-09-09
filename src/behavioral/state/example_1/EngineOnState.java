package behavioral.state.example_1;

public class EngineOnState implements State {
  @Override
  public void on(Engine engine) {
    System.out.println("Motor zaten çalışıyor.");
  }

  @Override
  public void off(Engine engine) {
    engine.setState(new EngineOffState());
    System.out.println("Motor kapatıldı.");
  }
}
