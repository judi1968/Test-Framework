package model;

import java.sql.Date;

import jframework.web.JFile;


public class Voiture {
    public String nom;
    public String prenom;
    public int numero;
    public Date dateSortie;
    public Chauffeur chauffeur;
    public Pneu[][] pneus;
    public JFile sary;
    public Voiture() {
    }

    
}
 