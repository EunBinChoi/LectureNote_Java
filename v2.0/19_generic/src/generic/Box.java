package generic;

// ���ʸ� ����
// <T>: T�� Ÿ�� �Ķ���� (T, K, V, R, E)
// T: type
// K: key
// V: value
// R: return type 
// E: element (�迭����)

public class Box<T> {
	private T item; 
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
}