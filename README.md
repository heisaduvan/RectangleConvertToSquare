İbrahim Kürce okuduğu kitaplardan beğendiği örnekleri Türkçe'ye çevirip medium hesabında paylaşıyor. Kendisinin 
Grokking Algorithms — 2 yazısında böl ve yönet algoritması anlatılıyor. Öz yinelemeli teknik olarak da bilinen bu teknik bir çok problemin
çözümünde kullanılır. 

İbrahim Kürce'nin bu yazısına ulaşmak için : https://medium.com/bili%C5%9Fim-hareketi/grokking-algorithms-2-6afb940f8682

Bir çiftçi olduğunuzu ve 640x400 m ölçülerinde bir tarlanız olduğunu düşünün. Bu tarlayı mümkün olan en büyük ölçülerde kare tarlalara 
ayırmak istiyoruz. Bu kare tarlaların kenar uzunlukları ne olurdu ? Biraz düşününce aslında bunun basit bir EBOB - OBEB sorusu olduğunu 
farketmek çok kolay. Yapmamız gereken tek şey dikdörtgen şeklindeki tarlanın iki kenar uzunluğunu bilmek ve EBOB'larını hesaplamak. Bu çok 
basit bir işlem ve bir for döngüsü ile kolayca yapılabilir. 

Peki ya dikdörtgen biçimindeki bir tarlayı mümkün olan en az sayıda kare tarlalara bölmek isteseydik ne yapmamız gerekecekti ? İşte burada
öz yinelemeli teknik kullanarak problemi kolayca çözebiliyoruz. Dikdörtgenin her iki kenar uzunluğunu bir fonksiyona gönderiyoruz ve bu dikdörtgen
içerisindeki en büyük kareyi hesaplıyoruz. Daha sonra elimizde kalan dikdörtgenin değerlerini aynı fonksiyona tekrar gönderiyoruz. Elimizde bir
kare kaldığında işlem bitmiş oluyor. 
