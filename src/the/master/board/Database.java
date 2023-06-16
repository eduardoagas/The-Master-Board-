/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.master.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Du
 */
public class Database {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    static final String USER = "root";
    static final String PASS = "";
    
    public Database(){
        
    }
    
    public static void atualizar(String query){
        Connection conn = null;
        Statement stmt = null;
        // TODO code application logic here
        try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      //System.out.println("Conectando...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      //System.out.println("Connectado");
      
      //STEP 4: Execute a query
      //System.out.println("Atualizando...");
      stmt = conn.createStatement();

      stmt.executeUpdate(query);
      System.out.println("Atualizaçao realizada com sucesso.");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   //System.out.println("Conexão terminada.");
    }
    
    
public static Personagem[] recuperarPersonagens(Personagem[] lista){
        ResultSet rs = null;
        Connection conn = null;
        Statement stmt = null;
        // TODO code application logic here
        try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      //System.out.println("Conectando...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      //System.out.println("Connectado");
      
      //STEP 4: Execute a query
      //System.out.println("Atualizando...");
       stmt = conn.createStatement();
       
       String query = "SELECT nome, lvl, classe, quantFor, quantInt,"
                       + "quantVit, quantSab, quantCar, quantSor, quantAgi, quantHab,"
                       + "hpmax, spmax, hpatual, spatual"
                       + ", condBox FROM personagem";
       rs = stmt.executeQuery(query);
       int i = 0;
        while(rs.next()){
                        lista[i] = new Personagem(rs.getString("nome"), rs.getInt("lvl"), rs.getString("classe"), rs.getInt("quantFor"),rs.getInt("quantInt"), rs.getInt("quantVit"), rs.getInt("quantSab"), rs.getInt("quantCar"), rs.getInt("quantSor"), rs.getInt("quantAgi"),
                        rs.getInt("quantHab"), rs.getInt("hpmax"), rs.getInt("spmax"), rs.getInt("hpatual"), rs.getInt("spatual"), rs.getString("condbox"));
                         i++;
                    }
      System.out.println("Atualizaçao realizada com sucesso.");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   //System.out.println("Conexão terminada.");
   return lista;
    }


public static String recuperarInfo(String retorno, String query){
        ResultSet rs = null;
        Connection conn = null;
        Statement stmt = null;
        String result = "";
        // TODO code application logic here
        try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");
      
      //STEP 3: Open a connection
      //System.out.println("Conectando...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      //System.out.println("Connectado");
      
      //STEP 4: Execute a query
      //System.out.println("Atualizando...");
       stmt = conn.createStatement();
       rs = stmt.executeQuery(query);
       //int i = 0;
        while(rs.next()){
                        result += rs.getString(retorno) + "\n";
                    }
      System.out.println("Atualizaçao realizada com sucesso.");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   //System.out.println("Conexão terminada.");
   return result;
    }


    public static float recuperarFunc(String tipo, String nome1, int dado1, String nome2, int dado2){
            System.out.println(tipo);
            ResultSet rs = null;
            Connection conn = null;
            Statement stmt = null;
            float result = 0;
            String query = "SELECT " + tipo + "('" + nome1 + "', " + dado1 + ", '" + nome2 + "', " + dado2 + ") as val;";
            // TODO code application logic here
            try{
          //STEP 2: Register JDBC driver
          Class.forName("com.mysql.jdbc.Driver");

          //STEP 3: Open a connection
          //System.out.println("Conectando...");
          conn = DriverManager.getConnection(DB_URL, USER, PASS);
          //System.out.println("Connectado");

          //STEP 4: Execute a query
          //System.out.println("Atualizando...");
           stmt = conn.createStatement();
           rs = stmt.executeQuery(query);
            while(rs.next()){
                            result = rs.getFloat("val");
                        }
          System.out.println("Atualizaçao realizada com sucesso.");
       }catch(SQLException se){
          //Handle errors for JDBC
          se.printStackTrace();
       }catch(Exception e){
          //Handle errors for Class.forName
          e.printStackTrace();
       }finally{
          //finally block used to close resources
          try{
             if(stmt!=null)
                conn.close();
          }catch(SQLException se){
          }// do nothing
          try{
             if(conn!=null)
                conn.close();
          }catch(SQLException se){
             se.printStackTrace();
          }//end finally try
       }//end try
       //System.out.println("Conexão terminada.");
       return result;
    }
    
    
    public static String recuperarInfoAlma(String query){
        ResultSet rs = null;
        Connection conn = null;
        Statement stmt = null;
        String result = "";
        // TODO code application logic here
        try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");
      
      //STEP 3: Open a connection
      //System.out.println("Conectando...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      //System.out.println("Connectado");
      
      //STEP 4: Execute a query
      //System.out.println("Atualizando...");
       stmt = conn.createStatement();
       rs = stmt.executeQuery(query);
       while(rs.next()){
            result += rs.getString("nome") + "\n";
            result += "For = " + rs.getString("bonfor") + "\n";
            result += "Int = " + rs.getString("bonint") + "\n";
            result += "Vit = " + rs.getString("bonvit") + "\n";
            result += "Sab = " + rs.getString("bonsab") + "\n";
            result += "Car = " + rs.getString("boncar") + "\n";
            result += "Agi = " + rs.getString("bonagi") + "\n";
            result += "Sor = " + rs.getString("bonsor") + "\n";
            result += "Hab = " + rs.getString("bonhab") + "\n";   
       }             
      System.out.println(result);
      System.out.println("Atualizaçao realizada com sucesso.");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   //System.out.println("Conexão terminada.");
   return result;
    }

    

}

