package exercice3;

public class Agent extends Thread {
char [] ing= {'A','T','P'};
public void run() {
	try {
		Test.S.acquire();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
int x=(int)(Math.random()*3);
int y=(int)(Math.random()*3);
while(x==y)
{
	y=(int)(Math.random()*3);
}
char a=ing[x];
char b=ing[y];
if((a=='T'&&b=='P') || (a=='P'&& b=='T')) {
	
System.out.println("l'agent genre T et P");
	Test.TP.release();/* T et P en attente */
}
if((a=='A'&&b=='P') || (a=='P'&& b=='A')) {
	
System.out.println("l'agent genre A et P");
	Test.PA.release();/* T et P en attente */
}
if((a=='A'&&b=='T') || (a=='T'&& b=='A')) {
	
System.out.println("l'agent genre A et T");
	Test.AT.release();/* T et P en attente */
}

}
}
