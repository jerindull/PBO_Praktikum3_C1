/*  Nama File   : AngkaSialException.java
    Deskripsi   : Eksepsi buatan sendiri, menolak masukan angka 13!
    Nama        : Jerico Ash Shiddiqy Purnomo
    NIM         : 24060123140126
    Tanggal     : 07 - Maret - 2025
*/
public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukan angka 13 karena angka sial !!!");
    }
}
