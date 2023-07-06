package JavaJdbc;

import java.sql.*;

public class jdbsexample {
    public static void main(String[] args) {
        getMet();
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "Sami2020";
    }
    public static void getMet(){
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "Sami2020";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection= DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            String query = "SELECT * FROM classinfo";
            ResultSet resultSet= statement.executeQuery(query);
            while (resultSet.next()){
                int id=resultSet.getInt("ID");
                String fName=resultSet.getString("Name");
                String  Email=resultSet.getString("Email");
                String Phone=resultSet.getString("Phone");
                String Type=resultSet.getString("Type");
                System.out.println(id+"  "+fName+"  "+Email+"  "+Phone+"  "+Type);
            }
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
