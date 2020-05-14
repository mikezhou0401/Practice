package main.webapp.jdbc;

import main.webapp.charactor.Hero;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class TestJDBC {
    public static void main(String[] args) {
        String sql = "select * from  wf_task where  enterprise_id=211";
        //execute(sql);
        list(5, 3);
    }


    public static void list(int start, int count) {
        String sql = "select * from  wf_task where  enterprise_id=211";
        String sql1 = sql + " limit " + start + "," + count;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功 ！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection c = DriverManager.getConnection("jdbc:mysql://192.168.1.169:4006/bpm_query?characterEncoding=UTF-8",
                "yunsom_scm", "T0NqKo42lK");
             Statement s = c.createStatement();

        ) {
            c.setAutoCommit(false);
            s.execute(sql);
            s.execute(sql1);
            c.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
