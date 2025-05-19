/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2;

/**
 *
 * @author shabr
 */
public class Film {
    // Atribut
    private String judul;
    private String genre;
    private int durasi; // dalam menit
    private double rating;
    private int tahunRilis;

    // Konstruktor
    public Film(String judul, String genre, int durasi, double rating, int tahunRilis) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.rating = rating;
        this.tahunRilis = tahunRilis;
    }

    // Method menampilkan informasi film
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Genre: " + genre);
        System.out.println("Durasi: " + durasi + " menit");
        System.out.println("Rating: " + rating);
        System.out.println("Tahun Rilis: " + tahunRilis);
        System.out.println("--------------------------");
    }

    // Method memutar film
    public void putarFilm() {
        System.out.println("Memutar film: " + judul);
    }

    // Method memberi rating baru
    public void beriRating(double ratingBaru) {
        rating = (rating + ratingBaru) / 2;
        System.out.println("Rating baru untuk " + judul + ": " + rating);
    }
}
