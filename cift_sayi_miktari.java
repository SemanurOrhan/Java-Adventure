import java.util.Scanner;

public class cift_sayi_miktari {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int b =0;
		int sayac=0;
		
		for(int i=0;i<10;i++) {
		System.out.println("Sayiyi giriniz:");
		b=scan.nextInt();
		if(b%2==0) {
			System.out.println(""+b +" cift sayidir.");
			sayac++;
		}else {
			System.out.println(""+b +" tek sayidir.");
		}
			
		}
		System.out.println("Cift eleman sayisi: "+sayac);
	}

}
