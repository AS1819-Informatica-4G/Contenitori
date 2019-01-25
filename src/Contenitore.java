
public interface Contenitore<T> {
	public boolean add(T o);
	public int size();
	public T get(int i);
	public boolean remove(int i);
}
