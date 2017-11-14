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
}
