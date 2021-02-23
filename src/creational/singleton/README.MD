### Amaç

- Bazı sınıfların uygulama içinde bir kez oluşturulması gerekir ve ihtiyaç duyan tüm isteklerin aynı sınıf üzerinden erişim yaparak işlem yapması gerekir.

### Hatırlatıcı Örnekler

- Database connection pool oluşturan bağlantı sınıfı.
- Application scope ihtiyaçlar olarak genelleme yapılabilir.

### Singleton sınıf oluşturmanın bazı kuralları vardır

- Sınıf konstruktörlerinin private olması gerekiyor. Konstrüktörleri private olan bir sınıftan, başka bir sınıf new operatörü ile nesne oluşturamaz.
- Singleton sınıfından sadece bir tane nesne oluşturulması gerektiği için oluşturulması gereken nesneyi sınıfın static değiskeni olarak tanımlamamız gerekiyor.
- Singleton sınıfında instance() isminde static bir metodun olması ve bu metodun static olarak tanımlanmış nesneyi geri vermesi gerekiyor.

