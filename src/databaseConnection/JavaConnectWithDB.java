package databaseConnection;

import java.sql.*;

public class JavaConnectWithDB {
    public static void main(String[] args) throws SQLException {
// TODO Auto-generated method stub



        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/bollywood";
            String user="root";
            String password="root";

            Connection con= DriverManager.getConnection(url, user, password);
//String query="Insert into movie(name,actor,actress,director,releaseDate,ratingPoint) values (?,?,?,?,?,?);";
            String query="Select * from movie";



            PreparedStatement pstmt=con.prepareStatement(query);


            ResultSet rst=pstmt.executeQuery();
//pstmt.executeQuery();
            while(rst.next()) {
                String name=rst.getString("name");
                String actors=rst.getString("actor");
                String actores=rst.getString("actress");



                System.out.println(name);
                System.out.println(actors);
                System.out.println(actores);



            }

        } catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }


    }


}
