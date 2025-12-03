/**
 * Ad Soyad: [Hayrunnisa Ekinci]
 * Öğrenci No: [240541043]
 * Proje: [Exercise4_1]
 * Tarih: [03/12/2025]
 */

import java.util.Scanner;
public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
         System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
          System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("--- Tarih Girişi ---");
        
        // Girdiler
        System.out.print("Günü giriniz (Örn: Pazartesi): ");
        String day= input.nextLine();

        System.out.print("Ayı giriniz (Örn: Ocak): ");
        String month= input.nextLine();
        
        System.out.print("Tarihi giriniz (Örn: 20): ");
        int date= input.nextInt();
        
        System.out.print("Yılı giriniz (Örn: 2025): ");
        int year= input.nextInt();
        
        input.close();
        //Çıktılar
        System.out.println("\n--- ÇIKTI FORMATLARI ---");
        
        
        System.out.print("Amerikan Formati: ");
        
        printAmerican(day,date,month,year);

        System.out.print("Avrupa Formati: ");
        
        printEuropean(day,date,month,year);
        
        System.out.println("--------------------------");
    }
}
