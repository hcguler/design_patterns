package behavioral.observer.example_2;

import java.util.ArrayList;
import java.util.List;

/**
 * İzlenebilirlik özelliklerini içeren interface implemente edilirken kendini izleyenleri tetiklemek ve takip etmek için liste tutmaktadır.
 */
public class Hurriyet implements Gazete {
  private List<Abone> aboneListesi = new ArrayList<Abone>();

  @Override
  public void aboneEkle(Abone abone) {
    aboneListesi.add(abone);
  }

  @Override
  public void aboneSil(Abone abone) {
    aboneListesi.remove(abone);
  }

  @Override
  public void gazeteGonder() {
    for (int i = 0; i < aboneListesi.size(); i++) {
      aboneListesi.get(i).update();
    }
  }

  public List<Abone> getAboneListesi() {
    return aboneListesi;
  }

  public void setAboneListesi(List<Abone> aboneListesi) {
    this.aboneListesi = aboneListesi;
  }
}
