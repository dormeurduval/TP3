import java.awt.List;
import java.util.LinkedList;
import java.util.Scanner;

public class AjouterNombre {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		while(true){
			System.out.println("Tapez 1 pour ajouter un nombre ");
			System.out.println("Tapez 2 pour afficher la liste ");
			Scanner questionUser= new Scanner(System.in);
			int number = questionUser.nextInt();
			if(number==1){
				System.out.println("Choisissez le nombre à ajouter");
				number = questionUser.nextInt();
				l.add(number);
			}
			else{
				System.out.println("Liste: ");
				for(int i=0;i<l.size();i++){
					System.out.print(l.get(i)+" ");
				}
				System.out.println();
			}
		}
	}
}
