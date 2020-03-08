/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsea.controleur;

import dsea.pions.Des;
import dsea.pions.Joueur;
import dsea.tuiles.Emplacement;
import dsea.tuiles.Tresor;

/**
 *
 * @author Madxyz
 */
public class DSea {

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] emplacement = new int[32][1];
        Tresor t = new Tresor();
        
        for (int i=0 ; i<32; i++){
            //cree les emplacements
            //Emplacement e = new Emplacement();
            //emplacement[i][0]= e.getNumero();
            
            //met des tuiles trésors en fonction du niveau 
            // 1 : dans les 8 premiers emplacements
            // 2 : dans les 8 deuxiemes emplacements
            // 3 : dans les 8 troisiémes emplacements
            // 4 : dans les 8 derniers emplacements
            if ( i < 8 ){
                emplacement[i][0] = t.donnerValeur(1);
                System.out.println("A l'emplacement nm°"+ (i+1) +" la tuile a la valeur du trésor est de : "+ emplacement[i][0]);
            }
            
            if (i > 7 && i < 16){
                emplacement[i][0] = t.donnerValeur(2);
                System.out.println("A l'emplacement nm°"+ (i+1) +" la tuile a la valeur du trésor est de : "+ emplacement[i][0]);
            }
            
            if (i > 15 && i < 24){
                emplacement[i][0] = t.donnerValeur(3);
                System.out.println("A l'emplacement nm°"+ (i+1) +" la tuile a la valeur du trésor est de : "+ emplacement[i][0]);
            }
            
            if (i > 23 && i < 32){
                emplacement[i][0] = t.donnerValeur(4);
                System.out.println("A l'emplacement nm°"+ (i+1) +" la tuile a la valeur du trésor est de : "+ emplacement[i][0]);
            }
        }
        Joueur p1 = new Joueur();
        Joueur p2 = new Joueur();
        Joueur p3 = new Joueur();
        Joueur p4 = new Joueur();
        Joueur p5 = new Joueur();
        System.out.println(p1.getCouleur());
                System.out.println(p2.getCouleur());
                        System.out.println(p3.getCouleur());
                                System.out.println(p4.getCouleur());
                                        System.out.println(p5.getCouleur());
    }
    
}
