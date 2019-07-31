package behavioral.observer.example_1;

/**
 * Ana nesneyi izlemek için state bilgisine göre davranış sergilemesi gerekiyor.
 * Bu nedenle izlediği ana objeye sahip olmalı ve state bilgisi güncellendiğinde alacağı aksiyonu içeren metoda sahip olması gereklidir.
 */
public abstract class Observer {
  protected Subject subject;
  public abstract void update();
}
