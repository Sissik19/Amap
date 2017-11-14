package DAO;

import Object.Cheque;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOCheque extends DAO<Cheque> {

//CTRL + SHIFT + O pour générer les imports

        public DAOCheque(Connection conn) {
            super(conn);
        }

        public boolean create(Cheque obj) {
            return false;
        }

        public boolean delete(Cheque obj) {
            return false;
        }


        public boolean update(Cheque obj) {
            return false;
        }


        public Cheque find(int id) {
            Cheque Cheque = new Cheque();
            try {
                ResultSet result = this.connect.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Cheque WHERE id = " + id);
                if(result.first())
                    Cheque = new Cheque(
                            id,
                            result.getString("elv_nom"),
                            result.getString("elv_prenom"
                            ));

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return Cheque;

        }

    }
}
