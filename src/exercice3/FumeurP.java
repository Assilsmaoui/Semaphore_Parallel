package exercice3;

public class FumeurP extends Thread{
	public void run() {
		try {
			Test.AT.acquire();/* P en attendre */
			System.out.println("Le fumeur P fumme");
			System.out.println("le fumeurP fumme(Semaphore AT=1) et fumeurT en attente (semaphore AP=0)et fumeurA en attente (semaphore TP=0) et semaphore agent en attente");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Test.S.release();
	}
}
