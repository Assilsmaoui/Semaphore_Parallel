package prodconglid;

import java.util.concurrent.Semaphore;

public class Client extends Thread {
static int nbp=1;
static Semaphore S=new Semaphore(1,true);
public void run() {
	//sc
	/*protocole d'entrer*/
	try {
		S.acquire();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	reserver();
	//protocole de sortie
	S.release();
	
}
void reserver() {
	if(nbp>0) nbp=nbp-1;
}
}
