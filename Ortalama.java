import java.util.Scanner;

public class Ortalama {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		double a=0;
		double toplam=0;
		
     	for(int i=0;i<10;i++) {
     		System.out.println("Ortalamasını istediğiniz sayıları giriniz:");
     	    a = scan.nextInt();
     	    toplam=toplam +a;
     	    
     	}
     	a = toplam /10  ;
     	System.out.println("Ortalama:"+a);	
     	}
     	

	}


