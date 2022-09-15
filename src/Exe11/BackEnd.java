package Exe11;

public class BackEnd extends Tecnologias implements Linguagem{
	
	 protected boolean conteinerizar;
	
	
	public boolean getConteinerizar() {
		return conteinerizar;
	}
	
	public void setConteinerizar(boolean conteinerizar) {
		this.conteinerizar=conteinerizar;
	}
	
	public BackEnd() {
		
	}
	
	public BackEnd(String lingProgramacao,String princFramework, String descLinguagem, String descFramework,boolean conteinerizar) {
		super(lingProgramacao,princFramework,descLinguagem, descFramework);
		this.conteinerizar=conteinerizar;
	}
	
	@Override
	public void DescricaoLinguagem() {
		
		
	}

	@Override
	public void DescricaoFramework() {

		
	}

}
