package prodconglid;

public class Principale {

	public static void main(String[] args) {
	Client c1=new Client();
	Client c2=new Client();
	c1.start();
	c2.start();
	try {
	c1.join();
	c2.join();
	}catch(Exception e) {}
	System.out.println("nb place"+Client.nbp);

	}

}
