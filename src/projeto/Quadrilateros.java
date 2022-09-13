package projeto;

public abstract class Quadrilateros {

	public double raio;
	public double largura;
	public double altura;
	public double base;
	
    public double Raio() {
        return raio;
    }
 
    public void setRaio(int raio) {
        this.raio = raio;
    }
 
    public double getLargura() {
        return largura;
    }
 
    public void setLargura(int largura) {
        this.largura = largura;
    }
 
    public double getAltura() {
        return altura;
    }
 
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }
 
    public void setBase(int base) {
        this.base = base;
    }
 
    Quadrilateros(){
       
    }
   
    Quadrilateros(double raio, double largura, double altura,double base){
        this.raio = raio;
        this.largura = largura;
        this.altura = altura;
        this.base = base;
    }
 
    public abstract void CalcularPerimetro();
   
 
}
