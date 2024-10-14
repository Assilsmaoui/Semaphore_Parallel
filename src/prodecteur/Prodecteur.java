package prodecteur;

public class Prodecteur extends Thread {
	static int in=0;
public void run() {
	//if tampn plein =>attendre
	//else
	try {
		Principale.nbplaceVide.acquire();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ajouter();
	Principale.S.release();
	Principale.nbplaceplein.release();
}
public void ajouter(){
	int x=(int)(Math.random()*100);
	Principale.tab[in]=x;
	System.out.println("le prod depse"+x);
	in=(in+1)%Principale.taille;
}
}
