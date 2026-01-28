import java.util.Scanner;

public class Konu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int konuSayisi;

        // 1️⃣ Konu sayısını al
        do {
            System.out.print("BIL201 dersinde anlatılan konu sayısını giriniz (3-10 arası): ");
            konuSayisi = input.nextInt();
            input.nextLine(); // nextInt’ten sonra satırı temizle

            if (konuSayisi < 3 || konuSayisi > 10) {
                System.out.println("Hatalı giriş! Konu sayısı 3’ten az, 10’dan fazla olamaz.");
            }
        } while (konuSayisi < 3 || konuSayisi > 10);

        // 2️⃣ Konuları tutmak için dizi oluştur
        String[] konular = new String[konuSayisi];

        // 3️⃣ Konuları kullanıcıdan al
        for (int i = 0; i < konuSayisi; i++) {
            System.out.print((i + 1) + ". konu başlığını giriniz: ");
            String yeniKonu = input.nextLine();

            // Tekrar kontrolü
            boolean tekrarVar = false;

            for (int j = 0; j < i; j++) { // önceki konularla karşılaştır
                if (konular[j].equals(yeniKonu)) { // büyük/küçük harf duyarlı
                    tekrarVar = true;
                    break;
                }
            }

            if (tekrarVar) {
                System.out.println("Bu konu zaten girildi! Farklı bir konu yazınız.");
                i--; // aynı sırayı tekrar et
            } else {
                konular[i] = yeniKonu; // diziye ekle
            }
        }

        // 4️⃣ Sonuçları göster
        System.out.println("------------------------------------");
        System.out.println("BIL201 dersinde anlatılan konular:");
        for (int i = 0; i < konular.length; i++) {
            System.out.println((i + 1) + ". " + konular[i]);
        }

        input.close();
    }
}
