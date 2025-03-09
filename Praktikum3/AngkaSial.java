/*  Nama File   : AngkaSial.java
    Deskripsi   : Program penggunaan exception buatan sendiri
                  Pengenalan klausa 'throw' dan 'throws'
    Nama        : Jerico Ash Shiddiqy Purnomo
    NIM         : 24060123140126
    Tanggal     : 07 - Maret - 2025
*/
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka +" bukan angka sial ");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase ){
            System.out.println(ase.getMessage());
            System.out.println("hati hati dalam memasukan angka !!");
        }
    }
}

// Pertanyaan 1: Metode cobaAngka(int angka) memiliki pengecekan apakah angka bernilai 13. Jika iya, maka sebuah eksepsi dilempar (throw new AngkaSialException()). 
// Ketika as.cobaAngka(13); dipanggil, karena angka == 13, maka eksepsi terjadi sebelum baris 12 dieksekusi.
// Akibatnya, baris 12 tidak akan dieksekusi karena program langsung melompat ke blok catch.
// Jawaban: Tidak, baris 12 tidak dieksekusi saat eksepsi terjadi

// Pertanyaan 2: Pemanggilan metode di dalam try dilakukan secara berurutan.
// as.cobaAngka(10): Tidak menyebabkan eksepsi, sehingga berjalan normal.
// as.cobaAngka(13): Melempar AngkaSialException, menyebabkan program langsung melompat ke blok catch, tanpa melanjutkan eksekusi kode setelahnya dalam blok try.
// as.cobaAngka(12): Tidak dieksekusi karena sudah terjadi eksepsi sebelumnya, yang langsung menghentikan eksekusi di dalam try.
// Jawaban: Tidak, baris 21 tidak dieksekusi karena eksepsi sebelumnya menyebabkan aliran program pindah ke blok catch.