/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsea.pions;

/**
 * 
 * Capitaine représente l'oxygène disponible aux joueurs 
 * Il est initialisé à 25 
 * L'oxygène est consommé au début du tour de chaques joueurs 
 * -1 oxygène par trésor porté par le joueur au début de son tour 
 * 
 * Compteur de manche
 * max 3
 * 
 * @author Madxyz
 */
public class Capitaine {
    private int mancheActuel = 0;
    private int oxygene = 25;
    
    public Capitaine(){
    }

        
    /**
     * méthode a appeler en debut de chaque manche.
     * incremente de un le compteur de manche.
     */
    public void ajouterUneManche(){
        mancheActuel++;
    }
    
    /**
     * L'oxygene est consommé au debut du tour
     * le nombre consommé depend du nombre de trésor porté par le joueur actif
     * On passe en parametre le nombre de trésor porté du joueur
     * On déduit le nombre de trésor du nombre d'oxygene.
     * @param consommation 
     * @return On retourne la nouvelle valeur d'oxygene (int).
     */
    public int fournirOxygene(int consommation){
        this.oxygene -= consommation;
        return oxygene;
    }
    
    public int getOxygene() {
        return oxygene;
    }

    public void setOxygene(int oxygene) {
        this.oxygene = oxygene;
    }

    public int getManche() {
        return mancheActuel;
    }

    public void setManche(int manche) {
        this.mancheActuel = manche;
    }
    
    //test 
    /*
    public static void main(String[] args){
        Capitaine b = new Capitaine();
        System.out.println(b.oxygene);
        b.fournirOxygene(5);
        System.out.println(b.oxygene);
    }*/
}
