package joken;

import java.util.Random;
import java.util.Scanner;

public class JokenPo {

	public static void main(String[] args) {
		String resposta = "s";
		Scanner leitor = new Scanner(System.in);

		int vitoriasrodadasmac = 0;
		int vitoriasusuario = 0;

		while (resposta.equals("S") || resposta.equals("s")) {
			int nJogos;
			int cont = 1;

			System.out.println("J O K E N P O");

			System.out.println("apenas valores impares");
			System.out.println("Quantas partidas: ");
			nJogos = leitor.nextInt();

			while (nJogos % 2 == 0 || nJogos < 3) {
				System.out.println("o numero tem q ser maior q 3 " + "digite novamente:");
				nJogos = leitor.nextInt();

			}

			System.out.println("----------------------------");
			System.out.println("Pedra = 1");
			System.out.println("Papel = 2");
			System.out.println("Tesoura = 3");
			System.out.println("----------------------------");

			while (nJogos % 2 == 0) {
				System.out.println("esse numero não é elegivel");
				System.out.println("digite um numero impar:");
				nJogos = leitor.nextInt();
			}

			while (nJogos >= cont) {
				Random joken = new Random();
				int nSorteado = joken.nextInt(3) + 1;
				int nUsuario;

				System.out.println("Escolha uma opção: ");
				nUsuario = leitor.nextInt();

				System.out.println("Numero sorteado pelo pc: " + nSorteado);
				System.out.println("Numero do Usuario: " + nUsuario);

				cont++;

				if (nUsuario >= 0 && nUsuario <= 3) {
					if (nSorteado == nUsuario) {
						System.out.println("Empate!! ");
					} else if ((nUsuario == 1 && nSorteado == 3) || (nUsuario == 2 && nSorteado == 1)
							|| (nUsuario == 3 && nSorteado == 2)) {
						System.out.println("Usuario Ganhou!! ");
						vitoriasusuario = vitoriasusuario + 1;
					} else if (((nUsuario == 3 && nSorteado == 1) || (nUsuario == 1 && nSorteado == 2)
							|| (nUsuario == 2 && nSorteado == 3))) {
						System.out.println("Pc Ganhou!! ");
						vitoriasrodadasmac = vitoriasrodadasmac + 1;
					}
				}
				while (vitoriasrodadasmac == vitoriasusuario) {
					joken = new Random();
					nSorteado = joken.nextInt(3) + 1;

					System.out.println("Escolha uma opção: ");
					nUsuario = leitor.nextInt();

					System.out.println("Numero sorteado pelo pc: " + nSorteado);
					System.out.println("Numero do Usuario: " + nUsuario);

					cont++;

					System.out.println("vamos desempatar ? (S/N)");
					resposta = leitor.next();
					if (nUsuario >= 0 && nUsuario <= 3) {
						if (nSorteado == nUsuario) {
							System.out.println("Empate!! ");
						} else if ((nUsuario == 1 && nSorteado == 3) || (nUsuario == 2 && nSorteado == 1)
								|| (nUsuario == 3 && nSorteado == 2)) {
							System.out.println("Usuario Ganhou!! ");
							vitoriasusuario = vitoriasusuario + 1;
						} else if (((nUsuario == 3 && nSorteado == 1) || (nUsuario == 1 && nSorteado == 2)
								|| (nUsuario == 2 && nSorteado == 3))) {
							System.out.println("Pc Ganhou!! ");
							vitoriasrodadasmac = vitoriasrodadasmac + 1;
						}

					} else {
						System.out.println("O Numero que você digitou não é elegivel");
					}

				}

			}
			System.out.println("Jogar novamente(S/N):");
			resposta = leitor.next();

			if (vitoriasrodadasmac > vitoriasusuario) {
				System.out.println("maquina ganhou");
			} else {
				System.out.println("usuario ganhou");
			}

			leitor.close();

			System.out.println("*****fim*****");

		}

	}
}
