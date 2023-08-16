package br.senai.sp.jandira.game.Model;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Register {


    int validaPrint = 0;

    /**
     * Instancia Scanner
     */
    Scanner teclado = new Scanner(System.in);

    /**
     * Instancia Player
     */
    Player player = new Player();

    /**
     * Instancia Enemy
     */
    Enemy enemy = new Enemy();

    /**
     * *Instancia Output
     */

    Output output = new Output();


    public void BothRegister() {
        validaPrint = 1;
        PlayerRegister();
        EnemyRegister();
        output.PrintPlayer(player);
        output.PrintEnemy(enemy);
    }

    public void PlayerRegister() {

        /** Coleta dados do Player-1 */
        System.out.println("---------------- Cadastro Player ----------------");
        System.out.print("Qual é o seu nome: ");
        player.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (red - blue - purple) : ");
        player.skin = teclado.nextLine();
        System.out.println("--------- Player Cadastrado com Sucesso ---------");

        if (validaPrint != 1) {
            /** Printa as Informações Cadastradas */
            output.PrintPlayer(player);
        }
    }

    public void EnemyRegister() {

        /** Coleta dados do Enemy-1 */
        System.out.println("---------------- Cadastro Enemy ----------------");
        System.out.print("Qual é o seu nome: ");
        enemy.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (red - blue - purple) : ");
        enemy.skin = teclado.nextLine();
        System.out.println("--------- Enemy Cadastrado com Sucesso ---------");

        if (validaPrint != 1) {
            /** Printa as Informações Cadastradas */
            output.PrintEnemy(enemy);
        }
    }

    public void Decision() {

        String decision;

        System.out.println("Seja Bem Vindo !!!");
        System.out.println("Deseja Cadastrar [ Player - Enemy - Ambos: ");
        decision = teclado.nextLine();

        switch (decision.toLowerCase()) {

            case "Player":
                PlayerRegister();
                break;

            case "Enemy":
                EnemyRegister();
                break;

            case "Ambos":
                BothRegister();


                }
        System.out.println("Deseja Retornar ao Cadastro [1- Sim 2- Não]?");
        int continuar = teclado.nextInt();

        if (continuar == 1) {
            Decision();
        }

    }
}