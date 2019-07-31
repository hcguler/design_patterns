package behavioral.observer.example_2;

public class ObserverDemo {
  public static void main(final String[] args) {
    final Gazete hurriyet = new Hurriyet();
    final Abone musteri1 = new Musteri("Hüseyin Cihad", "Güler");
    musteri1.aboneOl(hurriyet);
    final Abone musteri2 = new Musteri("Reyyan", "Güler");
    musteri2.aboneOl(hurriyet);
    hurriyet.gazeteGonder();
    musteri2.aboneligiIptalEt();
    hurriyet.gazeteGonder();
  }
}
