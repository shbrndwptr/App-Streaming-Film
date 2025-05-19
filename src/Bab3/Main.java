/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3;

/**
 *
 * @author shabr
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Film
        Film filmBiasa = new Film("Interstellar", "Sci-Fi", 169, 8.6, 2014);
        
        // Membuat objek FilmAction
        FilmAction filmAction = new FilmAction("Avengers: Endgame", "Action", 181, 8.4, 2019, "Canggih & Spektakuler");

        // Membuat objek FilmComedy
        FilmComedy filmComedy = new FilmComedy("Mr.Bean's Holiday", "Comedy", 90, 7.0, 2007, 25);

        System.out.println("=== Informasi Film Biasa ===");
        filmBiasa.tampilkanInfo();
        filmBiasa.putarFilm();
        filmBiasa.beriRating(9.0);

        System.out.println("\n=== Informasi Film Action ===");
        filmAction.tampilkanInfo();
        filmAction.putarFilm();
        filmAction.beriRating(9.5);

        System.out.println("\n=== Informasi Film Comedy ===");
        filmComedy.tampilkanInfo();
        filmComedy.putarFilm();
        filmComedy.beriRating(8.5);
    }
}
