package proekt3;

import java.util.Scanner;
public class Pravoagolnik {

	public static void main(String[] args) {
		double str1, str2, plostina, perimetar;
		java.util.Scanner tastatura = new Scanner(System.in);
		System.out.println("Programata presmetuva povrsina i perimetar.");
		System.out.println("Vnesete dolzina na edna strana: ");
		str1=tastatura.nextDouble();
		System.out.println("Vnesete dolzina na drugata strana: ");
		str2=tastatura.nextDouble();
		plostina=str1*str2;
		perimetar=str1*2+str2*2;
		System.out.println();
		System.out.println("Perimetarot e:"+perimetar);
		//System.out.println(perimetar);
		System.out.println("Plostinata e"+plostina);
		//System.out.println(plostina);
	}
}
