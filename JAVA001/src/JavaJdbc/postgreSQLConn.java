package JavaJdbc;

import java.sql.*;



public class postgreSQLConn {
    public static void main(String[] args) {

        Connection connection = CreateConnection();

        if (connection != null){
         getMethod(connection);
  //         updateData(connection);
//         deleteData(connection);
            closeConnection(connection);
        }}
         public static Connection CreateConnection(){
        Connection connection=null;
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String username = "postgres";
            String password = "Sami2020";
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                throw new RuntimeException();
            }
             return connection;
        }
        public static void getMethod (Connection connection){
            try {
                Statement statement = connection.createStatement();
                String query = "SELECT * FROM classInfo";
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    int id = resultSet.getInt("ID");
                    String fName = resultSet.getString("Name");
                    String Email = resultSet.getString("Email");
                    String Phone = resultSet.getString("Phone");
                    String Type = resultSet.getString("Type");
                    System.out.println(id + " " + fName + " " + Email + " " + Phone + " " + Type);
                }
                resultSet.close();
                statement.close();
            } catch (SQLException e) {
                System.out.println("Failed to execute Query");
                e.printStackTrace();
            }}
    public static void deleteData(Connection connection){
        try {
          String query="DELETE FROM classinfo WHERE id=1";
          PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch (SQLException e){ e.printStackTrace();}
        }
        public static void updateData(Connection connection){
        try{
            String query = "UPDATE classInfo SET Name = ?, Email = ? Where id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1,"John Doe");
            preparedStatement.setString(2,"JOHN.DOE@gmail.com");
            preparedStatement.setInt(3,6);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Data Updated Success");

        }catch (SQLException e){

            e.printStackTrace();
        }
        }

    public static void closeConnection(Connection connection){
        try {
            if (connection !=null){
                connection.close();
                System.out.println("connection close success");
            }}catch (SQLException e){
            System.out.println("failed to excute query");
            e.printStackTrace();
        }
    }
}
