import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, column;
		System.out.println("May�n Tarlas�na Ho� Geldiniz ! ");
		System.out.println("L�tfen oynamak istedi�iniz boyutlar� giriniz ! ");
		//System.out.println("Sat�r Say�s� : ");
		//row= scan.nextInt();
		//System.out.println("S�tun Say�s� : ");
		//column= scan.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(2,2);
		mayin.run();
	}

}
