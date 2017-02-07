import java.util.Scanner;

public class Proov3{
	public static void main(String[] args){
		int n;
		double a;
		Scanner in = new Scanner(System.in);
 
		System.out.println("Sisesta hulknurga nurkade arv: ");
		n = in.nextInt();
		System.out.println("Sisesta hulknurga küljepikkus: ");
		a = in.nextDouble();
		Hulknurk laud1=new Hulknurk(n, a);
		System.out.println(laud1.toString());
	}
}