package joken;

import java.util.Random;
import java.util.Scanner;

public class JokenPo {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int nJogos;
		int cont = 1;

		System.out.println("J O K E N P O");

		System.out.println("Quantas partidas: ");
		nJogos = leitor.nextInt();

		System.out.println("Pedra = 1");
		System.out.println("Papel = 2");
		System.out.println("Tesoura = 3");

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
				} else if (((nUsuario == 3 && nSorteado == 1) || (nUsuario == 1 && nSorteado == 2)
						|| (nUsuario == 2 && nSorteado == 3))) {
					System.out.println("Pc Ganhou!! ");
				}
			} else {
				System.out.println("O Numero que você digitou não é elegivel");
			}
		}
		leitor.close();
	}
}
