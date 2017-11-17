package Object;

import AccesData.DatabaseConnection;
import DAO.DAOEtat;
import DAO.DAOPersonne;

import java.util.ArrayList;
import java.util.Date;

public class Commande {
    private int id;
    private float prix;
    private Date date;
    private Personne personne;
    private ArrayList<Pain> pains;
    private Etat etat;

    public Commande(){}
    public Commande(int id, float prix, Date date, int personne, ArrayList<Pain> pains, int etat){
        this.id = id;
        this.prix = prix;
        this.date = date;
        DAOPersonne daoPersonne = new DAOPersonne(DatabaseConnection.createData());
        this.personne = daoPersonne.find(personne);
        this.pains = pains;
        DAOEtat daoEtat = new DAOEtat(DatabaseConnection.createData());
        this.etat = daoEtat.find(etat);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public ArrayList<Pain> getPains() {
        return pains;
    }

    public void setPains(ArrayList<Pain> pains) {
        this.pains = pains;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
}
