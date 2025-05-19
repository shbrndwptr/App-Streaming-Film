/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1;

/**
 *
 * @author shabr
 */
public class Main {
    public static void main(String[] args) {
        // Membuat object Film tanpa konstruktor
        Film film1 = new Film();
        film1.judul = "Inception";
        film1.genre = "Sci-Fi";
        film1.durasi = 148;
        film1.rating = 8.8;
        film1.tahunRilis = 2010;

        Film film2 = new Film();
        film2.judul = "Avengers: Endgame";
        film2.genre = "Action";
        film2.durasi = 181;
        film2.rating = 8.4;
        film2.tahunRilis = 2019;

        Film film3 = new Film();
        film3.judul = "Parasite";
        film3.genre = "Thriller";
        film3.durasi = 132;
        film3.rating = 8.6;
        film3.tahunRilis = 2019;

        film1.tampilkanInfo();
        film2.tampilkanInfo();
        film3.tampilkanInfo();

        film1.putarFilm();
        film3.beriRating(9.0);
    }
}
