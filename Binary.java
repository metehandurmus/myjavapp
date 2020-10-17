import java.util.Scanner;
public class NYP1 {
    public static void main(String[] args) {   
        long sayi, toplam = 0;
        int basamak = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("1 -> Binary to ASCII and Char\n2 -> Char to ASCII and Binary\n-> ");
        int secim = input.nextInt();
        if (secim == 1) {
            System.out.print("2'lik tabanda sayiyi giriniz(8bit) : ");
            sayi = input.nextLong();
            while (sayi != 0) {
                toplam += (sayi % 10) * Math.pow(2, basamak);
                sayi /= 10;
                basamak++;
            }
            System.out.println("Karakterin ASCII kodu : " + toplam);
            char ch = (char) toplam;
            System.out.println("Karakter : " + ch);
        } else {
            System.out.print("Karakteri giriniz : ");
            input.nextLine();
            String veri = input.nextLine();
            char x = veri.charAt(0);
            int a = (int) x;
            System.out.println("Karakterin ASCII kodu : " + a);
            char[] binary = new char[8];
            int j = 7;
            while (a != 0) {
                if (a % 2 != 0)
                    binary[j] = '1';
                else
                    binary[j] = '0';
                j--;
                a /= 2;
            }
            System.out.print("Karakterin binary kodu : 0");
            for (int i = 0; i < 8; i++)
                System.out.print(binary[i]);
            System.out.print("\n");
        }
    }
}
