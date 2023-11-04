import java.util.Scanner;

public class asal_sayi_kontrolu {

	public static void main(String[] args) {
		
	Scanner scanner =new Scanner(System.in); 
	int bolunenSayisi=0;

	System.out.println("Bir pozitif sayi giriniz:");
	int sayi=scanner.nextInt();
	
	if (sayi>1) {
		
		for (int i=2 ; i < sayi ; i++ ){
			
			if(sayi%i==0) {
				bolunenSayisi++;
				
			}
				
			
		}
		
		if(bolunenSayisi==0){
			System.out.println(sayi+" asal bir sayidir.");}
		else {
			bolunenSayisi = bolunenSayisi + 2;
			System.out.println(sayi+" asal değildir! "+bolunenSayisi+" tane pozitif boleni vardir.");
		}
		
		
	}else {
		System.out.println("Sayi pozitif değildir veya sayi 1'dir!");  }
	
	

	}

	
}


