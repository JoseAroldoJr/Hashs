package funcaoHash;

public class Teste {

	public static void main(String[] args) {

		HashSemCol h = new HashSemCol();

		h.inserir(5, 12);
		h.inserir(3, 10);

		System.out.println(h.getValue(3));
		System.out.println(h.getValue(5));
		h.inserir(104, 28);
		System.out.println(h.getValue(3));
	}

}
