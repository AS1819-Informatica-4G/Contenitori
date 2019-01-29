
public class ContenitoreLista<T> implements Contenitore<T> {

	private class Elemento<T> {
		private Elemento succ;
		private Elemento prec;
		private T dato;
		
		public Elemento getSucc() {
			return succ;
		}
		public void setSucc(Elemento succ) {
			this.succ = succ;
		}
		public Elemento getPrec() {
			return prec;
		}
		public void setPrec(Elemento prec) {
			this.prec = prec;
		}
		public T getDato() {
			return dato;
		}
		public void setDato(T dato) {
			this.dato = dato;
		}
		
	}
	
	private Elemento testa;
	private int size;
	
	public ContenitoreLista() {
		testa = null;
		size=0;
	}
	
	@Override
	public boolean add(T o) {
		Elemento<T> elemento=new Elemento();
		elemento.setDato(o);
		elemento.setSucc(null);
		elemento.setPrec(null);
		if ( testa == null) {
			testa=elemento;
		} else {
			Elemento<T> temp;
			for ( temp=testa; temp.getSucc()!=null; temp=temp.getSucc()) ;
			temp.setSucc(elemento);
			elemento.setPrec(temp);
		}
		size++;
		return true;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public T get(int i) {
		return getElemento(i).getDato();
 	}

	public Elemento<T> getElemento(int i) {
		if ( i > size) {
			return null;
		}
		Elemento<T> temp;
		int c;
		for (temp=testa, c=0; c<i; c++, temp=temp.getSucc());
		return temp;
 	}
	
	@Override
	public boolean remove(int i) {
	    if (i==0) {
	    	testa=testa.getSucc();
	    } else {
	    	Elemento<T> temp=getElemento(i);
	    	temp.getPrec().setSucc(temp.getSucc());
	    }
		return false;
	}

}
