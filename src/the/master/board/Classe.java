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
public class Classe {
    private String nome;
    private int bonClasFor;
    private int bonClasInt;
    private int bonClasVit;
    private int bonClasSab;
    private int bonClasCar;
    private int bonClasSor;
    private int bonClasAgi;
    private int bonClasHab;
    
    
    public Classe(String nome, int bonfor, int bonint, int bonvit, int bonsab, int boncar, int bonsor, int bonagi, int bonhab ) {
    
        this.nome = nome;
        this.bonClasFor = bonfor;
        this.bonClasInt = bonint;
        this.bonClasVit = bonvit;
        this.bonClasSab = bonsab;
        this.bonClasCar = boncar;
        this.bonClasSor = bonsor;
        this.bonClasAgi = bonagi;
        this.bonClasHab = bonhab;
        String query = "INSERT INTO Classe VALUES('" + nome + "', '" + bonfor + "', '" + bonint + "', ' " + bonvit +"', '" + bonsab +"', '" + boncar +"', '" + bonsor +"', '" + bonagi +"', '" + bonhab +"')";
        Database.atualizar(query);
        
    }
    
    public static void classesInit() {      
        Classe defender = new Classe("Defender", 7, 3, 10, 3, 2, 1, -5, -4);
        Classe nightmareRider = new Classe("Nightmare Rider", -5, -5, -5, -5, -5, -5, -5, -5);
        Classe valkyrie = new Classe("Valkyrie", -5, 5, 4, 5, 5, 0, 0, 5);
        Classe druid = new Classe("Druid", -3, -2, 0, 5, -2, 2, 0, 7);
        Classe shadowalker = new Classe("Shadowalker", 2, -3, -7, 3, 0, 4, 7, 7);
        Classe berserker = new Classe("Berserker", 10, -10, -10, -5, -5, 3, 10, 0);
        Classe trickster = new Classe("Trickster", -10, 7, -6, 5, 3, -2, -5, 4);
        Classe samurai = new Classe("Samurai", 6, 3, -5, 3, 2, 1, 5, 3);
        Classe tamer = new Classe("Tamer", 0, 0, 0, 0, 0, 0, 0, 0);
        Classe soulord = new Classe("Soulord", 1, 4, 0, 5, 0, -4, 0, 4);
        Classe eagleborn = new Classe("Eagleborne", 7, -5, 5, -1, 0, 3, 5, 5);
        Classe gambler = new Classe("Gambler", 1, -2, -2, 1, 6, 7, 3, 3);
        Classe dragonKnight = new Classe("Dragon Knight", 7, 7, 2, 4, -2, 1, -5, 3);
        Classe musician = new Classe("Musician", -1, 7, 1, 7, 2, 4, -4, 7);
        Classe falconborn = new Classe("Falconborn", -5, 4, -9, 2, 7, 9, 7, 7);
        Classe winterbringer = new Classe("Winterbringer", 0, 0, 10, 10, -10, -10, 10, 10);
               
    }
    
    public int calcHpMax(){
        return 0;
        
    }
    
    public static String criarTabela(){
         return    " CREATE TABLE if not exists Classe " +
                   "(nome VARCHAR(40), " + 
                   " bonfor INTEGER," +
                   " bonint INTEGER, " +
                   " bonvit INTEGER, " +
                   " bonsab INTEGER, " +
                   " boncar INTEGER, " +
                   " bonsor INTEGER, " +
                   " bonagi INTEGER, " +
                   " bonhab INTEGER, " +
                   "PRIMARY KEY (nome))";
    }
    
}
