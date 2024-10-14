package Ecercice2;

public class Boulanger extends Thread {
	static int in;
public void run() {
	//section critique
	try {
		Test.nbplaceVide.acquire();
		Test.S.acquire();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	deposer();//deposer 1 baguette
	Test.S.release();
	Test.nbbagdispo.release();
	
}
void deposer() {
	//fabriquer une bag
	Baguette b=new Baguette();
	//placer la bag dans le panier
	Test.panier[in]=b;
	System.out.println("boulanger depose une bag");
	//incrimenter in
	in=(in+1)%Test.taille;
}
//2.panier plain=> boulanger en attente
}
