import java.util.Scanner;

public class hipotenus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci kenar:");
		double a = scanner.nextDouble();
		
		System.out.print("Ikinci kenar:");
		double b = scanner.nextDouble();
		
		double hptns = Math.sqrt(a*a + b*b);//hazır mat kütüphanesi kök alma fonksiyonu.
		
		System.out.print("Hipotenüs uzunlugu: " + hptns );
		

	}

}
