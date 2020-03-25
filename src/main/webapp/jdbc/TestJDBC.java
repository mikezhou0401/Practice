package main.webapp.jdbc;

import main.webapp.charactor.Hero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

public class TestJDBC {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功 ！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root", "admin");
             Statement s = c.createStatement();
        ) {
            Random r = new Random();

            for (int i = 0; i < 100; i++) {
                String name = "hero" + i;
                float hp = r.nextInt(1000);
                int damage = r.nextInt(100);
                String sql = "Insert into hero values(null," +"name" + "," + hp + "," + damage + ")";
                s.execute(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
