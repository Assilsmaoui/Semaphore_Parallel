package prodecteur;

import java.security.Principal;

public class Consomateur extends Thread {
	static int out=0;
	
public void run() {
	try {
		Principale.S.acquire(); //acquire lancer la section critique 
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	prelever();
	Principale.S.release();//incrimenter 1
	
}
public void prelever() {
	
	//acceder a la case out
	//recuperer l'element
	int y=Principale.tab[out];
	//incrimenter l'indice
	out=(out+1)%Principale.taille;
	System.out.println("le consomateur prelever "+out);
	//1.Ex Mutelle prod et consomateur ne peuvent acceder en tampon
	//
	//
}
}
