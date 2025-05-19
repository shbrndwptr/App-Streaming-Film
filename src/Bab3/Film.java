/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3;

/**
 *
 * @author shabr
 */
public class Film {
    protected String judul;
    protected String genre;
    protected int durasi;
    protected double rating;
    protected int tahunRilis;

    public Film(String judul, String genre, int durasi, double rating, int tahunRilis) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.rating = rating;
        this.tahunRilis = tahunRilis;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Genre: " + genre);
        System.out.println("Durasi: " + durasi + " menit");
        System.out.println("Rating: " + rating);
        System.out.println("Tahun Rilis: " + tahunRilis);
    }

    public void putarFilm() {
        System.out.println("Memutar Film: " + judul);
    }

    public void beriRating(double ratingBaru) {
        rating = (rating + ratingBaru) / 2;
        System.out.println("Rating Baru: " + rating);
    }
}
