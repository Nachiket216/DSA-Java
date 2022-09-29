package com.nachiket.Practice2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ConnectDB {
    static Connection connection= null;
    static String databaseName = "";
    static String  url = "jdbc:mysql://localhost:3306/"+databaseName;

    static String username = "root";
    static String password = "root";

    public static void main(String[] args)
        throws InstantiationException,IllegalAccessException,ClassNotFoundException,SQLException{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url,username,password);
        PreparedStatement ps=connection.prepareStatement("INSERT INTO 'studentdatabase'.'student'('name')VALUES('michael clark');");

        int status = ps.executeUpdate();

        if(status!=0){
            System.out.println("Database was connected");
            System.out.println("Record was INSERTED");
        }
        }
}
