package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class MySQLUsersDao implements Users{

    private Connection connection;


    public MySQLUsersDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }catch (SQLException e){
            throw new RuntimeException("Runtime Error!", e);
        }
    }



    @Override
    public User findByUsername(String username) {
        try {
            //confused on how to do a prepared statment?
            String sql = "SELECT * FROM username WHERE name LIKE ?";
            String searchTermWithWildcards = "%" + username + "%";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, searchTermWithWildcards);

            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            // do something with the search results


        } catch (SQLException e){
            throw new RuntimeException("Error finding user.", e);
        }
//        return User; ????
    }



    @Override
    public Long insert(User user) {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(createInsertQuery(user), Statement.RETURN_GENERATED_KEYS);
            //why is this red? ^
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1); //which index do I return?
        } catch (SQLException e){
            throw new RuntimeException("Error creating new user.", e);
        }
//        return createUserFromResults(rs); ???
    }




}
