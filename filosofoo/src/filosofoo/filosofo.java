package filosofoo;



public class filosofo  {
	public static void main(String[] args) {
		silla s=new silla();
		tenedor[] tenedores=new tenedor[5];
		for(int a=0;a<tenedores.length;a++) {
			tenedores[a]=new tenedor(a);
		}
		comensal[]comensales=new comensal[5];
		for(int a=0;a<comensales.length;a++)
		{
			comensales[a]=new comensal(a,tenedores[a],tenedores[(a+1)%5],s);
		}
		for(int a=0;a<comensales.length;a++) {
			comensales[a].start();
		}
	}


}
