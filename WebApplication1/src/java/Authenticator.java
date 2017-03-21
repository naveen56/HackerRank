
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author naveen
 */
public class Authenticator {

    String username;
    String password;
    Connection con;
    boolean admin;

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public boolean auth() {
        boolean flag = false;

        try {
            PreparedStatement ps = con.prepareStatement(
                    "select * from Users where username=? and password=?");
            ps.setString(1, username.trim());
            ps.setString(2, password.trim());
            System.out.println(username+" "+password);
            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(Authenticator.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

}
