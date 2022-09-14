package Exe11;

public class FrontEnd extends Tecnologias implements Linguagem {

	String web;
	String mobile;
	
	public FrontEnd(String web , String mobile) {
		
		setWeb(web);
		setMobile(mobile);
		
	}
	
	public String getWeb() {
		return web;
	}
	
	public void setWeb(String web) {
		this.web=web;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile=mobile;
	}
	
	@Override
	public void DescricaoLinguagem() {
		
		
	}

	@Override
	public void DescricaoFramework() {
		
		
	}

}
