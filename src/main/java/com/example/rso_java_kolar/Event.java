package com.example.rso_java_kolar;
    public class Event {
        private int id;
        private String ime;
        private String datum;

        // Konstruktor razreda Event
        public Event(int id, String ime, String datum) {
            this.id = id;
            this.ime = ime;
            this.datum = datum;
        }

        // Get metoda za ID
        public int getId() {
            return id;
        }

        // Set metoda za ID
        public void setId(int id) {
            this.id = id;
        }

        // Get metoda za ime
        public String getIme() {
            return ime;
        }

        // Set metoda za ime
        public void setIme(String ime) {
            this.ime = ime;
        }

        // Get metoda za datum
        public String getDatum() {
            return datum;
        }

        // Set metoda za datum
        public void setDatum(String datum) {
            this.datum = datum;
        }

        // Dodatne metode, če jih potrebujete
    }
