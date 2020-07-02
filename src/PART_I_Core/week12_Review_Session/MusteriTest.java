package PART_I_Core.week12_Review_Session;

import java.util.Arrays;

public class MusteriTest {

	public static void main(String[] args) {
		
		Musteri Merkez[] = new Musteri[6];
		Musteri Ula[]= new Musteri[5];
		
//		Merkez[0]=new Musteri();
//		Merkez[1]=new Musteri();
//		Ula[0]=new Musteri();
				
		Merkez[0].adi="Ali";
		Merkez[0].TC_Nu=1234567;
		Merkez[1].adi="Veli";
		Merkez[1].TC_Nu=7654321;
		
		System.out.println((Merkez[1].adi));
		System.out.println(Merkez[1].TC_Nu);
		
		Ula[0].adi="deneme";
		System.out.println(Ula[0].adi);
		
//		System.out.println(Ula[0].toString());  // toString i hiç yapmıyor, HATA VERİYOR!!!
		
//		System.out.println(Arrays.deepToString(Musteri[])); neden hata veriyor anlamadim
		

	}

}
