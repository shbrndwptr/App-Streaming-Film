package Bab6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shabr
 */
public abstract class Film {  // Menambahkan keyword abstract
    private String judul;
    private String genre;
    private int durasi;
    private double rating;
    private int tahunRilis;

    public Film(String judul, String genre, int durasi, double rating, int tahunRilis) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.rating = rating;
        this.tahunRilis = tahunRilis;
    }

    // Getter dan Setter
    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    public int getDurasi() { return durasi; }
    public void setDurasi(int durasi) { this.durasi = durasi; }
    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
    public int getTahunRilis() { return tahunRilis; }
    public void setTahunRilis(int tahunRilis) { this.tahunRilis = tahunRilis; }

    // Abstract method: Tidak ada implementasi, harus diimplementasikan oleh kelas turunan
    public abstract void tampilkanInfo(); 

    public void putarFilm() {
        System.out.println("Memutar Film: " + judul);
    }

    public void beriRating(double ratingBaru) {
        rating = (rating + ratingBaru) / 2;
        System.out.println("Rating Baru: " + rating);
    }   
    
}
