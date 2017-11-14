package AccesData;

import java.sql.*;

public class DatabaseConnection {
    private static Connection data;

    public static Connection createData(){
        if(data == null) {
            try {
                Class.forName("org.h2.Driver");

                String url = "jdbc:h2:D:/MesProjets/AMAP/database";
                String user = "";
                String passwd = "";

                Connection conn = DriverManager.getConnection(url, user, passwd);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return data;
    }
    public static Connection getData(){
        if(data!=null) {
            return data;
        }
        else{
            System.out.println("Data not create");
            return null;
        }
    }
}

