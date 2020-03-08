/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsea.pions;

import java.util.Random;

/**
 * donne le nb de deplacement a effectuer pour le joueur en cours.
 * 2 dés sont lancé au debut du tour du joueur 
 * Le nombre de décplacement est :
 * La somme des 2 dés - nombre de trésor porté par le joueur.
 * ex : 2 dés lancés : 3 + 2 = 5 
 *      le joueur porte 2 trésors : 5 - 2 = 3 déplacements.
 * @author Madxyz
 */
public class Des {
    Random alea = new Random();
    private int sommeResultat ;
    
    /**
     * represente un lancer de 2 dés
     * Chaques dés a 2 faces  de valeur 1,2,3.
     * @return 
     * retourne un tableau (int) de taille 2 avec les valeurs des 2 lancers.
     */
    public int[] lancerDes(){
        //IntStream ints = new Random().ints(2,1,3);
                    //ints(min, (max+1))
        int[] resultat = new int[2];
        resultat[0] =alea.ints(1,(3+1)).findFirst().getAsInt();
        resultat[1] =alea.ints(1,(3+1)).findFirst().getAsInt();
        
        this.sommeResultat = resultat[0]+resultat[1];
        return resultat;
    }

    
    public Random getAlea() {
        return alea;
    }

    public int getSommeResultat() {
        return sommeResultat;
    }
    
    public void setAlea(Random alea) {
        this.alea = alea;
    }

    public void setSommeResultat(int sommeResultat) {
        this.sommeResultat = sommeResultat;
    }
            
    //test
    /*
    public static void main(String[] args){
        Des x = new Des();
       
        for (int i=0; i<200;i++){
            int[] j = x.lancerDes();
            System.out.println("["+j[0]+"]  ["+ j[1]+"]");
        }
    }*/
}
