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
public class Personagem {
    
    private String nome;
    private String classe;
    private Habilidade Hab1;
    private Habilidade Hab2;
    private Habilidade Hab3;
    private Habilidade Hab4;
    private Habilidade Hab5;
    private Habilidade Hab6;
    private Habilidade Hab7;
    private Habilidade Hab8;
    private Habilidade Hab9;
    private Habilidade Hab10;
    private int quantFor;
    private int quantInt;
    private int quantVit;
    private int quantSab;
    private int quantCar;
    private int quantSor;
    private int quantAgi;
    private int quantHab;
    private int hpMax;
    private int spMax;
    private int hpAtual;
    private int spAtual;
    private Equipamento arma;
    private Equipamento armadura;
    private Equipamento acc1;
    private Equipamento acc2;
    private Equipamento acc3;
    private String condBox;
    private int lvl;



public Personagem(String nome, String classe) {
    this.nome = nome;
    this.classe = classe;
    String query = "INSERT INTO Personagem(nome, classe) VALUES('" + nome + "', '" + classe + "')";
    System.out.println(query);
    Database.atualizar(query);

}

public Personagem(String nome, int lvl, String classe, int quantFor, int quantInt, int quantVit, int quantSab, int quantCar, int quantSor, int quantAgi, 
        int quantHab, int hpmax, int spmax, int hpatual, int spatual, String condbox) {
    this.nome = nome;
    this.classe = classe;
    this.lvl = lvl;
   /* this.Hab1 = hab1;
    this.Hab2 = hab2;
    this.Hab3 = hab3;
    this.Hab4 = hab4;
    this.Hab5 = hab5;
    this.Hab6 = hab6;
    this.Hab7 = hab7;
    this.Hab8 = hab8;
    this.Hab9 = hab9;
    this.Hab10 = hab10;*/
    this.quantFor = quantFor;
    this.quantInt = quantInt;
    this.quantVit = quantVit;
    this.quantSab = quantSab;
    this.quantCar = quantCar;
    this.quantSor = quantSor;
    this.quantAgi = quantAgi;
    this.quantHab = quantHab;
    /*this.arma = arma;
    this.armadura = armadura;
    this.nome = nome;*/
    this.classe = classe;
    this.condBox = condbox;
    this.hpMax = hpmax;
    this.hpAtual = hpatual;
    this.spAtual = spatual;
    this.spMax = spmax;
    String query = "INSERT INTO Personagem(nome, lvl, classe, "
                       + "quantFor, quantInt,"
                       + "quantVit, quantSab, quantCar, quantSor, quantAgi, quantHab,"
                       + "hpmax, spmax, hpatual, spatual, "
                       + "condBox) VALUES('" + nome + "', '" + lvl + "', '" + classe + "','" + quantFor + "','" + quantInt + "','" + quantVit + "','" + quantSab + "','" + quantCar + "','" + quantSor + "','" + quantAgi + "','" + quantHab + "','" + hpmax + "','" + spmax + "','" + hpatual + "','" + spatual + "','" + condbox + "')";


}


public static String criarTabela(){
         return    " CREATE TABLE if not exists Personagem " +
                   "(nome VARCHAR(20), " + 
                   "lvl INTEGER," +
                   " classe VARCHAR(20),"
                 + " hab1 VARCHAR(20)," +
                    "    hab2 VARCHAR(20)," +
                    "    hab3 VARCHAR(20)," +
                    "    hab4 VARCHAR(20)," +
                    "    hab5 VARCHAR(20)," +
                    "    hab6 VARCHAR(20)," +
                    "    hab7 VARCHAR(20)," +
                    "    hab8 VARCHAR(20)," +
                    "    hab9 VARCHAR(20)," +
                    "    hab10 VARCHAR(20)," +
                    "    quantFor INTEGER," +
                    "    quantInt INTEGER," +
                    "    quantVit INTEGER," +
                    "    quantSab INTEGER," +
                    "    quantCar INTEGER," +
                    "    quantSor INTEGER," +
                    "    quantAgi INTEGER," +
                    "    quantHab INTEGER," +
                    "    hpMax INTEGER," +
                    "    spMax INTEGER," +
                    "    hpAtual INTEGER," +
                    "    spAtual INTEGER," +
                    "    arma VARCHAR(20)," +
                    "    armadura VARCHAR(20)," +
                    "    acc1 VARCHAR(20)," +
                    "    acc2 VARCHAR(20)," +
                    "    acc3 VARCHAR(20)," +
                    "    condBox VARCHAR(10000)," +
                   "PRIMARY KEY (nome))";
}
       /* return    " CREATE TABLE if not exists Personagem " +
                   "(nome VARCHAR(20), " +
                   " classe VARCHAR(20))";
*/
    /**
     * @return the classe
     */
    
    public String getClasse() {
        return classe;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the Hab1
     */
    public Habilidade getHab1() {
        return Hab1;
    }

    /**
     * @param Hab1 the Hab1 to set
     */
    public void setHab1(Habilidade Hab1) {
        this.Hab1 = Hab1;
    }

    /**
     * @return the Hab2
     */
    public Habilidade getHab2() {
        return Hab2;
    }

    /**
     * @param Hab2 the Hab2 to set
     */
    public void setHab2(Habilidade Hab2) {
        this.Hab2 = Hab2;
    }

    /**
     * @return the Hab3
     */
    public Habilidade getHab3() {
        return Hab3;
    }

    /**
     * @param Hab3 the Hab3 to set
     */
    public void setHab3(Habilidade Hab3) {
        this.Hab3 = Hab3;
    }

    /**
     * @return the Hab4
     */
    public Habilidade getHab4() {
        return Hab4;
    }

    /**
     * @param Hab4 the Hab4 to set
     */
    public void setHab4(Habilidade Hab4) {
        this.Hab4 = Hab4;
    }

    /**
     * @return the Hab5
     */
    public Habilidade getHab5() {
        return Hab5;
    }

    /**
     * @param Hab5 the Hab5 to set
     */
    public void setHab5(Habilidade Hab5) {
        this.Hab5 = Hab5;
    }

    /**
     * @return the Hab6
     */
    public Habilidade getHab6() {
        return Hab6;
    }

    /**
     * @param Hab6 the Hab6 to set
     */
    public void setHab6(Habilidade Hab6) {
        this.Hab6 = Hab6;
    }

    /**
     * @return the Hab7
     */
    public Habilidade getHab7() {
        return Hab7;
    }

    /**
     * @param Hab7 the Hab7 to set
     */
    public void setHab7(Habilidade Hab7) {
        this.Hab7 = Hab7;
    }

    /**
     * @return the Hab8
     */
    public Habilidade getHab8() {
        return Hab8;
    }

    /**
     * @param Hab8 the Hab8 to set
     */
    public void setHab8(Habilidade Hab8) {
        this.Hab8 = Hab8;
    }

    /**
     * @return the Hab9
     */
    public Habilidade getHab9() {
        return Hab9;
    }

    /**
     * @param Hab9 the Hab9 to set
     */
    public void setHab9(Habilidade Hab9) {
        this.Hab9 = Hab9;
    }

    /**
     * @return the Hab10
     */
    public Habilidade getHab10() {
        return Hab10;
    }

    /**
     * @param Hab10 the Hab10 to set
     */
    public void setHab10(Habilidade Hab10) {
        this.Hab10 = Hab10;
    }

    /**
     * @return the quantFor
     */
    public int getQuantFor() {
        return quantFor;
    }

    /**
     * @param quantFor the quantFor to set
     */
    public void setQuantFor(int quantFor) {
        this.quantFor = quantFor;
    }

    /**
     * @return the quantInt
     */
    public int getQuantInt() {
        return quantInt;
    }

    /**
     * @param quantInt the quantInt to set
     */
    public void setQuantInt(int quantInt) {
        this.quantInt = quantInt;
    }

    /**
     * @return the quantVit
     */
    public int getQuantVit() {
        return quantVit;
    }

    /**
     * @param quantVit the quantVit to set
     */
    public void setQuantVit(int quantVit) {
        this.quantVit = quantVit;
    }

    /**
     * @return the quantSab
     */
    public int getQuantSab() {
        return quantSab;
    }

    /**
     * @param quantSab the quantSab to set
     */
    public void setQuantSab(int quantSab) {
        this.quantSab = quantSab;
    }

    /**
     * @return the quantCar
     */
    public int getQuantCar() {
        return quantCar;
    }

    /**
     * @param quantCar the quantCar to set
     */
    public void setQuantCar(int quantCar) {
        this.quantCar = quantCar;
    }

    /**
     * @return the quantSor
     */
    public int getQuantSor() {
        return quantSor;
    }

    /**
     * @param quantSor the quantSor to set
     */
    public void setQuantSor(int quantSor) {
        this.quantSor = quantSor;
    }

    /**
     * @return the quantAgi
     */
    public int getQuantAgi() {
        return quantAgi;
    }

    /**
     * @param quantAgi the quantAgi to set
     */
    public void setQuantAgi(int quantAgi) {
        this.quantAgi = quantAgi;
    }

    /**
     * @return the quantHab
     */
    public int getQuantHab() {
        return quantHab;
    }

    /**
     * @param quantHab the quantHab to set
     */
    public void setQuantHab(int quantHab) {
        this.quantHab = quantHab;
    }

    /**
     * @return the hpMax
     */
    public int getHpMax() {
        return hpMax;
    }

    /**
     * @param hpMax the hpMax to set
     */
    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    /**
     * @return the spMax
     */
    public int getSpMax() {
        return spMax;
    }

    /**
     * @param spMax the spMax to set
     */
    public void setSpMax(int spMax) {
        this.spMax = spMax;
    }

    /**
     * @return the hpAtual
     */
    public int getHpAtual() {
        return hpAtual;
    }

    /**
     * @param hpAtual the hpAtual to set
     */
    public void setHpAtual(int hpAtual) {
        this.hpAtual = hpAtual;
    }

    /**
     * @return the spAtual
     */
    public int getSpAtual() {
        return spAtual;
    }

    /**
     * @param spAtual the spAtual to set
     */
    public void setSpAtual(int spAtual) {
        this.spAtual = spAtual;
    }

    /**
     * @return the arma
     */
    public Equipamento getArma() {
        return arma;
    }

    /**
     * @param arma the arma to set
     */
    public void setArma(Equipamento arma) {
        this.arma = arma;
    }

    /**
     * @return the armadura
     */
    public Equipamento getArmadura() {
        return armadura;
    }

    /**
     * @param armadura the armadura to set
     */
    public void setArmadura(Equipamento armadura) {
        this.armadura = armadura;
    }

    /**
     * @return the acc1
     */
    public Equipamento getAcc1() {
        return acc1;
    }

    /**
     * @param acc1 the acc1 to set
     */
    public void setAcc1(Equipamento acc1) {
        this.acc1 = acc1;
    }

    /**
     * @return the acc2
     */
    public Equipamento getAcc2() {
        return acc2;
    }

    /**
     * @param acc2 the acc2 to set
     */
    public void setAcc2(Equipamento acc2) {
        this.acc2 = acc2;
    }

    /**
     * @return the acc3
     */
    public Equipamento getAcc3() {
        return acc3;
    }

    /**
     * @param acc3 the acc3 to set
     */
    public void setAcc3(Equipamento acc3) {
        this.acc3 = acc3;
    }

    /**
     * @return the condBox
     */
    public String getCondBox() {
        return condBox;
    }

    /**
     * @param condBox the condBox to set
     */
    public void setCondBox(String condBox) {
        this.condBox = condBox;
    }

    /**
     * @return the lvl
     */
    public int getLvl() {
        return lvl;
    }

    /**
     * @param lvl the lvl to set
     */
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

}