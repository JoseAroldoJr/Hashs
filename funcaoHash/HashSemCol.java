package funcaoHash;

public class HashSemCol {

	static int hashMap[];
	int size = 101;

	public int getValue(int key) {
		int pos = funcaoH(key);
		return hashMap[pos];
	}

	public static int funcaoH(int valor) {

		int key = valor % 101;

		return key;
	}

	public static void inserir(int key, int valor) {
		int pos = funcaoH(key);
		hashMap[pos] = valor;
	}

	public HashSemCol() {
		hashMap = new int[size];
	}
}
