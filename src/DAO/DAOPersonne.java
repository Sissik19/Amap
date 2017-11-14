package DAO;

import Object.Personne;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOPersonne extends DAO<Personne> {

//CTRL + SHIFT + O pour générer les imports

    public DAOPersonne(Connection conn) {
        super(conn);
    }

    public boolean create(Personne obj) {
        return false;
    }

    public boolean delete(Personne obj) {
        return false;
    }


    public boolean update(Personne obj) {
        return false;
    }


    public Personne find(int id) {
        Personne Personne = new Personne();
        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Personne WHERE id = " + id);
            if(result.first())
                Personne = new Personne(
                        id,
                        result.getString("mail"),
                        result.getString("tel"),
                        result.getString("nom"),
                        result.getString("prenom"),
                        result.getFloat("compte")

                );

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Personne;

    }

}

