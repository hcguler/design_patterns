package structural.facade.example_1;

public class FacadeDemo {
  public static void main(String[] args) {
    //Client sınıfı facade üzerinden hizmet alırken yapacağı işlem.
    //Client SecretClass bilgisine sahip değildir.
    FacadeFactory instance = FacadeFactory.instance();
    instance.getFacade().doSomething();
  }
}
