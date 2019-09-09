package behavioral.state.example_1;

public class EngineOffState implements State {
  @Override
  public void on(Engine engine) {
    //Kapalı durum için on çağırıldığında motor çalıştırılmalıdır.
    engine.setState(new EngineOnState());
    System.out.println("Motor çalıştırıldı.");
  }

  @Override
  public void off(Engine engine) {
    System.out.println("Motor zaten kapalıdır.");
  }
}
