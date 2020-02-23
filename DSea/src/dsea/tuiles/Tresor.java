/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsea.tuiles;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Represente les trésors donc les valeurs des tuiles sur le plateau
 * Il y'a 4 niveau different qui represente la profondeur
 * Plus on s'eloigne (donc on va en profondeur) plus les points assigné aleatoirement
 * sont élevés
 * @author Madxyz
 */
public class Tresor {
    Random alea = new Random();
        
    private int[] nv1 =  new int[]{0,0,1,1,2,2,3,3};
    private int[] nv2 =  new int[]{4,4,5,5,6,6,7,7};
    private int[] nv3 =  new int[]{8,8,9,9,10,10,11,11};
    private int[] nv4 =  new int[]{12,12,13,13,14,14,15,15};
    
    ArrayList<Integer> niveau1 = IntStream.of(nv1).boxed().collect(Collectors.toCollection(ArrayList::new));
    ArrayList<Integer> niveau2 = IntStream.of(nv2).boxed().collect(Collectors.toCollection(ArrayList::new));
    ArrayList<Integer> niveau3 = IntStream.of(nv3).boxed().collect(Collectors.toCollection(ArrayList::new));
    ArrayList<Integer> niveau4 = IntStream.of(nv4).boxed().collect(Collectors.toCollection(ArrayList::new));
    
    /**
     * Assigne aleatoirement une valeur a une tuile en fonction du niveau passer
     * en parametre 
     * Le niveau peut être compris entre 1 et 4
     * il y'a 8 valeurs pour chaque niveau
     * @param niveau
     * une valeur(int) est retourné en fonction du niveau de la tuile.
     * @return 
     */
    public int donnerValeur(int niveau){
        int temp;
        int valeur = 0;

        if (niveau >= 1 && niveau <=4 ){
            switch (niveau) {

              case 1:
                    //index alea
                temp = alea.ints(0,niveau1.size()).findFirst().getAsInt();
                    //get valeur a l'index alea
                valeur = niveau1.get(temp);
                    //remove la valeur a l'index alea
                niveau1.remove(temp);
                break;

              case 2:
                temp = alea.ints(0,niveau2.size()).findFirst().getAsInt();
                valeur = niveau2.get(temp);
                niveau2.remove(temp);
                break;

              case 3:
                temp = alea.ints(0,niveau3.size()).findFirst().getAsInt();
                valeur = niveau3.get(temp);
                niveau3.remove(temp);
                break;

              case 4:
                temp = alea.ints(0,niveau4.size()).findFirst().getAsInt();
                valeur = niveau4.get(temp);
                niveau4.remove(temp);
                break;
            }
        }
        return valeur; 
    }
    
    /*test
      public static void main(String[] args){
      
          Tresor tr = new Tresor();
          
          int x0 = tr.donnerValeur(1);
          int x1 = tr.donnerValeur(1);
          int x2 = tr.donnerValeur(1);
          int x3 = tr.donnerValeur(1);
          int x4 = tr.donnerValeur(1);
          int x5 = tr.donnerValeur(1);
          int x6 = tr.donnerValeur(1);
          int x7 = tr.donnerValeur(1);
          
          System.out.println(x0 +" "+ x1 +" "+ x2 +" "+ x3 +" "+ x4
          +" "+ x5 +" "+ x6 +" "+ x7);
          System.out.println(tr.niveau1);
      }*/
}
