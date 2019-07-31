package behavioral.observer.example_2;

/**
 * Observe edilecek nesnenin yapabileceklerini tanımlıyoruz.
 * Kendisini observe edeceklerin listesine ekleme ve silme işlemi.
 * Güncel gazete dağıtımı için gönderme işlemi.
 */
public interface Gazete {
  void aboneEkle(Abone abone);
  void aboneSil(Abone abone);
  void gazeteGonder();
}
