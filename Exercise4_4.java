/**
 * Ad Soyad: [Hayrunnisa Ekinci]
 * Öğrenci No: [240541043]
 * Proje: [Exercise4_4]
 * Tarih: [03/12/2025]
 */
public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        /*
         * Cevap:
         * Kod derlenir ve calisir. Derleyici herhangi bir hata veya uyari vermez.
         * Dondurulen deger (42) yok sayilir ve herhangi bir etkiye neden olmaz.
         */

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        /*
         * Cevap 2:
         * Kod derlenirken hata verir.
         * Hata mesaji: "error: 'void' type not allowed here" (veya benzeri).
         * Aciklama: 'void' metotlar deger dondurmez, bu yuzden bir aritmetik ifadenin
         * (ornegin + 7) icinde kullanilamazlar.
         */

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
