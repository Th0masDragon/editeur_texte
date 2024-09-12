package fr.iut.editeur.document;

public class Document {

    private String contentDocument;

    public Document() {
        this.contentDocument = "";
    }
	
    public String getContentDocument() {
        return contentDocument;
    }

    public void setContentDocument(String contentDocument) {
        this.contentDocument = contentDocument;
    }

    public void ajouter(String texte) {
        this.contentDocument += texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = contentDocument.substring(0, debut);
        String partieDroite = contentDocument.substring(fin + 1);
        contentDocument = partieGauche + remplacement + partieDroite;
    }


    public void effacer(int debut, int fin) {
        String partieGauche = contentDocument.substring(0, debut);
        String partieDroite = contentDocument.substring(fin + 1);
        contentDocument = partieGauche + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String partieGauche = contentDocument.substring(0, debut);
        String partieDroite = contentDocument.substring(fin + 1);
        String partie = contentDocument.substring(debut, fin);
        contentDocument = partieGauche + partie.toUpperCase() + partieDroite;
    }

    public void clear() {
        contentDocument = "";
    }

    public void minuscule(int debut, int fin){
        String partieGauche = contentDocument.substring(0, debut);
        String partieDroite = contentDocument.substring(fin + 1);
        String partie = contentDocument.substring(debut, fin);
        contentDocument = partieGauche + partie.toLowerCase() + partieDroite;
    }

    public void inserer(int place, String ajout){
        if(place==0){
            String textegarde= contentDocument;
            this.clear();
            contentDocument =ajout+textegarde;
        }
        else {
            String partiegauche = contentDocument.substring(0,place);
            String partiedroite = contentDocument.substring(place);
            contentDocument =partiegauche+ajout+partiedroite;
        }
    }



    @Override
    public String toString() {
        return this.contentDocument;
    }
}
