package behavioral.strategy.example_1;

public class StrategyDemo {
    public static void main(String[] args) {
        final Bean bean = new Bean();
        bean.setCounter(10);
        bean.setName("name");
        FileManager.instance().saveBean(bean);
    }
}
