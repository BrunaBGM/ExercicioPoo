package Exe11;

import java.util.ArrayList;
import java.util.Scanner;

import projeto.Circulo;

public class Programa {

	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		ArrayList<BackEnd>listaBackend = new ArrayList<BackEnd>();
		ArrayList<FrontEnd>listaFrontend = new ArrayList<FrontEnd>();
		
		int qtd;
		String opcao;
		
		System.out.printf("Deseja cadastrar quantas tecnologias? ");
			qtd=ler.nextInt();
			
			for(int i=0; i < qtd; i++) {
				
				System.out.printf("Deseja cadastrar: Frontend ou Backend? ");
					opcao=ler.next();
					opcao = opcao.replaceAll("\\s+","");
					opcao = opcao.toUpperCase();
					
					if(opcao.equals("BACKEND")) {
						
						System.out.printf("Digite a linguagem de programacao: ");
						String lingProgramacao = ler.next();
						
						System.out.printf("Digite um framework: ");
						String princFramework = ler.next();
						
						System.out.printf("Digite uma descrição da linguagem: ");
						String descLinguagem = ler.next();
						
						System.out.printf("Digite uma descrição do framework: ");
						String descFramework = ler.next();
						
						BackEnd backend = new BackEnd();				
						listaBackend.add(backend);
						
					}else if(opcao.equals("FRONTEND")) {
							
							System.out.printf("Digite a linguagem de programacao: ");
							String lingProgramacao = ler.next();
							
							System.out.printf("Digite um framework: ");
							String princFramework = ler.next();
							
							System.out.printf("Digite uma descrição da linguagem: ");
							String descLinguagem = ler.next();
							
							System.out.printf("Digite uma descrição do framework: ");
							String descFramework = ler.next();
							
							//FrontEnd frontend = new FrontEnd();				
							//listaFrontend.add(frontend);
						
					}else {
						
					}
					
			}
			
	}
}


