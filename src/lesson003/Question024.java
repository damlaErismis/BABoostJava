package lesson003;
import java.util.Scanner;
public class Question024 {

	public static void main(String[] args) {
		
		//girilen sayının fakt.
		Scanner scan = new Scanner(System.in);
        int faktoriyel = 1;
         
        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
         
        for(int i = 1; i <= sayi; i++)
        {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(faktoriyel);
	}

}
