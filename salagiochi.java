
//tris Composto&Donadelli

import java.util.Arrays;
import java.util.Scanner;

public class salagiochi {

    public static void main(String[] args) {

        char c = 27;

        // insegna sala giochi
        String[][] sala = {
                { "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ",
                        "   ", "   ", "   " }, // cornice magenta
                { "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ",
                        "   ", "   ", "   " }, // cornice gialla
                { "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ",
                        "   ", "   ", "   " }, // cornice nera
                { "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ",
                        "   ", "   ", "   " },
                { "   ", "   ", "   ", "   ", " S ", " A ", " L ", " A ", "   ", "   ", "   ", "   ", "   ", "   ",
                        "   ", "   ", "   " },
                { "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ",
                        "   ", "   ", "   " },
                { "   ", "   ", "   ", "   ", "   ", "   ", "   ", " G ", " I ", " O ", " C ", " H ", " I ", "   ",
                        "   ", "   ", "   " },
                { "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ",
                        "   ", "   ", "   " },
                { "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ",
                        "   ", "   ", "   " }, // cor nera
                { "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ",
                        "   ", "   ", "   " }, // cor gialla
                { "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ",
                        "   ", "   ", "   " } };// cor magenta
        // riga 1
        for (int i = 0; i < 17; i++) {

            System.out.print(c + "[45m" + sala[0][i] + c + "[0m");
        }
        System.out.println();

        // riga 2
        System.out.print(c + "[45m" + sala[1][0] + c + "[0m");
        for (int i = 1; i < 16; i++) {

            System.out.print(c + "[43;33;1m" + sala[1][i] + c + "[0m");
        }
        System.out.print(c + "[45m" + sala[1][16] + c + "[0m");
        System.out.println();

        // riga 3
        System.out.print(c + "[45m" + sala[2][0] + c + "[0m");
        System.out.print(c + "[43;33;1m" + sala[2][1] + c + "[0m");
        for (int i = 2; i < 15; i++) {

            System.out.print(c + "[40m" + sala[2][i] + c + "[0m");
        }
        System.out.print(c + "[43;33;1m" + sala[2][15] + c + "[0m");
        System.out.print(c + "[45m" + sala[2][16] + c + "[0m");

        System.out.println();

        // riga 4
        System.out.print(c + "[45m" + sala[3][0] + c + "[0m");
        System.out.print(c + "[43;33;1m" + sala[3][1] + c + "[0m");
        for (int i = 2; i < 10; i++) {

            System.out.print(c + "[40m" + sala[3][i] + c + "[0m");
        }
        System.out.print(c + "[43;33;1m" + sala[3][10] + c + "[0m");
        System.out.print(c + "[45m" + sala[3][11] + c + "[0m");

        System.out.print(c + "[43;33;1m" + sala[3][12] + c + "[0m");
        System.out.print(c + "[43;33;1m" + sala[3][13] + c + "[0m");
        System.out.print(c + "[40m" + sala[3][14] + c + "[0m");

        System.out.print(c + "[43;33;1m" + sala[3][15] + c + "[0m");
        System.out.print(c + "[45m" + sala[3][16] + c + "[0m");

        System.out.println();

        // riga 5
        System.out.print(c + "[45m" + sala[4][0] + c + "[0m");
        System.out.print(c + "[43;33;1m" + sala[4][1] + c + "[0m");
        System.out.print(c + "[40m" + sala[4][2] + c + "[0m");
        System.out.print(c + "[40m" + sala[4][3] + c + "[0m");
        System.out.print(c + "[33;40;1m" + sala[4][4] + c + "[1m");
        System.out.print(c + "[35;40;1m" + sala[4][5] + c + "[1m");
        System.out.print(c + "[33;40;1m" + sala[4][6] + c + "[1m");
        System.out.print(c + "[35;40;1m" + sala[4][7] + c + "[1m");
        System.out.print(c + "[40m" + sala[4][8] + c + "[0m");
        System.out.print(c + "[40m" + sala[4][9] + c + "[0m");
        System.out.print(c + "[40m" + sala[4][10] + c + "[0m");
        System.out.print(c + "[40m" + sala[4][11] + c + "[0m");
        System.out.print(c + "[45m" + sala[4][12] + c + "[0m");
        System.out.print(c + "[43;33;1m" + sala[4][13] + c + "[0m");
        System.out.print(c + "[40m" + sala[4][14] + c + "[0m");
        System.out.print(c + "[43;33;1m" + sala[4][15] + c + "[0m");
        System.out.print(c + "[45m" + sala[4][16] + c + "[0m");
        System.out.println();
        // riga 6
        System.out.print(c + "[45m" + sala[5][0] + c + "[0m");
        System.out.print(c + "[43;33;1m" + sala[5][1] + c + "[0m");
        for (int i = 2; i < 15; i++) {

            System.out.print(c + "[40m" + sala[5][i] + c + "[0m");
        }
        System.out.print(c + "[43;33;1m" + sala[5][15] + c + "[0m");
        System.out.print(c + "[45m" + sala[5][16] + c + "[0m");

        System.out.println();
        // riga 7
        System.out.print(c + "[45m" + sala[6][0] + c + "[0m");
        System.out.print(c + "[43;33;1m" + sala[6][1] + c + "[0m");
        System.out.print(c + "[40m" + sala[6][2] + c + "[0m");
        System.out.print(c + "[45m" + sala[6][3] + c + "[0m");
        System.out.print(c + "[43;33;1m" + sala[6][4] + c + "[0m");
        System.out.print(c + "[40m" + sala[6][5] + c + "[0m");
        System.out.print(c + "[40m" + sala[6][6] + c + "[0m");
        System.out.print(c + "[33;40;1m" + sala[6][7] + c + "[1m");
        System.out.print(c + "[35;40;1m" + sala[6][8] + c + "[1m");
        System.out.print(c + "[33;40;1m" + sala[6][9] + c + "[1m");
        System.out.print(c + "[35;40;1m" + sala[6][10] + c + "[1m");
        System.out.print(c + "[33;40;1m" + sala[6][11] + c + "[1m");
        System.out.print(c + "[35;40;1m" + sala[6][12] + c + "[1m");
        System.out.print(c + "[40m" + sala[6][13] + c + "[0m");
        System.out.print(c + "[40m" + sala[6][14] + c + "[0m");
        System.out.print(c + "[43;33;1m" + sala[6][15] + c + "[0m");
        System.out.print(c + "[45m" + sala[6][16] + c + "[0m");
        System.out.println();

        // riga 8
        System.out.print(c + "[45m" + sala[7][0] + c + "[0m");
        System.out.print(c + "[43;33;1m" + sala[7][1] + c + "[0m");
        System.out.print(c + "[40m" + sala[7][2] + c + "[0m");
        System.out.print(c + "[45m" + sala[7][3] + c + "[0m");
        System.out.print(c + "[45m" + sala[7][4] + c + "[0m");
        System.out.print(c + "[43;33;1m" + sala[7][5] + c + "[0m");
        System.out.print(c + "[45m" + sala[7][6] + c + "[0m");
        System.out.print(c + "[40m" + sala[7][7] + c + "[0m");
        System.out.print(c + "[40m" + sala[7][8] + c + "[0m");
        System.out.print(c + "[40m" + sala[7][9] + c + "[0m");
        System.out.print(c + "[40m" + sala[7][10] + c + "[0m");
        System.out.print(c + "[40m" + sala[7][11] + c + "[0m");
        System.out.print(c + "[40m" + sala[7][12] + c + "[0m");
        System.out.print(c + "[40m" + sala[7][13] + c + "[0m");
        System.out.print(c + "[40m" + sala[7][14] + c + "[0m");
        System.out.print(c + "[43;33;1m" + sala[7][15] + c + "[0m");
        System.out.print(c + "[45m" + sala[7][16] + c + "[0m");
        System.out.println();

        // riga 9
        System.out.print(c + "[45m" + sala[8][0] + c + "[0m");
        System.out.print(c + "[43;33;1m" + sala[8][1] + c + "[0m");
        for (int i = 2; i < 15; i++) {

            System.out.print(c + "[40m" + sala[8][i] + c + "[0m");
        }
        System.out.print(c + "[43;33;1m" + sala[8][15] + c + "[0m");
        System.out.print(c + "[45m" + sala[8][16] + c + "[0m");

        System.out.println();

        // riga 10
        System.out.print(c + "[45m" + sala[9][0] + c + "[0m");
        for (int i = 1; i < 16; i++) {

            System.out.print(c + "[43;33;1m" + sala[9][i] + c + "[0m");
        }
        System.out.print(c + "[45m" + sala[9][16] + c + "[0m");
        System.out.println();
        // riga 11

        for (int i = 0; i < 17; i++) {

            System.out.print(c + "[45m" + sala[10][i] + c + "[0m");
        }
        System.out.println();

        inizio();
        System.out.println();
        System.out.println();
        System.out.println(" ...grazie per aver giocato, speriamo in un tuo ritorno...");
        System.out.println("    realizzato da Composto Antonio e Donadelli Tommasso");

    }

    public static void inizio() {
        // SCELTA GIOCO
        char c = 27;
        Scanner input8 = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println(
                "Che vuoi fare ?\n-Tris --> inserire '1'\n-Impiccato --> inserire '2'\n-Slot Machine --> inserire '3'\n-Altri giochi --> inserire '4'");
        String gioco = input8.nextLine();

        switch (gioco) {
            case "1":
                tris(c);
                break;
            case "2":
                impiccato();
                break;
                case "4":
                metaltrigiochi();
                break;
            case "3":
                slotdifficile();
                break;

        }

    }

    public static void metaltrigiochi() {
        char c = 27;
        System.out.println();
        System.out.println(
                "A cosa vuoi giocare?\n-Carte --> inserire '1'\n-Dadi --> inserire '2'\n-Slot Fortunata --> inserire '3'");
        Scanner input8 = new Scanner(System.in);
        String gioco = input8.nextLine();
        int provenienza = 0;
        int singolodoppio = 0;
        switch (gioco) {
            case "1":
                // insegna
                String insegna[][] = { { " ♥ ", " ♠ ", " ♦ ", " ♣ ", " ♥ ", " ♠ ", " ♦ ", " ♦ " },
                        { " ♣ ", " C ", " A ", " R ", " T ", " E ", " ♣ ", " ♣ " },
                        { " ♦ ", " ♠ ", " ♥ ", " ♣ ", " ♦ ", " ♠ ", " ♥ ", " ♥ " } };
                for (int i = 0; i < insegna.length; i++) {
                    for (int j = 0; j < insegna[0].length - 1; j++) {
                        if (insegna[i][j] == " ♥ " || insegna[i][j] == " ♦ ") {
                            System.out.print(c + "[47;31;1m" + insegna[i][j] + c + "[0m");
                        } else if (insegna[i][j] == " C " || insegna[i][j] == " R " || insegna[i][j] == " E ") {
                            System.out.print(c + "[47;31;1m" + insegna[i][j] + c + "[0m");
                        } else if (insegna[i][j] == " A " || insegna[i][j] == " T ") {
                            System.out.print(c + "[47;30;1m" + insegna[i][j] + c + "[0m");
                        } else {
                            System.out.print(c + "[47;30;1m" + insegna[i][j] + c + "[0m");
                        }

                    }
                    System.out.println();
                }
                Scanner input40 = new Scanner(System.in);
                System.out.println("in che modalità vuoi giocare?\n-singolo-->1\n-doppio-->2\n");
                int singodop = input40.nextInt();
                if (singodop == 2) {
                    // nickname
                    System.out.println();
                    Scanner input10 = new Scanner(System.in);
                    System.out.println("inserire nickname Giocatore 1");
                    String playera = input10.nextLine();
                    System.out.println("\ninserire nickname Giocatore 2");
                    String playerb = input10.nextLine();

                    carte(playera, playerb, provenienza);
                } else {
                    Scanner input11 = new Scanner(System.in);
                    System.out.println("inserire nickname Giocatore 1");
                    String playera = input11.nextLine();

                    cartesingolo(playera, provenienza);
                }

                break;
            case "2":
                System.out.println();
                System.out.println(
                        "In che modalità  vuoi giocare?\n-Singolo --> inserire '1'\n-Doppio --> inserire '2'");
                singolodoppio = input8.nextInt();
                if (singolodoppio == 1) {
                    // nick1
                    System.out.println();
                    Scanner inp13 = new Scanner(System.in);
                    System.out.println(" GIOCATORE , inserisci il tuo nickname");
                    String nick = inp13.nextLine();
                    // nick2

                    String nick2 = "computer";

                    singolodadi(nick, nick2, provenienza);
                } else {// nick1
                    System.out.println();
                    Scanner inp13 = new Scanner(System.in);
                    System.out.println(" GIOCATORE 1, inserisci il tuo nickname");
                    String nick = inp13.nextLine();
                    // nick2
                    System.out.println();
                    System.out.println("GIOCATORE 2, inserisci il tuo nickname");
                    String nick2 = inp13.nextLine();

                    dadi(nick, nick2, provenienza);
                }

                break;
            case "3":
                slotsingolo();

                break;

        }

    }

    public static void tris(char c) {

        // INSEGNA TRIS
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        String[][] b = { { "   ", "   ", "   ", "   ", "   ", "   " },
                { "   ", " T ", " R ", " I ", " S ", "   " },
                { "   ", "   ", "   ", "   ", "   ", "   " } };

        for (int i = 0; i < b.length; i++) {
            System.out.println();
            for (int j = 0; j < b[0].length; j++) {
                if (b[i][j] == "   ") {
                    System.out.print(c + "[40m" + b[i][j] + c + "[0m");
                } else {
                    System.out.print(c + "[41m" + b[i][j] + c + "[0m");
                }

            }
        }

        // tabella punteggi
        System.out.println();
        String z[][] = {
                { "  —————————————————————————————————" },
                { " |  ҉  P U N T E G G I  ҉  | quote |   " },
                { "  —————————————————————————————————" },
                { " |     V I T T O R I A     |   2   |" },
                { "  —————————————————————————————————" },
                { " |     P A R E G G I O     |   1   |" },
                { "  —————————————————————————————————" },
                { " |     S C O N F I T T A   |   0   |" },
                { "  —————————————————————————————————" } };
        for (int i = 0; i < z.length; i++) {
            System.out.println();
            for (int j = 0; j < z[0].length; j++) {
                System.out.print(z[i][j]);
            }
        }

        Scanner input1 = new Scanner(System.in);
        System.out.print(
                "\n\nIn che modalità vuoi giocare?\n-Mod singolo facile inserire --> 1\n-Mod singolo difficile inserire --> 2\n-Doppio inserire --> 3\n");
        String mod = input1.nextLine();
        System.out.println();

        String tris[][] = new String[5][5];
        // riempimento colonne ES
        for (int i = 0; i < tris.length; i++) {
            for (int j = 0; j < tris.length; j++) {

                if (j == 1 || j == 3) {
                    tris[i][j] = "|";
                } else {
                    tris[i][j] = " ";

                }
            }
        }

        // riempimento righe ES
        for (int i = 1; i < tris.length; i += 2) {
            for (int j = 0; j < tris.length; j++) {
                tris[i][j] = "-";

            }
        }

        // riempimento intersezioni ES
        for (int i = 0; i < tris.length; i++) {
            for (int j = 0; j < tris.length; j++) {
                if ((i == 1 && j == 1) || (i == 3 && j == 1) || (i == 3 && j == 3) || (i == 1 && j == 3)) {
                    tris[i][j] = "|";

                }
            }

        }

        // riempimento numeri
        int n = 1;
        String ns = "";
        for (int i = 0; i < tris.length; i += 2) {
            for (int j = 0; j < tris.length; j += 2) {
                ns = String.valueOf(n);
                tris[i][j] = ns;
                n++;
            }

        }

        // SCELTA MOD
        switch (mod) {
            case "1":
                metsingolofac(tris);
                break;
            case "2":
                metsingolodif(tris);
                break;
            case "3":
                metdoppio(tris);
                break;
        }
    }

    /**
     * @param tris
     */
    public static void metsingolofac(String[][] tris) {

        // nickname
        Scanner input4 = new Scanner(System.in);
        System.out.println("inserire nickname");
        String player = input4.nextLine();

        int p = 0;
        int punteggio1 = 0;
        int punteggio2 = 0;
        int quantepartite = 1;
        int punti1[] = new int[33];
        int punti2[] = new int[33];
        int contapunti = 0;

        // scelta inizio
        int provenienza = 1;
        int inizio = 0;
        Scanner input30 = new Scanner(System.in);
        System.out.print("\nin che modo vuoi scegliere chi cominccia?\n-manuale-->1\n-carte-->2\n-dadi-->3\n");
        int iniziale = input30.nextInt();
        switch (iniziale) {
            case 1:
                Scanner input3 = new Scanner(System.in);
                System.out.print("\nchi comincia?\n-io\n-avversario\n");
                String primo = input3.nextLine();
                System.out.println();

                if (primo == "avversario") {
                    inizio = 1;
                }

                break;

            case 2:
                inizio = cartesingolo(player, provenienza);

                break;
            case 3:
                String nomepc = "pc ";
                inizio = singolodadi(player, nomepc, provenienza);

        }

        // scelta segno
        Scanner input2 = new Scanner(System.in);
        System.out.print("\nche segno vuoi utilizzare?\n-x\n-o\n");
        String segno = input2.nextLine();
        System.out.println();
        String utente = "";
        String macchina = "";
        switch (segno) {
            case "x":
                utente = "X";
                macchina = "O";
                break;

            case "o":
                utente = "O";
                macchina = "X";
                break;
        }

        while (p == 0) {

            // stampa primo tris
            for (int i = 0; i < tris.length; i++) {
                System.out.println();
                for (int j = 0; j < tris.length; j++) {
                    System.out.print(" " + tris[i][j] + " ");
                }
            }

            // inizio gioco
            int rip = 0;
            char c = 27;
            int pareggio = 0;

            // creo e riempio array per segnare posizioni già usate
            int contaposizioni[] = new int[9];
            for (int i = 0; i < tris.length; i++) {
                contaposizioni[i] = 0;
            }
            int valorearray = 0;

            Scanner input5 = new Scanner(System.in);
            String coordinata = "";
            // GIOCA INIZIO UTENTE
            if (inizio == 0) {
                while (rip < 9) {
                    if (rip % 2 == 0)// GIOCA UTENTE
                    {
                        if (utente == "X") {
                            System.out.println(
                                    "\n\n" + player + ", basandoti sulla legenda dove vuoi inserire la '" + utente
                                            + "' ?");
                        } else {
                            System.out.println(
                                    "\n\n" + player + ", basandoti sulla legenda dove vuoi inserire il '" + utente
                                            + "' ?");
                        }

                        int b = 0;
                        while (b == 0) {
                            coordinata = input5.nextLine();
                            int conpostutente = Integer.valueOf(coordinata);
                            if (conpostutente < 10) {
                                if (contaposizioni[conpostutente - 1] == 0) {

                                    // turno utente
                                    switch (coordinata) {
                                        case "1":
                                            tris[0][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "2":
                                            tris[0][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "3":
                                            tris[0][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "4":
                                            tris[2][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "5":
                                            tris[2][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "6":
                                            tris[2][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "7":
                                            tris[4][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "8":
                                            tris[4][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "9":
                                            tris[4][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;

                                    }

                                    // controllo vincita
                                    if (tris[0][0] == tris[0][2] && tris[0][0] == tris[0][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[2][0] == tris[2][2] && tris[2][0] == tris[2][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[4][0] == tris[4][2] && tris[4][0] == tris[4][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][0] && tris[0][0] == tris[4][0]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][2] == tris[2][2] && tris[0][2] == tris[4][2]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][4] == tris[2][4] && tris[0][4] == tris[4][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][2] && tris[0][0] == tris[4][4]) {
                                        System.out.println("HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][4] == tris[2][2] && tris[0][4] == tris[4][0]) {
                                        System.out.println("HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[0][1] && tris[0][0] == tris[0][2]) {
                                        System.out.println("HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    b++;
                                } else {
                                    System.out.println("casella occupatsa,riprova");
                                }
                            } else {
                                System.out.println("casella non esistente,riprova");
                            }
                        }
                        // stampa mossa utente

                        for (int i = 0; i < tris.length; i++) {
                            System.out.println();
                            for (int j = 0; j < tris.length; j++) {
                                if (tris[i][j] == macchina || tris[i][j] == utente) {
                                    if (tris[i][j] == utente) {
                                        System.out.print(" " + c + "[31m" + utente + c + "[0m" + " ");

                                    } else {
                                        System.out.print(" " + c + "[34m" + macchina + c + "[0m" + " ");
                                    }
                                } else {
                                    System.out.print(" " + tris[i][j] + " ");
                                }
                                ;
                            }
                        }

                        rip++;
                    } // fine turno utente

                    else {
                        // turno avversario
                        System.out.println("\n\nturno dell'avversario");
                        int a = 0;
                        int conpos = 0;
                        int casella = (int) (Math.random() * 9);
                        String casellas = String.valueOf(casella);
                        int casellagiusta = 0;
                        while (a == 0) {
                            casella = (int) (Math.random() * 9);
                            casellagiusta = casella + 1;
                            casellas = String.valueOf(casellagiusta);
                            conpos = casellagiusta - 1;
                            if (contaposizioni[conpos] == 0) {
                                a++;
                                switch (casellas) {
                                    case "1":
                                        tris[0][0] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "2":
                                        tris[0][2] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "3":
                                        tris[0][4] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "4":
                                        tris[2][0] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "5":
                                        tris[2][2] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "6":
                                        tris[2][4] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "7":
                                        tris[4][0] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "8":
                                        tris[4][2] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "9":
                                        tris[4][4] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;

                                }
                                // controllo vincita
                                if (tris[0][0] == tris[0][2] && tris[0][0] == tris[0][4]) {
                                    System.out.println("\nHAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }
                                if (tris[2][0] == tris[2][2] && tris[2][0] == tris[2][4]) {
                                    System.out.println("\nHAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }
                                if (tris[4][0] == tris[4][2] && tris[4][0] == tris[4][4]) {
                                    System.out.println("\nHAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }

                                if (tris[0][0] == tris[2][0] && tris[0][0] == tris[4][0]) {
                                    System.out.println("\nHAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }
                                if (tris[0][2] == tris[2][2] && tris[0][2] == tris[4][2]) {
                                    System.out.println("\nHAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }
                                if (tris[0][4] == tris[2][4] && tris[0][4] == tris[4][4]) {
                                    System.out.println("\nHAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }

                                if (tris[0][0] == tris[2][2] && tris[0][0] == tris[4][4]) {
                                    System.out.println("HAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }

                                if (tris[0][4] == tris[2][2] && tris[0][4] == tris[4][0]) {
                                    System.out.println("HAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }

                                if (tris[0][0] == tris[0][1] && tris[0][0] == tris[0][2]) {
                                    System.out.println("HAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }

                            }
                        }

                        // prossimo turno e stampa tris
                        rip++;
                        for (int i = 0; i < tris.length; i++) {
                            System.out.println();
                            for (int j = 0; j < tris.length; j++) {

                                if (tris[i][j] == macchina || tris[i][j] == utente) {
                                    if (tris[i][j] == utente) {
                                        System.out.print(" " + c + "[31m" + utente + c + "[0m" + " ");

                                    } else {
                                        System.out.print(" " + c + "[34m" + macchina + c + "[0m" + " ");
                                    }
                                } else {
                                    System.out.print(" " + tris[i][j] + " ");
                                }

                            }
                        }
                    }

                } // fine mosse
            } // fine se inizia utente

            // SE INIZIA AVVERSARIO
            else if (inizio == 1) {
                while (rip < 9) {

                    if (rip % 2 == 0) {
                        // turno avversario
                        System.out.println("\n\nturno dell'avversario");
                        int a = 0;
                        int conpos = 0;
                        int casella = (int) (Math.random() * 9);
                        String casellas = String.valueOf(casella);
                        int casellagiusta = 0;
                        while (a == 0) {
                            casella = (int) (Math.random() * 9);
                            casellagiusta = casella + 1;
                            casellas = String.valueOf(casellagiusta);
                            conpos = casellagiusta - 1;
                            if (contaposizioni[conpos] == 0) {
                                a++;
                                switch (casellas) {
                                    case "1":
                                        tris[0][0] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "2":
                                        tris[0][2] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "3":
                                        tris[0][4] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "4":
                                        tris[2][0] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "5":
                                        tris[2][2] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "6":
                                        tris[2][4] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "7":
                                        tris[4][0] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "8":
                                        tris[4][2] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;
                                    case "9":
                                        tris[4][4] = macchina;
                                        contaposizioni[conpos] = 1;

                                        break;

                                }

                                // controllo vincita
                                if (tris[0][0] == tris[0][2] && tris[0][0] == tris[0][4]) {
                                    System.out.println("\nHAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }
                                if (tris[2][0] == tris[2][2] && tris[2][0] == tris[2][4]) {
                                    System.out.println("\nHAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }
                                if (tris[4][0] == tris[4][2] && tris[4][0] == tris[4][4]) {
                                    System.out.println("\nHAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }

                                if (tris[0][0] == tris[2][0] && tris[0][0] == tris[4][0]) {
                                    System.out.println("\nHAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }
                                if (tris[0][2] == tris[2][2] && tris[0][2] == tris[4][2]) {
                                    System.out.println("\nHAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }
                                if (tris[0][4] == tris[2][4] && tris[0][4] == tris[4][4]) {
                                    System.out.println("\nHAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }

                                if (tris[0][0] == tris[2][2] && tris[0][0] == tris[4][4]) {
                                    System.out.println("HAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }

                                if (tris[0][4] == tris[2][2] && tris[0][4] == tris[4][0]) {
                                    System.out.println("HAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }

                                if (tris[0][0] == tris[0][1] && tris[0][0] == tris[0][2]) {
                                    System.out.println("HAI PERSO!");
                                    rip = 9;
                                    pareggio++;
                                    punteggio2 = punteggio2 + 2;
                                    punti2[contapunti] = 2;
                                    punti1[contapunti] = 0;
                                    contapunti++;
                                }

                            }
                        }
                        // prossimo turno e stampa tris
                        rip++;
                        for (int i = 0; i < tris.length; i++) {
                            System.out.println();
                            for (int j = 0; j < tris.length; j++) {

                                if (tris[i][j] == macchina || tris[i][j] == utente) {
                                    if (tris[i][j] == utente) {
                                        System.out.print(" " + c + "[31m" + utente + c + "[0m" + " ");

                                    } else {
                                        System.out.print(" " + c + "[34m" + macchina + c + "[0m" + " ");
                                    }
                                } else {
                                    System.out.print(" " + tris[i][j] + " ");
                                }

                            }
                        }
                    }

                    else// GIOCA UTENTE
                    {
                        if (utente == "X") {
                            System.out.println(
                                    "\n\n" + player + ", basandoti sulla legenda dove vuoi inserire la '" + utente
                                            + "' ?");
                        } else {
                            System.out.println(
                                    "\n\n" + player + ", basandoti sulla legenda dove vuoi inserire il '" + utente
                                            + "' ?");
                        }
                        int b = 0;
                        while (b == 0) {
                            coordinata = input5.nextLine();
                            int conpostutente = Integer.valueOf(coordinata);
                            if (conpostutente < 10) {
                                if (contaposizioni[conpostutente - 1] == 0) {

                                    // turno utente
                                    switch (coordinata) {
                                        case "1":
                                            tris[0][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "2":
                                            tris[0][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "3":
                                            tris[0][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "4":
                                            tris[2][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "5":
                                            tris[2][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "6":
                                            tris[2][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "7":
                                            tris[4][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "8":
                                            tris[4][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "9":
                                            tris[4][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;

                                    }

                                    // controllo vincita
                                    if (tris[0][0] == tris[0][2] && tris[0][0] == tris[0][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[2][0] == tris[2][2] && tris[2][0] == tris[2][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[4][0] == tris[4][2] && tris[4][0] == tris[4][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][0] && tris[0][0] == tris[4][0]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][2] == tris[2][2] && tris[0][2] == tris[4][2]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][4] == tris[2][4] && tris[0][4] == tris[4][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][2] && tris[0][0] == tris[4][4]) {
                                        System.out.println("HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][4] == tris[2][2] && tris[0][4] == tris[4][0]) {
                                        System.out.println("HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[0][1] && tris[0][0] == tris[0][2]) {
                                        System.out.println("HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    b++;
                                } else {
                                    System.out.println("casella occupatsa,riprova");
                                }
                            } else {
                                System.out.println("casella non esistente,riprova");
                            }
                        }
                        // stampa mossa utente

                        for (int i = 0; i < tris.length; i++) {
                            System.out.println();
                            for (int j = 0; j < tris.length; j++) {
                                if (tris[i][j] == macchina || tris[i][j] == utente) {
                                    if (tris[i][j] == utente) {
                                        System.out.print(" " + c + "[31m" + utente + c + "[0m" + " ");

                                    } else {
                                        System.out.print(" " + c + "[34m" + macchina + c + "[0m" + " ");
                                    }
                                } else {
                                    System.out.print(" " + tris[i][j] + " ");
                                }
                                ;
                            }
                        }

                        rip++;
                    } // fine turno utente

                }

            }
            if (pareggio == 0) {
                System.out.print("\n\n PAREGGIO");
                punteggio1 = punteggio1 + 1;
                punteggio2 = punteggio2 + 1;
                punti2[contapunti] = 1;
                punti1[contapunti] = 1;
                contapunti++;
            }
            pareggio = 0;

            Scanner input6 = new Scanner(System.in);
            System.out.println("\n\nVuoi fare un'altra partita ?\n-sì --> inserire '1'\n-no --> inserire '2'\n");
            int piuMatch = input6.nextInt();

            if (piuMatch == 1) {
                quantepartite++;

                // riempimento colonne ES
                for (int i = 0; i < tris.length; i++) {
                    for (int j = 0; j < tris.length; j++) {

                        if (j == 1 || j == 3) {
                            tris[i][j] = "|";
                        } else {
                            tris[i][j] = " ";

                        }
                    }
                }

                // riempimento righe ES
                for (int i = 1; i < tris.length; i += 2) {
                    for (int j = 0; j < tris.length; j++) {
                        tris[i][j] = "-";

                    }
                }

                // riempimento intersezioni ES
                for (int i = 0; i < tris.length; i++) {
                    for (int j = 0; j < tris.length; j++) {
                        if ((i == 1 && j == 1) || (i == 3 && j == 1) || (i == 3 && j == 3) || (i == 1 && j == 3)) {
                            tris[i][j] = "|";

                        }
                    }

                }

                // riempimento numeri
                int n = 1;
                String ns = "";
                for (int i = 0; i < tris.length; i += 2) {
                    for (int j = 0; j < tris.length; j += 2) {
                        ns = String.valueOf(n);
                        tris[i][j] = ns;
                        n++;
                    }

                }

            } else {
                p = 1;

            }

        }

        // tabella punti
        char color = 27;
        System.out.println();

        System.out.print(color + "[31m" + player + color + "[0m");
        System.out.print(color + "[34m" + " macchina" + color + "[0m");

        System.out.println();

        System.out.print("-----------------");
        System.out.println();
        System.out.print("|punteggi finali |");

        System.out.println();
        System.out.print("-----------------");
        System.out.println();
        for (int i = 0; i < quantepartite; i++) {
            System.out.print("partita " + (i + 1));
            System.out.print("|");
            System.out.print(" ");

            System.out.print(color + "[31m" + punti1[i] + color + "[0m");

            System.out.print(" ");
            System.out.print("|");
            System.out.print(" ");

            System.out.print(color + "[34m" + punti2[i] + color + "[0m");

            System.out.print(" ");
            System.out.print("|");
            System.out.println();
            System.out.print("-----------------");
            System.out.println();

        }

        System.out.print("punti tot");
        System.out.print("| ");
        System.out.print(punteggio1);
        System.out.print(" | ");
        System.out.print(punteggio2);
        System.out.print(" |");
        System.out.println();
        System.out.print("-----------------");
        System.out.println();
        System.out.println();

        // grafico
        int contomeno = 0;
        if (punteggio1 > punteggio2) {
            contomeno = punteggio1 + 3;
        } else {
            contomeno = punteggio2 + 3;
        }
        for (int i = contomeno; i > 0; i--) {
            if (i <= 9) {
                System.out.print(i);
                System.out.print(" | ");
            } else {
                System.out.print(i);
                System.out.print("| ");
            }

            if (punteggio1 >= i) {
                System.out.print(color + "[41;33;1m" + " " + color + "[0m");
            } else {
                System.out.print(" ");
            }
            System.out.print(" ");
            if (punteggio2 >= i) {
                System.out.print(color + "[44;33;1m" + " " + color + "[0m");
            } else {
                System.out.print(" ");
            }
            System.out.println(" ");

        }
        System.out.print("  -----");
        Scanner cambio = new Scanner(System.in);
        System.out.println();
        System.out.println("\n\nVuoi cambiare gioco ?\n-sì --> inserire '1'\n-no --> inserire '2'\n");
        int cambiagioco = cambio.nextInt();
        if (cambiagioco == 1) {
            inizio();
        }

    }// fine metodo gioco singolo

    // inizia gioco in doppio
    public static void metdoppio(String[][] tris) {
        // nickname
        Scanner input4 = new Scanner(System.in);
        System.out.println("inserire nickname Giocatore 1");
        String player = input4.nextLine();
        System.out.println("\ninserire nickname Giocatore 2");
        String player2 = input4.nextLine();

        // scelta inizio
        int provenienza = 1;
        System.out.println();
        Scanner scelta = new Scanner(System.in);
        System.out.println(
                "\nCome vuoi decidere chi inizia? \n-Manualmente --> inserire '1'\n-Carte --> inserire '2'\n-Dadi --> inserire '3'\n");
        int sceltamodinizio = scelta.nextInt();
        // inizio manuale
        int inizio = 0;
        if (sceltamodinizio == 1) {
            Scanner input3 = new Scanner(System.in);
            System.out.print("\nchi comincia?\n" + player + " --> inserire '1'\n" + player2 + " --> inserire '2'");
            String primo = input3.nextLine();
            System.out.println();

            switch (primo) {
                case "2":
                    inizio = 1;
                    break;
            }
        }
        // inizio con carte
        if (sceltamodinizio == 2) {

            inizio = carte(player, player2, provenienza);

        }
        // inizio con dadi
        if (sceltamodinizio == 3) {
            inizio = dadi(player, player2, provenienza);

        }

        // scelta segno
        Scanner input2 = new Scanner(System.in);
        System.out.print("\n" + player + " che segno vuoi utilizzare?\n-x\n-o\n");
        String segno = input2.nextLine();
        System.out.println();
        String utente = "";
        String macchina = "";
        switch (segno) {
            case "x":
                utente = "X";
                macchina = "O";
                break;

            case "o":
                utente = "O";
                macchina = "X";
                break;
        }

        int pi = 0;
        int punteggio1 = 0;
        int punteggio2 = 0;
        int quantepartite = 1;
        int punti1[] = new int[33];
        int punti2[] = new int[33];
        int contapunti = 0;
        while (pi == 0) {
            // stampa primo tris
            for (int i = 0; i < tris.length; i++) {
                System.out.println();
                for (int j = 0; j < tris.length; j++) {
                    System.out.print(" " + tris[i][j] + " ");
                }
            }

            // inizio gioco
            int rip = 0;
            char c = 27;
            int pareggio = 0;

            // creo e riempio array per segnare posizioni già usate
            int contaposizioni[] = new int[9];
            for (int i = 0; i < tris.length; i++) {
                contaposizioni[i] = 0;
            }
            int valorearray = 0;

            Scanner input5 = new Scanner(System.in);
            String coordinata = "";
            // GIOCA INIZIO prima g1
            if (inizio == 0) {
                while (rip < 9) {
                    if (rip % 2 == 0)// GIOCA UTENTE1
                    {
                        if (utente == "X") {
                            System.out.println(
                                    "\n\n" + c + "[31m" + player + c + "[0m"
                                            + ", basandoti sulla legenda dove vuoi inserire la '" + utente + "' ?");
                        } else {
                            System.out.println(
                                    "\n\n" + c + "[31m" + player + c + "[0m"
                                            + ", basandoti sulla legenda dove vuoi inserire il '" + utente + "' ?");
                        }

                        int b = 0;
                        while (b == 0) {
                            coordinata = input5.nextLine();
                            int conpostutente = Integer.valueOf(coordinata);
                            if (conpostutente < 10) {
                                if (contaposizioni[conpostutente - 1] == 0) {

                                    // turno utente
                                    switch (coordinata) {
                                        case "1":
                                            tris[0][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "2":
                                            tris[0][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "3":
                                            tris[0][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "4":
                                            tris[2][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "5":
                                            tris[2][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "6":
                                            tris[2][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "7":
                                            tris[4][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "8":
                                            tris[4][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "9":
                                            tris[4][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;

                                    }

                                    // controllo vincita
                                    if (tris[0][0] == tris[0][2] && tris[0][0] == tris[0][4]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[2][0] == tris[2][2] && tris[2][0] == tris[2][4]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[4][0] == tris[4][2] && tris[4][0] == tris[4][4]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][0] && tris[0][0] == tris[4][0]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][2] == tris[2][2] && tris[0][2] == tris[4][2]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][4] == tris[2][4] && tris[0][4] == tris[4][4]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][2] && tris[0][0] == tris[4][4]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][4] == tris[2][2] && tris[0][4] == tris[4][0]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[0][1] && tris[0][0] == tris[0][2]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    b++;
                                } else {
                                    System.out.println("casella occupatsa,riprova");
                                }
                            } else {
                                System.out.println("casella non esistente,riprova");
                            }
                        }
                        // stampa mossa utente

                        for (int i = 0; i < tris.length; i++) {
                            System.out.println();
                            for (int j = 0; j < tris.length; j++) {
                                if (tris[i][j] == macchina || tris[i][j] == utente) {
                                    if (tris[i][j] == utente) {
                                        System.out.print(" " + c + "[31m" + utente + c + "[0m" + " ");

                                    } else {
                                        System.out.print(" " + c + "[34m" + macchina + c + "[0m" + " ");
                                    }
                                } else {
                                    System.out.print(" " + tris[i][j] + " ");
                                }
                                ;
                            }
                        }

                        rip++;
                    } // fine turno utente 1

                    else { // inizio turno utente 2
                        if (macchina == "X") {
                            System.out.println(
                                    "\n\n" + c + "[34m" + player2 + c + "[0m"
                                            + ", basandoti sulla legenda dove vuoi inserire la '" + macchina
                                            + "' ?");
                        } else {
                            System.out.println(
                                    "\n\n" + c + "[34m" + player2 + c + "[0m"
                                            + ", basandoti sulla legenda dove vuoi inserire il '" + macchina
                                            + "' ?");
                        }

                        int b = 0;
                        while (b == 0) {
                            coordinata = input5.nextLine();
                            int conpostutente = Integer.valueOf(coordinata);
                            if (conpostutente < 10) {
                                if (contaposizioni[conpostutente - 1] == 0) {

                                    // turno utente
                                    switch (coordinata) {
                                        case "1":
                                            tris[0][0] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "2":
                                            tris[0][2] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "3":
                                            tris[0][4] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "4":
                                            tris[2][0] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "5":
                                            tris[2][2] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "6":
                                            tris[2][4] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "7":
                                            tris[4][0] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "8":
                                            tris[4][2] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "9":
                                            tris[4][4] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;

                                    }

                                    // controllo vincita
                                    if (tris[0][0] == tris[0][2] && tris[0][0] == tris[0][4]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[2][0] == tris[2][2] && tris[2][0] == tris[2][4]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[4][0] == tris[4][2] && tris[4][0] == tris[4][4]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][0] && tris[0][0] == tris[4][0]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][2] == tris[2][2] && tris[0][2] == tris[4][2]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][4] == tris[2][4] && tris[0][4] == tris[4][4]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][2] && tris[0][0] == tris[4][4]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][4] == tris[2][2] && tris[0][4] == tris[4][0]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[0][1] && tris[0][0] == tris[0][2]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }

                                    b++;
                                } else {
                                    System.out.println("casella occupatsa,riprova");
                                }
                            } else {
                                System.out.println("casella non esistente,riprova");
                            }
                        }
                        // stampa mossa utente

                        for (int i = 0; i < tris.length; i++) {
                            System.out.println();
                            for (int j = 0; j < tris.length; j++) {
                                if (tris[i][j] == macchina || tris[i][j] == utente) {
                                    if (tris[i][j] == utente) {
                                        System.out.print(" " + c + "[31m" + utente + c + "[0m" + " ");

                                    } else {
                                        System.out.print(" " + c + "[34m" + macchina + c + "[0m" + " ");
                                    }
                                } else {
                                    System.out.print(" " + tris[i][j] + " ");
                                }
                                ;
                            }
                        }

                        rip++;
                    }

                } // fine mosse
            } // fine se inizia g1

            // SE INIZIA g2
            else if (inizio == 1) {
                while (rip < 9) {

                    if (rip % 2 != 0)// GIOCA UTENTE1
                    {
                        if (utente == "X") {
                            System.out.println(
                                    "\n\n" + c + "[31m" + player + c + "[0m"
                                            + ", basandoti sulla legenda dove vuoi inserire la '" + utente + "' ?");
                        } else {
                            System.out.println(
                                    "\n\n" + c + "[31m" + player + c + "[0m"
                                            + ", basandoti sulla legenda dove vuoi inserire il '" + utente + "' ?");
                        }

                        int b = 0;
                        while (b == 0) {
                            coordinata = input5.nextLine();
                            int conpostutente = Integer.valueOf(coordinata);
                            if (conpostutente < 10) {
                                if (contaposizioni[conpostutente - 1] == 0) {

                                    // turno utente
                                    switch (coordinata) {
                                        case "1":
                                            tris[0][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "2":
                                            tris[0][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "3":
                                            tris[0][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "4":
                                            tris[2][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "5":
                                            tris[2][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "6":
                                            tris[2][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "7":
                                            tris[4][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "8":
                                            tris[4][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "9":
                                            tris[4][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;

                                    }

                                    // controllo vincita
                                    if (tris[0][0] == tris[0][2] && tris[0][0] == tris[0][4]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[2][0] == tris[2][2] && tris[2][0] == tris[2][4]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[4][0] == tris[4][2] && tris[4][0] == tris[4][4]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][0] && tris[0][0] == tris[4][0]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][2] == tris[2][2] && tris[0][2] == tris[4][2]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][4] == tris[2][4] && tris[0][4] == tris[4][4]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][2] && tris[0][0] == tris[4][4]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][4] == tris[2][2] && tris[0][4] == tris[4][0]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[0][1] && tris[0][0] == tris[0][2]) {
                                        System.out.println("\n" + c + "[31m" + player + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    b++;
                                } else {
                                    System.out.println("casella occupatsa,riprova");
                                }
                            } else {
                                System.out.println("casella non esistente,riprova");
                            }
                        }
                        // stampa mossa utente

                        for (int i = 0; i < tris.length; i++) {
                            System.out.println();
                            for (int j = 0; j < tris.length; j++) {
                                if (tris[i][j] == macchina || tris[i][j] == utente) {
                                    if (tris[i][j] == utente) {
                                        System.out.print(" " + c + "[31m" + utente + c + "[0m" + " ");

                                    } else {
                                        System.out.print(" " + c + "[34m" + macchina + c + "[0m" + " ");
                                    }
                                } else {
                                    System.out.print(" " + tris[i][j] + " ");
                                }
                                ;
                            }
                        }

                        rip++;
                    } // fine turno utente 1

                    else { // inizio turno utente 2
                        if (macchina == "X") {
                            System.out.println(
                                    "\n\n" + c + "[34m" + player2 + c + "[0m"
                                            + ", basandoti sulla legenda dove vuoi inserire la '" + macchina
                                            + "' ?");
                        } else {
                            System.out.println(
                                    "\n\n" + c + "[34m" + player2 + c + "[0m"
                                            + ", basandoti sulla legenda dove vuoi inserire il '" + macchina
                                            + "' ?");
                        }

                        int b = 0;
                        while (b == 0) {
                            coordinata = input5.nextLine();
                            int conpostutente = Integer.valueOf(coordinata);
                            if (conpostutente < 10) {
                                if (contaposizioni[conpostutente - 1] == 0) {

                                    // turno utente
                                    switch (coordinata) {
                                        case "1":
                                            tris[0][0] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "2":
                                            tris[0][2] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "3":
                                            tris[0][4] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "4":
                                            tris[2][0] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "5":
                                            tris[2][2] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "6":
                                            tris[2][4] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "7":
                                            tris[4][0] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "8":
                                            tris[4][2] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "9":
                                            tris[4][4] = macchina;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;

                                    }

                                    // controllo vincita
                                    if (tris[0][0] == tris[0][2] && tris[0][0] == tris[0][4]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[2][0] == tris[2][2] && tris[2][0] == tris[2][4]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[4][0] == tris[4][2] && tris[4][0] == tris[4][4]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][0] && tris[0][0] == tris[4][0]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][2] == tris[2][2] && tris[0][2] == tris[4][2]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][4] == tris[2][4] && tris[0][4] == tris[4][4]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][2] && tris[0][0] == tris[4][4]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][4] == tris[2][2] && tris[0][4] == tris[4][0]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[0][1] && tris[0][0] == tris[0][2]) {
                                        System.out.println("\n" + c + "[34m" + player2 + c + "[0m" + " HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio2 = punteggio2 + 2;
                                        punti2[contapunti] = 2;
                                        punti1[contapunti] = 0;
                                        contapunti++;
                                    }

                                    b++;
                                } else {
                                    System.out.println("casella occupatsa,riprova");
                                }
                            } else {
                                System.out.println("casella non esistente,riprova");
                            }
                        }
                        // stampa mossa utente

                        for (int i = 0; i < tris.length; i++) {
                            System.out.println();
                            for (int j = 0; j < tris.length; j++) {
                                if (tris[i][j] == macchina || tris[i][j] == utente) {
                                    if (tris[i][j] == utente) {
                                        System.out.print(" " + c + "[31m" + utente + c + "[0m" + " ");

                                    } else {
                                        System.out.print(" " + c + "[34m" + macchina + c + "[0m" + " ");
                                    }
                                } else {
                                    System.out.print(" " + tris[i][j] + " ");
                                }
                                ;
                            }
                        }

                        rip++;
                    }

                }

            }
            if (pareggio == 0) {
                System.out.print("\n\n PAREGGIO");
                punteggio1 = punteggio1 + 1;
                punteggio2 = punteggio2 + 1;
                punti2[contapunti] = 1;
                punti1[contapunti] = 1;
                contapunti++;

            }
            pareggio = 0;

            Scanner input8 = new Scanner(System.in);
            System.out.println("\n\nVuoi fare un'altra partita ?\n-sì --> inserire '1'\n-no --> inserire '2'\n");
            int piuMatch = input8.nextInt();

            if (piuMatch == 1) {
                quantepartite++;

                // riempimento colonne ES
                for (int i = 0; i < tris.length; i++) {
                    for (int j = 0; j < tris.length; j++) {

                        if (j == 1 || j == 3) {
                            tris[i][j] = "|";
                        } else {
                            tris[i][j] = " ";

                        }
                    }
                }

                // riempimento righe ES
                for (int i = 1; i < tris.length; i += 2) {
                    for (int j = 0; j < tris.length; j++) {
                        tris[i][j] = "-";

                    }
                }

                // riempimento intersezioni ES
                for (int i = 0; i < tris.length; i++) {
                    for (int j = 0; j < tris.length; j++) {
                        if ((i == 1 && j == 1) || (i == 3 && j == 1) || (i == 3 && j == 3) || (i == 1 && j == 3)) {
                            tris[i][j] = "|";

                        }
                    }

                }

                // riempimento numeri
                int n = 1;
                String ns = "";
                for (int i = 0; i < tris.length; i += 2) {
                    for (int j = 0; j < tris.length; j += 2) {
                        ns = String.valueOf(n);
                        tris[i][j] = ns;
                        n++;
                    }

                }

            } else {
                pi = 2;
            }
        }
        // tabella punti
        char color = 27;
        System.out.println();

        System.out.print(color + "[31m" + player + color + "[0m");
        System.out.print("  " + color + "[34m" + player2 + color + "[0m");

        System.out.println();

        System.out.print("-----------------");
        System.out.println();
        System.out.print("|punteggi finali |");

        System.out.println();
        System.out.print("-----------------");
        System.out.println();
        for (int i = 0; i < quantepartite; i++) {
            System.out.print("partita " + (i + 1));
            System.out.print("|");
            System.out.print(" ");

            System.out.print(color + "[31m" + punti1[i] + color + "[0m");

            System.out.print(" ");
            System.out.print("|");
            System.out.print(" ");

            System.out.print(color + "[34m" + punti2[i] + color + "[0m");

            System.out.print(" ");
            System.out.print("|");
            System.out.println();
            System.out.print("-----------------");
            System.out.println();

        }

        System.out.print("punti tot");
        System.out.print("| ");
        System.out.print(punteggio1);
        System.out.print(" | ");
        System.out.print(punteggio2);
        System.out.print(" |");
        System.out.println();
        System.out.print("-----------------");
        System.out.println();
        System.out.println();

        // grafico
        int contomeno = 0;
        if (punteggio1 > punteggio2) {
            contomeno = punteggio1 + 3;
        } else {
            contomeno = punteggio2 + 3;
        }
        for (int i = contomeno; i > 0; i--) {
            if (i <= 9) {
                System.out.print(i);
                System.out.print(" | ");
            } else {
                System.out.print(i);
                System.out.print("| ");
            }

            if (punteggio1 >= i) {
                System.out.print(color + "[41;33;1m" + " " + color + "[0m");
            } else {
                System.out.print(" ");
            }
            System.out.print(" ");
            if (punteggio2 >= i) {
                System.out.print(color + "[44;33;1m" + " " + color + "[0m");
            } else {
                System.out.print(" ");
            }
            System.out.println(" ");

        }
        System.out.print("  -----");
        // cambio gioco
        Scanner cambio = new Scanner(System.in);
        System.out.println();
        System.out.println("\n\nVuoi cambiare gioco ?\n-sì --> inserire '1'\n-no --> inserire '2'\n");
        int cambiagioco = cambio.nextInt();
        if (cambiagioco == 1) {
            inizio();
        }

    }// fine metodo gioco doppio

    // INIZIO MET DIFFICILE
    public static void metsingolodif(String tris[][]) {

        // nickname
        Scanner input4 = new Scanner(System.in);
        System.out.println("inserire nickname");
        String player = input4.nextLine();

        // scelta inizio
        int inizio = 0;
        int provenienza = 1;
        Scanner input30 = new Scanner(System.in);
        System.out.print("\nin che modo vuoi decidere chi comincia?\n-manuale-->1\n-carte-->2\n-dadi-->3\n");
        int metodo = input30.nextInt();
        switch (metodo) {
            case 1:
                Scanner input3 = new Scanner(System.in);
                System.out.print("\nchi comincia?\n-io\n-avversario\n");
                String primo = input3.nextLine();
                System.out.println();

                switch (primo) {
                    case "avversario":
                        inizio = 1;
                        break;
                }
                break;
            case 2:
                inizio = cartesingolo(player, provenienza);

                break;
            case 3:
                String nome = "pc ";
                inizio = singolodadi(player, nome, provenienza);
                break;

        }

        // scelta segno
        Scanner input2 = new Scanner(System.in);
        System.out.print("\nche segno vuoi utilizzare?\n-x\n-o\n");
        String segno = input2.nextLine();
        System.out.println();
        String utente = "";
        String macchina = "";
        switch (segno) {
            case "x":
                utente = "X";
                macchina = "O";
                break;

            case "o":
                utente = "O";
                macchina = "X";
                break;
        }

        int p = 0;
        int punteggio1 = 0;
        int punteggio2 = 0;
        int quantepartite = 1;
        int punti1[] = new int[33];
        int punti2[] = new int[33];
        int contapunti = 0;
        while (p == 0) {

            // stampa primo tris
            for (int i = 0; i < tris.length; i++) {
                System.out.println();
                for (int j = 0; j < tris.length; j++) {
                    System.out.print(" " + tris[i][j] + " ");
                }
            }

            // inizio gioco
            int rip = 0;
            char c = 27;
            int pareggio = 0;

            // creo e riempio array per segnare posizioni già usate
            int contaposizioni[] = new int[9];
            for (int i = 0; i < tris.length; i++) {
                contaposizioni[i] = 0;
            }
            int valorearray = 0;

            Scanner input5 = new Scanner(System.in);
            String coordinata = "";
            // GIOCA INIZIO UTENTE
            if (inizio == 0) {
                while (rip < 10) {
                    if (rip % 2 == 0)// GIOCA UTENTE
                    {
                        if (utente == "X") {
                            System.out.println(
                                    "\n\n" + player + ", basandoti sulla legenda dove vuoi inserire la '" + utente
                                            + "' ?");
                        } else {
                            System.out.println(
                                    "\n\n" + player + ", basandoti sulla legenda dove vuoi inserire il '" + utente
                                            + "' ?");
                        }

                        int b = 0;
                        while (b == 0) {
                            coordinata = input5.nextLine();
                            int conpostutente = Integer.valueOf(coordinata);
                            if (conpostutente < 10) {
                                if (contaposizioni[conpostutente - 1] == 0) {

                                    // turno utente
                                    switch (coordinata) {
                                        case "1":
                                            tris[0][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "2":
                                            tris[0][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "3":
                                            tris[0][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "4":
                                            tris[2][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "5":
                                            tris[2][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "6":
                                            tris[2][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "7":
                                            tris[4][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "8":
                                            tris[4][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "9":
                                            tris[4][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;

                                    }

                                    // controllo vincita
                                    if (tris[0][0] == tris[0][2] && tris[0][0] == tris[0][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[2][0] == tris[2][2] && tris[2][0] == tris[2][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[4][0] == tris[4][2] && tris[4][0] == tris[4][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][0] && tris[0][0] == tris[4][0]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][2] == tris[2][2] && tris[0][2] == tris[4][2]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][4] == tris[2][4] && tris[0][4] == tris[4][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][2] && tris[0][0] == tris[4][4]) {
                                        System.out.println("HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][4] == tris[2][2] && tris[0][4] == tris[4][0]) {
                                        System.out.println("HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[0][1] && tris[0][0] == tris[0][2]) {
                                        System.out.println("HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    b++;
                                } else {
                                    System.out.println("casella occupatsa,riprova");
                                }
                            } else {
                                System.out.println("casella non esistente,riprova");
                            }
                        }
                        // stampa mossa utente

                        for (int i = 0; i < tris.length; i++) {
                            System.out.println();
                            for (int j = 0; j < tris.length; j++) {
                                if (tris[i][j] == macchina || tris[i][j] == utente) {
                                    if (tris[i][j] == utente) {
                                        System.out.print(" " + c + "[31m" + utente + c + "[0m" + " ");

                                    } else {
                                        System.out.print(" " + c + "[34m" + macchina + c + "[0m" + " ");
                                    }
                                } else {
                                    System.out.print(" " + tris[i][j] + " ");
                                }
                                ;
                            }
                        }

                        rip++;
                    } // fine turno utente

                    else {
                        // turno avversario
                        System.out.println("\n\nturno dell'avversario");

                        int t = 0;

                        // mosse a favore macchina
                        if (t == 0 && tris[0][0] == macchina && tris[0][2] == macchina && tris[0][4] != "X"
                                && tris[0][4] != "O") {
                            tris[0][4] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][0] == macchina && tris[2][2] == macchina && tris[2][4] != "X"
                                && tris[2][4] != "O") {
                            tris[2][4] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][0] == macchina && tris[4][2] == macchina && tris[4][4] != "X"
                                && tris[4][4] != "O") {
                            tris[4][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][4] == macchina && tris[0][2] == macchina && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][4] == macchina && tris[2][2] == macchina && tris[2][0] != "X"
                                && tris[2][0] != "O") {
                            tris[2][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == macchina && tris[4][2] == macchina && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == macchina && tris[2][0] == macchina && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][2] == macchina && tris[2][2] == macchina && tris[4][2] != "X"
                                && tris[4][2] != "O") {
                            tris[4][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == macchina && tris[2][4] == macchina && tris[4][4] != "X"
                                && tris[4][4] != "O") {
                            tris[4][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[4][0] == macchina && tris[2][0] == macchina && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][2] == macchina && tris[2][2] == macchina && tris[0][2] != "X"
                                && tris[0][2] != "O") {
                            tris[0][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == macchina && tris[2][4] == macchina && tris[0][4] != "X"
                                && tris[0][4] != "O") {
                            tris[0][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][4] == macchina && tris[0][2] == macchina && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][4] == macchina && tris[2][2] == macchina && tris[2][0] != "X"
                                && tris[2][0] != "O") {
                            tris[2][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == macchina && tris[4][2] == macchina && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == macchina && tris[0][4] == macchina && tris[0][2] != "X"
                                && tris[0][2] != "O") {
                            tris[0][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][0] == macchina && tris[2][4] == macchina && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][0] == macchina && tris[4][4] == macchina && tris[4][2] != "X"
                                && tris[4][2] != "O") {
                            tris[4][2] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == macchina && tris[4][0] == macchina && tris[2][0] != "X"
                                && tris[2][0] != "O") {
                            tris[2][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][2] == macchina && tris[4][2] == macchina && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == macchina && tris[4][4] == macchina && tris[2][4] != "X"
                                && tris[2][4] != "O") {
                            tris[2][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == macchina && tris[4][4] == macchina && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == macchina && tris[4][0] == macchina && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == macchina && tris[2][2] == macchina && tris[4][4] != "X"
                                && tris[4][4] != "O") {
                            tris[4][4] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == macchina && tris[2][2] == macchina && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == macchina && tris[2][2] == macchina && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][0] == macchina && tris[2][2] == macchina && tris[0][4] != "X"
                                && tris[0][4] != "O") {
                            tris[0][4] = macchina;
                            t++;
                        }

                        // mosse contro utente
                        if (t == 0 && tris[0][0] == utente && tris[0][2] == utente && tris[0][4] != "X"
                                && tris[0][4] != "O") {
                            tris[0][4] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][0] == utente && tris[2][2] == utente && tris[2][4] != "X"
                                && tris[2][4] != "O") {
                            tris[2][4] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][0] == utente && tris[4][2] == utente && tris[4][4] != "X"
                                && tris[4][4] != "O") {
                            tris[4][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][4] == utente && tris[0][2] == utente && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][4] == utente && tris[2][2] == utente && tris[2][0] != "X"
                                && tris[2][0] != "O") {
                            tris[2][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == utente && tris[4][2] == utente && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == utente && tris[2][0] == utente && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][2] == utente && tris[2][2] == utente && tris[4][2] != "X"
                                && tris[4][2] != "O") {
                            tris[4][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == utente && tris[2][4] == utente && tris[4][4] != "X"
                                && tris[4][4] != "O") {
                            tris[4][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[4][0] == utente && tris[2][0] == utente && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][2] == utente && tris[2][2] == utente && tris[0][2] != "X"
                                && tris[0][2] != "O") {
                            tris[0][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == utente && tris[2][4] == utente && tris[0][4] != "X"
                                && tris[0][4] != "O") {
                            tris[0][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][4] == utente && tris[0][2] == utente && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][4] == utente && tris[2][2] == utente && tris[2][0] != "X"
                                && tris[2][0] != "O") {
                            tris[2][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == utente && tris[4][2] == utente && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == utente && tris[0][4] == utente && tris[0][2] != "X"
                                && tris[0][2] != "O") {
                            tris[0][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][0] == utente && tris[2][4] == utente && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][0] == utente && tris[4][4] == utente && tris[4][2] != "X"
                                && tris[4][2] != "O") {
                            tris[4][2] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == utente && tris[4][0] == utente && tris[2][0] != "X"
                                && tris[2][0] != "O") {
                            tris[2][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][2] == utente && tris[4][2] == utente && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == utente && tris[4][4] == utente && tris[2][4] != "X"
                                && tris[2][4] != "O") {
                            tris[2][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == utente && tris[4][4] == utente && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == utente && tris[4][0] == utente && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == utente && tris[2][2] == utente && tris[4][4] != "X"
                                && tris[4][4] != "O") {
                            tris[4][4] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == utente && tris[2][2] == utente && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == utente && tris[2][2] == utente && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][0] == utente && tris[2][2] == utente && tris[0][4] != "X"
                                && tris[0][4] != "O") {
                            tris[0][4] = macchina;
                            t++;
                        }

                        if (t == 0) {

                            int a = 0;
                            int conpos = 0;
                            int casella = (int) (Math.random() * 9);
                            String casellas = String.valueOf(casella);
                            int casellagiusta = 0;
                            while (a == 0) {
                                casella = (int) (Math.random() * 9);
                                casellagiusta = casella + 1;
                                casellas = String.valueOf(casellagiusta);
                                conpos = casellagiusta - 1;
                                if (contaposizioni[conpos] == 0) {
                                    a++;
                                    switch (casellas) {
                                        case "1":
                                            tris[0][0] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "2":
                                            tris[0][2] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "3":
                                            tris[0][4] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "4":
                                            tris[2][0] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "5":
                                            tris[2][2] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "6":
                                            tris[2][4] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "7":
                                            tris[4][0] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "8":
                                            tris[4][2] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "9":
                                            tris[4][4] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;

                                    }

                                }
                            }
                        }
                        // controllo vincita
                        if (tris[0][0] == tris[0][2] && tris[0][0] == tris[0][4]) {
                            System.out.println("\nHAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }
                        if (tris[2][0] == tris[2][2] && tris[2][0] == tris[2][4]) {
                            System.out.println("\nHAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }
                        if (tris[4][0] == tris[4][2] && tris[4][0] == tris[4][4]) {
                            System.out.println("\nHAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }

                        if (tris[0][0] == tris[2][0] && tris[0][0] == tris[4][0]) {
                            System.out.println("\nHAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }
                        if (tris[0][2] == tris[2][2] && tris[0][2] == tris[4][2]) {
                            System.out.println("\nHAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }
                        if (tris[0][4] == tris[2][4] && tris[0][4] == tris[4][4]) {
                            System.out.println("\nHAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }

                        if (tris[0][0] == tris[2][2] && tris[0][0] == tris[4][4]) {
                            System.out.println("HAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }

                        if (tris[0][4] == tris[2][2] && tris[0][4] == tris[4][0]) {
                            System.out.println("HAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }

                        if (tris[0][0] == tris[0][1] && tris[0][0] == tris[0][2]) {
                            System.out.println("HAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }

                        // prossimo turno e stampa tris
                        rip++;
                        for (int i = 0; i < tris.length; i++) {
                            System.out.println();
                            for (int j = 0; j < tris.length; j++) {

                                if (tris[i][j] == macchina || tris[i][j] == utente) {
                                    if (tris[i][j] == utente) {
                                        System.out.print(" " + c + "[31m" + utente + c + "[0m" + " ");

                                    } else {
                                        System.out.print(" " + c + "[34m" + macchina + c + "[0m" + " ");
                                    }
                                } else {
                                    System.out.print(" " + tris[i][j] + " ");
                                }

                            }
                        }
                    }

                } // fine mosse
            } // fine se inizia utente

            // SE INIZIA AVVERSARIO
            else if (inizio == 1) {
                while (rip < 9) {

                    if (rip % 2 == 0) {
                        // turno avversario
                        System.out.println("\n\nturno dell'avversario");

                        int t = 0;

                        // mosse a favore macchina
                        if (t == 0 && tris[0][0] == macchina && tris[0][2] == macchina && tris[0][4] != "X"
                                && tris[0][4] != "O") {
                            tris[0][4] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][0] == macchina && tris[2][2] == macchina && tris[2][4] != "X"
                                && tris[2][4] != "O") {
                            tris[2][4] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][0] == macchina && tris[4][2] == macchina && tris[4][4] != "X"
                                && tris[4][4] != "O") {
                            tris[4][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][4] == macchina && tris[0][2] == macchina && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][4] == macchina && tris[2][2] == macchina && tris[2][0] != "X"
                                && tris[2][0] != "O") {
                            tris[2][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == macchina && tris[4][2] == macchina && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == macchina && tris[2][0] == macchina && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][2] == macchina && tris[2][2] == macchina && tris[4][2] != "X"
                                && tris[4][2] != "O") {
                            tris[4][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == macchina && tris[2][4] == macchina && tris[4][4] != "X"
                                && tris[4][4] != "O") {
                            tris[4][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[4][0] == macchina && tris[2][0] == macchina && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][2] == macchina && tris[2][2] == macchina && tris[0][2] != "X"
                                && tris[0][2] != "O") {
                            tris[0][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == macchina && tris[2][4] == macchina && tris[0][4] != "X"
                                && tris[0][4] != "O") {
                            tris[0][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][4] == macchina && tris[0][2] == macchina && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][4] == macchina && tris[2][2] == macchina && tris[2][0] != "X"
                                && tris[2][0] != "O") {
                            tris[2][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == macchina && tris[4][2] == macchina && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == macchina && tris[0][4] == macchina && tris[0][2] != "X"
                                && tris[0][2] != "O") {
                            tris[0][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][0] == macchina && tris[2][4] == macchina && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][0] == macchina && tris[4][4] == macchina && tris[4][2] != "X"
                                && tris[4][2] != "O") {
                            tris[4][2] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == macchina && tris[4][0] == macchina && tris[2][0] != "X"
                                && tris[2][0] != "O") {
                            tris[2][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][2] == macchina && tris[4][2] == macchina && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == macchina && tris[4][4] == macchina && tris[2][4] != "X"
                                && tris[2][4] != "O") {
                            tris[2][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == macchina && tris[4][4] == macchina && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == macchina && tris[4][0] == macchina && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == macchina && tris[2][2] == macchina && tris[4][4] != "X"
                                && tris[4][4] != "O") {
                            tris[4][4] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == macchina && tris[2][2] == macchina && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == macchina && tris[2][2] == macchina && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][0] == macchina && tris[2][2] == macchina && tris[0][4] != "X"
                                && tris[0][4] != "O") {
                            tris[0][4] = macchina;
                            t++;
                        }

                        // mosse contro utente
                        if (t == 0 && tris[0][0] == utente && tris[0][2] == utente && tris[0][4] != "X"
                                && tris[0][4] != "O") {
                            tris[0][4] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][0] == utente && tris[2][2] == utente && tris[2][4] != "X"
                                && tris[2][4] != "O") {
                            tris[2][4] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][0] == utente && tris[4][2] == utente && tris[4][4] != "X"
                                && tris[4][4] != "O") {
                            tris[4][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][4] == utente && tris[0][2] == utente && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][4] == utente && tris[2][2] == utente && tris[2][0] != "X"
                                && tris[2][0] != "O") {
                            tris[2][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == utente && tris[4][2] == utente && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == utente && tris[2][0] == utente && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][2] == utente && tris[2][2] == utente && tris[4][2] != "X"
                                && tris[4][2] != "O") {
                            tris[4][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == utente && tris[2][4] == utente && tris[4][4] != "X"
                                && tris[4][4] != "O") {
                            tris[4][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[4][0] == utente && tris[2][0] == utente && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][2] == utente && tris[2][2] == utente && tris[0][2] != "X"
                                && tris[0][2] != "O") {
                            tris[0][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == utente && tris[2][4] == utente && tris[0][4] != "X"
                                && tris[0][4] != "O") {
                            tris[0][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][4] == utente && tris[0][2] == utente && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][4] == utente && tris[2][2] == utente && tris[2][0] != "X"
                                && tris[2][0] != "O") {
                            tris[2][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == utente && tris[4][2] == utente && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == utente && tris[0][4] == utente && tris[0][2] != "X"
                                && tris[0][2] != "O") {
                            tris[0][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[2][0] == utente && tris[2][4] == utente && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][0] == utente && tris[4][4] == utente && tris[4][2] != "X"
                                && tris[4][2] != "O") {
                            tris[4][2] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == utente && tris[4][0] == utente && tris[2][0] != "X"
                                && tris[2][0] != "O") {
                            tris[2][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][2] == utente && tris[4][2] == utente && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == utente && tris[4][4] == utente && tris[2][4] != "X"
                                && tris[2][4] != "O") {
                            tris[2][4] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == utente && tris[4][4] == utente && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == utente && tris[4][0] == utente && tris[2][2] != "X"
                                && tris[2][2] != "O") {
                            tris[2][2] = macchina;
                            t++;
                        }

                        if (t == 0 && tris[0][0] == utente && tris[2][2] == utente && tris[4][4] != "X"
                                && tris[4][4] != "O") {
                            tris[4][4] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[0][4] == utente && tris[2][2] == utente && tris[4][0] != "X"
                                && tris[4][0] != "O") {
                            tris[4][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][4] == utente && tris[2][2] == utente && tris[0][0] != "X"
                                && tris[0][0] != "O") {
                            tris[0][0] = macchina;
                            t++;
                        }
                        if (t == 0 && tris[4][0] == utente && tris[2][2] == utente && tris[0][4] != "X"
                                && tris[0][4] != "O") {
                            tris[0][4] = macchina;
                            t++;
                        }

                        if (t == 0) {

                            int a = 0;
                            int conpos = 0;
                            int casella = (int) (Math.random() * 9);
                            String casellas = String.valueOf(casella);
                            int casellagiusta = 0;
                            while (a == 0) {
                                casella = (int) (Math.random() * 9);
                                casellagiusta = casella + 1;
                                casellas = String.valueOf(casellagiusta);
                                conpos = casellagiusta - 1;
                                if (contaposizioni[conpos] == 0) {
                                    a++;
                                    switch (casellas) {
                                        case "1":
                                            tris[0][0] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "2":
                                            tris[0][2] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "3":
                                            tris[0][4] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "4":
                                            tris[2][0] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "5":
                                            tris[2][2] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "6":
                                            tris[2][4] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "7":
                                            tris[4][0] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "8":
                                            tris[4][2] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;
                                        case "9":
                                            tris[4][4] = macchina;
                                            contaposizioni[conpos] = 1;

                                            break;

                                    }
                                }
                            }
                        }
                        // controllo vincita
                        if (tris[0][0] == tris[0][2] && tris[0][0] == tris[0][4]) {
                            System.out.println("\nHAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }
                        if (tris[2][0] == tris[2][2] && tris[2][0] == tris[2][4]) {
                            System.out.println("\nHAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }
                        if (tris[4][0] == tris[4][2] && tris[4][0] == tris[4][4]) {
                            System.out.println("\nHAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }

                        if (tris[0][0] == tris[2][0] && tris[0][0] == tris[4][0]) {
                            System.out.println("\nHAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }
                        if (tris[0][2] == tris[2][2] && tris[0][2] == tris[4][2]) {
                            System.out.println("\nHAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }
                        if (tris[0][4] == tris[2][4] && tris[0][4] == tris[4][4]) {
                            System.out.println("\nHAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }

                        if (tris[0][0] == tris[2][2] && tris[0][0] == tris[4][4]) {
                            System.out.println("HAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }

                        if (tris[0][4] == tris[2][2] && tris[0][4] == tris[4][0]) {
                            System.out.println("HAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }

                        if (tris[0][0] == tris[0][1] && tris[0][0] == tris[0][2]) {
                            System.out.println("HAI PERSO!");
                            rip = 9;
                            pareggio++;
                            punteggio2 = punteggio2 + 2;
                            punti2[contapunti] = 2;
                            punti1[contapunti] = 0;
                            contapunti++;
                        }

                        // prossimo turno e stampa tris
                        rip++;
                        for (int i = 0; i < tris.length; i++) {
                            System.out.println();
                            for (int j = 0; j < tris.length; j++) {

                                if (tris[i][j] == macchina || tris[i][j] == utente) {
                                    if (tris[i][j] == utente) {
                                        System.out.print(" " + c + "[31m" + utente + c + "[0m" + " ");

                                    } else {
                                        System.out.print(" " + c + "[34m" + macchina + c + "[0m" + " ");
                                    }
                                } else {
                                    System.out.print(" " + tris[i][j] + " ");
                                }

                            }
                        }
                    }

                    else// GIOCA UTENTE
                    {
                        if (utente == "X") {
                            System.out.println(
                                    "\n\n" + player + ", basandoti sulla legenda dove vuoi inserire la '" + utente
                                            + "' ?");
                        } else {
                            System.out.println(
                                    "\n\n" + player + ", basandoti sulla legenda dove vuoi inserire il '" + utente
                                            + "' ?");
                        }
                        int b = 0;
                        while (b == 0) {
                            coordinata = input5.nextLine();
                            int conpostutente = Integer.valueOf(coordinata);
                            if (conpostutente < 10) {
                                if (contaposizioni[conpostutente - 1] == 0) {

                                    // turno utente
                                    switch (coordinata) {
                                        case "1":
                                            tris[0][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "2":
                                            tris[0][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "3":
                                            tris[0][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "4":
                                            tris[2][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "5":
                                            tris[2][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "6":
                                            tris[2][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "7":
                                            tris[4][0] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "8":
                                            tris[4][2] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;
                                        case "9":
                                            tris[4][4] = utente;
                                            valorearray = Integer.valueOf(coordinata);
                                            contaposizioni[valorearray - 1] = 1;
                                            break;

                                    }

                                    // controllo vincita
                                    if (tris[0][0] == tris[0][2] && tris[0][0] == tris[0][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[2][0] == tris[2][2] && tris[2][0] == tris[2][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[4][0] == tris[4][2] && tris[4][0] == tris[4][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][0] && tris[0][0] == tris[4][0]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][2] == tris[2][2] && tris[0][2] == tris[4][2]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }
                                    if (tris[0][4] == tris[2][4] && tris[0][4] == tris[4][4]) {
                                        System.out.println("\nHAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[2][2] && tris[0][0] == tris[4][4]) {
                                        System.out.println("HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][4] == tris[2][2] && tris[0][4] == tris[4][0]) {
                                        System.out.println("HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    if (tris[0][0] == tris[0][1] && tris[0][0] == tris[0][2]) {
                                        System.out.println("HAI VINTO!");
                                        rip = 9;
                                        pareggio++;
                                        punteggio1 = punteggio1 + 2;
                                        punti1[contapunti] = 2;
                                        punti2[contapunti] = 0;
                                        contapunti++;
                                    }

                                    b++;
                                } else {
                                    System.out.println("casella occupatsa,riprova");
                                }
                            } else {
                                System.out.println("casella non esistente,riprova");
                            }
                        }
                        // stampa mossa utente

                        for (int i = 0; i < tris.length; i++) {
                            System.out.println();
                            for (int j = 0; j < tris.length; j++) {
                                if (tris[i][j] == macchina || tris[i][j] == utente) {
                                    if (tris[i][j] == utente) {
                                        System.out.print(" " + c + "[31m" + utente + c + "[0m" + " ");

                                    } else {
                                        System.out.print(" " + c + "[34m" + macchina + c + "[0m" + " ");
                                    }
                                } else {
                                    System.out.print(" " + tris[i][j] + " ");
                                }
                                ;
                            }
                        }

                        rip++;
                    } // fine turno utente

                }

            }
            if (pareggio == 0) {
                System.out.print("\n\n PAREGGIO");
                punteggio1 = punteggio1 + 1;
                punteggio2 = punteggio2 + 1;
                punti1[contapunti] = 1;
                punti2[contapunti] = 1;
            }
            pareggio = 0;

            Scanner input6 = new Scanner(System.in);
            System.out.println("\n\nVuoi fare un'altra partita ?\n-sì --> inserire '1'\n-no --> inserire '2'\n");
            int piuMatch = input6.nextInt();

            if (piuMatch == 1) {
                quantepartite++;
                // riempimento colonne ES
                for (int i = 0; i < tris.length; i++) {
                    for (int j = 0; j < tris.length; j++) {

                        if (j == 1 || j == 3) {
                            tris[i][j] = "|";
                        } else {
                            tris[i][j] = " ";

                        }
                    }
                }

                // riempimento righe ES
                for (int i = 1; i < tris.length; i += 2) {
                    for (int j = 0; j < tris.length; j++) {
                        tris[i][j] = "-";

                    }
                }

                // riempimento intersezioni ES
                for (int i = 0; i < tris.length; i++) {
                    for (int j = 0; j < tris.length; j++) {
                        if ((i == 1 && j == 1) || (i == 3 && j == 1) || (i == 3 && j == 3) || (i == 1 && j == 3)) {
                            tris[i][j] = "|";

                        }
                    }

                }

                // riempimento numeri
                int n = 1;
                String ns = "";
                for (int i = 0; i < tris.length; i += 2) {
                    for (int j = 0; j < tris.length; j += 2) {
                        ns = String.valueOf(n);
                        tris[i][j] = ns;
                        n++;
                    }

                }

            } else {
                p = 1;
            }

        }

        // tabella punti
        char color = 27;
        System.out.println();

        System.out.print(color + "[31m" + player + color + "[0m");
        System.out.print("  " + color + "[34m" + "macchina" + color + "[0m");

        System.out.println();

        System.out.print("-----------------");
        System.out.println();
        System.out.print("|punteggi finali |");

        System.out.println();
        System.out.print("-----------------");
        System.out.println();
        for (int i = 0; i < quantepartite; i++) {
            System.out.print("partita " + (i + 1));
            System.out.print("|");
            System.out.print(" ");

            System.out.print(color + "[31m" + punti1[i] + color + "[0m");

            System.out.print(" ");
            System.out.print("|");
            System.out.print(" ");

            System.out.print(color + "[34m" + punti2[i] + color + "[0m");

            System.out.print(" ");
            System.out.print("|");
            System.out.println();
            System.out.print("-----------------");
            System.out.println();

        }

        System.out.print("punti tot");
        System.out.print("| ");
        System.out.print(punteggio1);
        System.out.print(" | ");
        System.out.print(punteggio2);
        System.out.print(" |");
        System.out.println();
        System.out.print("-----------------");
        System.out.println();
        System.out.println();

        // grafico
        int contomeno = 0;
        if (punteggio1 > punteggio2) {
            contomeno = punteggio1 + 3;
        } else {
            contomeno = punteggio2 + 3;
        }
        for (int i = contomeno; i > 0; i--) {
            if (i <= 9) {
                System.out.print(i);
                System.out.print(" | ");
            } else {
                System.out.print(i);
                System.out.print("| ");
            }

            if (punteggio1 >= i) {
                System.out.print(color + "[41;33;1m" + " " + color + "[0m");
            } else {
                System.out.print(" ");
            }
            System.out.print(" ");
            if (punteggio2 >= i) {
                System.out.print(color + "[44;33;1m" + " " + color + "[0m");
            } else {
                System.out.print(" ");
            }
            System.out.println(" ");

        }
        System.out.print("  -----");

        // cambio gioco
        Scanner cambio = new Scanner(System.in);
        System.out.println();
        System.out.println("\n\nVuoi cambiare gioco ?\n-sì --> inserire '1'\n-no --> inserire '2'\n");
        int cambiagioco = cambio.nextInt();
        if (cambiagioco == 1) {
            inizio();
        }

    }// fine tris difficile

    public static int carte(String playera, String playerb, int provenienza) {
        char c = 27;

        Scanner input11 = new Scanner(System.in);
        System.out.println("\n" + playera + " scegli la tua carta! (escluse le figure)\n\nEs: 3 di picche\n");
        String sceltaCarta1 = input11.nextLine();

        int g = 0;
        int cont = 0;
        int cont5 = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int c6 = 0;
        int c7 = 0;
        int c8 = 0;
        int c9 = 0;
        int c10 = 0;
        int c11 = 0;
        int c12 = 0;
        int c13 = 0;
        int c14 = 0;
        int c15 = 0;
        int c16 = 0;
        int c17 = 0;
        int c18 = 0;
        int c19 = 0;
        int c20 = 0;
        int c21 = 0;
        int c22 = 0;
        int c23 = 0;
        int c24 = 0;
        int c25 = 0;
        int c26 = 0;
        int c27 = 0;
        int c28 = 0;
        int c29 = 0;
        int c30 = 0;
        int c31 = 0;
        int c32 = 0;
        int c33 = 0;
        int c34 = 0;
        int c35 = 0;
        int c36 = 0;
        int c37 = 0;
        int c38 = 0;
        int c39 = 0;
        int c40 = 0;
        String stringCarta = "";

        int numCarta = (int) (Math.random() * 40) + 1;
        stringCarta = String.valueOf(numCarta);

        while (g == 0) {

            cont++;
            int cont3 = 0;

            if (cont != 0) {

                numCarta = (int) (Math.random() * 40);
                stringCarta = String.valueOf(numCarta);

            }

            switch (stringCarta) {
                case "1":
                    String[][] assocuori = { { " A", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "A " }, };

                    c1++;
                    if (c1 == 1) {
                        cont5++;
                        for (int i = 0; i < assocuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assocuori[0].length; j++) {
                                if (assocuori[i][j] != " " && assocuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + assocuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + assocuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "2":
                    String[][] duecuori = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };

                    c2++;

                    if (c2 == 1) {
                        cont5++;
                        for (int i = 0; i < duecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duecuori[0].length; j++) {
                                if (duecuori[i][j] != " " && duecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + duecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + duecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "3":
                    String[][] trecuori = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };

                    c3++;
                    if (c3 == 1) {
                        cont5++;
                        for (int i = 0; i < trecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trecuori[0].length; j++) {
                                if (trecuori[i][j] != " " && trecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + trecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + trecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "4":
                    String[][] quattrocuori = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c4++;
                    if (c4 == 1) {
                        cont5++;
                        for (int i = 0; i < quattrocuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattrocuori[0].length; j++) {
                                if (quattrocuori[i][j] != " " && quattrocuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + quattrocuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + quattrocuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "5":
                    String[][] cinquecuori = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c5++;

                    if (c5 == 1) {
                        cont5++;
                        for (int i = 0; i < cinquecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquecuori[0].length; j++) {
                                if (cinquecuori[i][j] != " " && cinquecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + cinquecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + cinquecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "6":
                    String[][] seicuori = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c6++;
                    if (c6 == 1) {
                        cont5++;
                        for (int i = 0; i < seicuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seicuori[0].length; j++) {
                                if (seicuori[i][j] != " " && seicuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + seicuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + seicuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "7":
                    String[][] settecuori = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c7++;
                    if (c7 == 1) {
                        cont5++;
                        for (int i = 0; i < settecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settecuori[0].length; j++) {
                                if (settecuori[i][j] != " " && settecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + settecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + settecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "8":
                    String[][] ottocuori = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c8++;
                    if (c8 == 1) {
                        cont5++;
                        for (int i = 0; i < ottocuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottocuori[0].length; j++) {
                                if (ottocuori[i][j] != " " && ottocuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + ottocuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + ottocuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "9":
                    String[][] novecuori = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c9++;
                    if (c9 == 1) {
                        cont5++;
                        for (int i = 0; i < novecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novecuori[0].length; j++) {
                                if (novecuori[i][j] != " " && novecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + novecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + novecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "10":
                    String[][] diecicuori = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c10++;
                    if (c10 == 1) {
                        cont5++;
                        for (int i = 0; i < diecicuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < diecicuori[0].length; j++) {
                                if (diecicuori[i][j] != " " && diecicuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + diecicuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + diecicuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "11":
                    String[][] assoquadri = { { " 1", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "1 " }, };
                    c11++;
                    if (c11 == 1) {
                        cont5++;
                        for (int i = 0; i < assoquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assoquadri[0].length; j++) {
                                if (assoquadri[i][j] != " " && assoquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + assoquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + assoquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "12":
                    String[][] duequadri = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };
                    c12++;
                    if (c12 == 1) {
                        cont5++;
                        for (int i = 0; i < duequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duequadri[0].length; j++) {
                                if (duequadri[i][j] != " " && duequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + duequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + duequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "13":
                    String[][] trequadri = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };
                    c13++;
                    if (c13 == 1) {
                        cont5++;
                        for (int i = 0; i < trequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trequadri[0].length; j++) {
                                if (trequadri[i][j] != " " && trequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + trequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + trequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "14":
                    String[][] quattroquadri = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c14++;
                    if (c14 == 1) {
                        cont5++;
                        for (int i = 0; i < quattroquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattroquadri[0].length; j++) {
                                if (quattroquadri[i][j] != " " && quattroquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + quattroquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + quattroquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "15":
                    String[][] cinquequadri = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c15++;
                    if (c15 == 1) {
                        cont5++;
                        for (int i = 0; i < cinquequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquequadri[0].length; j++) {
                                if (cinquequadri[i][j] != " " && cinquequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + cinquequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + cinquequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "16":
                    String[][] seiquadri = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c16++;
                    if (c16 == 1) {
                        cont5++;
                        for (int i = 0; i < seiquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seiquadri[0].length; j++) {
                                if (seiquadri[i][j] != " " && seiquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + seiquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + seiquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "17":
                    String[][] settequadri = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c17++;
                    if (c17 == 1) {
                        cont5++;
                        for (int i = 0; i < settequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settequadri[0].length; j++) {
                                if (settequadri[i][j] != " " && settequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + settequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + settequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "18":
                    String[][] ottoquadri = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c18++;
                    if (c18 == 1) {
                        cont5++;
                        for (int i = 0; i < ottoquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottoquadri[0].length; j++) {
                                if (ottoquadri[i][j] != " " && ottoquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + ottoquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + ottoquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "19":
                    String[][] novequadri = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c19++;
                    if (c19 == 1) {
                        cont5++;
                        for (int i = 0; i < novequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novequadri[0].length; j++) {
                                if (novequadri[i][j] != " " && novequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + novequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + novequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "20":
                    String[][] dieciquadri = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c20++;
                    if (c20 == 1) {
                        cont5++;
                        for (int i = 0; i < dieciquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < dieciquadri[0].length; j++) {
                                if (dieciquadri[i][j] != " " && dieciquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + dieciquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + dieciquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "21":
                    String[][] assopicche = { { " 1", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "1 " }, };
                    c21++;
                    if (c21 == 1) {
                        cont5++;
                        for (int i = 0; i < assopicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assopicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + assopicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "22":
                    String[][] duepicche = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };
                    c22++;
                    if (c22 == 1) {
                        cont5++;
                        for (int i = 0; i < duepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + duepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "23":
                    String[][] trepicche = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };
                    c23++;
                    if (c23 == 1) {
                        cont5++;
                        for (int i = 0; i < trepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + trepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "24":
                    String[][] quattropicche = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c24++;
                    if (c24 == 1) {
                        cont5++;
                        for (int i = 0; i < quattropicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattropicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + quattropicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "25":
                    String[][] cinquepicche = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c25++;
                    if (c25 == 1) {
                        cont5++;
                        for (int i = 0; i < cinquepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + cinquepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "26":
                    String[][] seipicche = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c26++;
                    if (c26 == 1) {
                        cont5++;
                        for (int i = 0; i < seipicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seipicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + seipicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "27":
                    String[][] settepicche = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c27++;
                    if (c27 == 1) {
                        cont5++;
                        for (int i = 0; i < settepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + settepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "28":
                    String[][] ottopicche = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c28++;
                    if (c28 == 1) {
                        cont5++;
                        for (int i = 0; i < ottopicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottopicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + ottopicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "29":
                    String[][] novepicche = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c29++;
                    if (c29 == 1) {
                        cont5++;
                        for (int i = 0; i < novepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + novepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "30":
                    String[][] diecipicche = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c30++;
                    if (c30 == 1) {
                        cont5++;
                        for (int i = 0; i < diecipicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < diecipicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + diecipicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "31":
                    String[][] assofiori = { { " 1", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "1 " }, };
                    c31++;
                    if (c31 == 1) {
                        cont5++;
                        for (int i = 0; i < assofiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assofiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + assofiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "32":
                    String[][] duefiori = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };
                    c32++;
                    if (c32 == 1) {
                        cont5++;
                        for (int i = 0; i < duefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + duefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "33":
                    String[][] trefiori = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };
                    c33++;
                    if (c33 == 1) {
                        cont5++;
                        for (int i = 0; i < trefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + trefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "34":
                    String[][] quattrofiori = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c34++;
                    if (c34 == 1) {
                        cont5++;
                        for (int i = 0; i < quattrofiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattrofiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + quattrofiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "35":
                    String[][] cinquefiori = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c35++;
                    if (c35 == 1) {
                        cont5++;
                        for (int i = 0; i < cinquefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + cinquefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "36":
                    String[][] seifiori = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c36++;
                    if (c36 == 1) {
                        cont5++;
                        for (int i = 0; i < seifiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seifiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + seifiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "37":
                    String[][] settefiori = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c37++;
                    if (c37 == 1) {
                        cont5++;
                        for (int i = 0; i < settefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + settefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "38":
                    String[][] ottofiori = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c38++;
                    if (c38 == 1) {
                        cont5++;
                        for (int i = 0; i < ottofiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottofiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + ottofiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "39":
                    String[][] novefiori = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c39++;
                    if (c39 == 1) {
                        cont5++;
                        for (int i = 0; i < novefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + novefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "40":
                    String[][] diecifiori = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c40++;
                    if (c40 == 1) {
                        cont5++;
                        for (int i = 0; i < diecifiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < diecifiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + diecifiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();

                    }

                    break;
            }

            switch (sceltaCarta1) {
                case "asso di cuori":

                    if (c1 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di cuori":

                    if (c2 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di cuori":

                    if (c3 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di cuori":

                    if (c4 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di cuori":

                    if (c5 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di cuori":

                    if (c6 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di cuori":

                    if (c7 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di cuori":

                    if (c8 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di cuori":

                    if (c9 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di cuori":

                    if (c10 == 1) {
                        g = 1;
                    }
                    break;
                case "asso di quadri":

                    if (c11 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di quadri":

                    if (c12 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di quadri":

                    if (c13 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di quadri":

                    if (c14 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di quadri":

                    if (c15 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di quadri":

                    if (c16 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di quadri":

                    if (c17 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di quadri":

                    if (c18 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di quadri":

                    if (c19 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di quadri":

                    if (c20 == 1) {
                        g = 1;
                    }
                    break;
                case "asso di picche":

                    if (c21 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di picche":

                    if (c22 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di picche":

                    if (c23 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di picche":

                    if (c24 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di picche":

                    if (c25 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di picche":

                    if (c26 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di picche":

                    if (c27 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di picche":

                    if (c28 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di picche":

                    if (c29 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di picche":

                    if (c30 == 1) {
                        g = 1;
                    }
                    break;
                case "asso di fiori":

                    if (c31 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di fiori":

                    if (c32 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di fiori":

                    if (c33 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di fiori":

                    if (c34 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di fiori":

                    if (c35 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di fiori":

                    if (c36 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di fiori":

                    if (c37 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di fiori":

                    if (c38 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di fiori":

                    if (c39 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di fiori":

                    if (c40 == 1) {
                        g = 1;
                    }
                    break;
            }

        }
        System.out.println("\nCARTA NUMERO " + cont5);

        Scanner input12 = new Scanner(System.in);
        System.out.println("\n" + playerb + " scegli la tua carta! (escluse le figure)\n\nEs: 3 di picche\n");
        sceltaCarta1 = input12.nextLine();

        c = 27;
        g = 0;
        cont = 0;
        int cont6 = 0;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        c6 = 0;
        c7 = 0;
        c8 = 0;
        c9 = 0;
        c10 = 0;
        c11 = 0;
        c12 = 0;
        c13 = 0;
        c14 = 0;
        c15 = 0;
        c16 = 0;
        c17 = 0;
        c18 = 0;
        c19 = 0;
        c20 = 0;
        c21 = 0;
        c22 = 0;
        c23 = 0;
        c24 = 0;
        c25 = 0;
        c26 = 0;
        c27 = 0;
        c28 = 0;
        c29 = 0;
        c30 = 0;
        c31 = 0;
        c32 = 0;
        c33 = 0;
        c34 = 0;
        c35 = 0;
        c36 = 0;
        c37 = 0;
        c38 = 0;
        c39 = 0;
        c40 = 0;
        stringCarta = "";

        numCarta = (int) (Math.random() * 40) + 1;
        stringCarta = String.valueOf(numCarta);

        while (g == 0) {

            cont++;
            int cont3 = 0;

            if (cont != 0) {

                numCarta = (int) (Math.random() * 40);
                stringCarta = String.valueOf(numCarta);

            }

            switch (stringCarta) {
                case "1":
                    String[][] assocuori = { { " A", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "A " }, };

                    c1++;
                    if (c1 == 1) {
                        cont6++;
                        for (int i = 0; i < assocuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assocuori[0].length; j++) {
                                if (assocuori[i][j] != " " && assocuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + assocuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + assocuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "2":
                    String[][] duecuori = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };

                    c2++;

                    if (c2 == 1) {
                        cont6++;
                        for (int i = 0; i < duecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duecuori[0].length; j++) {
                                if (duecuori[i][j] != " " && duecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + duecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + duecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "3":
                    String[][] trecuori = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };

                    c3++;
                    if (c3 == 1) {
                        cont6++;
                        for (int i = 0; i < trecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trecuori[0].length; j++) {
                                if (trecuori[i][j] != " " && trecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + trecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + trecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "4":
                    String[][] quattrocuori = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c4++;
                    if (c4 == 1) {
                        cont6++;
                        for (int i = 0; i < quattrocuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattrocuori[0].length; j++) {
                                if (quattrocuori[i][j] != " " && quattrocuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + quattrocuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + quattrocuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "5":
                    String[][] cinquecuori = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c5++;

                    if (c5 == 1) {
                        cont6++;
                        for (int i = 0; i < cinquecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquecuori[0].length; j++) {
                                if (cinquecuori[i][j] != " " && cinquecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + cinquecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + cinquecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "6":
                    String[][] seicuori = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c6++;
                    if (c6 == 1) {
                        cont6++;
                        for (int i = 0; i < seicuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seicuori[0].length; j++) {
                                if (seicuori[i][j] != " " && seicuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + seicuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + seicuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "7":
                    String[][] settecuori = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c7++;
                    if (c7 == 1) {
                        cont6++;
                        for (int i = 0; i < settecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settecuori[0].length; j++) {
                                if (settecuori[i][j] != " " && settecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + settecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + settecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "8":
                    String[][] ottocuori = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c8++;
                    if (c8 == 1) {
                        cont6++;
                        for (int i = 0; i < ottocuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottocuori[0].length; j++) {
                                if (ottocuori[i][j] != " " && ottocuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + ottocuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + ottocuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "9":
                    String[][] novecuori = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c9++;
                    if (c9 == 1) {
                        cont6++;
                        for (int i = 0; i < novecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novecuori[0].length; j++) {
                                if (novecuori[i][j] != " " && novecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + novecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + novecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "10":
                    String[][] diecicuori = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c10++;
                    if (c10 == 1) {
                        cont6++;
                        for (int i = 0; i < diecicuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < diecicuori[0].length; j++) {
                                if (diecicuori[i][j] != " " && diecicuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + diecicuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + diecicuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "11":
                    String[][] assoquadri = { { " 1", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "1 " }, };
                    c11++;
                    if (c11 == 1) {
                        cont6++;
                        for (int i = 0; i < assoquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assoquadri[0].length; j++) {
                                if (assoquadri[i][j] != " " && assoquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + assoquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + assoquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "12":
                    String[][] duequadri = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };
                    c12++;
                    if (c12 == 1) {
                        cont6++;
                        for (int i = 0; i < duequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duequadri[0].length; j++) {
                                if (duequadri[i][j] != " " && duequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + duequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + duequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "13":
                    String[][] trequadri = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };
                    c13++;
                    if (c13 == 1) {
                        cont6++;
                        for (int i = 0; i < trequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trequadri[0].length; j++) {
                                if (trequadri[i][j] != " " && trequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + trequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + trequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "14":
                    String[][] quattroquadri = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c14++;
                    if (c14 == 1) {
                        cont6++;
                        for (int i = 0; i < quattroquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattroquadri[0].length; j++) {
                                if (quattroquadri[i][j] != " " && quattroquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + quattroquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + quattroquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "15":
                    String[][] cinquequadri = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c15++;
                    if (c15 == 1) {
                        cont6++;
                        for (int i = 0; i < cinquequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquequadri[0].length; j++) {
                                if (cinquequadri[i][j] != " " && cinquequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + cinquequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + cinquequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "16":
                    String[][] seiquadri = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c16++;
                    if (c16 == 1) {
                        cont6++;
                        for (int i = 0; i < seiquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seiquadri[0].length; j++) {
                                if (seiquadri[i][j] != " " && seiquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + seiquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + seiquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "17":
                    String[][] settequadri = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c17++;
                    if (c17 == 1) {
                        cont6++;
                        for (int i = 0; i < settequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settequadri[0].length; j++) {
                                if (settequadri[i][j] != " " && settequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + settequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + settequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "18":
                    String[][] ottoquadri = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c18++;
                    if (c18 == 1) {
                        cont6++;
                        for (int i = 0; i < ottoquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottoquadri[0].length; j++) {
                                if (ottoquadri[i][j] != " " && ottoquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + ottoquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + ottoquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "19":
                    String[][] novequadri = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c19++;
                    if (c19 == 1) {
                        cont6++;
                        for (int i = 0; i < novequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novequadri[0].length; j++) {
                                if (novequadri[i][j] != " " && novequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + novequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + novequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "20":
                    String[][] dieciquadri = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c20++;
                    if (c20 == 1) {
                        cont6++;
                        for (int i = 0; i < dieciquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < dieciquadri[0].length; j++) {
                                if (dieciquadri[i][j] != " " && dieciquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + dieciquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + dieciquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "21":
                    String[][] assopicche = { { " 1", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "1 " }, };
                    c21++;
                    if (c21 == 1) {
                        cont6++;
                        for (int i = 0; i < assopicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assopicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + assopicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "22":
                    String[][] duepicche = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };
                    c22++;
                    if (c22 == 1) {
                        cont6++;
                        for (int i = 0; i < duepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + duepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "23":
                    String[][] trepicche = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };
                    c23++;
                    if (c23 == 1) {
                        cont6++;
                        for (int i = 0; i < trepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + trepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "24":
                    String[][] quattropicche = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c24++;
                    if (c24 == 1) {
                        cont6++;
                        for (int i = 0; i < quattropicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattropicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + quattropicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "25":
                    String[][] cinquepicche = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c25++;
                    if (c25 == 1) {
                        cont6++;
                        for (int i = 0; i < cinquepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + cinquepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "26":
                    String[][] seipicche = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c26++;
                    if (c26 == 1) {
                        cont6++;
                        for (int i = 0; i < seipicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seipicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + seipicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "27":
                    String[][] settepicche = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c27++;
                    if (c27 == 1) {
                        cont6++;
                        for (int i = 0; i < settepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + settepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "28":
                    String[][] ottopicche = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c28++;
                    if (c28 == 1) {
                        cont6++;
                        for (int i = 0; i < ottopicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottopicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + ottopicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "29":
                    String[][] novepicche = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c29++;
                    if (c29 == 1) {
                        cont6++;
                        for (int i = 0; i < novepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + novepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "30":
                    String[][] diecipicche = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c30++;
                    if (c30 == 1) {
                        cont6++;
                        for (int i = 0; i < diecipicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < diecipicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + diecipicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "31":
                    String[][] assofiori = { { " 1", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "1 " }, };
                    c31++;
                    if (c31 == 1) {
                        cont6++;
                        for (int i = 0; i < assofiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assofiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + assofiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "32":
                    String[][] duefiori = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };
                    c32++;
                    if (c32 == 1) {
                        cont6++;
                        for (int i = 0; i < duefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + duefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "33":
                    String[][] trefiori = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };
                    c33++;
                    if (c33 == 1) {
                        cont6++;
                        for (int i = 0; i < trefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + trefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "34":
                    String[][] quattrofiori = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c34++;
                    if (c34 == 1) {
                        cont6++;
                        for (int i = 0; i < quattrofiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattrofiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + quattrofiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "35":
                    String[][] cinquefiori = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c35++;
                    if (c35 == 1) {
                        cont6++;
                        for (int i = 0; i < cinquefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + cinquefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "36":
                    String[][] seifiori = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c36++;
                    if (c36 == 1) {
                        cont6++;
                        for (int i = 0; i < seifiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seifiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + seifiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "37":
                    String[][] settefiori = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c37++;
                    if (c37 == 1) {
                        cont6++;
                        for (int i = 0; i < settefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + settefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "38":
                    String[][] ottofiori = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c38++;
                    if (c38 == 1) {
                        cont6++;
                        for (int i = 0; i < ottofiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottofiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + ottofiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "39":
                    String[][] novefiori = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c39++;
                    if (c39 == 1) {
                        cont6++;
                        for (int i = 0; i < novefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + novefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "40":
                    String[][] diecifiori = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c40++;
                    if (c40 == 1) {
                        cont6++;
                        for (int i = 0; i < diecifiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < diecifiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + diecifiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();

                    }

                    break;
            }

            switch (sceltaCarta1) {
                case "asso di cuori":

                    if (c1 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di cuori":

                    if (c2 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di cuori":

                    if (c3 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di cuori":

                    if (c4 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di cuori":

                    if (c5 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di cuori":

                    if (c6 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di cuori":

                    if (c7 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di cuori":

                    if (c8 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di cuori":

                    if (c9 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di cuori":

                    if (c10 == 1) {
                        g = 1;
                    }
                    break;
                case "asso di quadri":

                    if (c11 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di quadri":

                    if (c12 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di quadri":

                    if (c13 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di quadri":

                    if (c14 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di quadri":

                    if (c15 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di quadri":

                    if (c16 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di quadri":

                    if (c17 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di quadri":

                    if (c18 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di quadri":

                    if (c19 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di quadri":

                    if (c20 == 1) {
                        g = 1;
                    }
                    break;
                case "asso di picche":

                    if (c21 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di picche":

                    if (c22 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di picche":

                    if (c23 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di picche":

                    if (c24 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di picche":

                    if (c25 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di picche":

                    if (c26 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di picche":

                    if (c27 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di picche":

                    if (c28 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di picche":

                    if (c29 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di picche":

                    if (c30 == 1) {
                        g = 1;
                    }
                    break;
                case "asso di fiori":

                    if (c31 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di fiori":

                    if (c32 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di fiori":

                    if (c33 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di fiori":

                    if (c34 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di fiori":

                    if (c35 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di fiori":

                    if (c36 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di fiori":

                    if (c37 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di fiori":

                    if (c38 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di fiori":

                    if (c39 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di fiori":

                    if (c40 == 1) {
                        g = 1;
                    }
                    break;
            }

        }
        System.out.println("\nCARTA NUMERO " + cont6);
        int iniziale = 0;
        if (cont5 < cont6) {
            System.out.println("\nIL VINCITORE E' ... " + playera);
            iniziale = 0;
        }
        if (cont6 < cont5) {
            System.out.println("\nIL VINCITORE E' ... " + playerb);
            iniziale = 1;
        }
        if (cont5 == cont6) {
            System.out.println("\nPAREGGIO");
            iniziale = 0;
        }

        if (provenienza == 0) {
            Scanner cambio = new Scanner(System.in);
            System.out.println();
            System.out.println("\n\nVuoi cambiare gioco ?\n-sì --> inserire '1'\n-no --> inserire '2'\n");
            int cambiagioco = cambio.nextInt();
            if (cambiagioco == 1) {

                inizio();
            }
        }
        return iniziale;
    }// fine carte doppio

    public static int cartesingolo(String nick1, int provenienza) {
        String playera = "";
        // nickname
        if (provenienza == 0) {
            playera = nick1;

        } else {
            playera = nick1;
        }

        String playerb = "pc";

        Scanner input11 = new Scanner(System.in);
        System.out.println("\n" + playera + " scegli la tua carta! (escluse le figure)\n\nEs: 3 di picche\n");
        String sceltaCarta1 = input11.nextLine();

        char c = 27;
        int g = 0;
        int cont = 0;
        int cont5 = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int c6 = 0;
        int c7 = 0;
        int c8 = 0;
        int c9 = 0;
        int c10 = 0;
        int c11 = 0;
        int c12 = 0;
        int c13 = 0;
        int c14 = 0;
        int c15 = 0;
        int c16 = 0;
        int c17 = 0;
        int c18 = 0;
        int c19 = 0;
        int c20 = 0;
        int c21 = 0;
        int c22 = 0;
        int c23 = 0;
        int c24 = 0;
        int c25 = 0;
        int c26 = 0;
        int c27 = 0;
        int c28 = 0;
        int c29 = 0;
        int c30 = 0;
        int c31 = 0;
        int c32 = 0;
        int c33 = 0;
        int c34 = 0;
        int c35 = 0;
        int c36 = 0;
        int c37 = 0;
        int c38 = 0;
        int c39 = 0;
        int c40 = 0;
        String stringCarta = "";

        int numCarta = (int) (Math.random() * 40) + 1;
        stringCarta = String.valueOf(numCarta);

        while (g == 0) {

            cont++;
            int cont3 = 0;

            if (cont != 0) {

                numCarta = (int) (Math.random() * 40);
                stringCarta = String.valueOf(numCarta);

            }

            switch (stringCarta) {
                case "1":
                    String[][] assocuori = { { " A", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "A " }, };

                    c1++;
                    if (c1 == 1) {
                        cont5++;
                        for (int i = 0; i < assocuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assocuori[0].length; j++) {
                                if (assocuori[i][j] != " " && assocuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + assocuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + assocuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "2":
                    String[][] duecuori = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };

                    c2++;

                    if (c2 == 1) {
                        cont5++;
                        for (int i = 0; i < duecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duecuori[0].length; j++) {
                                if (duecuori[i][j] != " " && duecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + duecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + duecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "3":
                    String[][] trecuori = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };

                    c3++;
                    if (c3 == 1) {
                        cont5++;
                        for (int i = 0; i < trecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trecuori[0].length; j++) {
                                if (trecuori[i][j] != " " && trecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + trecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + trecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "4":
                    String[][] quattrocuori = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c4++;
                    if (c4 == 1) {
                        cont5++;
                        for (int i = 0; i < quattrocuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattrocuori[0].length; j++) {
                                if (quattrocuori[i][j] != " " && quattrocuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + quattrocuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + quattrocuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "5":
                    String[][] cinquecuori = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c5++;

                    if (c5 == 1) {
                        cont5++;
                        for (int i = 0; i < cinquecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquecuori[0].length; j++) {
                                if (cinquecuori[i][j] != " " && cinquecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + cinquecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + cinquecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "6":
                    String[][] seicuori = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c6++;
                    if (c6 == 1) {
                        cont5++;
                        for (int i = 0; i < seicuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seicuori[0].length; j++) {
                                if (seicuori[i][j] != " " && seicuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + seicuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + seicuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "7":
                    String[][] settecuori = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c7++;
                    if (c7 == 1) {
                        cont5++;
                        for (int i = 0; i < settecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settecuori[0].length; j++) {
                                if (settecuori[i][j] != " " && settecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + settecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + settecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "8":
                    String[][] ottocuori = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c8++;
                    if (c8 == 1) {
                        cont5++;
                        for (int i = 0; i < ottocuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottocuori[0].length; j++) {
                                if (ottocuori[i][j] != " " && ottocuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + ottocuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + ottocuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "9":
                    String[][] novecuori = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c9++;
                    if (c9 == 1) {
                        cont5++;
                        for (int i = 0; i < novecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novecuori[0].length; j++) {
                                if (novecuori[i][j] != " " && novecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + novecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + novecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "10":
                    String[][] diecicuori = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c10++;
                    if (c10 == 1) {
                        cont5++;
                        for (int i = 0; i < diecicuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < diecicuori[0].length; j++) {
                                if (diecicuori[i][j] != " " && diecicuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + diecicuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + diecicuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "11":
                    String[][] assoquadri = { { " 1", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "1 " }, };
                    c11++;
                    if (c11 == 1) {
                        cont5++;
                        for (int i = 0; i < assoquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assoquadri[0].length; j++) {
                                if (assoquadri[i][j] != " " && assoquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + assoquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + assoquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "12":
                    String[][] duequadri = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };
                    c12++;
                    if (c12 == 1) {
                        cont5++;
                        for (int i = 0; i < duequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duequadri[0].length; j++) {
                                if (duequadri[i][j] != " " && duequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + duequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + duequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "13":
                    String[][] trequadri = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };
                    c13++;
                    if (c13 == 1) {
                        cont5++;
                        for (int i = 0; i < trequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trequadri[0].length; j++) {
                                if (trequadri[i][j] != " " && trequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + trequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + trequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "14":
                    String[][] quattroquadri = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c14++;
                    if (c14 == 1) {
                        cont5++;
                        for (int i = 0; i < quattroquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattroquadri[0].length; j++) {
                                if (quattroquadri[i][j] != " " && quattroquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + quattroquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + quattroquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "15":
                    String[][] cinquequadri = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c15++;
                    if (c15 == 1) {
                        cont5++;
                        for (int i = 0; i < cinquequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquequadri[0].length; j++) {
                                if (cinquequadri[i][j] != " " && cinquequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + cinquequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + cinquequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "16":
                    String[][] seiquadri = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c16++;
                    if (c16 == 1) {
                        cont5++;
                        for (int i = 0; i < seiquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seiquadri[0].length; j++) {
                                if (seiquadri[i][j] != " " && seiquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + seiquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + seiquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "17":
                    String[][] settequadri = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c17++;
                    if (c17 == 1) {
                        cont5++;
                        for (int i = 0; i < settequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settequadri[0].length; j++) {
                                if (settequadri[i][j] != " " && settequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + settequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + settequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "18":
                    String[][] ottoquadri = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c18++;
                    if (c18 == 1) {
                        cont5++;
                        for (int i = 0; i < ottoquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottoquadri[0].length; j++) {
                                if (ottoquadri[i][j] != " " && ottoquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + ottoquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + ottoquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "19":
                    String[][] novequadri = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c19++;
                    if (c19 == 1) {
                        cont5++;
                        for (int i = 0; i < novequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novequadri[0].length; j++) {
                                if (novequadri[i][j] != " " && novequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + novequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + novequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "20":
                    String[][] dieciquadri = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c20++;
                    if (c20 == 1) {
                        cont5++;
                        for (int i = 0; i < dieciquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < dieciquadri[0].length; j++) {
                                if (dieciquadri[i][j] != " " && dieciquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + dieciquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + dieciquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "21":
                    String[][] assopicche = { { " 1", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "1 " }, };
                    c21++;
                    if (c21 == 1) {
                        cont5++;
                        for (int i = 0; i < assopicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assopicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + assopicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "22":
                    String[][] duepicche = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };
                    c22++;
                    if (c22 == 1) {
                        cont5++;
                        for (int i = 0; i < duepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + duepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "23":
                    String[][] trepicche = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };
                    c23++;
                    if (c23 == 1) {
                        cont5++;
                        for (int i = 0; i < trepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + trepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "24":
                    String[][] quattropicche = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c24++;
                    if (c24 == 1) {
                        cont5++;
                        for (int i = 0; i < quattropicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattropicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + quattropicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "25":
                    String[][] cinquepicche = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c25++;
                    if (c25 == 1) {
                        cont5++;
                        for (int i = 0; i < cinquepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + cinquepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "26":
                    String[][] seipicche = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c26++;
                    if (c26 == 1) {
                        cont5++;
                        for (int i = 0; i < seipicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seipicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + seipicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "27":
                    String[][] settepicche = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c27++;
                    if (c27 == 1) {
                        cont5++;
                        for (int i = 0; i < settepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + settepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "28":
                    String[][] ottopicche = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c28++;
                    if (c28 == 1) {
                        cont5++;
                        for (int i = 0; i < ottopicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottopicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + ottopicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "29":
                    String[][] novepicche = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c29++;
                    if (c29 == 1) {
                        cont5++;
                        for (int i = 0; i < novepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + novepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "30":
                    String[][] diecipicche = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c30++;
                    if (c30 == 1) {
                        cont5++;
                        for (int i = 0; i < diecipicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < diecipicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + diecipicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "31":
                    String[][] assofiori = { { " 1", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "1 " }, };
                    c31++;
                    if (c31 == 1) {
                        cont5++;
                        for (int i = 0; i < assofiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assofiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + assofiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "32":
                    String[][] duefiori = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };
                    c32++;
                    if (c32 == 1) {
                        cont5++;
                        for (int i = 0; i < duefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + duefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "33":
                    String[][] trefiori = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };
                    c33++;
                    if (c33 == 1) {
                        cont5++;
                        for (int i = 0; i < trefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + trefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "34":
                    String[][] quattrofiori = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c34++;
                    if (c34 == 1) {
                        cont5++;
                        for (int i = 0; i < quattrofiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattrofiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + quattrofiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "35":
                    String[][] cinquefiori = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c35++;
                    if (c35 == 1) {
                        cont5++;
                        for (int i = 0; i < cinquefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + cinquefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "36":
                    String[][] seifiori = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c36++;
                    if (c36 == 1) {
                        cont5++;
                        for (int i = 0; i < seifiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seifiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + seifiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "37":
                    String[][] settefiori = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c37++;
                    if (c37 == 1) {
                        cont5++;
                        for (int i = 0; i < settefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + settefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "38":
                    String[][] ottofiori = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c38++;
                    if (c38 == 1) {
                        cont5++;
                        for (int i = 0; i < ottofiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottofiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + ottofiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "39":
                    String[][] novefiori = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c39++;
                    if (c39 == 1) {
                        cont5++;
                        for (int i = 0; i < novefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + novefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "40":
                    String[][] diecifiori = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c40++;
                    if (c40 == 1) {
                        cont5++;
                        for (int i = 0; i < diecifiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < diecifiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + diecifiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();

                    }

                    break;
            }

            switch (sceltaCarta1) {
                case "asso di cuori":

                    if (c1 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di cuori":

                    if (c2 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di cuori":

                    if (c3 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di cuori":

                    if (c4 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di cuori":

                    if (c5 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di cuori":

                    if (c6 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di cuori":

                    if (c7 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di cuori":

                    if (c8 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di cuori":

                    if (c9 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di cuori":

                    if (c10 == 1) {
                        g = 1;
                    }
                    break;
                case "asso di quadri":

                    if (c11 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di quadri":

                    if (c12 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di quadri":

                    if (c13 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di quadri":

                    if (c14 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di quadri":

                    if (c15 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di quadri":

                    if (c16 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di quadri":

                    if (c17 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di quadri":

                    if (c18 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di quadri":

                    if (c19 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di quadri":

                    if (c20 == 1) {
                        g = 1;
                    }
                    break;
                case "asso di picche":

                    if (c21 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di picche":

                    if (c22 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di picche":

                    if (c23 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di picche":

                    if (c24 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di picche":

                    if (c25 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di picche":

                    if (c26 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di picche":

                    if (c27 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di picche":

                    if (c28 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di picche":

                    if (c29 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di picche":

                    if (c30 == 1) {
                        g = 1;
                    }
                    break;
                case "asso di fiori":

                    if (c31 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di fiori":

                    if (c32 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di fiori":

                    if (c33 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di fiori":

                    if (c34 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di fiori":

                    if (c35 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di fiori":

                    if (c36 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di fiori":

                    if (c37 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di fiori":

                    if (c38 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di fiori":

                    if (c39 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di fiori":

                    if (c40 == 1) {
                        g = 1;
                    }
                    break;
            }

        }
        System.out.println("\nCARTA NUMERO " + cont5);

        // ----------------------------------------------------------------------------------------------

        String cartaPc = "";
        int numCartaPc = (int) (Math.random() * 40) + 1;

        switch (numCartaPc) {
            case 1:
                cartaPc = "asso di cuori";
                break;
            case 2:
                cartaPc = "2 di cuori";
                break;
            case 3:
                cartaPc = "3 di cuori";
            case 4:
                cartaPc = "4 di cuori";
                break;
            case 5:
                cartaPc = "5 di cuori";
                break;
            case 6:
                cartaPc = "6 di cuori";
                break;
            case 7:
                cartaPc = "7 di cuori";
                break;
            case 8:
                cartaPc = "8 di cuori";
                break;
            case 9:
                cartaPc = "9 di cuori";
                break;
            case 10:
                cartaPc = "10 di cuori";
                break;
            case 11:
                cartaPc = "asso di quadri";
                break;
            case 12:
                cartaPc = "2 di quadri";
                break;
            case 13:
                cartaPc = "3 di quadri";
                break;
            case 14:
                cartaPc = "4 di quadri";
                break;
            case 15:
                cartaPc = "5 di quadri";
                break;
            case 16:
                cartaPc = "6 di quadri";
                break;
            case 17:
                cartaPc = "7 di quadri";
                break;
            case 18:
                cartaPc = "8 di quadri";
                break;
            case 19:
                cartaPc = "9 di quadri";
                break;
            case 20:
                cartaPc = "10 di quadri";
                break;
            case 21:
                cartaPc = "asso di picche";
                break;
            case 22:
                cartaPc = "2 di picche";
                break;
            case 23:
                cartaPc = "3 di picche";
                break;
            case 24:
                cartaPc = "4 di picche";
                break;
            case 25:
                cartaPc = "5 di picche";
                break;
            case 26:
                cartaPc = "6 di picche";
                break;
            case 27:
                cartaPc = "7 di picche";
                break;
            case 28:
                cartaPc = "8 di picche";
                break;
            case 29:
                cartaPc = "9 di picche";
                break;
            case 30:
                cartaPc = "10 di picche";
                break;
            case 31:
                cartaPc = "asso di fiori";
                break;
            case 32:
                cartaPc = "2 di fiori";
                break;
            case 33:
                cartaPc = "3 di fiori";
                break;
            case 34:
                cartaPc = "4 di fiori";
                break;
            case 35:
                cartaPc = "5 di fiori";
                break;
            case 36:
                cartaPc = "6 di fiori";
                break;
            case 37:
                cartaPc = "7 di fiori";
                break;
            case 38:
                cartaPc = "8 di fiori";
                break;
            case 39:
                cartaPc = "9 di fiori";
                break;
            case 40:
                cartaPc = "10 di fiori";
                break;

        }

        System.out.println("\nl'avversario ha scelto la carta: " + cartaPc);
        Scanner input12 = new Scanner(System.in);
        System.out.println("pronto per l'estrazione?\n");
        String delete = input12.nextLine();

        c = 27;
        g = 0;
        cont = 0;
        int cont6 = 0;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        c6 = 0;
        c7 = 0;
        c8 = 0;
        c9 = 0;
        c10 = 0;
        c11 = 0;
        c12 = 0;
        c13 = 0;
        c14 = 0;
        c15 = 0;
        c16 = 0;
        c17 = 0;
        c18 = 0;
        c19 = 0;
        c20 = 0;
        c21 = 0;
        c22 = 0;
        c23 = 0;
        c24 = 0;
        c25 = 0;
        c26 = 0;
        c27 = 0;
        c28 = 0;
        c29 = 0;
        c30 = 0;
        c31 = 0;
        c32 = 0;
        c33 = 0;
        c34 = 0;
        c35 = 0;
        c36 = 0;
        c37 = 0;
        c38 = 0;
        c39 = 0;
        c40 = 0;
        stringCarta = "";

        stringCarta = String.valueOf(numCartaPc);

        while (g == 0) {

            cont++;
            int cont3 = 0;

            if (cont != 0) {

                numCartaPc = (int) (Math.random() * 40);
                stringCarta = String.valueOf(numCartaPc);

            }

            switch (stringCarta) {
                case "1":
                    String[][] assocuori = { { " A", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "A " }, };

                    c1++;
                    if (c1 == 1) {
                        cont6++;
                        for (int i = 0; i < assocuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assocuori[0].length; j++) {
                                if (assocuori[i][j] != " " && assocuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + assocuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + assocuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "2":
                    String[][] duecuori = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };

                    c2++;

                    if (c2 == 1) {
                        cont6++;
                        for (int i = 0; i < duecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duecuori[0].length; j++) {
                                if (duecuori[i][j] != " " && duecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + duecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + duecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "3":
                    String[][] trecuori = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };

                    c3++;
                    if (c3 == 1) {
                        cont6++;
                        for (int i = 0; i < trecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trecuori[0].length; j++) {
                                if (trecuori[i][j] != " " && trecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + trecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + trecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "4":
                    String[][] quattrocuori = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c4++;
                    if (c4 == 1) {
                        cont6++;
                        for (int i = 0; i < quattrocuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattrocuori[0].length; j++) {
                                if (quattrocuori[i][j] != " " && quattrocuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + quattrocuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + quattrocuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "5":
                    String[][] cinquecuori = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c5++;

                    if (c5 == 1) {
                        cont6++;
                        for (int i = 0; i < cinquecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquecuori[0].length; j++) {
                                if (cinquecuori[i][j] != " " && cinquecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + cinquecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + cinquecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "6":
                    String[][] seicuori = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c6++;
                    if (c6 == 1) {
                        cont6++;
                        for (int i = 0; i < seicuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seicuori[0].length; j++) {
                                if (seicuori[i][j] != " " && seicuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + seicuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + seicuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "7":
                    String[][] settecuori = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c7++;
                    if (c7 == 1) {
                        cont6++;
                        for (int i = 0; i < settecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settecuori[0].length; j++) {
                                if (settecuori[i][j] != " " && settecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + settecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + settecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "8":
                    String[][] ottocuori = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c8++;
                    if (c8 == 1) {
                        cont6++;
                        for (int i = 0; i < ottocuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottocuori[0].length; j++) {
                                if (ottocuori[i][j] != " " && ottocuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + ottocuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + ottocuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "9":
                    String[][] novecuori = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c9++;
                    if (c9 == 1) {
                        cont6++;
                        for (int i = 0; i < novecuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novecuori[0].length; j++) {
                                if (novecuori[i][j] != " " && novecuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + novecuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + novecuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "10":
                    String[][] diecicuori = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", "♥", " ", "  " },
                            { "  ", "♥", " ", "♥", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c10++;
                    if (c10 == 1) {
                        cont6++;
                        for (int i = 0; i < diecicuori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < diecicuori[0].length; j++) {
                                if (diecicuori[i][j] != " " && diecicuori[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + diecicuori[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + diecicuori[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "11":
                    String[][] assoquadri = { { " 1", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "1 " }, };
                    c11++;
                    if (c11 == 1) {
                        cont6++;
                        for (int i = 0; i < assoquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assoquadri[0].length; j++) {
                                if (assoquadri[i][j] != " " && assoquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + assoquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + assoquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "12":
                    String[][] duequadri = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };
                    c12++;
                    if (c12 == 1) {
                        cont6++;
                        for (int i = 0; i < duequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duequadri[0].length; j++) {
                                if (duequadri[i][j] != " " && duequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + duequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + duequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "13":
                    String[][] trequadri = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };
                    c13++;
                    if (c13 == 1) {
                        cont6++;
                        for (int i = 0; i < trequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trequadri[0].length; j++) {
                                if (trequadri[i][j] != " " && trequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + trequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + trequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "14":
                    String[][] quattroquadri = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c14++;
                    if (c14 == 1) {
                        cont6++;
                        for (int i = 0; i < quattroquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattroquadri[0].length; j++) {
                                if (quattroquadri[i][j] != " " && quattroquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + quattroquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + quattroquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "15":
                    String[][] cinquequadri = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c15++;
                    if (c15 == 1) {
                        cont6++;
                        for (int i = 0; i < cinquequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquequadri[0].length; j++) {
                                if (cinquequadri[i][j] != " " && cinquequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + cinquequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + cinquequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "16":
                    String[][] seiquadri = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c16++;
                    if (c16 == 1) {
                        cont6++;
                        for (int i = 0; i < seiquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seiquadri[0].length; j++) {
                                if (seiquadri[i][j] != " " && seiquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + seiquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + seiquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "17":
                    String[][] settequadri = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c17++;
                    if (c17 == 1) {
                        cont6++;
                        for (int i = 0; i < settequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settequadri[0].length; j++) {
                                if (settequadri[i][j] != " " && settequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + settequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + settequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "18":
                    String[][] ottoquadri = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c18++;
                    if (c18 == 1) {
                        cont6++;
                        for (int i = 0; i < ottoquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottoquadri[0].length; j++) {
                                if (ottoquadri[i][j] != " " && ottoquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + ottoquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + ottoquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "19":
                    String[][] novequadri = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c19++;
                    if (c19 == 1) {
                        cont6++;
                        for (int i = 0; i < novequadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novequadri[0].length; j++) {
                                if (novequadri[i][j] != " " && novequadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + novequadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + novequadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "20":
                    String[][] dieciquadri = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", "♦", " ", "  " },
                            { "  ", "♦", " ", "♦", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c20++;
                    if (c20 == 1) {
                        cont6++;
                        for (int i = 0; i < dieciquadri.length; i++) {
                            System.out.println();
                            for (int j = 0; j < dieciquadri[0].length; j++) {
                                if (dieciquadri[i][j] != " " && dieciquadri[i][j] != "  ") {
                                    System.out.print(c + "[47;31;1m" + dieciquadri[i][j] + c + "[0m");
                                } else {
                                    System.out.print(c + "[47;30;1m" + dieciquadri[i][j] + c + "[0m");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "21":
                    String[][] assopicche = { { " 1", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "1 " }, };
                    c21++;
                    if (c21 == 1) {
                        cont6++;
                        for (int i = 0; i < assopicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assopicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + assopicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "22":
                    String[][] duepicche = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };
                    c22++;
                    if (c22 == 1) {
                        cont6++;
                        for (int i = 0; i < duepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + duepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "23":
                    String[][] trepicche = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };
                    c23++;
                    if (c23 == 1) {
                        cont6++;
                        for (int i = 0; i < trepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + trepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "24":
                    String[][] quattropicche = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c24++;
                    if (c24 == 1) {
                        cont6++;
                        for (int i = 0; i < quattropicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattropicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + quattropicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "25":
                    String[][] cinquepicche = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c25++;
                    if (c25 == 1) {
                        cont6++;
                        for (int i = 0; i < cinquepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + cinquepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "26":
                    String[][] seipicche = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c26++;
                    if (c26 == 1) {
                        cont6++;
                        for (int i = 0; i < seipicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seipicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + seipicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "27":
                    String[][] settepicche = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c27++;
                    if (c27 == 1) {
                        cont6++;
                        for (int i = 0; i < settepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + settepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "28":
                    String[][] ottopicche = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c28++;
                    if (c28 == 1) {
                        cont6++;
                        for (int i = 0; i < ottopicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottopicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + ottopicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "29":
                    String[][] novepicche = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c29++;
                    if (c29 == 1) {
                        cont6++;
                        for (int i = 0; i < novepicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novepicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + novepicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "30":
                    String[][] diecipicche = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", "♠", " ", "  " },
                            { "  ", "♠", " ", "♠", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c30++;
                    if (c30 == 1) {
                        cont6++;
                        for (int i = 0; i < diecipicche.length; i++) {
                            System.out.println();
                            for (int j = 0; j < diecipicche[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + diecipicche[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "31":
                    String[][] assofiori = { { " 1", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "1 " }, };
                    c31++;
                    if (c31 == 1) {
                        cont6++;
                        for (int i = 0; i < assofiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < assofiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + assofiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "32":
                    String[][] duefiori = { { " 2", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "2 " }, };
                    c32++;
                    if (c32 == 1) {
                        cont6++;
                        for (int i = 0; i < duefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < duefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + duefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "33":
                    String[][] trefiori = { { " 3", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "3 " }, };
                    c33++;
                    if (c33 == 1) {
                        cont6++;
                        for (int i = 0; i < trefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < trefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + trefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "34":
                    String[][] quattrofiori = { { " 4", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "4 " }, };
                    c34++;
                    if (c34 == 1) {
                        cont6++;
                        for (int i = 0; i < quattrofiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < quattrofiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + quattrofiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "35":
                    String[][] cinquefiori = { { " 5", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "5 " }, };
                    c35++;
                    if (c35 == 1) {
                        cont6++;
                        for (int i = 0; i < cinquefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < cinquefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + cinquefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "36":
                    String[][] seifiori = { { " 6", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "6 " }, };
                    c36++;
                    if (c36 == 1) {
                        cont6++;
                        for (int i = 0; i < seifiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < seifiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + seifiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "37":
                    String[][] settefiori = { { " 7", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "7 " }, };
                    c37++;
                    if (c37 == 1) {
                        cont6++;
                        for (int i = 0; i < settefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < settefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + settefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "38":
                    String[][] ottofiori = { { " 8", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "8 " }, };
                    c38++;
                    if (c38 == 1) {
                        cont6++;
                        for (int i = 0; i < ottofiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ottofiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + ottofiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "39":
                    String[][] novefiori = { { " 9", " ", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", " ", "  " },
                            { "  ", " ", " ", " ", "9 " }, };
                    c39++;
                    if (c39 == 1) {
                        cont6++;
                        for (int i = 0; i < novefiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < novefiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + novefiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "40":
                    String[][] diecifiori = { { " 1", "0", " ", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", "♣", " ", "  " },
                            { "  ", "♣", " ", "♣", "  " },
                            { "  ", " ", " ", "1", "0 " }, };
                    c40++;
                    if (c40 == 1) {
                        cont6++;
                        for (int i = 0; i < diecifiori.length; i++) {
                            System.out.println();
                            for (int j = 0; j < diecifiori[0].length; j++) {
                                System.out.print(c + "[47;30;1m" + diecifiori[i][j] + c + "[0m");
                            }
                        }
                        System.out.println();

                    }

                    break;
            }

            switch (cartaPc) {
                case "asso di cuori":

                    if (c1 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di cuori":

                    if (c2 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di cuori":

                    if (c3 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di cuori":

                    if (c4 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di cuori":

                    if (c5 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di cuori":

                    if (c6 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di cuori":

                    if (c7 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di cuori":

                    if (c8 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di cuori":

                    if (c9 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di cuori":

                    if (c10 == 1) {
                        g = 1;
                    }
                    break;
                case "asso di quadri":

                    if (c11 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di quadri":

                    if (c12 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di quadri":

                    if (c13 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di quadri":

                    if (c14 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di quadri":

                    if (c15 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di quadri":

                    if (c16 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di quadri":

                    if (c17 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di quadri":

                    if (c18 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di quadri":

                    if (c19 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di quadri":

                    if (c20 == 1) {
                        g = 1;
                    }
                    break;
                case "asso di picche":

                    if (c21 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di picche":

                    if (c22 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di picche":

                    if (c23 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di picche":

                    if (c24 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di picche":

                    if (c25 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di picche":

                    if (c26 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di picche":

                    if (c27 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di picche":

                    if (c28 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di picche":

                    if (c29 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di picche":

                    if (c30 == 1) {
                        g = 1;
                    }
                    break;
                case "asso di fiori":

                    if (c31 == 1) {
                        g = 1;
                    }
                    break;
                case "2 di fiori":

                    if (c32 == 1) {
                        g = 1;
                    }
                    break;
                case "3 di fiori":

                    if (c33 == 1) {
                        g = 1;
                    }
                    break;
                case "4 di fiori":

                    if (c34 == 1) {
                        g = 1;
                    }
                    break;
                case "5 di fiori":

                    if (c35 == 1) {
                        g = 1;
                    }
                    break;
                case "6 di fiori":

                    if (c36 == 1) {
                        g = 1;
                    }
                    break;
                case "7 di fiori":

                    if (c37 == 1) {
                        g = 1;
                    }
                    break;
                case "8 di fiori":

                    if (c38 == 1) {
                        g = 1;
                    }
                    break;
                case "9 di fiori":

                    if (c39 == 1) {
                        g = 1;
                    }
                    break;
                case "10 di fiori":

                    if (c40 == 1) {
                        g = 1;
                    }
                    break;
            }

        }
        System.out.println("\nCARTA NUMERO " + cont6);
        int risultato = 0;

        if (cont5 < cont6) {
            System.out.println("\nIL VINCITORE E' ... " + playera);

        }
        if (cont6 < cont5) {
            System.out.println("\nIL VINCITORE E' ... " + playerb);
            risultato = 1;
        }
        if (cont5 == cont6) {
            System.out.println("\nPAREGGIO");
        }
        if (provenienza == 0) {
            Scanner cambio = new Scanner(System.in);
            System.out.println();
            System.out.println("\n\nVuoi cambiare gioco ?\n-sì --> inserire '1'\n-no --> inserire '2'\n");
            int cambiagioco = cambio.nextInt();
            if (cambiagioco == 1) {

                inizio();
            }
        }
        return risultato;
    }

    public static int dadi(String nick, String nick2, int provenienza) {
        String uno[][] = { { "  ", "   ", "  " }, { "  ", " • ", "  " }, { "  ", "   ", "  " } };
        String due[][] = { { " •", "   ", "  " }, { "  ", "   ", "  " }, { "  ", "   ", "• " } };
        String tre[][] = { { " •", "   ", "  " }, { "  ", " • ", "  " }, { "  ", "   ", "• " } };
        String quattro[][] = { { " •", "   ", "• " }, { "  ", "   ", "  " }, { " •", "   ", "• " } };
        String cinque[][] = { { " •", "   ", "• " }, { "  ", " • ", "  " }, { " •", "   ", "• " } };
        String sei[][] = { { " •", "   ", "• " }, { " •", "   ", "• " }, { " •", "   ", "• " } };

        // QUANTI DADI
        Scanner in13 = new Scanner(System.in);
        System.out.println();
        Scanner in17 = new Scanner(System.in);
        System.out.println("quanti dadi volete lanciare?");
        int numerodadi = in17.nextInt();

        // variabili
        int p1 = 0;
        int p2 = 0;
        char c = 27;

        // g1
        for (int rip = 0; rip < numerodadi; rip++) {
            System.out.println(
                    "\n" + c + "[31;1m" + nick + c + "[0m" + " premi 'invio' per lanciare il " + (rip + 1) + "° dado");
            String nullo = in13.nextLine();
            int num = (int) (Math.random() * 6);
            switch (num) {
                case 0:
                    for (int i = 0; i < uno.length; i++) {
                        System.out.println();
                        for (int j = 0; j < uno[0].length; j++) {
                            System.out.print(c + "[47;31;1m" + uno[i][j] + c + "[0m");

                        }

                    }
                    p1 = p1 + num + 1;
                    break;
                case 1:
                    for (int i = 0; i < due.length; i++) {
                        System.out.println();
                        for (int j = 0; j < due[0].length; j++) {
                            System.out.print(c + "[47;31;1m" + due[i][j] + c + "[0m");

                        }
                    }
                    p1 = p1 + num + 1;
                    break;
                case 2:
                    for (int i = 0; i < tre.length; i++) {
                        System.out.println();
                        for (int j = 0; j < tre[0].length; j++) {
                            System.out.print(c + "[47;31;1m" + tre[i][j] + c + "[0m");

                        }
                    }
                    p1 = p1 + num + 1;
                    break;
                case 3:
                    for (int i = 0; i < quattro.length; i++) {
                        System.out.println();
                        for (int j = 0; j < quattro[0].length; j++) {
                            System.out.print(c + "[47;31;1m" + quattro[i][j] + c + "[0m");

                        }
                    }
                    p1 = p1 + num + 1;
                    break;
                case 4:
                    for (int i = 0; i < cinque.length; i++) {
                        System.out.println();
                        for (int j = 0; j < cinque[0].length; j++) {
                            System.out.print(c + "[47;31;1m" + cinque[i][j] + c + "[0m");

                        }
                    }
                    p1 = p1 + num + 1;
                    break;
                case 5:
                    for (int i = 0; i < sei.length; i++) {
                        System.out.println();
                        for (int j = 0; j < sei[0].length; j++) {
                            System.out.print(c + "[47;31;1m" + sei[i][j] + c + "[0m");
                        }
                    }
                    p1 = p1 + num + 1;
                    break;

            }

        } // fine for g1
        System.out.println();
        System.out.println();
        for (int rip = 0; rip < numerodadi; rip++) {
            System.out.println(
                    "\n" + c + "[34;1m" + nick2 + c + "[0m" + " premi 'invio' per lanciare il " + (rip + 1) + "° dado");
            String nullo = in13.nextLine();
            int num = (int) (Math.random() * 6);
            switch (num) {
                case 0:
                    for (int i = 0; i < uno.length; i++) {
                        System.out.println();
                        for (int j = 0; j < uno[0].length; j++) {
                            System.out.print(c + "[47;34;1m" + uno[i][j] + c + "[0m");

                        }

                    }
                    p2 = p2 + num + 1;
                    break;
                case 1:
                    for (int i = 0; i < due.length; i++) {
                        System.out.println();
                        for (int j = 0; j < due[0].length; j++) {
                            System.out.print(c + "[47;34;1m" + due[i][j] + c + "[0m");

                        }
                    }
                    p2 = p2 + num + 1;
                    break;
                case 2:
                    for (int i = 0; i < tre.length; i++) {
                        System.out.println();
                        for (int j = 0; j < tre[0].length; j++) {
                            System.out.print(c + "[47;34;1m" + tre[i][j] + c + "[0m");

                        }
                    }
                    p2 = p2 + num + 1;
                    break;
                case 3:
                    for (int i = 0; i < quattro.length; i++) {
                        System.out.println();
                        for (int j = 0; j < quattro[0].length; j++) {
                            System.out.print(c + "[47;34;1m" + quattro[i][j] + c + "[0m");

                        }
                    }
                    p2 = p2 + num + 1;
                    break;
                case 4:
                    for (int i = 0; i < cinque.length; i++) {
                        System.out.println();
                        for (int j = 0; j < cinque[0].length; j++) {
                            System.out.print(c + "[47;34;1m" + cinque[i][j] + c + "[0m");

                        }
                    }
                    p2 = p2 + num + 1;
                    break;
                case 5:
                    for (int i = 0; i < sei.length; i++) {
                        System.out.println();
                        for (int j = 0; j < sei[0].length; j++) {
                            System.out.print(c + "[47;34;1m" + sei[i][j] + c + "[0m");
                        }
                    }
                    p2 = p2 + num + 1;
                    break;

            }

        } // fine for g2

        System.out.println();
        System.out.println();

        System.out.println("\n" + c + "[31;1m" + nick + c + "[0m" + " ha totalizzato " + p1 + " punti");
        System.out.println("\n" + c + "[34;1m" + nick2 + c + "[0m" + " ha totalizzato " + p2 + " punti");
        int iniziotris = 0;
        if (p1 == p2) {
            System.out.println("PAREGGIO");
            iniziotris = 0;
        }

        if (p1 > p2) {
            System.out.println("\n" + "il vincitore è " + c + "[31;1m" + nick + c + "[0m");
            iniziotris = 0;
        } else {
            System.out.println("\n" + "il vincitore è " + c + "[34;1m" + nick2 + c + "[0m");
            iniziotris = 1;
        }
        if (provenienza == 0) {
            Scanner cambio = new Scanner(System.in);
            System.out.println();
            System.out.println("\n\nVuoi cambiare gioco ?\n-sì --> inserire '1'\n-no --> inserire '2'\n");
            int cambiagioco = cambio.nextInt();
            if (cambiagioco == 1) {

                inizio();
            }
        }
        return iniziotris;

    }// fine met dadi

    public static int singolodadi(String nick, String nick2, int provenienza) {
        String uno[][] = { { "  ", "   ", "  " }, { "  ", " • ", "  " }, { "  ", "   ", "  " } };
        String due[][] = { { " •", "   ", "  " }, { "  ", "   ", "  " }, { "  ", "   ", "• " } };
        String tre[][] = { { " •", "   ", "  " }, { "  ", " • ", "  " }, { "  ", "   ", "• " } };
        String quattro[][] = { { " •", "   ", "• " }, { "  ", "   ", "  " }, { " •", "   ", "• " } };
        String cinque[][] = { { " •", "   ", "• " }, { "  ", " • ", "  " }, { " •", "   ", "• " } };
        String sei[][] = { { " •", "   ", "• " }, { " •", "   ", "• " }, { " •", "   ", "• " } };

        // QUANTI DADI
        Scanner in13 = new Scanner(System.in);
        System.out.println();
        Scanner in17 = new Scanner(System.in);
        System.out.println("quanti dadi vuoi lanciare?");
        int numerodadi = in17.nextInt();

        // variabili
        int p1 = 0;
        int p2 = 0;
        char c = 27;

        // g1
        for (int rip = 0; rip < numerodadi; rip++) {
            System.out.println(
                    "\n" + c + "[31;1m" + nick + c + "[0m" + " premi 'invio' per lanciare il " + (rip + 1) + "° dado");
            String nullo = in13.nextLine();
            int num = (int) (Math.random() * 6);
            switch (num) {
                case 0:
                    for (int i = 0; i < uno.length; i++) {
                        System.out.println();
                        for (int j = 0; j < uno[0].length; j++) {
                            System.out.print(c + "[47;31;1m" + uno[i][j] + c + "[0m");

                        }

                    }
                    p1 = p1 + num + 1;
                    break;
                case 1:
                    for (int i = 0; i < due.length; i++) {
                        System.out.println();
                        for (int j = 0; j < due[0].length; j++) {
                            System.out.print(c + "[47;31;1m" + due[i][j] + c + "[0m");

                        }
                    }
                    p1 = p1 + num + 1;
                    break;
                case 2:
                    for (int i = 0; i < tre.length; i++) {
                        System.out.println();
                        for (int j = 0; j < tre[0].length; j++) {
                            System.out.print(c + "[47;31;1m" + tre[i][j] + c + "[0m");

                        }
                    }
                    p1 = p1 + num + 1;
                    break;
                case 3:
                    for (int i = 0; i < quattro.length; i++) {
                        System.out.println();
                        for (int j = 0; j < quattro[0].length; j++) {
                            System.out.print(c + "[47;31;1m" + quattro[i][j] + c + "[0m");

                        }
                    }
                    p1 = p1 + num + 1;
                    break;
                case 4:
                    for (int i = 0; i < cinque.length; i++) {
                        System.out.println();
                        for (int j = 0; j < cinque[0].length; j++) {
                            System.out.print(c + "[47;31;1m" + cinque[i][j] + c + "[0m");

                        }
                    }
                    p1 = p1 + num + 1;
                    break;
                case 5:
                    for (int i = 0; i < sei.length; i++) {
                        System.out.println();
                        for (int j = 0; j < sei[0].length; j++) {
                            System.out.print(c + "[47;31;1m" + sei[i][j] + c + "[0m");
                        }
                    }
                    p1 = p1 + num + 1;
                    break;

            }

        } // fine for g1
        System.out.println();
        System.out.println();
        for (int rip = 0; rip < numerodadi; rip++) {
            System.out.println(
                    "\n" + c + "[34;1m" + nick2 + c + "[0m" + " ha lanciato il " + (rip + 1) + "° dado");

            int num = (int) (Math.random() * 6);
            switch (num) {
                case 0:
                    for (int i = 0; i < uno.length; i++) {
                        System.out.println();
                        for (int j = 0; j < uno[0].length; j++) {
                            System.out.print(c + "[47;34;1m" + uno[i][j] + c + "[0m");

                        }

                    }
                    p2 = p2 + num + 1;
                    break;
                case 1:
                    for (int i = 0; i < due.length; i++) {
                        System.out.println();
                        for (int j = 0; j < due[0].length; j++) {
                            System.out.print(c + "[47;34;1m" + due[i][j] + c + "[0m");

                        }
                    }
                    p2 = p2 + num + 1;
                    break;
                case 2:
                    for (int i = 0; i < tre.length; i++) {
                        System.out.println();
                        for (int j = 0; j < tre[0].length; j++) {
                            System.out.print(c + "[47;34;1m" + tre[i][j] + c + "[0m");

                        }
                    }
                    p2 = p2 + num + 1;
                    break;
                case 3:
                    for (int i = 0; i < quattro.length; i++) {
                        System.out.println();
                        for (int j = 0; j < quattro[0].length; j++) {
                            System.out.print(c + "[47;34;1m" + quattro[i][j] + c + "[0m");

                        }
                    }
                    p2 = p2 + num + 1;
                    break;
                case 4:
                    for (int i = 0; i < cinque.length; i++) {
                        System.out.println();
                        for (int j = 0; j < cinque[0].length; j++) {
                            System.out.print(c + "[47;34;1m" + cinque[i][j] + c + "[0m");

                        }
                    }
                    p2 = p2 + num + 1;
                    break;
                case 5:
                    for (int i = 0; i < sei.length; i++) {
                        System.out.println();
                        for (int j = 0; j < sei[0].length; j++) {
                            System.out.print(c + "[47;34;1m" + sei[i][j] + c + "[0m");
                        }
                    }
                    p2 = p2 + num + 1;
                    break;

            }
            System.out.println();
        } // fine for g2

        System.out.println();
        System.out.println();

        System.out.println("\n" + c + "[31;1m" + nick + c + "[0m" + " ha totalizzato " + p1 + " punti");
        System.out.println("\n" + c + "[34;1m" + nick2 + c + "[0m" + " ha totalizzato " + p2 + " punti");
        int iniziotris = 0;
        if (p1 == p2) {
            System.out.println("PAREGGIO");
            iniziotris = 0;
        }

        if (p1 > p2) {
            System.out.println("\n" + "il vincitore è " + c + "[31;1m" + nick + c + "[0m");
            iniziotris = 0;
        } else {
            System.out.println("\n" + "il vincitore è " + c + "[34;1m" + nick2 + c + "[0m");
            iniziotris = 1;
        }
        if (provenienza == 0) {
            Scanner cambio = new Scanner(System.in);
            System.out.println();
            System.out.println("\n\nVuoi cambiare gioco ?\n-sì --> inserire '1'\n-no --> inserire '2'\n");
            int cambiagioco = cambio.nextInt();
            if (cambiagioco == 1) {

                inizio();
            }
        }
        return iniziotris;

    }// fine met dadi singoli

    // MET IMPICCATO
    public static void impiccato() {
        String dieci[][]={{"\n  ___ \n |  | \n O  | \n-|- | \n_|_ | \n____|_",}};
        String nove[][]={{"\n  ___ \n |  | \n O  | \n-|- | \n_|  | \n____|_",}};
        String otto[][]={{"\n  ___ \n |  | \n O  | \n-|- | \n |  | \n____|_",}};
        String sette[][]={{"\n  ___ \n |  | \n O  | \n-|- | \n    | \n____|_",}};
        String sei[][]={{"\n  ___ \n |  | \n O  | \n-|  | \n    | \n____|_",}};
        String cinque[][]={{"\n  ___ \n |  | \n O  | \n |  | \n    | \n____|_",}};
        String quattro[][]={{"\n  ___ \n |  | \n O  | \n    | \n    | \n____|_",}};
        String tre[][]={{"\n  ___ \n |  | \n    | \n    | \n    | \n____|_",}};
        String due[][]={{"\n      \n    | \n    | \n    | \n    | \n____|_",}};
        String uno[][]={{"\n      \n      \n      \n      \n      \n____|_",}};
        

        String[] animali = { "bradipo", "canguro", "koala", "pinguino", "armadillo", "squalo martello",
                "panda rosso", "rinoceronte", "acquila", "pesce gatto", "avvoltoio", "poiana",
                "cavedano", "cervo", "fenicottero", "formichiere", "tricheco", "formica rossa",
                "acciuga", "pesce spada", "tartaruga", "piranha", "alligatore", "pecora", "processionaria",
                "cornacchia", "scorpione", "lucertola", "black mamba", "camola del miele", "koala", "serpente",
                "scoiattolo", "lepre", "pappagallo" };

        String[] piante = { "orchidea", "edera", "pioppo nero", "quercia", "faggio", "acero rosso", "tulipano",
                "narciso", "margherita", "gelsomino", "pino argentato", "magnolia", "erba pampa",
                "tiglio", "ortensia", "acacia", "eucalipto", "bella di notte", "banano", "palma",
                "basilico", "lavanda", "bambù", "ciclamino", "cipresso", "lauro", "camomilla", "oleandro",
                "pino marittimo", "salice piangente" };

        String[] cittàIta = { "milano", "taranto", "monopoli", "firenze", "massa carrara", "forte dei marmi",
                "siracusa", "udine", "modena", "ferrara", "milazzo", "arezzo", "la spezia",
                "treviso", "gressoney", "aosta", "ancona", "civitanova", "jesolo", "senigallia",
                "urbino", "torino", "messina", "reggio calabria", "l'acquila" };

        String[] verbi = { "abdicare", "affilare", "circunnavigare", "acquisire", "penalizzare", "stendere",
                "ammettere", "accingere", "stampare", "fornire", "sensibilizzare", "spiare",
                "stringere", "crescere", "livellare", "proiettore", "emigrare", "estirpare",
                "affliggere", "amministrare", "premere", "intromettere", "inclinare", "istruire",
                "affiliare", "estinguere", "poltrire", "masticare", "impollinare", "screditare" };

        String[] nomi = { "camillo", "salvatore", "eugenio", "emanuele", "tommaso", "antonio", "adelmo",
                "riccardo", "alessandro", "leonardo", "gabriele", "vittoria", "francesco",
                "geltrude", "genoveffa", "ginevra", "simonetta", "giuseppe", "ismaele",
                "rodolfo", "ignazio", "gustavo", "ottavio", "damiano", "matilde", "diletta",
                "massimo", "manfredi", "stefano", "giancarlo" };

        int categoria = (int) (Math.random() * 5);
        int numeroparola = 0;
        String parola = "";
        String stringacat = "";
        switch (categoria) {
            case 0:
                numeroparola = (int) (Math.random() * 36);
                parola = animali[numeroparola];
                stringacat = "animali";
                break;
            case 1:
                numeroparola = (int) (Math.random() * 31);
                parola = piante[numeroparola];
                stringacat = "piante e fiori";
                break;
            case 2:
                numeroparola = (int) (Math.random() * 26);
                parola = cittàIta[numeroparola];
                stringacat = "città italiane";
                break;
            case 3:
                numeroparola = (int) (Math.random() * 31);
                parola = verbi[numeroparola];
                stringacat = "verbi";
                break;
            case 4:
                numeroparola = (int) (Math.random() * 31);
                parola = nomi[numeroparola];
                stringacat = "nomi propri di persona";
                break;

        }
        // riempio trattini
        String[] parolaincognita = new String[parola.length()];
        for (int i = 0; i < parolaincognita.length; i++) {

            if (parola.charAt(i) == ' ') {
                parolaincognita[i] = " ";
            } else {
                parolaincognita[i] = "_ ";
            }
        }
        System.out.println("\n" + Arrays.toString(parolaincognita) + "\n");
        

        // inserimento parola o lettera

        int rip = 0;
        int errore = 0;
        while (rip < 11) {
            if (errore==10)
            {
                System.out.println(dieci[0][0]);
                System.out.println("HAI PERSO ");
                rip=100;
                errore=100;
                System.out.println("la parola era "+parola);
            }
            if (errore==9)
            {
                System.out.println(nove[0][0]);
               
            }
            if (errore==8)
            {
                System.out.println(otto[0][0]);
                
            }
            if (errore==7)
            {
                System.out.println(sette[0][0]);
                
            }
            if (errore==6)
            {
                System.out.println(sei[0][0]);
               
            }
            if (errore==5)
            {
                System.out.println(cinque[0][0]);
                
            }
            if (errore==4)
            {
                System.out.println(quattro[0][0]);
               
            }
            if (errore==3)
            {
                System.out.println(tre[0][0]);
                
            }
            if (errore==2)
            {
                System.out.println(due[0][0]);
                
            }
            if (errore==1)
            {
                System.out.println(uno[0][0]);
                
            }
 Scanner in20 = new Scanner(System.in);
 String parolaoletter="";
if (errore<11) {
    
            System.out.println("\n\nInserisci la lettera o la parola \n");
             parolaoletter = in20.nextLine();
}
           
            
            int parolaolettera = 0;
            if(parolaoletter.length()==1){
                parolaolettera=2;
            }
            else{
                parolaolettera=1;
            }

            switch (parolaolettera) {
                case 1:
                    // inserire tutta la parola
                  
                    String parolaoinserita =parolaoletter;
                    if (parolaoinserita.equals(parola)) {
                        System.out.println("HAI VINTO!");
                        rip = 13;
                        errore=100;
                    } else {
                        errore++;
                        System.out.println("parola errata");
                        rip++;
                    }

                    break;
                case 2:
                    // inserire lettere
                    
                    String letterainserita =parolaoletter;
                    int cont = 0;
                    int cont2 = 0;

                    for (int i = 0; i < parola.length(); i++) {

                        if (parola.charAt(i) == letterainserita.charAt(0)) {
                            parolaincognita[i] = letterainserita;
                            cont++;

                        }
                    }

                    for (int i = 0; i < parola.length(); i++) {

                        if (parolaincognita[i].charAt(0) == parola.charAt(i)) {
                            cont2++;
                        }
                    }

                    if (cont2 == parola.length()) {
                        System.out.println("HAI VINTO!");
                        rip = 13;
                        errore=100;
                    }

                    if (cont == 0) {
                        errore++;
                        rip++;
                    }
                    cont = 0;
                    System.out.println(Arrays.toString(parolaincognita));

                    break;
            }
            if (errore == 4) {
                System.out.println("\nCATEGORIA: " + stringacat);
            }

        }// fine while
        Scanner in26=new Scanner(System.in);
       
        System.out.println("\n");
                
                System.out.println("vuoi cambiare gioco? \n-si--> inserisci'1'\n-no-->inserisci '2'");
                int cambia = in26.nextInt();
                if (cambia == 1) {
                    inizio();
                }
            


    }// fine metodo impiccato

    // MET SLOTE MACHINE SINGOLO
    public static void slotsingolo() {
        char c = 27;
        int[] a = new int[3];
        int rip = 2;
        int ripeti = 0;
        while (ripeti == 0) {

            // immagine iniziale
            System.out.println(c + "[40m" + "       TENTA LA FORTUNA       " + c + "[0m");
            System.out.println(c + "[40m" + "                              " + c + "[0m");
            for (int i = 0; i < 5; i++) {
                System.out.print(c + "[40m" + "    " + c + "[0m");
                System.out.print(c + "[47m" + "      " + c + "[0m");
                System.out.print(c + "[40m" + "  " + c + "[0m");
                System.out.print(c + "[47m" + "      " + c + "[0m");
                System.out.print(c + "[40m" + "  " + c + "[0m");
                System.out.print(c + "[47m" + "      " + c + "[0m");
                System.out.print(c + "[40m" + "    " + c + "[0m");
                System.out.println();
            }
            System.out.print(c + "[40m" + "                              " + c + "[0m");
            System.out.println();
            System.out.println();
            int[] b = slotsingoloric(a, rip);
            // stampa figura finale
            System.out.println("premi per tentare la fortuna");
            Scanner in21 = new Scanner(System.in);
            String nullo = in21.nextLine();
            if (a[0] == a[1] && a[1] == a[2]) {
                System.out.println(c + "[40m" + "          HAI VINTO!          " + c + "[0m");

            } else {
                System.out.println(c + "[40m" + "          HAI PERSO!          " + c + "[0m");
            }
            System.out.println(c + "[40m" + "                              " + c + "[0m");

            for (int i = 0; i < 5; i++) {
                System.out.print(c + "[40m" + "    " + c + "[0m");
                // primo rettangolo
                if (a[0] == 1) {
                    System.out.print(c + "[41m" + "      " + c + "[0m");
                }
                if (a[0] == 2) {
                    System.out.print(c + "[42m" + "      " + c + "[0m");
                }
                if (a[0] == 3) {
                    System.out.print(c + "[43m" + "      " + c + "[0m");
                }
                System.out.print(c + "[40m" + "  " + c + "[0m");
                // secondo rettangolo
                if (a[1] == 1) {
                    System.out.print(c + "[41m" + "      " + c + "[0m");
                }
                if (a[1] == 2) {
                    System.out.print(c + "[42m" + "      " + c + "[0m");
                }
                if (a[1] == 3) {
                    System.out.print(c + "[43m" + "      " + c + "[0m");
                }
                System.out.print(c + "[40m" + "  " + c + "[0m");
                // terzo rettangolo
                if (a[2] == 1) {
                    System.out.print(c + "[41m" + "      " + c + "[0m");
                }
                if (a[2] == 2) {
                    System.out.print(c + "[42m" + "      " + c + "[0m");
                }
                if (a[2] == 3) {
                    System.out.print(c + "[43m" + "      " + c + "[0m");
                }
                System.out.print(c + "[40m" + "    " + c + "[0m");
                System.out.println();

            }
            System.out.println(c + "[40m" + "                              " + c + "[0m");

            System.out.println("\nvuoi riprovare? \n-si--> inserisci'1'\n-no-->inserisci '2'");
            int ancora = in21.nextInt();
            if (ancora == 2) {
                ripeti++;
                System.out.println("vuoi cambiare gioco? \n-si--> inserisci'1'\n-no-->inserisci '2'");
                int cambia = in21.nextInt();
                if (cambia == 1) {
                    inizio();
                }
            }

        } // fine while
    }

    // MET SLOTE MACHINE SINGOLO RICORSIVO
    public static int[] slotsingoloric(int[] a, int rip) {

        if (rip < 0) {
            return a;
        } else {
            int numero = (int) (Math.random() * 3) + 1;
            a[rip] = numero;
            return slotsingoloric(a, rip - 1);
        }

    }

    //metodo main slot machine frame

    public static void slotdifficile (){

        
     
         new f();
          Scanner inn=new Scanner(System.in);
         
            
                
                System.out.println("vuoi cambiare gioco? \n-si--> inserisci'1'\n-no-->inserisci '2'");
                int cambia = inn.nextInt();
                if (cambia == 1) {
                    inizio();
                }
            
        }

}
