package filosofoo;

public class tenedor {
	private int id;
	private boolean libre=true;
	
	public tenedor(int id)
	{
		this.id=id;
	}
	public synchronized void qtenedor(int a) throws InterruptedException
	{
		while(!libre)
			wait();
		System.out.println("filosofo"+a+"  " +" coge el tenedor"+id);
		libre=false;
	}
	public synchronized void stenedor(int a) {
		libre=true;
		System.out.println("filosofo"+a+"  "+"solto el tenedor"+id);
		notify();
	}
	


}
