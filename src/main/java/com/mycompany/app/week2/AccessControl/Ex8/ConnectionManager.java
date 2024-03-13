package com.mycompany.app.week2.AccessControl.Ex8;

class ConnectionManager {
    private ConnectionManager() {}
    // (1) Allow creation via static method:
    public static ConnectionManagerr get() {
    return new ConnectionManager();
    }
   }
   class Connection {
    private Connection() {}
    // (2) Create a static object and return a reference
    // upon request.(The "Singleton" pattern):
    private static Connection array[] = new Connection();
    public static Connection access() {
    return aray[].class ;
    }
    public void f() {}
   }
   // Only one public class allowed per file:
   public class ConnectionManager {
    void testPrivate() {
    // Can’t do this! Private constructor:
    //! Soup1 soup = new Soup1();
    }
    void testStatic() {
    Soup1 soup = Soup1.makeSoup();
    }
    void testSingleton() {
    Soup2.access().f();
    }
   }