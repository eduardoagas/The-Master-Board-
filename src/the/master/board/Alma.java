/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package the.master.board;

/**
 *
 * @author Du
 */
public class Alma {
    private String nome;
    private int bonFor;
    private int bonInt;
    private int bonVit;
    private int bonSab;
    private int bonCar;
    private int bonSor;
    private int bonAgi;
    private int bonHab;

    public Alma(String nome, int bonFor, int bonInt, int bonVit, int bonSab, int bonCar, int bonSor, int bonAgi, int bonHab) {
        this.nome = nome;
        this.bonFor = bonFor;
        this.bonInt = bonInt;
        this.bonVit = bonVit;
        this.bonSab = bonSab;
        this.bonCar = bonCar;
        this.bonSor = bonSor;
        this.bonAgi = bonAgi;
        this.bonHab = bonHab;

        String query = "INSERT INTO Alma VALUES('" + nome + "', '" + bonFor + "', '" + bonInt + "', ' " + bonVit +"', '" + bonSab +"', '" + bonCar +"', '" + bonSor +"', '" + bonAgi +"', '" + bonHab +"')";
        Database.atualizar(query);
    }
    
     public static String criarTabela(){
         return    " CREATE TABLE if not exists Alma " +
                   "(nome VARCHAR(50), " + 
                   " bonfor INTEGER, " +
                   " bonint INTEGER, " +
                   " bonvit INTEGER, " +
                   " bonsab INTEGER, " +
                   " boncar INTEGER, " +
                   " bonagi INTEGER,  " +
                   " bonsor INTEGER, " +
                   " bonhab INTEGER, " +
                   " PRIMARY KEY (nome))";
    }
    
    
}
