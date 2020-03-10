package br.fai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		Main app = new Main();
		app.start();

	}

	private Scanner scanner = new Scanner(System.in); // varivavel global

	private final String VALOR_INVALIDO = "Valor_Invalido";

	private void start() {

		List<String> lista = new ArrayList<String>();

		// String valorRecebido = obterDados();
		// System.out.println("O valor recebido foi: " + valorRecebido);

		while (lista.size() < 5) {
			String valorRecebido = obterDados();

			if (valorRecebido.isEmpty() || valorRecebido.contentEquals(VALOR_INVALIDO)) {
				System.out.println("Este valor foi descartado");

			} else {
				lista.add(valorRecebido);
			}

			System.out.println("------------");

		}

		for (String item : lista) {
			System.out.println("O item da lista eh: " + item);
		}

		lista.add("O item add automaticamente 01");
		lista.add("O item add automaticamente 02");

		lista.remove(1);
		lista.remove(2);

		for (String item : lista) {
			System.out.println("Novos valores: " + item);
		}

	}

	private String obterDados() {
		try {

			System.out.print("Digite o valor: ");
			int valor = scanner.nextInt();
			return String.valueOf(valor);

		} catch (Exception e) {
			// lugar para colocar o que retornar em caso de erro
			scanner.next();
			return VALOR_INVALIDO;
		}

	}

}
