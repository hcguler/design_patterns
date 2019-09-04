### Amaç 

- Bir durum değişikliğinde birden fazla nesne için güncelleme gereken işlevleri yönetmek.
- Güncelleme işlemlerini nesneler içerisinde implemente ederek state değişimlerinde davranış modelini nesnelerin belirlemesini sağlamak.
- Interface veya abstraction ile state değişiminde tüm nesnelerin tetiklenebilir olmasını sağlamak.
- Alıcı ve gönderen arasındaki ilişkiyi yönetmeyi sağlar. Gönderen tüm alıcıların kendine özgü yapılandırılması için imkan sağlar.
- Nesneler arasında OneToMany ilişki kurularak gönderici değişikliğinde tüm alıcıların güncellenmesini sağlarsınız.

### Hatırlatıcı Örnekler

- Hava durumu bilgisinin push edilmesi
- Abonelik bilgisine göre hizmet alım şeklinin yönetilmesi.
