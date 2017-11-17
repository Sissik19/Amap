package Object;

import AccesData.DatabaseConnection;
import DAO.DAOCheque;
import DAO.DAOPersonne;

import java.util.Date;

public class Cheque {
    private int id;
    private float montant;
    private Date date;
    private Personne personne;

    public Cheque(int id, float montant, Date date, int personne){
        this.id = id;
        this.montant = montant;
        this.date = date;
        DAOPersonne dao = new DAOPersonne(DatabaseConnection.createData());
        this.personne = dao.find(personne);
    }
    public Cheque(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
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
}
