/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Texnoservis
 */
public class Musteri {
    private int id;
    private String ad;
    private String soyad;
    private int yash;
    private String olke;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

   

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYash() {
        return yash;
    }

    public void setYash(int yash) {
        this.yash = yash;
    }

    public String getOlke() {
        return olke;
    }

    public void setOlke(String olke) {
        this.olke = olke;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", yash=" + yash + ", olke=" + olke;
    }
    
}
