package filosofoo;

public class silla {
	private int slibre=4;
	public synchronized void qsilla(int a) throws  InterruptedException{
		while(slibre==0)
			wait();
		System.out.println("filosofo"+a+"  "+"coge una silla");
		slibre--;
	}
	public synchronized void ssilla(int a) {
		slibre++;
		System.out.println("filosofo"+a+"  "+"suelte el tenedor");
		notify();
		
	}


}
