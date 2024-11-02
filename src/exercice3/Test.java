package exercice3;

import java.util.concurrent.Semaphore;

public class Test {
 static Semaphore TP=new Semaphore(0);
 static Semaphore PA=new Semaphore(0);
 static Semaphore AT=new Semaphore(0);
 static Semaphore S=new Semaphore(1);/*synchronisation */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Agent a =new Agent ();
			FumeurA fa =new FumeurA();
			FumeurP fp =new FumeurP();
			FumeurT ft =new FumeurT();
			a.start();
			fa.start();
			fp.start();
			ft.start();
		}
	}

}
