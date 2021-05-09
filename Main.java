import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, column;
		System.out.println("Mayýn Tarlasýna Hoþ Geldiniz ! ");
		System.out.println("Lütfen oynamak istediðiniz boyutlarý giriniz ! ");
		//System.out.println("Satýr Sayýsý : ");
		//row= scan.nextInt();
		//System.out.println("Sütun Sayýsý : ");
		//column= scan.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(2,2);
		mayin.run();
	}

}
