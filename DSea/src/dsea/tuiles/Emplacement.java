/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsea.tuiles;

/**
 * Represente les emplacements donc le plateau de jeu
 * il y'a 32 emplacements au debut du jeu
 * Chaques emplacements est rempli d'une tuile
 * Tuile Trésor ou DisqueBlanc quand un trésor est ramasser
 * Si un emplacement est rempli d'une tuile disqueblanc au d'une manche ce
 * derniers est enlevé.
 * @author Madxyz
 */
public class Emplacement {
    private static int numero;
    
    /**
     * donne un numéro a chaque emplacement crée
     * maximum 32 emplacements
     */
    public Emplacement(){
        if(this.numero < 33){numero++;}
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //test
    /*
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
                System.out.println("A l'emplacement nm°"+ (i+1) +" la tuile la valeur du trésor est de : "+ emplacement[i][0]);
            }
            
            if (i > 7 && i < 16){
                emplacement[i][0] = t.donnerValeur(2);
                System.out.println("A l'emplacement nm°"+ (i+1) +" la tuile la valeur du trésor est de : "+ emplacement[i][0]);
            }
            
            if (i > 15 && i < 24){
                emplacement[i][0] = t.donnerValeur(3);
                System.out.println("A l'emplacement nm°"+ (i+1) +" la tuile la valeur du trésor est de : "+ emplacement[i][0]);
            }
            
            if (i > 23 && i < 32){
                emplacement[i][0] = t.donnerValeur(4);
                System.out.println("A l'emplacement nm°"+ (i+1) +" la tuile la valeur du trésor est de : "+ emplacement[i][0]);
            }
        }
    }*/    
}
