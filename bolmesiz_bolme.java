import java.util.Scanner;

public class bolmesiz_bolme {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bolum = 0;
        double kusurat=0;

        System.out.println("Bölmesiz bölme için birinci sayıyı giriniz:");
        double first = scan.nextDouble();
        System.out.println("Bölmesiz bölme için ikinci sayıyı giriniz:");
        double second = scan.nextDouble();

        double c = first;
        int b=10;

        if (second != 0) {
            while (c >= second) {
                c = c - second;
                bolum++;
               
            }
        } else {
            System.out.println("Hata: İkinci sayı sıfıra bölünemez!");
        }
        double i =bolum*second;
        double kalan =first-i;
        
        for (;kalan==0;kalan=kalan*b) {
        	
        	while(kalan>=second) {
        		kalan=kalan-second;
        		kusurat ++;
        	}
        	
        }
        double sonuc=bolum+(kusurat/b);
        String formattedNumber=String.format("%.2f",sonuc);
    	System.out.println(formattedNumber);
        

        System.out.println("Sonuc: " + sonuc);
    }
}
