package fr.iut.editeur.document;
/**
 * classe Document, elle contient les choses
 */
public class Document {

    /**
     * TexteDocument est le texte du document en 1 big string
     */
    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }
	
    public String getTexte() {
        return texteDocument;
    }

    public void setTexte(String texte) {
        this.texteDocument = texte;
    }

    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    /**
     * Description de la méthode
     * @param debut indice du début du remplacement
     * @param fin indice de la fin du remplacement
     * @param remplacement ce que l'on veut mettre
     * @return void, on fait juste le remplacement
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        texteDocument = partieGauche + remplacement + partieDroite;
    }


    public void effacer(int debut, int fin) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        texteDocument = partieGauche + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        String partie = texteDocument.substring(debut, fin);
        texteDocument = partieGauche + partie.toUpperCase() + partieDroite;
    }

    public void clear() {
        texteDocument = "";
    }

    public void inserer(int place, String ajout){
        if(place==0){
            String textegarde=texteDocument;
            this.clear();
            texteDocument=ajout+textegarde;
        }
        else {
            String partiegauche = texteDocument.substring(0,place);
            String partiedroite = texteDocument.substring(place);
            texteDocument=partiegauche+ajout+partiedroite;
        }
    }



    @Override
    public String toString() {
        return this.texteDocument;
    }
}
