package Exe11;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
	var ler = new Scanner (System.in);
		
	ArrayList<BackEnd>listaBackend = new ArrayList<BackEnd>();
	ArrayList<FrontEnd>listaFrontend = new ArrayList<FrontEnd>();
		
	int qtd;
	String opcao;
		
		
	System.out.printf("Deseja cadastrar quantas tecnologias? ");
	qtd = ler.nextInt();
		
	for(int i=0; i < qtd; i++) {
		System.out.printf("Deseja cadastrar: Frontend ou Backend? ");
		opcao = ler.next();
		opcao = opcao.replaceAll("\\s+","");
		opcao = opcao.toUpperCase();
				
	if(opcao.equals("BACKEND") || opcao.equals("BACK")) {						
			BackEnd b = new BackEnd();
					
			System.out.printf("Digite a linguagem de programacao: ");
			String lingProgramacao = ler.next();
			b.setLingProgramacao(lingProgramacao);
					
			System.out.printf("Digite um framework: ");
			String princFramework = ler.next();
			b.setPrincFramework(princFramework);
					
			System.out.printf("Digite uma descrição da linguagem: ");
			String descLinguagem = ler.next();
			b.setDescLinguagem(descLinguagem);
					
			System.out.printf("Digite uma descrição do framework: ");
			String descFramework = ler.next();
			b.setDescFramework(descFramework);
								
			System.out.printf("Faz conteinirização: Sim/Nao ");
			String cont=ler.next();
			
					cont.toUpperCase();	
					
			if(cont.equals("SIM")) {
				b.setConteinerizar(true);
				listaBackend.add(b);
				
			}
			else {
			
				
			}
							
			listaBackend.add(b);	
		} else if (opcao.equals("FRONTEND") || opcao.equals("FRONT")) {							
			FrontEnd f = new FrontEnd();								
		 	System.out.printf("Digite a linguagem de programacao: ");
			String lingProgramacao = ler.next();
			f.setLingProgramacao(lingProgramacao);
								
			System.out.printf("Digite um framework: ");
			String princFramework = ler.next();
			f.setPrincFramework(princFramework);
								
			System.out.printf("Digite uma descrição da linguagem: ");
			String descLinguagem = ler.next();
			f.setDescLinguagem(descLinguagem);
								
			System.out.printf("Digite uma descrição do framework: ");
			String descFramework = ler.next();
			f.setDescFramework(descFramework);
								
			System.out.printf("É compatível com Web ou é compatível com Mobile? \n");
			String resp=ler.next();
			
			resp = resp.toUpperCase();
			
			if (resp.equals("WEB")) {									
				f.setCompatibilidadeWeb(true);
				f.setCompatibilidadeMobile(false);
				
			} else {
				f.setCompatibilidadeWeb(false);
				f.setCompatibilidadeMobile(true);
			}	
			
			listaFrontend.add(f); 
		}
		else {							
				System.out.print("Linguagem não encontrada!");
			}
	    
	}	
	for( BackEnd b : listaBackend) {
		System.out.printf("Linguagem: %s \nFramework: %s \nDescrição da Linguagem: %s \nDescrição do framework: %s \nConteinirização: %b", b.getLingProgramacao(),b.getPrincFramework(),b.getDescLinguagem(),b.getDescFramework(), b.getConteinerizar());
    }	
	for( FrontEnd f : listaFrontend) {
		System.out.printf("Linguagem: %s \nFramework: %s \nDescrição da Linguagem: %s \nDescrição do framework: %s \nCompatibilidade %b", f.getLingProgramacao(),f.getPrincFramework(),f.getDescLinguagem(),f.getDescFramework(), f.getCompatibilidadeWeb(), f.getCompatibilidadeMobile());						
	}						
  }
}

