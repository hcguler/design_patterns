package creational.singleton.example_1;

public class AppProperties {
    // new operatörü ile yeniden oluşturulmayı engellemiş olduk.
    private AppProperties() {
        System.out.println("singletion initialize edildi");
    }

    /**
     * Sınıfın bir tane yaratılarak heryerden erişilebilir olmasını sağlayan tekil kaynak.
     */
    private static volatile AppProperties instance = null;

    /**
     * Double check locking yapabilmek için kullanılan sınıf.
     */
    private static Object lock =  new Object();

    public static AppProperties instance(){
        if (instance == null) {
            synchronized (lock){
                if (instance == null){
                    instance =  new AppProperties();
                }
            }
        }
        return instance;
    }

    public double getPiValue(){
        return 3.14;
    }
}
