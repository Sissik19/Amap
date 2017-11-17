package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import Object.Commande;

    public class DAOCommande extends DAO<Commande> {

//CTRL + SHIFT + O pour générer les imports

        public DAOCommande(Connection conn) {
            super(conn);
        }

        public boolean create(Commande obj) {
            return false;
        }

        public boolean delete(Commande obj) {
            return false;
        }


        public boolean update(Commande obj) {
            return false;
        }


        public Commande find(int id) {
            Commande Commande = new Commande();
            try {
                ResultSet result = this.connect.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Commande WHERE id = " + id);
                if(result.first())
                    Commande = new Commande(
                            id,
                            result.getFloat("prix"),
                            result.getDate("date"),
                            result.getInt("personne"),
                            //result.getArray(???),
                            result.getInt("etat")
                    );

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return Commande;

        }

    }


}
