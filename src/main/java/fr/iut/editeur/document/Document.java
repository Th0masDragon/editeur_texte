package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }


    public void effacer(int debut, int fin) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        String partie = texte.substring(debut, fin);
        texte = partieGauche + partie.toUpperCase() + partieDroite;
    }

    public void clear() {
        texte = "";
    }

    public void inserer(int place, String ajout){
        if(place==0){
            String textegarde=texte;
            this.clear();
            texte=ajout+textegarde;
        }
        else {
            String partiegauche = texte.substring(0,place);
            String partiedroite = texte.substring(place);
            texte=partiegauche+ajout+partiedroite;
        }
    }



    @Override
    public String toString() {
        return this.texte;
    }
}
