/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1;

/**
 *
 * @author shabr
 */
public class Film {
    // Atribut
    String judul;
    String genre;
    int durasi;
    double rating;
    int tahunRilis;

    // Method menampilkan informasi film
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Genre: " + genre);
        System.out.println("Durasi: " + durasi + " menit");
        System.out.println("Rating: " + rating);
        System.out.println("Tahun Rilis: " + tahunRilis);
        System.out.println("--------------------------");
    }

    public void putarFilm() {
        System.out.println("Memutar film: " + judul);
    }

    public void beriRating(double ratingBaru) {
        rating = (rating + ratingBaru) / 2;
        System.out.println("Rating baru untuk " + judul + ": " + rating);
    }
}
