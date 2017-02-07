import java.util.Scanner;

public class Proov4{
	public static void main(String[] args){
		int n;
		double a;
		double l;
		Scanner in = new Scanner(System.in);
 
		System.out.println("Sisesta hulknurga nurkade arv: ");
		n = in.nextInt();
		System.out.println("Sisesta hulknurga küljepikkus: ");
		a = in.nextDouble();
		System.out.println("Sisesta värvi kulunorm(m2/l kohta): ");
		l = in.nextDouble();
		Hulknurk3 laud1=new Hulknurk3(n, a);
		System.out.println(laud1.toString());
		System.out.println(laud1.v2rvikulu(l));
	}
}