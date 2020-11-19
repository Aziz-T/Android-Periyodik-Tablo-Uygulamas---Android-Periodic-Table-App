package com.k.periyodiktablo;

public class AtomModeli {
    private String atomSembol,atomAdi,atomNumarasi,metallik, elektron,proton,notron;
    private String agirlik,dizilim,yukselt,fizikselHal,renk,elektronDizilmi;
    public AtomModeli() {}

    public AtomModeli(String atomSembol, String atomAdi, String atomNumarasi, String metallik, String agirlik, String dizilim, String yukselt, String fizikselHal,String renk,String elektronDizilmi, String elektron, String proton, String notron) {
        this.atomSembol = atomSembol;
        this.atomAdi = atomAdi;
        this.atomNumarasi = atomNumarasi;
        this.metallik = metallik;
        this.agirlik = agirlik;
        this.dizilim = dizilim;
        this.yukselt = yukselt;
        this.fizikselHal = fizikselHal;
        this.renk = renk;
        this.elektronDizilmi = elektronDizilmi;
        this.elektron=elektron;
        this.proton=proton;
        this.notron=notron;
    }

    public String getElektron() {
        return elektron;
    }

    public void setElektron(String elektron) {
        this.elektron = elektron;
    }

    public String getProton() {
        return proton;
    }

    public void setProton(String proton) {
        this.proton = proton;
    }

    public String getNotron() {
        return notron;
    }

    public void setNotron(String notron) {
        this.notron = notron;
    }

    public String getAtomSembol() {
        return atomSembol;
    }

    public void setAtomSembol(String atomSembol) {
        this.atomSembol = atomSembol;
    }

    public String getAtomAdi() {
        return atomAdi;
    }

    public void setAtomAdi(String atomAdi) {
        this.atomAdi = atomAdi;
    }

    public String getAtomNumarasi() {
        return atomNumarasi;
    }

    public void setAtomNumarasi(String atomNumarasi) {
        this.atomNumarasi = atomNumarasi;
    }

    public String getMetallik() {
        return metallik;
    }

    public void setMetallik(String metallik) {
        this.metallik = metallik;
    }

    public String getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(String agirlik) {
        this.agirlik = agirlik;
    }

    public String getDizilim() {
        return dizilim;
    }

    public void setDizilim(String dizilim) {
        this.dizilim = dizilim;
    }

    public String getYukselt() {
        return yukselt;
    }

    public void setYukselt(String yukselt) {
        this.yukselt = yukselt;
    }

    public String getFizikselHal() {
        return fizikselHal;
    }

    public void setFizikselHal(String fizikselHal) {
        this.fizikselHal = fizikselHal;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getElektronDizilmi() {
        return elektronDizilmi;
    }

    public void setElektronDizilmi(String elektronDizilmi) {
        this.elektronDizilmi = elektronDizilmi;
    }
}
