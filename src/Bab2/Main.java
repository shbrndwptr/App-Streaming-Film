/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2;

/**
 *
 * @author shabr
 */
public class Main {
    public static void main(String[] args) {
        // Membuat 3 objek Film dengan konstruktor
        Film film1 = new Film("Inception", "Sci-Fi", 148, 8.8, 2010);
        Film film2 = new Film("Avengers: Endgame", "Action", 181, 8.4, 2019);
        Film film3 = new Film("Parasite", "Thriller", 132, 8.6, 2019);

        // Menampilkan informasi masing-masing film
        film1.tampilkanInfo();
        film2.tampilkanInfo();
        film3.tampilkanInfo();

        // Memutar film
        film1.putarFilm();

        // Memberi rating baru
        film3.beriRating(9.0);
    }
}
