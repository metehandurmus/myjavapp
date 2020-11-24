// Veri dizilerine normalizasyon uygulayan java kodu

package normalizasyon;

import java.util.*;

public class Normalizasyon {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç veri girilecek : ");
        int x = input.nextInt();
        double[] veri = new double[x];
        for (int i = 0; i < veri.length; i++) {
            System.out.print("a["+i+"] = ");
            veri[i] = input.nextDouble();
        }
        Norm(veri);
    }
    
    public static void Norm(double[] a) {
        int varyans = 0, i, j;
        double ortalama = 0, stdSapma, temp;
        for (i = 1; i < a.length; i++) {
            for (j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (i = 0; i < a.length; i++)  ortalama += a[i];
        ortalama /= a.length;
        for (i = 0; i < a.length; i++)  varyans += Math.pow((a[i] - ortalama), 2) / (a.length - 1);
        stdSapma = Math.sqrt(varyans);
        for (i = 0; i < a.length; i++)  a[i] = (a[i] - ortalama) / stdSapma;
        for (i = 0; i < a.length; i++)  System.out.println(a[i]);
        double bos = 0;
        for (i = 0; i < a.length; i++)  bos += a[i];
        bos /= a.length;
        System.out.println("Ortalama : "+bos);
        double bos2 = 0, bos3;
        for (i = 0; i < a.length; i++)  bos2 += Math.pow((a[i] - bos), 2) / (a.length - 1);
        bos3 = Math.sqrt(bos2);
        System.out.println("Std Sapma : "+bos3);
    }
}
