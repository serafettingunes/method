package method2;



public class Main {

	public static void main(String[] args) {
		String mesaj="Galatasaray";
		System.out.println(mesaj.substring(3,6));
		
		int sonuc=topla(4,5,7,7,10);
		System.out.println(sonuc);
	}
    
	public static int topla(int... sayilar)
	{
		int toplam=0;
		for (int sayi : sayilar) {
			
			toplam=toplam+sayi;
			
			
			
		}
		return toplam;
	}
}
