Proxy aracı demektir asıl işi yapan ile işe ihtiyaç duyan arasında görev alır. İşi yapacak olan kişinin vekilliğini üstlenerek işe ihtiyacı olan kişiye hizmet sağlar.
Proxy nesnesi Proxy olduğu nesneye ait tüm metodları barındırır.
Proxy görevi gördüğü nesnenin gerek olmadıkça oluşmasını engelleyebilir veya nesnenin gizlenmesini sağlayabilir.
Proxy olunan nesnenin dışarıdan erişimi kontrol altına alınmış olur.

Proxy design pattern 4 farklı şekilde kullnılabilir.

*Virtual Proxy
- Büyük bir dokümandaki resimlerin açılır açılmaz dolmaması, resim içeren sayfa içinde sayfa görüntülene kadar Proxy nesne boyutları bilir kendini konumlandırır fakat görüntülemez, taki sayfa açılana kadar. Resmin görüntülenmesi Proxy nesneni load() metodunun çağrılıp asıl nesneyi görüntülemesi ile gerçekleşir.
- Placeholder olarak bir nesneyi Proxy olarak temsil eder. Aslında nesnenin yerine geçer.
*Protection Proxy
- Bir nesnenin başka nesneler tarafından kontrolsüz kullanımını engellemek için kullanılır.
- Nesnenin sahip olduğu fonksiyonlardan erişim istenmeyenler Proxy aracılığı ile engellenerek nesnenin erişimi kısıtlandırılmış olur.
*Dynamic Proxy
-
-
-
-
*Remote Proxy
- Uzak sunucu üzerinde hizmet veren bir servisin Proxy olarak sunulmasıdır. Proxy uzak sunucudaki hizmetlerin hapsini onun yerine geçerek veribilir.
- Protocol bazında implemente edilebilir.

*Ne zaman kullanılır
-Oluşturulması zaman alıcı ve sistem kaynaklarını zorlayan nesnelere Proxy olmak için virtual Proxy oluşturulur.
-Bir nesneyi ve metodlarını dışarıdan erişmlere karşı korumak için Protection Proxy kullanılır.
-Başka bir sunucuda bulunan servislere erişimi kullanıcı için transparen hale getirmek için remote Proxy kullanılır.
