package Ecercice2;

public class Vendeur extends Thread {
	int n;
	static int out; 
	public Vendeur(int n) {
		this.n=n;
	}
	public void run() {
		try {
			Test.nbbagdispo.acquire(n);
			Test.S.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//section critique
		Baguette[] paquet=vendre();//vender n baguette
		Test.S.release();
		Test.nbplaceVide.release(n);//nbplaceVide=nbplaceVide+n
	}
	Baguette[] vendre()
	 {
		 Baguette[] paquet=new Baguette[n];
		 for(int i=0;i<n;i++) {
			 paquet[i]=Test.panier[(out+i)%Test.taille];
			 System.out.println("le panier de "+i+"dans "+paquet[i]);
		 }
		 out=(out+n)%Test.taille;
		 System.out.println("vendeur retour "+out+" baguette");
		 return paquet;
		//retourner n  bag 
	}
	//1.EX mutuelle entre boulangeret vendeur
	//2.panier plain=> boulanger en attente
	//3.panier ne contient pas n bag=>vendeur en attente 
	}