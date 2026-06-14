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
        
        // Score 
        // linha[0] -> Jogador (Vitórias[0], Empates[1], Derrotas[2])
        // linha[1] -> CPU     (Vitórias[0], Empates[1], Derrotas[2])
        int[][] score = new int[2][3];
        
        // Apresentação
        System.out.println(jokenpo);
        System.out.println("Seja bem vindo!");

        do{
            // Escolha do jogador
            System.out.print("\nFaça a sua escolha para jogar digite o número que representa sua jogada: pedra(0), papel(1) ou tesoura(2): ");
            escolhaJogador = sc.nextInt();
            // Escolha da máquina
            escolhaMaquina = rd.nextInt(3);
            // Retornando ao jogador as escolhas
            System.out.println("Você jogou: \n" + arte[escolhaJogador] + "\n");
            System.out.println("A máquina jogou: \n" + arte[escolhaMaquina] + "\n");
            // Determinar o resultado final

            if(escolhaJogador == escolhaMaquina){
                System.out.println("Empate!");
                score[0][1]++;
                score[1][1]++;
            }

            else if(escolhaJogador == 0){
                if(escolhaMaquina == 1){
                    System.out.println("Você perdeu!");
                    score[0][2]++;
                    score[1][0]++;
                }
                else {
                    System.out.println("Você ganhou!");
                    score[0][0]++;
                    score[1][2]++;
                }
            }

            else if(escolhaJogador == 1){
                if(escolhaMaquina == 0){
                    System.out.println("Você ganhou!");
                    score[0][0]++;
                    score[1][2]++;
                }
                else {
                    System.out.println("Você perdeu!");
                    score[0][2]++;
                    score[1][0]++;
                }
            }

            else {
                if(escolhaMaquina == 0){
                    System.out.println("Você perdeu!");
                    score[0][2]++;
                    score[1][0]++;
                }
                else{
                    System.out.println("Você ganhou!");
                    score[0][0]++;
                    score[1][2]++;
                }
            }

            System.out.print("Essa rodada terminou, gostaria de continuar? sim(1) ou não(2): ");
            continuar = sc.nextInt();
            if(continuar == 2){
                game = false;
            }
        }while(game);
        
        System.out.println();
        System.out.println();
        
        // Print do Score
        String printScore = (" ████  ███   ███  ████  █████ \r\n"
        		           + "█     █     █   █ █   █ █     \r\n"
        		           + " ███  █     █   █ ████  ████  \r\n"
        		           + "    █ █     █   █ █  █  █     \r\n"
        		           + "████   ███   ███  █   █ █████   \n"
        		           + "                                \n");
        
        System.out.println(printScore);
        
        for (int j = 0; j < score.length; j++) {
        	
        	if (j == 0) {
        		System.out.println("     JOGADOR\n");
        	}
        	else {
        		System.out.println("\n     MÁQUINA\n");
        	}
        	
        	for (int k = 0; k < score[j].length; k++) {
        		if (k == 0) {
        			System.out.print("Vitórias : \t");
            		System.out.print(score[j][k]);
            		System.out.println();
        		}
        		else if(k == 1) {
            		System.out.printf("Empates  : \t");
                	System.out.print(score[j][k]);
                	System.out.println();
        		}
        		else {
        			System.out.print("Derrotas : \t");
                	System.out.print(score[j][k]);
                	System.out.println();
        		}       	
        	}
        	System.out.println();
        }
        
    }
}
