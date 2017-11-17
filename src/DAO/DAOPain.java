package DAO;

import Object.Pain;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOPain extends DAO<Pain> {

//CTRL + SHIFT + O pour générer les imports

    public DAOPain(Connection conn) {
        super(conn);
    }

    public boolean create(Pain obj) {
        return false;
    }

    public boolean delete(Pain obj) {
        return false;
    }


    public boolean update(Pain obj) {
        return false;
    }


    public Pain find(int id) {
        Pain Pain = new Pain();
        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Pain WHERE id = " + id);
            if(result.first())
                Pain = new Pain(
                        id,
                        result.getString("cereale"),
                        result.getString("type"),
                        result.getFloat("poid"),
                        result.getFloat("prix")
                );

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Pain;

    }

}

