package models;

import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static java.sql.DriverManager.*;

public class MySQLAdsDao implements Ads {

    private Connection connection;


    public MySQLAdsDao(Config config){
        try {
            registerDriver(new Driver());
            this.connection = getConnection(
                    config.getUrl(),
                    config.getUSer(),
                    config.getPassword()
            );
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
//    retrieve ad method from database
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM ads")) {
                while (rs.next()) {
                    ads.add(new Ad(
                            rs.getLong("id"),
                            rs.getLong("user_id"),
                            rs.getString("title"),
                            rs.getString("description")
                    ));
                }
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();

        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        long lastInsertedId = 0;
        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(String.format("INSERT INTO ads (user_id, title, description) VALUES ('%d','%s','%s')", ad.getUserId(), ad.getTitle(), ad.getDescription()), Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            lastInsertedId = rs.getLong(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lastInsertedId;
    }
}
