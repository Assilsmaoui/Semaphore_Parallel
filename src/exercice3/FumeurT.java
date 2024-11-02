
package exercice3;

public class FumeurT extends Thread {
	public void run() {
		try {
			Test.PA.acquire();/* T en attendre */
			System.out.println("fumeur T fume");
			System.out.println("le fumeurT fumme(Semaphore PA=1) et fumeurA en attente (semaphore TP=0)et fumeurP en attente (semaphore AT=0) et semaphore agent en attente");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Test.S.release();
	}
}
