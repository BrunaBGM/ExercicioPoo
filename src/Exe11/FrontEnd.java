package Exe11;

public class FrontEnd extends Tecnologias implements Linguagem {

	protected boolean compatibilidadeWeb;
	protected boolean compatibilidadeMobile;
	
	
	public boolean getCompatibilidadeWeb() {
		return compatibilidadeWeb;
	}
	
	public void setCompatibilidadeWeb(boolean compatibilidadeWeb) {
		this.compatibilidadeWeb=compatibilidadeWeb;
	}
	
	public boolean getCompatibilidadeMobile() {
		return compatibilidadeMobile;
	}
	
	public void setCompatibilidadeMobile(boolean compatibilidadeMobile) {
		this.compatibilidadeMobile=compatibilidadeMobile;
	}
	
	public FrontEnd() {
		
	}
	
	public FrontEnd(String lingProgramacao,String princFramework,String descLinguagem,String descFramework,boolean compatibilidadeWeb, boolean compatibilidadeMobile) {
			super(lingProgramacao,princFramework,descLinguagem, descFramework);
			this.compatibilidadeWeb=compatibilidadeWeb;
			this.compatibilidadeMobile=compatibilidadeMobile;
	
	}
	
	@Override
	public void DescricaoLinguagem() {
		
		
	}

	@Override
	public void DescricaoFramework() {
		
		
	}

}
