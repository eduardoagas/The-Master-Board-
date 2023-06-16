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
public class Equipamento {
    private static Equipamento equipList[] = new Equipamento[115];
    private String nome;
    private int peso;
    private String tipo;
    private int bonEquipFor;
    private int bonEquipInt;
    private int bonEquipVit;
    private int bonEquipSab;
    private int bonEquipCar;
    private int bonEquipSor;
    private int bonEquipAgi;
    private int bonEquipHab;
    private String statusChange;
    private int dice;
    private String descr;

public Equipamento(String nome, int dice, String descr, int peso, String tipo, int bonFor, int bonInt, int bonVit, int bonSab, int bonCar, int bonSor, int bonAgi, int bonHab, String statusChange){
    
    this.nome = nome;
    this.dice = dice;
    this.descr = descr;
    this.peso = peso;
    this.tipo = tipo;
    this.bonEquipFor = bonFor;
    this.bonEquipInt = bonInt;
    this.bonEquipVit = bonVit;
    this.bonEquipSab = bonSab;
    this.bonEquipCar = bonCar;
    this.bonEquipSor = bonSor;
    this.bonEquipAgi = bonAgi;
    this.bonEquipHab = bonHab;
    this.statusChange = statusChange;   
    String query = "INSERT INTO Equipamento VALUES('" + nome + "', ' " + dice +"', '" + descr.replace("'", " ").replace("(", "<").replace(")", ">") + "', '" + peso + "', '" + tipo + "', '" + bonFor + "', '" + bonInt +"', '" + bonVit +"', '" + bonSab +"', '" + bonCar +"', '" + bonAgi +"', '" + bonHab +"', '" + statusChange + "')";
    Database.atualizar(query);
    
}

//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);

public static void equipInit(){
    equipList[0] = new Equipamento("Desarmado", 4, "", 0, "Mão", 0, 0, 0, 0, 0, 0, 0, 0, "");
    equipList[1] = new Equipamento("Faca de Cozinha", 6, "+6 for\n" +"+1 agi", 2, "Mão", 6, 0, 0, 0, 0, 0, 1, 0, "");
    equipList[2] = new Equipamento("Adaga", 6, "+8 for\n" +"+1 agi", 3, "Mão", 8, 0, 0, 0, 0, 0, 1, 0, "");
    equipList[3] = new Equipamento("Shuriken", 6, "+1 agi\n" +"+1 for", 1, "Mão", 1, 0, 0, 0, 0, 0, 1, 0, "");
    equipList[4] = new Equipamento("Punhal Laminado", 6, "+16 for\n" +"+2 agi", 3, "Mão", 16, 0, 0, 0, 0, 0, 2, 0, "");
    equipList[5] = new Equipamento("Kunai", 6, "+1 agi\n" +"+1 for\n" +"+1 hab", 1, "Mão", 1, 0, 0, 0, 0, 0, 1, 1, "");
    equipList[6] = new Equipamento("Katana", 12, "+12 for", 3, "Mão", 12, 0, 0, 0, 0, 0, 0, 0, "");
    equipList[7] = new Equipamento("Muramasa", 12, "+25 for", 3, "Mão", 25, 0, 0, 0, 0, 0, 0, 0, "");
    equipList[8] = new Equipamento("Zambatô", 12, "+35 for", 3, "Mão", 35, 0, 0, 0, 0, 0, 0, 0, "");
    equipList[9] = new Equipamento("Espada Comum", 10, "+10 for", 3, "Mão", 10, 0, 0, 0, 0, 0, 0, 0, "");
    equipList[10] = new Equipamento("Espada Bastarda", 10, "+22 for", 4, "Mão", 22, 0, 0, 0, 0, 0, 0, 0, "");
    equipList[11] = new Equipamento("Lança Comum", 12, "+10 for", 4, "Mão", 16, 0, 0, 0, 0, 0, 0, 0, "");
    equipList[12] = new Equipamento("Espada de Duas Mãos", 12, "+16 for", 7, "Mão", 16, 0, 0, 0, 0, 0, 0, 0,"");
    equipList[13] = new Equipamento("Espada do Defensor", 12, "+25 for\n" +"+1 vit", 8, "Mão", 25, 0, 1, 0, 0, 0, 0, 0, "");
    equipList[14] = new Equipamento("Alabarda", 12, "+16 for", 9, "Mão", 16, 0, 0, 0, 0, 0, 0, 0, "");
    equipList[15] = new Equipamento("Lança Dracônica", 12, "+25 for", 9, "Mão", 25, 0, 0, 0, 0, 0, 0, 0, "");
    equipList[16] = new Equipamento("Machado", 10, "+12 For\n" +"-4 agi", 5, "Mão", 12, 0, 0, 0, 0, 0, -4, 0, "");
    equipList[17] = new Equipamento("Machado Gigante", 10, "+20 For\n" +"-8 Agi ", 8, "Mão", 20, 0, 0, 0, 0, 0, -8, 0, "");
    equipList[18] = new Equipamento("Machado do Rei dos Orcs", 10, "+45 for\n" +"-19 agi", 10, "Mão", 45, 0, 0, 0, 0, 0, -19, 0, "");
    equipList[19] = new Equipamento("Revestimento de Arma - Bronze", 0, "+3p\n" +"+14 for\n" +"-2agi\n" +"+1 car", 3, "Revestimento", 14, 0, 0, 0, 1, 0, -2, 0, "");
    equipList[20] = new Equipamento("Revestimento de Arma - Prata", 0, "+5p\n" +"+18 for\n" +"-4 agi\n" +"+2 car", 5, "Revestimento", 18, 0, 0, 0, 2, 0, -4, 0, "");        
    equipList[21] = new Equipamento("Revestimento de Arma - Platina", 0, "+7p\n" +"For\n" +"-6 agi\n" +"+3 car", 7, "Revestimento", 24, 0, 0, 0, 3, 0, -6, 0, "");
    equipList[22] = new Equipamento("Revestimento de Arma - Diamante", 0, "+48 For\n" +"-6 agi\n" +"+4 car", 9, "Revestimento", 48, 0, 0, 0, 4, 0, -6, 0, "");
    equipList[23] = new Equipamento("Encravamento de Rubis + 1", 0, "+10 int por rubi", 1, "Revestimento", 0, 10, 0, 0, 0, 0, 0, 0, "");
    equipList[24] = new Equipamento("Encravamento de Rubis + 2", 0, "+10 int por rubi", 2, "Revestimento", 0, 20, 0, 0, 0, 0, 0, 0, "");
    equipList[25] = new Equipamento("Encravamento de Rubis + 3", 0, "+10 int por rubi", 3, "Revestimento", 0, 30, 0, 0, 0, 0, 0, 0, "");
    equipList[26] = new Equipamento("Encravamento de Rubis + 4", 0, "+10 int por rubi", 4, "Revestimento", 0, 40, 0, 0, 0, 0, 0, 0, "");
    equipList[27] = new Equipamento("Cajado", 4, "+2 int", 2, "Mão", 0, 2, 0, 0, 0, 0, 0, 0, "");
    equipList[28] = new Equipamento("Cetro Místico", 4, "+1 for\n" +"+6 int", 3, "Mão", 1, 6, 0, 0, 0, 0, 0, 0, "");
    equipList[29] = new Equipamento("Cetro de Ouro", 4, "+2 for\n" +"+12 int", 6, "Mão", 2, 12, 0, 0, 0, 0, 0, 0, "");
    equipList[30] = new Equipamento("Livro de Magia", 4, "+7 int", 3, "Mão", 0, 7, 0, 0, 0, 0, 0, 0, "");
    equipList[31] = new Equipamento("Livro de Magia Negra", 4, "+14 int ", 5, "Mão", 0, 14, 0, 0, 0, 0, 0, 0, "");
    equipList[32] = new Equipamento("Encadernamento", 0, "Bônus Int depende da capa", 1, "Revestimento", 0, 0, 0, 0, 0, 0, 0, 0, "");        
    equipList[33] = new Equipamento("Escudo de Madeira", 4, "+2 vit", 3, "Mão", 0, 0, 2, 0, 0, 0, 0, 0, "");
    equipList[33] = new Equipamento("Escudo de Ferro", 4, "+4 vit\n" +"-2 agi", 4, "Mão", 0, 0, 4, 0, 0, 0, -2, 0, "");
    equipList[34] = new Equipamento("Escudo do Defensor", 4, "+8 vit\n" +"-2 agi", 6, "Mão", 0, 0, 8, 0, 0, 0, 0, 0, "");
    equipList[35] = new Equipamento("Revestimento de Defesa - Bronze", 0, "+4 vit\n" +"-2agi\n" +"+1 car", 3, "Revestimento" , 0, 0, 4, 0, 1, 0, -2, 0, "");
    equipList[36] = new Equipamento("Revestimento de Defesa - Prata", 0, "+8 vit\n" +"-4 agi\n" +"+2 car", 5, "Revestimento", 0, 0, 8, 0, 2, 0, -4, 0, "");
    equipList[37] = new Equipamento("Revestimento de Defesa - Platina", 0, "+14 vit\n" +"-6 agi\n" +"+3 car", 7, "Revestimento", 0, 0, 14, 0, 3, 0, -6, 0, "");        
    equipList[38] = new Equipamento("Revestimento de Defesa - Diamante", 0, "+28 vit\n" +"-12 agi\n" +"+4 car", 9, "Revestimento", 0, 0, 28, 0, 4, 0, -12, 0, "");
    /*equipList[39] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);        
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);        
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);        
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);
    equipList[2] = new Equipamento(//nome, dice, desc, peso, tipo, for, int, vit, sab, car, sor, agi, hab, status);        
             */
}


    public static String criarTabela(){
         return    " CREATE TABLE if not exists Equipamento " +
                   "(nome VARCHAR(50), " + 
                   " dice INTEGER, " +
                   " descr VARCHAR(200), " +
                   " peso INTEGER, " +
                   " tipo VARCHAR(20), " +
                   " bonfor INTEGER, " +
                   " bonint INTEGER, " +
                   " bonvit INTEGER, " +
                   " bonsab INTEGER, " +
                   " boncar INTEGER, " +
                   " bonsor INTEGER, " +
                   " bonagi INTEGER, " +
                   " bonhab INTEGER, " +
                   " statuschange VARCHAR(50), " +
                   " PRIMARY KEY (nome))";
    }

}