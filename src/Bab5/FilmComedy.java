/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5;

/**
 *
 * @author shabr
 */
public class FilmComedy extends Film {
    private int jumlahLawakan;

    public FilmComedy(String judul, String genre, int durasi, double rating, int tahunRilis, int jumlahLawakan) {
        super(judul, genre, durasi, rating, tahunRilis);
        this.jumlahLawakan = jumlahLawakan;
    }

    public int getJumlahLawakan() { return jumlahLawakan; }
    public void setJumlahLawakan(int jumlahLawakan) { this.jumlahLawakan = jumlahLawakan; }

    // Overriding tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Lawakan: " + jumlahLawakan);
    }

    // Overloading tampilkanInfo
    public void tampilkanInfo(String komentar, boolean isLucu) {
        tampilkanInfo();
        System.out.println("Komentar: " + komentar);
        System.out.println("Lucu? " + (isLucu ? "Ya" : "Tidak"));
    } 
}
