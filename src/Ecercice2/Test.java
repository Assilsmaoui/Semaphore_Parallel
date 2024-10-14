package Ecercice2;
import java.util.*;
import java.util.concurrent.Semaphore;
public class Test {
static int taille=10;
//tableau de baguette
static Baguette[] panier=new Baguette[taille];
static Semaphore S=new Semaphore(1);
static Semaphore nbplaceVide=new Semaphore(taille,true);
static Semaphore nbbagdispo=new Semaphore(taille,true);
public static void main(String[]args) {

	//creation des instances de thread
	//lancement des threads parallele 
	Boulanger b1 =new Boulanger();
	Boulanger b2 =new Boulanger();
	Vendeur v1=new Vendeur(5);
	Vendeur v2=new Vendeur(2);
	b1.start();
	b2.start();
	v1.start();
	
}
}
