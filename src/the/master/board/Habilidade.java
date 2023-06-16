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
public class Habilidade {
    
    private static Habilidade listHab[] = new Habilidade[75];
    private String nome;
    private String descr;
    private int sp;
    
    
public Habilidade(String nome, String descr, int sp){
    
    this.nome = nome;
    this.descr = descr;
    this.sp = sp;
    String query = "INSERT IGNORE INTO Habilidade VALUES('" + nome + "', '" + descr.replace("'", " ").replace("(", "<").replace(")", ">") + "', '" + sp + "')";
    Database.atualizar(query);
}


    
public void efeito(Personagem usuario, Personagem alvo){

}

public static void habInit(){
    listHab[0] = new Habilidade("Lâmina Estilhaçante",
    "Khaim's Soul - Alma do Deus da Destruição – Lâmina Estilhaçante (40 SP)\n" +
"A lâmina brilha com uma aura vermelha, aumentando o impacto causado pela mesma.(+10 FOR)\n" +
"Tal impacto pode inclusive quebrar os equipamentos do inimigo.(1 em D6)\n" +
"A arma não pode ser destruída enquanto estiver neste modo.  ", 40);
    listHab[1] = new Habilidade("Força Defensora","Ethon's Soul - Alma do Herói Ancestral – Força Defensora (30 SP) \n" +
"Uma luz começar a emanar de todo o corpo do Defender. Enquanto o usuário estiver sob\n" +
"essa forma, toda sua força será convertida em vitalidade, sendo a força reduzida para 1. Enquanto estiver nesse modo, ao receber ataques mágicos, poderá refleti-los por 1/D6 chances.", 30);
    listHab[2] = new Habilidade("Cura","Shaimhazar's Soul - Alma do Deus Sagrado - Cura (20 SP)\n" +
"Recupera a si mesmo ou aliados. Pode curar status negativos aleatoriamente.",20);
    listHab[3] = new Habilidade("Luz","Turiia's Soul - Alma da Deusa da Luz - Luz (10 SP) \n" +
"Uma luz irradiará da lâmina, iluminando qualquer espaço escuro, podendo cegar o inimigo. Essa habilidade sobrepõe a habilidade de escuridão(Opurine's Soul) do Shadowalker.", 10);
    listHab[4] = new Habilidade("Armadura de Vida Maldita", "Umbra's Soul - Alma da Deusa Maldita – Armadura de Vida Maldita(40 SP)\n" +
"A armadura da Deusa Maldita descerá dos céus e equipará ambos amaldiçoados.\n" +
"Enquanto estiver ativo, o usuário sofrerá certo tanto de dano por rodada, de acordo com o HP\n" +
"total do NR(5%).\n" +
"O dano será aplicado também no inimigo amaldiçoado.",40);
    listHab[5] = new Habilidade("Armadura de Espírito Maldita","Baluka's Soul - Alma do Condenador – Armadura de Espírito Maldita (40 SP)\n" +
"Uma fumaça azul-elétrica envolverá os amaldiçoados.\n" +
"Enquanto estiver ativo, o usuário sofrerá certo tanto de dano por rodada, de acordo com o SP\n" +
"total do NR(5%).\n" +
"O dano será aplicado também no inimigo amaldiçoado.", 40);
    listHab[6] = new Habilidade("Nightmare","Cavelera's Soul - Alma Próspera - Nightmare (70 SP)\n" +
"Invoca Nightmare das profundezas do submundo.", 70);
    listHab[7] = new Habilidade("Roleta da Morte","Daveras's Soul - Alma do Deus da Morte – Roleta da Morte(100 SP)\n" +
"Aleatoriamente invoca Davera, que levará consigo 50% do HP de uma pessoa randômica ao redor,\n" +
" inclusive do próprio usuário.",100);
    listHab[8] = new Habilidade("Proteção","Kariman's Soul -Alma do Último Guardião - Proteção (70 SP)\n" +
"As asas triplicarão de tamanho e irradiarão uma luz intensa, podendo bloquear ataques\n" +
"com perfeição. (-25%) A habilidade do Shadowalker de escuridão(Opurine's Soul) cancela essa habilidade.",70);
    listHab[9] = new Habilidade("Escudo/Espada Plasma", "Suuruuko's Soul - Alma do Guerreiro Sobrevivente – Escudo/Espada Plasma (50 SP)\n" +
"Uma espada/escudo de luz com força/defesa igual a arma atual surgirá. Não é preciso estar equipado com a arma/escudo para cloná-la(o), basta tê-la(o) no inventário.\n" +
"A arma-plasma pode matar instantaneamente mortos-vivos. Não se pode usar essa habilidade para criar uma espada e escudo ao mesmo tempo.", 50);
    listHab[10] = new Habilidade("Asas Astrais", "Rhiotama's Soul - Alma do Rei dos Céus - +5 Asas Astrais (60 SP)\n" +
"Duas asas astrais aparecerão no alvo. O alvo não poderá usá-las para voar,\n" +
"mas ganhará um bônus de +5 em todos os atributos enquanto estiver ativa.", 60);
    listHab[11] = new Habilidade("Cultivar Plantas", "Tameraladun's Soul - Alma do Deus da Vida – Cultivar Plantas (10 SP/M)\n" +
"Pode fazer surgir árvores e plantas de qualquer lugar, desde que tenha consigo\n" +
"parte do DNA da planta desejada.", 10);
    listHab[12] = new Habilidade("Controle Espiritual", "Jokoia's Soul - Alma da Deusa da Natureza – Controle Espiritual (40 SP)\n" +
"O controle de águas, plantas, fogo e qualquer elemento natural ao redor, inclusive de\n" +
"animais selvagens será do druida. Ele não pode se mover enquanto conjura essa habilidade.", 40);
    listHab[13] = new Habilidade("Renovação de Espírito", "Essitassame' Soul - Alma Espectral – Renovação de Espírito (0 SP)\n" +
"Usa a energia vital que ronda pelo planeta como ajuda.\n" +
"Recupera todo o SP em troca do turno. ", 0);
    listHab[14] = new Habilidade("Espada de Vento", "Kekopura's Soul - Alma da Protetora dos Oprimidos – Espada de Vento (100 SP)\n" +
"Uma espada de vento surgirá e poderá ser usada contra os inimigos. A espada pode se\n" +
"estender a até 20 metros. O dano será calculado por VIT.INIMIGO - VIT.DRUID.", 100);
    listHab[15] = new Habilidade("Escuridão","Opurine's Soul - Alma do Deus da Escuridão - Escuridão(10 SP)\n" +
"Toda e qualquer luz ao redor será ocultada pelas sombras enquanto essa habilidade\n" +
"estiver ativa(Causa cegueira). Inimigos dentro da habilidade perdem 50% de HAB e AGI.  Se o SW também estiver dentro dessa sombra, perderá 25% de HAB e AGI.", 10);
    listHab[16] = new Habilidade("Roubar Alma", "O usuário poderá roubar uma alma equipada do inimigo(deve-se tirar 1 no D20). A alma poderá ser guardada caso o Shadowalker tenha um recipiente. Do contrário, ela será destruída. Essa habilidade pode ser usada para matar instantaneamente materializações de Soulords.", 200);
    listHab[17] = new Habilidade("Teleporte","Enquanto esta habilidade estiver ativa, o usuário poderá se teleportar livremente\n" +
"num raio de 15 metros.",90);
    listHab[18] = new Habilidade("Clones Sombrios", "Shikakuri's Soul - Alma do Deus das Sombras – Clones Sombrios (10 SP/CLONE)\n" +
"Cria clones de si mesmo, advindos da escuridão.", 10);
    listHab[19] = new Habilidade("Punhos de Tigre", "Elearinimoha's Soul - Alma da Besta Lendária – Punhos do Tigre (100 SP)\n" +
"Seus braços se equiparão com patas de tigre espectrais, que aumentarão o dano causado\n" +
"por ataques desarmados em 50%.", 100);
    listHab[20] = new Habilidade("Uivo à Lua", "Makurazu's Soul - Alma do Lobo Alfa – Uivo à Lua (100 SP)\n" +
"Os lobos começarão a uivar, simbolizando a descida da Alma do Lobo Lendário e a lua\n" +
"correspondente surgirá atrás de si. \n" +
"Na lua cheia, +50% em todos os atributos. Na lua nova +30%, minguante +10%.", 100);
    listHab[21] = new Habilidade("Frenesi", "Verdandi's Soul - Alma da Besta Acorrentada - Frenesi (100 SP)\n" +
"Uma das correntes da besta acorrentada se desfará. O usuário só poderá avançar e atacar\n" +
"durante 3 turnos, tendo seu dano duplicado e podendo eventualmente quebrar a armadura do inimigo (1 em D6). As chances de combo aumentarão. Caso seja usado 7 vezes, Verdandi tem a chance de ser invocado(Verdandi atacará tudo ao redor até que o efeito no usuário passe e a besta seja mais uma vez lacrada).", 100);
    listHab[22] = new Habilidade("Armadura de Ataque", "Karunu's Soul - Alma do Deus da Guerra – Armadura de Ataque (100 SP)\n" +
"A armadura do Deus da Guerra surgirá para equipar-se no Berserker. Ele não poderá usar\n" +
"nenhuma das outras habilidades. Terá +25% em AGI, FOR e SOR. Terá uma redução\n" +
"de 50% em VIT e HAB.", 100);
    listHab[23] = new Habilidade("Retorno", "Cronosales' Soul - Alma do Deus do Tempo – Retorno (350 SP)\n" +
"Um grande relógio espectral surge e retorna uma hora. O sinos badalam e o\n" +
" último turno anterior a este é cancelado. Este turno é encerrado. Essa habilidade só pode ser usada uma vez por dia.", 350);
    listHab[24] = new Habilidade ("Prestidigitação", "Geogra's Soul - Alma do Deus do Ventos – Prestidigitação (10 SP)\n" +
"Permite levantar as coisas sem tocá-las. Pode ser usada com alcance de 15 metros. Pode ser usada em humanos.",10);
    listHab[25] = new Habilidade("Magia", "Hiniju' Soul - Alma da Deusa Gêmea da Natureza - Magia (40 SP)\n" +
"Invoca água, fogo, terra ou raio, podendo controlá-los ao bel prazer. D20 +INT", 40);
    listHab[26] = new Habilidade("Enduir", "Icaro's Soul – Alma de Ícaro - Enduir (100 SP)\n" +
"Encanta armas/pergaminhos.", 100);
    listHab[27] = new Habilidade("Bainha Espiritual", "Kozuka's Soul - Alma do Deus das Armas – Bainha Espiritual (50 SP)\n" +
"A arma ou objeto emanará um brilho azul-escuro e\n" +
"passará a causar dano no SP, além do dano comum ao HP.",50);
    listHab[28] = new Habilidade("Bainha Crescente","Wakizashi's Soul - Alma do Guardião das Lâminas – Bainha Crescente(50 SP)\n" +
"A arma carregada pelo samurai é desembainhada de suas limitações.\n" +
"A arma causará dano em área 3m².", 50);
    listHab[29] = new Habilidade("Lâmina Contaminada", "Daigoro's Soul - Alma do Cão Lendário – Lâmina Contaminada (50 SP)\n" +
"A arma começará a borbulhar uma aura verde, \n" +
"podendo causar efeitos aleatórios em quem acertar.", 50);
    listHab[30] = new Habilidade("Zanmato", "Zanmato's Soul - Alma do Último Samurai – Zanmato (150 SP)\n" +
"Esta habilidade demorá 10 turnos para ser ativada. O inimigo primeiramente deve ter sido\n" +
"ferido por uma espada-ninja carregada pelo usuário. Zanmato virá e decapitará o\n" +
"oponente no último turno, sendo impossível esquivar de sua espada temida por tudo e todos.\n" +
"A habilidade será cancelada se o usuário tiver o HP reduzido a menos de 25% ou se distanciar\n" +
"demais do alvo.", 150);
    listHab[31] = new Habilidade("Invocar Kekoio", "Chitab's Soul - Alma do Domador da Besta Lendária – Invocar Kekoio (200 SP)\n" +
"Invoca um Kekoio.", 200);
    listHab[32] = new Habilidade("Pétalas Explosivas", "Lealiolu's Dance - Dança da Deusa das Pétalas – Pétalas Explosivas (60 SP)\n" +
"Invoca pétalas mágicas que serão lançadas contra o alvo, causando explosões. +Chamas\n" +
"(INT+D10)", 60);
    listHab[33] = new Habilidade("Chicote de Espinhos", "Bakaru's Soul - Alma do Domador Imperdoável – Chicote de Espinhos (70 SP)\n" +
"Se o usuário estiver com um chicote, este ganhará espinhos em torno de si mesmo, aumentando\n" +
"o dano causado em 30%. +Envenamento", 70);
    listHab[34] = new Habilidade("Troca de Vida", "Eriita's Soul - Alma da Andarilha Messiânica – Troca de Vida (0 SP)\n" +
"Permite trocar HP e SP com o Kekoio.", 0);
    listHab[35] = new Habilidade("Materialização", "Atamari's Soul - Alma do Deus da Ressureição - Materialização (100 SP)\n" +
"Permite materializar monstros através de suas almas. O Soulord terá controle do monstro, mas não poderá realizar nenhum movimento. Caso realize, o monstro retornará a ser uma reles alma.\n" +
"Somente as almas equipadas podem ser transformadas.", 100);
    listHab[36] = new Habilidade("Imunidade", "Keikaru's Soul - Alma do Deus Rei-Cobra - Imunidade (150 SP)\n" +
"O espectro do Deus Rei-Cobra te escoltará como uma armadura.\n" +
"Enquanto estiver ativada, o Soulord estará imune a todos status negativos(Exceto KO).", 150);
    listHab[37] = new Habilidade("Ingerir Almas", "Gluttonous Bijiordan's Soul - Alma de Lorde Negro(Gula) – Ingerir Almas (0 SP)\n" +
"Permite usar as almas equipadas para recuperar HP ou SP. A alma usada será destruída.\n" +
"Pode ser usada em aliados.(INTxD20xNúmero de Almas)", 0);
    listHab[38] = new Habilidade("Disparar Almas", "Greedy Bijiordan's Soul - Alma do Lorde Negro(Ganância) – Disparar Almas (0 SP)\n" +
"Permite usar as almas equipadas para causar dano. A alma usada será destruída.(INTxD20xNúmero de Almas)", 0);
    listHab[39] = new Habilidade("Visão 360º", "Vilatia's Soul - Alma do Senhor dos Pássaros – Visão 360 (80 SP)\n" +
"Permite ampliar a visão para 360º, além de alcançar o dobro da visão normal. (HABx2)", 80);
    listHab[40] = new Habilidade("Penas Habilidades", "Tunaloara's Destruction - Destruição  da Deusa dos Ares – Penas Explosivas (40 SP)\n" +
"Permite usar as penas das asas como ataques explosivos.(D10 + int + for)", 40);
    listHab[41] = new Habilidade("Garras Sanguinárias", "Serene' Soul - Alma da Deusa do Infinito – Garras Sanguinárias (100 SP)\n" +
"As garras da Eagleborn começarão a brilhar vermelho-escarlate. O dano será acompanhado\n" +
"de Perfuração e a agilidade da Eagleborn será aumentada 100%. Ela não poderá voar\n" +
"enquanto estiver neste modo. As chances de combo aumentarão.", 100);
    listHab[42] = new Habilidade("Guincho", "Final Innocent's Lament - Lamento Final do Inocente – Guincho (40 SP)\n" +
"A Eagleborn será capaz de transmitir gritos agudíssimos, atordoando os inimigos ao redor. ", 40);
    listHab[43] = new Habilidade("Ativar Moedas", "Ingigo's Soul – Alma do Espectro de Subsistência – Atirar Moedas (50 SP)\n" +
"O Gambler poderá usar seu dinheiro como arma. Ele deverá atirar as moedas, podendo atirar quantas quiser num único turno(há chance de erro). O dano será Valor/100.", 50);
    listHab[44] = new Habilidade("Dado de 6", "Gayatta's Soul – Alma do Herói Imprevisto – Dado de 6 (80 SP) \n" +
"Jogue o dado.. 1 – A força do Gambler receberá um bônus de 100%; 2 – A sorte do Gambler receberá um bônus de 100%; 3 – A vit do gambler receberá um bônus de 100%, 4 – A agi do gambler receberá um bônus de 100% 5 – Todos os status do Gambler cairão para 1. 6 – O Gambler ficará com 1 HP.", 80);
    listHab[45] = new Habilidade("Dado Penal", "Viluter's Soul – Alma do Deus dos Jogos – Dado Penal (10 SP)\n" +
"Jogue o D20 2 vezes. Se a primeira jogada for menor que segunda, o Gambler receberá o número do segundo dado como bônus em todos os atributos. Caso contrário, receberá o valor do primeiro dado como penalidade em todos os atributos.", 10);
    listHab[46] = new Habilidade("Perícia Com Bastão", "Tunigia's Soul – Alma da Deusa Esquecida – Perícia com Bastão (130 sp)\n" +
"Se o usuário estiver usando um bastão, ganhará +10 em todos os atributos. O bastão não poderá ser destruído.",130);
    listHab[47] = new Habilidade("Alma do Dragão Vermelho", "Niydhoggur's Soul – Alma do Dragão Vermelho (80 SP)\n" +
"A arma do Dragon Knight emergirá em chamas. O Dragon Knight poderá usar o fogo místico do dragão tanto como elemento em arma, quanto como magias de fogo. +Chamas", 80);
    listHab[48] = new Habilidade("Alma do Dragão Azul", "Fafnir's Soul – Alma do Dragão Azul (80 sp)\n" +
"A arma do Dragon Knight se revestirá por uma mágica camada de gelo. O Dragon Kight poderá usar o gelo místico tanto como elemento na arma, quando para magias de gelo. +Congelamento",80);
    listHab[49] = new Habilidade("Alma do Dragão Verde", "Windwyrm's Soul – Alma do Dragão Verde (80 SP)\n" +
"A arma do Dragon Knight se envolverá por um redemoinho de vento. O vento poderá ser usado como magia a distância. O ataque do Dragon Knight não poderá perfurar o inimigo, mas ao atacá-lo, o arremessará para if for > for.ini then Dist = For/10 metros.", 80);
    listHab[50] = new Habilidade("Alma do Dragão Amarelo", "Snakeskin's Soul – Alma do Dragão Amarelo (150 sp)\n" +
"A arma do Dragon Knight se revestirá com camadas de rocha firme. O ataque do Dragon Knight não poderá perfurar o inimigo, mas a BA da arma do Dragon Knight será dobrada.", 150);
    listHab[51] = new Habilidade("Alma do Deus Da Música", "Badallan's Soul – Alma do Deus da Música (140 sp)\n" +
"Adquire sabedoria para poder executar a música dos Deuses. LVL = Bônus de Sabedoria adquirida nesta forma.", 140);
    listHab[52] = new Habilidade("Melodia da Deusa do Triunfo", "Kurkura's Melody – Melodia da Deusa Do Triunfo (80 sp)\n" +
"Todos que escutarem esta música receberão um bônus de Msc. LVL em For e Int. Almas não poderão ser roubadas.", 80);
    listHab[53] = new Habilidade("Sinfonia do Deus do Ar", "Stenze's Symphony – Sinfonia do Deus do Ar (80 sp)\n" +
"Todos que escutarem esta música receberão um bônus de Msc. LVL em Agi e Hab. Equipamentos não poderão ser quebrados.", 80);
    listHab[54] = new Habilidade("Canto de Hioleteru","Hiolateru's Chant – Canto de Hioleteru (80sp)\n" +
"Todos que escutarem esta música(não é necessário instrumento, uma vez que é um canto) receberão um bônus de Msc. LVL em Sor e Vit. Magias não poderão ser refletidas.", 80);
    listHab[55] = new Habilidade("Regenaração Final", "Chablunk's Soul – Alma do Demônio da Luz – Regenaração Final (120 SP)\n" +
"Se o usuário receber KO enquanto esta alma estiver ativa, regenerará automaticamente 10% do HP, saindo da condição de KO.", 120);
    listHab[56] = new Habilidade("Agilidade Mística", "Tendrillu's Soul – Alma do Demônio dos Céus – Agilidade Mística (120 SP)\n" +
"Se o usuário receber dano enquanto esta alma estiver ativa, poderá usar um item sem que perca sua rodada.", 120);
    listHab[57] = new Habilidade("Refletir Status", "Wishinu's Soul – Alma do Demônio do Espelho – Refletir Status (120 SP)\n" +
"Se o usuário for afetado com algum status negativos enquanto está alma estiver ativa, o causador do status receberá o mesmo status(Exceto KO).", 120);
    listHab[58] = new Habilidade("Silenciador Astral", "Shouojozo's Soul – Alma do Demônio do Silêncio – Silenciador Astral (120 SP) \n" +
"Enquanto esta alma estiver ativa, nenhuma alma poderá ser ativada num alcance de 25 metros ao redor do usuário. As almas já ativadas não serão afetadas.", 120);
    listHab[59] = new Habilidade("Hit Adcional", "Kawarimomo's Soul – Alma do Demônio Batedor – Hit Adcional (120 SP)\n" +
"Enquanto esta alma estiver ativa, o número de números possíveis para escolha no dado para +1 HIT aumentará em 1.", 120);
    listHab[60] = new Habilidade("Sangue Envenenado", "Totenko's Soul – Alma do Vampiro – Sangue Envenado (120 SP)\n" +
"Enquanto esta alma estiver ativa, habilidades de dreno causarão dano ao invés de recuperar. ", 120);
    listHab[61] = new Habilidade ("Reversão", "Zegeozera's Soul – Alma Zumbificada – Reversão (120 SP)\n" +
"Enquanto esta alma estiver ativa, o uso de habilidades de cura causará dano a quem for curado. O dano usará apenas o modificador INT+Dado.", 120);
    listHab[62] = new Habilidade("Troca Rápida","Meteora's Soul – Alma do Demônio das Armas – Troca Rápida(120 SP)\n" +
"Enquanto esta alma estiver ativa, o usuário poderá trocar seus equipamentos sem que perca o turno, porém, pagando 10% do SP a cada troca.", 120);
    listHab[63] = new Habilidade ("Mira Perfeita", "Keloade's Soul – Alma do Demônio de Mil Olhos – Mira Perfeita(120 SP)\n" +
"Esta alma dura 1 rodada além daquela usada para sua ativação. O ataque que for desferido durante a rodada que esta alma está ativada terá um bônus de 200% em HAB para a mira.",120);
    listHab[64] = new Habilidade ("Proteção Espectral", "Rerrearsel's Soul – Alma do Protetor – Proteção Espectral(120 SP)\n" +
"Enquanto esta alma estiver ativada, os equipamentos do usuário estarão inquebráveis.",120);
    listHab[65] = new Habilidade("Retalhação", "Pretero's Soul – Alma do Demônio Retalhador – Retalhação(120 SP)\n" +
"Enquanto esta alma estiver ativada, a STR e INT aumentará em 100%.  ", 120);
    listHab[66] = new Habilidade("Corte Temporal", "Cululuter's Soul – Alma do Demônio do Tempo – Corte Temporal(120 SP)\n" +
"Enquanto esta alma estiver ativa, sempre que o usuário desferir um golpe e acertar, as almas ativas pela vítima do golpe serão adiantadas em 1 rodada.", 120);
    listHab[67] = new Habilidade("Visão Arqueira", "Reteri's Soul – Alma do Deus Falcão – Visão Arqueira(80 sp)\n" +
"Enquanto essa alma estiver ativa, o Falconborn ganha 100% de For(dano) e Hab(precisão), caso esteja equipado com um arco e flecha.", 120);
    listHab[68] = new Habilidade("Crítico", "Westertold's Soul – Alma do Heroi Arqueiro – Crítico (80 sp)\n Aumenta as chances de crítico e de combo.", 80);
    listHab[69] = new Habilidade("Falcão", "Kiakururu's Soul – Alma do Falcão lendário – Falcão (80sp)\n" +
"Invoca um falcão. Falconbornes podem ver através dos olhos do falcão. Enquanto o falcão estiver vivo, os ataques do Falcoborn perfurarão as defesas inimigas automaticamente, desde que estejam na visão do falcão. Falcões morrem ao serem acertados, porém possuem a mesma Agi que seu mestre.", 80);
    listHab[70] = new Habilidade("Camuflagem", "Senglop's Soul – Alma do Deus Selvagem – Camuflagem(80 sp)\n" +
"Ao usar essa alma, o Falconborn não pode atacar enquanto durar, nem usar outras almas ou itens. Ele estará 100% invisível e não poderá ser visado/atacado. Sempre que se mover, há uma chance dessa alma acabar(HAB).",80);
    listHab[71] = new Habilidade("Ventos do Inverno", "Colrhen’s Soul – Alma do Deus do Frio – Ventos do Inverno(100 SP)  \n" +
"Qualquer pessoa/criatura próxima do Winterbringer perderá 20% de HAB, AGI e SOR enquanto esta alma estiver ativa.", 100);
    listHab[72] = new Habilidade("Aura Negra", "Stonrhen’ Soul – Alma do Deus Gêmeo da Morte –  Aura Negra(50 SP) \n" +
"Enquanto esta alma estiver ativa, o dano do Winterbringer será HP MAX - HP Atual (puro). Sempre que Winterbringer atacar ele receberá 20% do dano como cura.", 50);
    listHab[73] = new Habilidade("Sobrevivência", "Snowj’s Soul – Alma do Deus da Ressurreição – Sobrevivência(100 SP) \n" +
"Se esta alma estiver ativa e o Winterbringer chegar a 0 HP, ele ficará com  HP/SP máximo e receberá um bônus de +10 em todos os atributos.", 100);
    listHab[74] = new Habilidade("Sopro Coronário", "Wight’s Soul – Alma do Deus Branco – Sopro Coronário(100 SP)  \n" +
"Enquanto esta alma estiver ativa, pessoas próximas ao Winterbringer receberão 10% de dano do HP máximo caso não visem o Winterbringer como alvo.", 100);
}        
        
        
public static String criarTabela(){
         return    " CREATE TABLE if not exists Habilidade " +
                   "(nome VARCHAR(50)," + 
                   " descr text," +
                   " sp INTEGER," +
                   " PRIMARY KEY (nome))";
}
    
public static String returnDesc(String nomeHab){
    for(int i = 0; i < 75; i++){
       // System.out.println("'"+ nomeHab +"'");
       // System.out.println("'" + listHab[i] + "'" );
        if(nomeHab.equals(listHab[i].getNome()))
            return listHab[i].getDesc();
    }
    return null;
}

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return descr;
    }

}
