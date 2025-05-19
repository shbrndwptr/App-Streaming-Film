/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5;

/**
 *
 * @author shabr
 */
public class FilmAction extends Film {
    private String efekVisual;

    public FilmAction(String judul, String genre, int durasi, double rating, int tahunRilis, String efekVisual) {
        super(judul, genre, durasi, rating, tahunRilis);
        this.efekVisual = efekVisual;
    }

    public String getEfekVisual() { return efekVisual; }
    public void setEfekVisual(String efekVisual) { this.efekVisual = efekVisual; }

    // Overriding tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Efek Visual: " + efekVisual);
    }

    // Overloading tampilkanInfo
    public void tampilkanInfo(String tambahan) {
        tampilkanInfo();
        System.out.println("Catatan: " + tambahan);
    }    
}
