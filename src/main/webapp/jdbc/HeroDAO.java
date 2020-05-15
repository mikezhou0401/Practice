package main.webapp.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HeroDAO implements DAO {

    public static Connection getConnection() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:mysql://192.168.1.169:4006/bpm_query?characterEncoding=UTF-8",
                "yunsom_scm", "T0NqKo42lK");
        return c;
    }

    public HeroDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功 ！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getTotal() {
        int total=0;
        Hero hero = null;
        String sql = "select count(*) from  hero ";
        try (Connection c = getConnection();
             Statement s = c.createStatement();
        ) {
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
               total++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return total;
    }

    @Override
    public void add(Hero hero) {
        String sql = "insert into hero values(null ,?,?,?)";
        try (Connection c = getConnection();
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

    @Override
    public void delete(Hero hero) {
        String sql = "delete from hero  where id = ?";

        try (Connection c = getConnection();
             PreparedStatement s = c.prepareStatement(sql);
        ) {
            s.setInt(1, hero.id);
            s.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Hero hero) {
        String sql = "update  hero  set name=?,hp=?,damage=? where id = ?";

        try (Connection c = getConnection();
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

    @Override
    public List<Hero> list() {
        return list(0, Short.MAX_VALUE);
    }

    @Override
    public List<Hero> list(int start, int count) {
        List<Hero> list = new ArrayList<>();
        String sql = "select * from hero limit ?,?";
        try (Connection c = getConnection();
             PreparedStatement s = c.prepareStatement(sql);
        ) {
            s.setInt(1, start);
            s.setInt(2, count);
            ResultSet rs = s.executeQuery();
            while (rs.next()) {
                Hero h = new Hero();
                h.id = rs.getInt(1);
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
