package behavioral.state.example_1;

public interface State {
  public void on(Engine engine);
  public void off(Engine engine);
}
