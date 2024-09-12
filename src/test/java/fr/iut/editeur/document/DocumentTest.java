package fr.iut.editeur.document;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentTest {

    private Document document;

    @BeforeEach
    public void setUp() {
        document = new Document();
    }

    @Test
    public void testInitialisation() {
        assertEquals("", document.getTexte());
    }

    @Test
    public void testSetTexte() {
        document.setTexte("Hello, World!");
        assertEquals("Hello, World!",document.getTexte());
    }

    @Test
    public void testAjouter() {
        document.ajouter("Hello");
        assertEquals("Hello", document.getTexte());
        document.ajouter(", World!");
        assertEquals("Hello, World!", document.getTexte());
    }

    @Test
    public void testRemplacer() {
        document.setTexte("Hello, World!");
        document.remplacer(7, 11, "Universe");
        assertEquals("Hello, Universe!", document.getTexte());
    }

    @Test
    public void testEffacer() {
        document.setTexte("Hello, World!");
        document.effacer(5, 7);
        assertEquals("Helloorld!", document.getTexte());
    }

    @Test
    public void testMajuscules() {
        document.setTexte("Hello, World!");
        document.majuscules(7, 12);
        assertEquals("Hello, WORLD", document.getTexte());
    }

    @Test
    public void testClear() {
        document.setTexte("Hello, World!");
        document.clear();
        assertEquals("", document.getTexte());
    }

    @Test
    public void testInsererDebut() {
        document.setTexte("World!");
        document.inserer(0, "Hello, ");
        assertEquals("Hello, World!", document.getTexte());
    }

    @Test
    public void testInsererMilieu() {
        document.setTexte("Hello World!");
        document.inserer(5, ",");
        assertEquals("Hello, World!", document.getTexte());
    }

    @Test
    public void testInsererFin() {
        document.setTexte("Hello");
        document.inserer(5, ", World!");
        assertEquals("Hello, World!", document.getTexte());
    }

    @Override
    public String toString() {
        return document.getTexte();
    }
}