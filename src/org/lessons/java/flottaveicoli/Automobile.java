package org.lessons.java.flottaveicoli;

public class Automobile extends Veicolo{
    private int porte;
    public Automobile(String targa, int annoImmatricolazione, int porte) {
        super(targa, annoImmatricolazione);
        this.porte = porte;
    }

    public int getPorte() {
        return porte;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Numero portiere: " + getPorte();
    }
}
