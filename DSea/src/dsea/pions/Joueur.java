/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsea.pions;

import dsea.tuiles.Tresor;
import java.util.List;

/**
 * Represente le joueur et son pion sur le plateau de jeu
 * La couleur est assigné aleatoirement 
 * {"Blanc","Noir","Jaune","Bleu","Violet"}
 * 
 * @author Madxyz
 */
public class Joueur {
    private final String tabCouleur[] = {"Blanc","Noir","Jaune","Bleu","Violet"};
    private String couleur;
    private static int index = 0;
    
    private List<Tresor> sacTresor;

    public Joueur(){
        if(index < 5){
            this.couleur = tabCouleur[index];
            index++;
        }else{System.out.println("Vous êtes deja 5 joueurs !");}
    }
        
    //public void donnerCouleur(){}

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }    
}
