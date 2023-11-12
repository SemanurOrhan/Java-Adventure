public class Account {
	private String HesapNo;
	private double Bakiye;
	private String Isim;
	private String EMail;
	private String TelefonNo;
	
	public Account() {
		
		System.out.println("Kendi yaptığımız Constructor....");
	}
	public Account(String HesapNo,double Bakiye,String Isim,String EMail, String TelefonNo) {
		
		this.HesapNo = HesapNo;
		this.Bakiye = Bakiye;
		this.Isim = Isim;
		this.EMail = EMail;
		this.TelefonNo = TelefonNo;
		
		
	}
	
	public void paraYatir(double miktar){
		Bakiye += miktar;
		System.out.println("Yeni bakiye:"+Bakiye);
		
	}
	
	public void paraCekme(double miktar) {
		if(miktar>1500) {
			System.out.println("Bir günde 1500$'dan fazla çekemezsiniz!");
			
		}
		if(Bakiye-miktar<0) {
			System.out.println("Yeterli bakiye yok! Mevcut bakiyeniz:"+Bakiye);
		}else {
			Bakiye -= miktar;
			System.out.println("Yeni bakiye:"+Bakiye);
			
		}
		
	}
	
	
	public String getHesapNo() {
		return HesapNo;
	}
	public void setHesapNo(String hesapNo) {
		this.HesapNo = hesapNo;
	}
	public double getBakiye() {
		return Bakiye;
	}
	public void setBakiye(double bakiye) {
		this.Bakiye = bakiye;
	}
	public String getIsim() {
		return Isim;
	}
	public void setIsim(String isim) {
		this.Isim = isim;
	}
	public String geteMail() {
		return EMail;
	}
	public void seteMail(String eMail) {
		this.EMail = eMail;
	}
	public String getTelefonNo() {
		return TelefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.TelefonNo = telefonNo;
	}

}
