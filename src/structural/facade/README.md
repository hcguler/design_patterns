### Amaç

- Üst sistemlere hizmet sağlayan alt sistemler tasarlarken erişim kontrollerini esnek bir bağ ile sağlamak.

### Faydaları

- Hizmet sağlanan üst sistemlerin erişim kontrolü ele alınmış olur.
- Hizmeti interface üzerinden sağladığımız için alt sistemde yapılan değişiklik hizmet sağlanan üst sistemlerde herhangi bir değişiklik yapılmadan yansıyabilmesini sağlar.
- Hizmet sağlayan alt sınıfların içerisinde kullanılan sınıflar üst sistemler tarafından kesinlikle bilinmez bu sınıfların üzerinde yapılacak herhangi bir değişikliğin üst sistemleri etkilemesini önler.
- Factory üzerinden hizmetler açılır ise birden fazla hizmet implementasyon consumer durumda olan üst sistemlerin ihtiyacına göre sağlanır.