package Test;

import AccesData.DatabaseConnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class TestData {
    public static void main(String[] args){
        try {
            Connection data = DatabaseConnection.createData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
