package behavioral.observer.example_2;

/**
 * Takip edeceği nesne bilgisine eklenme ve silinme işlevlerini içeren interface implemente edilir.
 * Kendine ait özel bilgisini içerir.
 */
public class Musteri implements Abone {
  private Gazete gazete;
  private String isim;
  private String soyad;

  public Musteri(String isim, String soyad) {
    this.isim = isim;
    this.soyad = soyad;
  }

  @Override
  public void update() {
    System.out
        .println(getIsim() + " "
            + getSoyad() + " " + "gazeteyi aldi");
  }

  @Override
  public void aboneligiIptalEt() {
    gazete.aboneSil(this);
    System.out.println(getIsim() + " " + getSoyad() + " "
        + "aboneligini sonlandirdi");
  }

  @Override
  public void aboneOl(Gazete gazete) {
    setGazete(gazete);
    gazete.aboneEkle(this);
    System.out.println(getIsim() + " "
        + getSoyad() + " " + "abone oldu");
  }

  public Gazete getGazete() {
    return gazete;
  }

  public void setGazete(Gazete gazete) {
    this.gazete = gazete;
  }

  public String getIsim() {
    return isim;
  }

  public void setIsim(String isim) {
    this.isim = isim;
  }

  public String getSoyad() {
    return soyad;
  }

  public void setSoyad(String soyad) {
    this.soyad = soyad;
  }
}
