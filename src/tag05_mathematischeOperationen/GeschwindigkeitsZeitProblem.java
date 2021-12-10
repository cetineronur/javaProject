package tag05_mathematischeOperationen;
import java.util.Scanner;
public class GeschwindigkeitsZeitProblem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geschwindigkeit eingeben:");
		double hiz=scan.nextInt();
		System.out.print("Geben Sie die km der Straße ein, die Sie fahren werden: ");
		double yol=scan.nextInt();
		//double zaman=(double)yol/hiz;
		System.out.println("sure: "+(yol/hiz*60)+" minute.");
		scan.close();
	}
}
