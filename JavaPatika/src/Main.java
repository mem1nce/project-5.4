import java.util.Scanner;

public class Main {

    // Özyinelemeli metot
    public static void sayiIsle(int sayi) {
        // Mevcut değeri ekrana yazdır
        System.out.print(sayi + " ");

        // Eğer sayı 0 veya negatifse, 5 ekleme işlemine geçecek
        if (sayi <= 0) {
            return; // Temel durum, burada döngüyü durdurur
        }

        // 5 çıkararak bir sonraki değeri hesapla
        sayiIsle(sayi - 5); // Özyinelemeli çağrı
        // Sayı negatif veya sıfır olduysa 5 ekleyerek devam et
        System.out.print((sayi + 5) + " "); // 5 ekleyerek ekrana yazdır
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int n = input.nextInt(); // Kullanıcıdan sayıyı al

        sayiIsle(n); // Özyinelemeli metodu çağır

        // Scanner'ı kapat
        input.close();
    }
}
