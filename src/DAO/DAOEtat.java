package DAO;

import Object.Etat;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOEtat extends DAO<Etat> {

//CTRL + SHIFT + O pour générer les imports

    public DAOEtat(Connection conn) {
        super(conn);
    }

    public boolean create(Etat obj) {
        return false;
    }

    public boolean delete(Etat obj) {
        return false;
    }


    public boolean update(Etat obj) {
        return false;
    }


    public Etat find(int id) {
        Etat Etat = new Etat();
        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Etat WHERE id = " + id);
            if(result.first())
                Etat = new Etat(
                        id,
                        result.getString("etat")
                );

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Etat;

    }

}

