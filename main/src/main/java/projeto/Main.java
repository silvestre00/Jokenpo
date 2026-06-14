package projeto;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String[] arte = {
                "      _______\n  ---'   ____)\n        (_____)\n        (_____)\n        (____)\n  ---.__(___)",
                "      _______\n  ---'   ____)____\n            ______)\n            _______)\n           _______)\n  ---.__________)",
                "      _______\n  ---'   ____)____\n            ______)\n         __________)\n        (____)\n  ---.__(___)"
        };
        int[][] placar = {{0, 0, 0}, {0, 0, 0}};
        String jokenpo =    "     ██  ██████  ██   ██ ███████ ███    ██ ██████   ██████  \n" +
                            "     ██ ██    ██ ██  ██  ██      ████   ██ ██   ██ ██    ██ \n" +
                            "     ██ ██    ██ █████   █████   ██ ██  ██ ██████  ██    ██ \n" +
                            "██   ██ ██    ██ ██  ██  ██      ██  ██ ██ ██      ██    ██ \n" +
                            " █████   ██████  ██   ██ ███████ ██   ████ ██       ██████  \n" +
                            "                                                            \n" +
                            "                                                            ";
        boolean game = true;
        int escolhaJogador;
        int escolhaMaquina;
        int continuar;
        int i;

        do{
            System.out.println(jokenpo);
            System.out.println("Seja bem vindo!");
            // Escolha do jogador
            System.out.print("Faça a sua escolha para jogar digite o número que representa sua jogada: pedra(0), papel(1) ou tesoura(2): ");
            escolhaJogador = sc.nextInt();
            // Escolha da máquina
            escolhaMaquina = rd.nextInt(3);
            // Retornando ao jogador as escolhas
            System.out.println("Você jogou: \n" + arte[escolhaJogador]);
            System.out.println("A máquina jogou: \n" + arte[escolhaMaquina]);
            // Determinar o resultado final

            if(escolhaJogador == escolhaMaquina){
                System.out.println();
            }

            else if(escolhaJogador == 0){
                if(escolhaMaquina == 1){
                    System.out.println("Você perdeu!");
                }
                else {
                    System.out.println("Você ganhou!");
                }
            }

            else if(escolhaJogador == 1){
                if(escolhaMaquina == 0){
                    System.out.println("Você ganhou!");
                }
                else {
                    System.out.println("Você perdeu!");
                }
            }

            else {
                if(escolhaMaquina == 0){
                    System.out.println("Você perdeu!");
                }
                else{
                    System.out.println("Você ganhou!");
                }
            }

            System.out.print("Essa rodada terminou, gostaria de continuar? sim(1) ou não(2): ");
            continuar = sc.nextInt();
            if(continuar == 2){
                game = false;
            }
        }while(game);

    }
}
