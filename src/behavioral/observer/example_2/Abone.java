package behavioral.observer.example_2;

/**
 * Bir observe edecek nesnenin yapması gereken işlevleri belirliyoruz.
 * Gazete dağıtımında aksiyon alınması için update metodu
 * Bir gazeteye dahil olması ve iptal etmesi
 */
public interface Abone {
  void update();
  void aboneligiIptalEt();
  void aboneOl(Gazete gazete);
}
