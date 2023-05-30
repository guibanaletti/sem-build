package edu.gui.primeirasemana;

public class SmartTV {
    boolean ligada = false;
    int canal = 1, volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("Tv sendo Ligada \n");
    }
    public void desligar(){
        ligada = false;
        System.out.println("Tv sendo Desligada \n");

    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume. \n");

    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume. \n");
    }

}
