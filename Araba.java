
public class Araba {

	private String renk;
	private int kapılar;
	private int tekerlekler;
	private String motor;
	private String model;
	
	
	public void setModel(String model) {//static kullanmıyoruz çünkü burda metotlar nesneye özgü olmalı.
		
		this.model=model;//this.model dediğimizde yukarıdaki modeli, burdaki modele eşitlemiş oluyoruz.
		//isimleri farklı olsaydı gerek yoktu.
		
	}
	public String getModel() {
		return this.model;
		
	}

}
//bu dosya için bir tane setırgetır metotlar ile her biri için bu eşitlemeyi yapmadan hızlıca bunu javaya yaptırabiliyoruz.

//sağ tık,source , generate getters and setters, diğerlerinde oluşturmak istediklerimizi seçiyoruz ,generate ve oluştu.