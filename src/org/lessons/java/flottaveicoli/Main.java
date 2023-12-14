package org.lessons.java.flottaveicoli;

public class Main {
    public static void main(String[] args) {
        GestoreFlotta flotta = new GestoreFlotta();

        Automobile auto = new Automobile("AB365J", 2010, 5);
        flotta.insVeicolo(auto);
        Motocicletta motoMoto = new Motocicletta("JK175A", 1987, true);
        flotta.insVeicolo(motoMoto);
        Automobile ferrari = new Automobile("AB375J", 2000, 3);
        flotta.insVeicolo(ferrari);
        Motocicletta broom = new Motocicletta("JK165A", 1997, false);
        flotta.insVeicolo(broom);
        Automobile maserati = new Automobile("AB366Y", 2019, 3);
        flotta.insVeicolo(maserati);
        Motocicletta kawasaki = new Motocicletta("JK146A", 2017, true);
        flotta.insVeicolo(kawasaki);
        Motocicletta kawasak = new Motocicletta("JK136A", 2016, true);
        flotta.insVeicolo(kawasak);

        System.out.println(flotta.contaVeicoliDiTipo(Motocicletta.class));
        System.out.println(flotta.trovaTargaVeicolo("JK146A"));



    }
}
