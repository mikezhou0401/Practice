package main.webapp.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TestJDBC {
    public static void main(String[] args) {
        Hero h = get(1);
        System.out.println(h.name);
    }

    public static Hero get(int id) {
        Hero hero = null;
        String sql = "select * from  hero where  id = ?";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功 ！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection c = DriverManager.getConnection("jdbc:mysql://192.168.1.169:4006/bpm_query?characterEncoding=UTF-8",
                "yunsom_scm", "T0NqKo42lK");
             PreparedStatement s = c.prepareStatement(sql);
        ) {
            s.setInt(1, id);
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()) {
                hero = new Hero();
                hero.id = rs.getInt("id");
                hero.name = rs.getString("name");
                hero.hp = rs.getFloat("hp");
                hero.damage = rs.getInt("damage");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hero;
    }

    public static void add(Hero hero) {
        String sql = "insert into hero values(null ,?,?,?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功 ！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection c = DriverManager.getConnection("jdbc:mysql://192.168.1.169:4006/bpm_query?characterEncoding=UTF-8",
                "yunsom_scm", "T0NqKo42lK");
             PreparedStatement s = c.prepareStatement(sql);
        ) {
            s.setString(1, hero.name);
            s.setFloat(2, hero.hp);
            s.setInt(3, hero.damage);
            s.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Hero hero) {
        String sql = "delete from hero  where id = ?";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功 ！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection c = DriverManager.getConnection("jdbc:mysql://192.168.1.169:4006/bpm_query?characterEncoding=UTF-8",
                "yunsom_scm", "T0NqKo42lK");
             PreparedStatement s = c.prepareStatement(sql);
        ) {
            s.setInt(1, hero.id);
            s.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Hero hero) {
        String sql = "update  hero  set name=?,hp=?,damage=? where id = ?";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功 ！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection c = DriverManager.getConnection("jdbc:mysql://192.168.1.169:4006/bpm_query?characterEncoding=UTF-8",
                "yunsom_scm", "T0NqKo42lK");
             PreparedStatement s = c.prepareStatement(sql);
        ) {
            s.setString(1, hero.name);
            s.setFloat(2, hero.hp);
            s.setInt(3, hero.damage);
            s.setInt(4, hero.id);
            s.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static List<Hero> list() {
        List<Hero> list = new ArrayList<>();
        String sql = "select * from hero ";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功 ！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection c = DriverManager.getConnection("jdbc:mysql://192.168.1.169:4006/bpm_query?characterEncoding=UTF-8",
                "yunsom_scm", "T0NqKo42lK");
             PreparedStatement s = c.prepareStatement(sql);
        ) {

            ResultSet rs = s.executeQuery();
            while (rs.next()) {
                Hero h = new Hero();
                h.id=rs.getInt(1);
                h.name = rs.getString(2);
                h.hp = rs.getFloat(3);
                h.damage = rs.getInt(4);
                list.add(h);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
