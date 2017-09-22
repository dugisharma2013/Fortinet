/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBSingleton;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hrishikesh
 */
public class SingleDBObject {

    private static SingleDBObject instance = new SingleDBObject();
    private static Connection con = null;

    private static Connection createCon() {
        Connection con1 = null;
        try {
            //Driver connection credentials to initialise conn1
            System.out.println("Database connected");

        } catch (Exception e) {
            System.out.println(e);
        }
        
        return con1;
    }

    private SingleDBObject() {
        con = createCon();
    }

    public static SingleDBObject getDBInstance() {
        return instance;
    }
    
    public void showMessage(){
        
        System.out.println("Connection working");
    }
    

}
