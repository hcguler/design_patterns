package structural.decorator.example_3;

public abstract class D implements I {
  private I core;
  public D(I inner){
    this.core = inner;
  }

  @Override
  public void doIt() {
    core.doIt();
  }
}
