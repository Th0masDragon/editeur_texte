package fr.iut.editeur.document;

public class Document {

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



    @Override
    public String toString() {
        return this.texteDocument;
    }
}
