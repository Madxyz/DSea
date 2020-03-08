/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsea.tuiles;

import java.util.ArrayList;
import java.util.Map;

/**
 * Represente les emplacements donc le plateau de jeu
 * il y'a 32 emplacements au debut du jeu
 * Chaques emplacements est rempli d'une tuile
 * Tuile (Trésor ou DisqueBlanc) quand un trésor est ramasser
 * Si un emplacement est rempli d'une tuile disqueblanc au debut d'une manche ce
 * derniers est enlevé.
 * @author Madxyz
 */
public class Emplacement {
    //emplacement 0 c'est le bateau
    private static int[] numero =
    {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
    21,22,23,24,25,26,27,28,29,30,31,32};
    private int i = 1;

    /**
     * 
     */
    public Emplacement(){}

    public void donnerNumeroPlace(Tuile tuile){
        tuile.setPosition(numero[i]);
        if(this.i < 33){
            i++;
        }
    }

    public static int[] getNumero() {
        return numero;
    }

    public static void setNumero(int[] numero) {
        Emplacement.numero = numero;
    }
}
