/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7;

import Bab6.*;

/**
 *
 * @author shabr
 */
// Kelas FilmAction
public class FilmAction extends Film {
    private String efekVisual;

    public FilmAction(String judul, String genre, int durasi, double rating, int tahunRilis, String efekVisual) {
        super(judul, genre, durasi, rating, tahunRilis);
        this.efekVisual = efekVisual;
    }

    public String getEfekVisual() { return efekVisual; }
    public void setEfekVisual(String efekVisual) { this.efekVisual = efekVisual; }

    // Implementasi metode abstrak tampilkanInfo() sesuai dengan genre Action
    @Override
    public void tampilkanInfo() {
        System.out.println("Judul: " + getJudul());
        System.out.println("Genre: " + getGenre());
        System.out.println("Durasi: " + getDurasi() + " menit");
        System.out.println("Rating: " + getRating());
        System.out.println("Tahun Rilis: " + getTahunRilis());
        System.out.println("Efek Visual: " + efekVisual);
    }
}
