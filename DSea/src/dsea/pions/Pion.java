/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsea.pions;

/**
 * Represente le joueur sur le plateau de jeu
 * La couleur est assigné aleatoirement 
 * {"Blanc","Noir","Jaune","Bleu","Violet"}
 * 
 * @author Madxyz
 */
public class Pion {
    private final String tabCouleur[] = {"Blanc","Noir","Jaune","Bleu","Violet"};
    private String couleur;
    private static int index = 0;
    

    private boolean occuper;
    private boolean liberer = false ;

    public Pion(){
        if(index < 5){
            this.couleur = tabCouleur[index];
            index++;
        }
    }
        
    //public void donnerCouleur(){}

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public boolean isOccuper() {
        return occuper;
    }

    public boolean isLiberer() {
        return liberer;
    }      
}
