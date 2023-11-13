import java.util.Scanner;

public class BKI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Boyunuzu giriniz:");
		double boy = scanner.nextDouble();
		
		System.out.println("Kilonuzu giriniz:");
		double kilo =scanner.nextInt();
		
		double bki = kilo / (boy * boy) ;
		System.out.println("Beden Kitle Indeksiniz: "+bki);
		
		

	}

}
