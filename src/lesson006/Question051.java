package lesson006;

public class Question051 {

	public static void main(String[] args) {
		// bir dizide ard arda gelen 2 indexdeki sayı değer
		//2 ise true yoksa false yazdıralım
		
		
		int[] sayilar = { 2 , -256 , -256 , 2, 2 , 1258 , 32 };

		boolean kontrol = false;
	       for (int i = 0; i < sayilar.length -1; i++) {
	            if (sayilar[i] == 2 && sayilar[i + 1] == 2) {
	                kontrol = true;
	            }
	        }
	        System.out.println(kontrol);

	}

}
