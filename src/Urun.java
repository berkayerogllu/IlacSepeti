/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author berkay
 */
public class Urun {
    
    private String urun_ismi;
    private int urun_adedi;
    private double birim_fiyati;
    private double toplam_fiyat;

    public Urun(String urun_ismi, int urun_adedi, double birim_fiyati, double toplam_fiyat) {
        this.urun_ismi = urun_ismi;
        this.urun_adedi = urun_adedi;
        this.birim_fiyati = birim_fiyati;
        this.toplam_fiyat = toplam_fiyat;
    }

    public String getUrun_ismi() {
        return urun_ismi;
    }

    public void setUrun_ismi(String urun_ismi) {
        this.urun_ismi = urun_ismi;
    }

    public int getUrun_adedi() {
        return urun_adedi;
    }

    public void setUrun_adedi(int urun_adedi) {
        this.urun_adedi = urun_adedi;
    }

    public double getBirim_fiyati() {
        return birim_fiyati;
    }

    public void setBirim_fiyati(double birim_fiyati) {
        this.birim_fiyati = birim_fiyati;
    }

    public double getToplam_fiyat() {
        return toplam_fiyat;
    }

    public void setToplam_fiyat(double toplam_fiyat) {
        this.toplam_fiyat = toplam_fiyat;
    }
    

   
    
}
