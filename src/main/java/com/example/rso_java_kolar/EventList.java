package com.example.rso_java_kolar;

import java.util.ArrayList;
import java.util.List;

public class EventList {
    private int id;
    private List<Event> eventList;
    private long casDoNajblizjegaEventa; // Čas do najbližjega dogodka v milisekundah

    // Konstruktor razreda EventList
    public EventList(int id) {
        this.id = id;
        this.eventList = new ArrayList<>();
        this.casDoNajblizjegaEventa = 0; // Privzeti čas do najbližjega dogodka
    }

    // Get metoda za ID
    public int getId() {
        return id;
    }

    // Set metoda za ID
    public void setId(int id) {
        this.id = id;
    }

    // Get metoda za seznam dogodkov
    public List<Event> getEventList() {
        return eventList;
    }

    // Dodajanje dogodka v seznam
    public void dodajEvent(Event event) {
        eventList.add(event);
    }

    // Get metoda za čas do najbližjega dogodka
    public long getCasDoNajblizjegaEventa() {
        return casDoNajblizjegaEventa;
    }

    // Set metoda za čas do najbližjega dogodka
    public void setCasDoNajblizjegaEventa(long casDoNajblizjegaEventa) {
        this.casDoNajblizjegaEventa = casDoNajblizjegaEventa;
    }

    // Dodatne metode, če jih potrebujete
}