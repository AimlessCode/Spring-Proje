package com.emin.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "tblogrenci")
public class Ogrenci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String ad;
    String soyad;


    public long getId() {
        return id;
    }
    public void setId(long id) {
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


    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }
}
