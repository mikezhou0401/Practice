package main.webapp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    List<Connection> list = new ArrayList<>();
    int size;

    public ConnectionPool(int size) {
        this.size = size;
    }

    public void init() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功 ！");
            for (int i = 0; i < size; i++) {
                Connection c = DriverManager.getConnection("jdbc:mysql://192.168.1.169:4006/bpm_query?characterEncoding=UTF-8",
                        "yunsom_scm", "T0NqKo42lK");
                list.add(c);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public synchronized Connection getConnection() {
        while (list.isEmpty()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Connection c = list.remove(0);
        return c;
    }

    public synchronized void returnConnection(Connection c) {
        list.add(c);
        this.notifyAll();
    }
}


