import java.util.ArrayList;
import java.util.Collections;

public class TestaInteiros {
	public static void main(String[] args) {
		ArrayList<Integer> listaInt1 = new ArrayList<Integer>();
		ArrayList<Integer> listaInt2 = new ArrayList<Integer>();
		ArrayList<String> listaS1 = new ArrayList<String>();
		ArrayList<String> listaS2 = new ArrayList<String>();
		listaInt1.add(20);
		listaInt1.add(50);
		listaInt1.add(0);
		listaInt1.add(-10);
		
		listaInt2.add(20);
		listaInt2.add(50);
		listaInt2.add(0);
		listaInt2.add(2);
		
		listaS1.add("banana");
		listaS1.add("banana");
		listaS1.add("banana");
		listaS1.add("banana");
		
		
		listaS2.add("jabuticaba");
		listaS2.add("batata");
		
		System.out.println(listaInt1);
		Collections.sort(listaInt1);
		System.out.println(listaInt1);
		System.out.println(Collections.binarySearch(listaInt1, -5));
		System.out.println(Collections.disjoint(listaInt1, listaInt2));
		System.out.println(Collections.disjoint(listaS1, listaS2));
		System.out.println(Collections.frequency(listaInt1, 50));
		System.out.println(Collections.min(listaInt1));
		System.out.println(Collections.max(listaInt1));
		Collections.reverse(listaInt1);
		System.out.println(listaInt1);
		System.out.println(Collections.frequency(listaS1, "banana"));
		
		ArrayList<Pessoa> pessoaList = new ArrayList<Pessoa>();
		Pessoa p1 = new Pessoa("Vitor", "123123123", "31/12/1901");
		Pessoa p2 = new Pessoa("Joao", "789789789", "20/07/1994");
		pessoaList.add(p1);
		pessoaList.add(p2);
		System.out.println(pessoaList);
		
		Collections.sort(pessoaList);
		System.out.println(pessoaList);
		p1.compareTo(p2);
	}
}
