/*
 * This source file was generated by the Gradle 'init' task
 */
package UNPA.Compilador;

import UNPA.Compilador.Utils.DbUtil;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        testUniversity u = new testUniversity();
        u.Initialize();
        // DbUtil dbUtil = new DbUtil();
        // dbUtil.createConexion();
    }
}
