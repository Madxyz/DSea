/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsea.tuiles;

/**
 * Remplace les tuiles trésors quand celle-ci sont ramasser par les joueurs
 * Elle sont supprimer de la piste au debut de chaque manche
 * Sa donne la possibilité aux joueurs de se debarasser d'un tresor a ces emplacements
 * Sa permet de raccourcir la piste et ainsi atteindre des cases plus lointaine
 * @author Madxyz
 */
public class DisqueBlanc {
    private boolean occuper;

    public boolean isOccuper() {
        return occuper;
    }

    //false : libre >activté
    //true : occupé >desactivé
    public void setOccuper(boolean occuper) {
        this.occuper = occuper;
    }
}
