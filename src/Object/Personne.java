package Object;

import AccesData.DatabaseConnection;

import javax.xml.crypto.Data;
import java.lang.reflect.Executable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Personne {
    private String mail, tel, nom, prenom;
    private float compte;
    private int id;

    public Personne(int id, String mail, String tel, String nom, String prenom, float compte){
        this.id = id;
        this.mail = mail;
        this.tel = tel;
        this.nom = nom;
        this.prenom = prenom;
        this.compte = compte;
        addPersonne();
    }
    public Personne(){}

    private void addPersonne() {
        try {
            Connection data = DatabaseConnection.createData();
            Statement state = data.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public float getCompte() {
        return compte;
    }

    public void setCompte(float compte) {
        this.compte = compte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
