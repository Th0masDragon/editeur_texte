package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class Commandeinserer extends CommandeDocument{
    public Commandeinserer(Document d,String[] p){
        super(d,p);
    }
    public void executer(){
        document.inserer(Integer.parseInt(parameters[1]),parameters[2]);
        super.executer();
    }

}
