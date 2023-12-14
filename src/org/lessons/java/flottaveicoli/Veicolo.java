package org.lessons.java.flottaveicoli;



public abstract class Veicolo {
    private String targa;
    private int annoImmatricolazione;

    public Veicolo(String targa, int annoImmatricolazione) {
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public String getTarga() {
        return targa;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }

    @Override
    public String toString() {
        return "Veicolo inserito \nTarga: " + getTarga() + "\n" + "Anno immatricolazione: " + getAnnoImmatricolazione();
    }
}
