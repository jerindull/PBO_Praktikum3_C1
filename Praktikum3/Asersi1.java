/*  Nama File   : Asersi1.java
    Deskripsi   : Program untuk menunjukkan asersi
    Nama        : Jerico Ash Shiddiqy Purnomo
    NIM         : 24060123140126
    Tanggal     : 07 - Maret - 2025
*/
public class Asersi1 {
    public static void main(String[] args) {
        int x= 0;
        if (x>0){
            System.out.println("bilangan posisitf");
        }else{
            assert (x<0):"ada kesalahan kode";
            System.out.println("bilangan negatif");
        }
    }
}
