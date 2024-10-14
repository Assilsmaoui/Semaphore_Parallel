package prodecteur;

import java.util.concurrent.Semaphore;

public class Principale {
	static int taille =10;
	static int[] tab=new int[taille];
	static Semaphore S=new Semaphore(1);
	static Semaphore nbplaceVide=new Semaphore(10);
	static Semaphore nbplaceplein=new Semaphore(0);
	public static void main(String[]args) {
		Consomateur c1= new Consomateur();
		Consomateur c2= new Consomateur();
		Consomateur c3= new Consomateur();
		Consomateur c4= new Consomateur();
		Consomateur c5= new Consomateur();
		Prodecteur p1=new Prodecteur();
		Prodecteur p2=new Prodecteur();
		Prodecteur p3=new Prodecteur();
		Prodecteur p4=new Prodecteur();
		Prodecteur p5=new Prodecteur();
		
		p1.start();
		c2.start();
		p2.start();
		c2.start();
		p3.start();
		c3.start();
		p4.start();
		c4.start();
		p5.start();
		c5.start();
		try {
		p1.join();
		c1.join();
		p2.join();
		c2.join();
		p3.join();
		c3.join();
		p4.join();
		c4.join();
		p5.join();
		c5.join();
		}catch(Exception e) {}
	
	}

}
