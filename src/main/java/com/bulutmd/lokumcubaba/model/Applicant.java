package com.bulutmd.lokumcubaba.model;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "bayilik_basvuru")
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "İsim Soyisim Girilmelidir.")
    @Column(name = "isim_soyisim")
    private String adSoyad;

    @NotBlank(message = "Kimlik Numaranız 11 Haneli Olarak Girilmelidir.")
    @Column(name = "tckn")
    private String tckn;

    @NotBlank(message = "Adres Bölümü Boş Bırakılamaz.")
    @Column(name = "adres")
    private String adres;

    @NotBlank(message = "Telefon Numarası Boş Bırakılamaz.")
    @Column(name = "gsm")
    private String gsm;

    @NotBlank(message = "Posta Adresi Boş Bırakılamaz")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "Lütfen Kısaca Lokumcu Baba'yı Tercih Nedeninizi Açıklayınız")
    @Column(name = "tercih_sebebi")
    private String tercih_sebebi;

    @NotBlank(message = "İl Boş Bırakılamaz")
    @Column(name = "il")
    private String il;

    @NotBlank(message = "İlçe Boş Bırakılamaz")
    @Column(name = "ilce")
    private String ilce;

    @Column(name = "ek")
    private String ek;

    @NotNull(message = "Yatırım Miktarı Boş Bırakılamaz")
    @Column(name = "yatirim")
    private int yatirim_miktari;

    @NotBlank(message = "Tecrübe Alanı Boş Bırakılamaz")
    @Column(name = "terube")
    private String gecmisTecrube;

    @NotNull(message = "Doğum Tarihi Boş Bırakılamaz")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "dog_tar")
    private Date dogumTarihi;

    public Applicant() {
        
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTercih_sebebi() {
        return tercih_sebebi;
    }

    public void setTercih_sebebi(String tercih_sebebi) {
        this.tercih_sebebi = tercih_sebebi;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getEk() {
        return ek;
    }

    public void setEk(String ek) {
        this.ek = ek;
    }

    public Integer getYatirim_miktari() {
        return yatirim_miktari;
    }

    public void setYatirim_miktari(Integer yatirim_miktari) {
        this.yatirim_miktari = yatirim_miktari;
    }

    public String getGecmisTecrube() {
        return gecmisTecrube;
    }

    public void setGecmisTecrube(String gecmisTecrube) {
        this.gecmisTecrube = gecmisTecrube;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}
