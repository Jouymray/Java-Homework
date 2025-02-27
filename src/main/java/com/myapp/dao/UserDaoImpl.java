package com.myapp.dao;

import com.myapp.model.User;
import com.myapp.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser(User user) {
        String sql = "INSERT INTO users (email, password, birthday, new_student, college, major, color, terms) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getBirthday());
            ps.setString(4, user.getNewStudent());
            ps.setString(5, user.getCollege());
            ps.setString(6, user.getMajor());
            ps.setString(7, user.getColor());
            ps.setString(8, user.getTerms());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
