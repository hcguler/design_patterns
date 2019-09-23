package structural.facade.example_1;

public class FacadeFactory {
  private static FacadeFactory instance = new FacadeFactory();

  private FacadeFactory() {

  }

  public static FacadeFactory instance() {
    return instance;
  }

  public KomponentFacade getFacade() {
    return new FacadeImpl();
  }
}
