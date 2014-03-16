package binarytree;

/**
 * 二叉排序树
 * 
 * @author hp
 * 
 * @param <E>
 */
public class BinarySortTree<E> {

	protected BinaryNode<E> root;

	public BinarySortTree() {
		this.root = null;
	}

	public BinarySortTree(BinaryNode<E> p) {
		this.root = p;
	}

	// 查找值为value的节点，非递归查找，查找成功返回p，否则返回null
	public BinaryNode<E> search(E value) {
		if (value == null || !(value instanceof Comparable)) {
			System.out.println("不能比");
			return null;
		}
		Comparable comp = (Comparable) value;
		BinaryNode<E> p = this.root;
		while (p != null && comp.compareTo(p.data) != 0) {
			if (comp.compareTo(p.data) < 0) {
				p = p.left;
			} else {
				p = p.right;
			}
		}
		return p;
	}
	
	public BinaryNode<E> search2(E value){
		return this.search(value, this.root);
	}
	
	//递归查找
	private BinaryNode<E> search(E value, BinaryNode<E> p){
		BinaryNode<E> find = null;
		if (value == null || !(value instanceof Comparable)) {
			System.out.println("不能比");
			return null;
		}
		Comparable com = (Comparable)value;
		if(com.compareTo(p.data) == 0){
			find = p;
		}else if(com.compareTo(p.data) < 0){
			find = search(value, p.left);
		}else{
			find = search(value, p.right);
		}
		
		return find;
	}

	public boolean insert(E value) {
		if (value == null || !(value instanceof Comparable)) {
			return false;
		}
		if (root == null) {
			root = new BinaryNode<E>(value);
			return true;
		}
		return insert(value, root);
	}

	private boolean insert(E value, BinaryNode<E> p) {
		Comparable comp = (Comparable) value;
		int com = comp.compareTo(p.data);
		if (com == 0) {
			return false;
		}
		if (com < 0) {
			if (p.left == null) {
				p.left = new BinaryNode<E>(value);
				return true;
			} else {
				return insert(value, p.left);
			}
		} else {
			if (p.right == null) {
				p.right = new BinaryNode<E>(value);
				return true;
			} else {
				return insert(value, p.right);
			}
		}

	}

}
