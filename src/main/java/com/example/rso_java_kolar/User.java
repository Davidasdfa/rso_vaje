package com.example.rso_java_kolar;
public class User {
    private String ime;
    private String priimek;
    private String geslo;

    // Konstruktor razreda User
    public User(String ime, String priimek, String geslo) {
        this.ime = ime;
        this.priimek = priimek;
        this.geslo = geslo;
    }

    // Get metoda za ime
    public String getIme() {
        return ime;
    }

    // Set metoda za ime
    public void setIme(String ime) {
        this.ime = ime;
    }

    // Get metoda za priimek
    public String getPriimek() {
        return priimek;
    }

    // Set metoda za priimek
    public void setPriimek(String priimek) {
        this.priimek = priimek;
    }

    // Get metoda za geslo
    public String getGeslo() {
        return geslo;
    }

    // Set metoda za geslo
    public void setGeslo(String geslo) {
        this.geslo = geslo;
    }

    // Dodatne metode, če jih potrebujete
}
