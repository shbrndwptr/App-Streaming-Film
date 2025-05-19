/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3;

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

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Efek Visual: " + efekVisual);
    }  
}
