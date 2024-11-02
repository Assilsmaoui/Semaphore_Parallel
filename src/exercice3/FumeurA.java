package exercice3;

public class FumeurA extends Thread {
public void run() {
	try {
		Test.TP.acquire();/* A en attendre */
		System.out.println("le fumeurA fumme");
		System.out.println("le fumeurA fumme(Semaphore TP=1) et fumeurT en attente (semaphore AP=0)et fumeurP en attente (semaphore AT=0) et semaphore agent en attente");
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Test.S.release();
}
}
