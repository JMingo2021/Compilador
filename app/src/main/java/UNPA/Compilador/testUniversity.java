/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNPA.Compilador;



import UNPA.Compilador.Utils.DbUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JDomingo
 */
public class testUniversity {
    //private Alumno alumno=new Alumno();

    // #region Attributes
    private Connection dbCon;

    //private Connection conn;
    DbUtil Conexion;
    // #endregion

    public testUniversity() {
        this.Initialize();
    }

    public void Initialize(){
        dbCon = DbUtil.getInstance().getConnection();
    }    
}
