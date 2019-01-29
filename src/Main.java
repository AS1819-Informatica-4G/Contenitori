
public class Main {
	public static void main(String[] args) {
		Contenitore<Integer> ciccio=new ContenitoreLista();
		
	
	
		ciccio.add(4);
		ciccio.add(5);
		ciccio.add(6);
		ciccio.add(7);
		System.out.println(ciccio.get(2));
		ciccio.remove(2);
		System.out.println(ciccio.get(2));
	}

}
