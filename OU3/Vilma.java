import java.util.*;

class Vilma{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("V�lj mellan l�da 1 eller 2!");
		int box = in.nextInt();
		if(box == 1){
			System.out.println("Vill du gifta dig med mig?");
		}
		else{
			System.out.println("L�t mig spr�cka din fitta!");
		}
	}
}