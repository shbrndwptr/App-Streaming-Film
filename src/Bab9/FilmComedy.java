/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9;

import Bab8.*;
import Bab7.*;
import Bab6.*;

/**
 *
 * @author shabr
 */
// Kelas FilmComedy
public class FilmComedy extends Film {
    private int jumlahLawakan;

    public FilmComedy(String judul, String genre, int durasi, double rating, int tahunRilis, int jumlahLawakan) {
        super(judul, genre, durasi, rating, tahunRilis);
        this.jumlahLawakan = jumlahLawakan;
    }

    public int getJumlahLawakan() { return jumlahLawakan; }
    public void setJumlahLawakan(int jumlahLawakan) { this.jumlahLawakan = jumlahLawakan; }

    @Override
    public void tampilkanInfo() {
        System.out.println("Judul: " + getJudul());
        System.out.println("Genre: " + getGenre());
        System.out.println("Durasi: " + getDurasi() + " menit");
        System.out.println("Rating: " + getRating());
        System.out.println("Tahun Rilis: " + getTahunRilis());
        System.out.println("Jumlah Lawakan: " + jumlahLawakan);
    }

    public void unduh() {
        System.out.println("Mengunduh film Komedi: " + getJudul());
    }

    public void beriKomentar(String komentar) {
        System.out.println("Komentar untuk film Komedi '" + getJudul() + "': " + komentar);
    }
}


