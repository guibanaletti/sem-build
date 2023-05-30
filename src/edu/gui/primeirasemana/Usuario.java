package edu.gui.primeirasemana;

public class Usuario {
    public static void main (String[] args) throws Exception {
        SmartTV SmartTV = new SmartTV();

        System.out.println("A TV está ligada? " + SmartTV.ligada);
        if (SmartTV.ligada) {

            System.out.println("Qual Canal? " + SmartTV.canal);
            System.out.println("volume: " + SmartTV.volume);
        }

    }
}
