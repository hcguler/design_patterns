package structural.facade.example_1;

public class SecretClass implements KomponentFacade{
  @Override
  public void doSomething() {
    System.out.println("Bir Sınıf çalıştırıldı.");
  }
}
