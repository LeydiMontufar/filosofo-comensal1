package filosofoo;


public class comensal extends Thread {
	private int id;
	private tenedor izquierda,derecha;
	private silla s;
	
	public comensal(int id,tenedor izquierda,tenedor derecha,silla s)
	{
		this.id=id;
		this.izquierda=izquierda;
		this.derecha=derecha;
		this.s=s;
	}
	public void run() {
		while(true) {
			try {
				
				
				s.qsilla(id);
				izquierda.qtenedor(id);
				derecha.qtenedor(id);
				
				izquierda.stenedor(id);
				derecha.stenedor(id);
				s.ssilla(id);
				
			}catch(InterruptedException e) {
			e.printStackTrace();
			}
		}
	}


}
