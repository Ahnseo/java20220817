package ch13.book.excersice.p3;

public class Container<K, V> {
	private K key;
	private V value;

	public void set(K k, V v) {
		this.key = k;
		this.value = v;
	}

	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
