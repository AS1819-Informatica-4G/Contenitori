
public class ContenitoreArray<T> implements Contenitore<T> {
	private T[] x;
	private int pos=0;

	public ContenitoreArray() {
		x=(T[]) new Object[10];
	}
	
	public ContenitoreArray(int s) {
		x=(T[]) new Object[s];
	}
	
	@Override
	public boolean add(T o) {
		if (pos==x.length) {
			T[] newx=(T[]) new Object[x.length+10];
			for (int i=0;i<x.length;i++) {
				newx[i]=x[i];
			}
			x=newx;
		}
		x[pos++]=o;
		return true;
	}

	@Override
	public int size() {
		return pos;
	}

	@Override
	public T get(int i) {
		if (i<pos) return x[i];
		return null;
	}

	@Override
	public boolean remove(int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
