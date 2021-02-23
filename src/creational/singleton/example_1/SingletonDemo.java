package creational.singleton.example_1;

public class SingletonDemo {

    public static void main(String[] args) {
        AppProperties instance = AppProperties.instance();
        AppProperties instance1 = AppProperties.instance();
        AppProperties instance2 = AppProperties.instance();

        if (instance.equals(instance1) && instance.equals(instance2)){
            System.out.println("bir kez oluşturulmuş.");
        }
    }
}
