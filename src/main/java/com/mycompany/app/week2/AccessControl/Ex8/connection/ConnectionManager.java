package com.mycompany.app.week2.AccessControl.Ex8.connection;

import java.util.Vector;

public class ConnectionManager {
    public static Vector<Connection> conn;
    public static int NUMBER_OF_CONN = 10;

    public static Connection getConn() {
        if (conn == null) {
            conn = new Vector<Connection> ();
            for (int i = 0 ; i < NUMBER_OF_CONN; i++) {
                conn.add(new Connection());
            }
        }
        Connection return_conn;
        if (!conn.isEmpty()) {
            return_conn = conn.get(0);
            conn.remove(0);
        } else {
            return_conn = null;
        }
        System.out.println(conn.size());
        return return_conn;
    }
}

class Connection {}