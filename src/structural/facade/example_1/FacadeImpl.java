package structural.facade.example_1;

public class FacadeImpl implements KomponentFacade {
  @Override
  public void doSomething() {
    new SecretClass().doSomething();
  }
}
