/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author yudis
 */
//public class DatabaseController {
//    static DatabaseHandler conn = new DatabaseHandler();
//
// // SELECT ALL from table users
//    public static ArrayList<User> getAllUsers() {
//       ArrayList<User> users = new ArrayList<>();
//       conn.connect();
//       String query = "SELECT * FROM users";
//       try {
//           Statement stmt = conn.con.createStatement();
//           ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                User user = new User();
//                user.setUserId(rs.getInt("ID"));
//                user.setUserName(rs.getString("Name"));
//                user.setUserEmail(rs.getString("Email"));
//                user.setUserGender(rs.getString("Gender"));
//                // user.setUserCategory(rs.("Age"));
//                user.setUserFollowers(rs.getInt ("follower"));
//                users.add(user);
//           }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return (users);
//    }
//
//   //  SELECT WHERE
//    public static User getUser(String name, String address) {
//        conn.connect();
//        String query = "SELECT * FROM users WHERE Name='" + name + "'&&Address='" + address + "'";
//        User user = new User();
//       try {
//            Statement stmt = conn.con.createStatement();
//           ResultSet rs = stmt.executeQuery(query);
//           while (rs.next()) {
////               user.setId(rs.getInt("ID"));
////               user.setName(rs.getString("Name"));
////               user.setAddress(rs.getString("Address"));
////               user.setPhone(rs.getString("Phone"));
////                user.setAge(rs.getInt("Age"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return (user);
//    }
//    
//    // INSERT
//   public static boolean insertNewUser(User user) {
//        conn.connect();
//       String query = "INSERT INTO users VALUES(?,?,?,?,?)";
//     // try {
////            PreparedStatement stmt = conn.con.prepareStatement(query);
////            stmt.setInt(1, user.getId());
////           stmt.setString(2, user.getName());
////            stmt.setString(3, user.getAddress());
////            stmt.setString(4, user.getPhone());
////           stmt.setInt(5, user.getAge());
////           stmt.executeUpdate();
//            return (true);
//      //  } catch (SQLException e) {
//        //    e.printStackTrace();
//            return (false);
//        }
//    }
//
//    // UPDATE
//    public static boolean updateUser(User user) {
//        conn.connect();
////        String query = "UPDATE users SET Name='" + user.getName() + "', "
////                + "Address='" + user.getAddress() + "', "
////                + "Phone='" + user.getPhone() + "' "
////                + "WHERE ID='" + user.getId() + "'";
////        try {
////            Statement stmt = conn.con.createStatement();
////            stmt.executeUpdate(query);
////            return (true);
////        } catch (SQLException e) {
////            e.printStackTrace();
////            return (false);
////        }
////    }
//
//    // DELETE
//   // public static boolean deleteUser(String name) {
//       conn.connect();
//
//   //     String query = "DELETE FROM users WHERE Name='" + name + "'";
//        try {
//            Statement stmt = conn.con.createStatement();
//  //          stmt.executeUpdate(query);
//            return (true);
//       } catch (SQLException e) {
//           e.printStackTrace();
//            return (false);
//        }
//    }
//}
