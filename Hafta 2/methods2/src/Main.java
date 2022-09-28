public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün";
        System.out.println(mesaj.substring(0,2));
        int sayi = topla(5,7);
        System.out.println(sayi);

        int toplam = topla(4,5,7,8);
        System.out.println(toplam);
    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int a, int b){
        return a+b;
    }
    public static int topla(int... sayilar)//3 tane nokta koyulmasının sebebi: sayısız adet veri girileceği zaman kullanılır.
    {
        int toplam = 0;
        for(int sayi : sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

}
