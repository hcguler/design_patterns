package structural.decorator.example_1;

public abstract class AynaDecorator implements EvEsyalari {

  private EvEsyalari ayna =  new Ayna();

  public EvEsyalari getAyna() {
    return ayna;
  }

  public void setAyna(EvEsyalari ayna) {
    this.ayna = ayna;
  }
}
