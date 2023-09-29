package com.example.rso_java_kolar;

public class BirthdayEvent extends Event {
    private int starost;

    // Konstruktor razreda BirthdayEvent
    public BirthdayEvent(int id, String ime, String datum, int starost) {
        super(id, ime, datum);
        this.starost = starost;
    }

    // Get metoda za starost
    public int getStarost() {
        return starost;
    }

    // Set metoda za starost
    public void setStarost(int starost) {
        this.starost = starost;
    }

    // Dodatne metode, če jih potrebujete
}