/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsea.pions;

/**
 * compteur de manche
 * max 3
 * 
 * @author Madxyz
 */
public class Manche {
    private int actuel = 0;

    public int getManche() {
        return actuel;
    }

    public void setManche(int manche) {
        this.actuel = manche;
    }
    
    /**
     * méthode a appeler en debut de chaque manche.
     * incremente de un le compteur de manche.
     */
    public void ajouterUneManche(){
        actuel++;
    }
    
}
