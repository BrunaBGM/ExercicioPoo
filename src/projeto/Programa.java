package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Circulo> listaCirculos = new ArrayList<>();
		ArrayList<Quadrado> listaQuadrados = new ArrayList<>();
		ArrayList<Retangulo> listaRetangulos = new ArrayList<>();
		
		int qtd;
		int i = 0;
		double raio;
		String opcao;
		
		
		System.out.printf("Quantas formas deseja criar?");
		qtd=ler.nextInt();
		
		
		
	       
		do {
			System.out.printf("Deseja criar: circulo,quadrado ou retangulo?");
			opcao=ler.next();
					
			if(opcao == "circulo") {
				
				Circulo c = new Circulo();
				
				System.out.printf("Digite o tamanho do raio: ");
				raio=ler.nextInt();
				

				listaCirculos.add(c);

				i++;
					
			}else if(opcao == "quadrado") {
				System.out.printf("Digite o tamanho do raio: ");
				i++;
			}
		}while(i <= qtd);
	

	}

public void Teste() {
	
}
}
