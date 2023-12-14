package org.lessons.java.flottaveicoli;

public class Motocicletta extends Veicolo{

    private boolean cavalletto;
    public Motocicletta(String targa, int annoImmatricolazione, boolean cavalletto) {
        super(targa, annoImmatricolazione);
        this.cavalletto = cavalletto;
    }

    public boolean isCavalletto() {
        return cavalletto;
    }

    public void setCavalletto(boolean cavalletto) {
        this.cavalletto = cavalletto;
    }

    public String cavallettoToString(){
        if (cavalletto){
            return "con cavalletto";
        } else {
            return "senza cavalletto";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + cavallettoToString();
    }
}
