/**
 * 
 */
package binarytree;

/**
 * @author hp
 *
 */
public class TreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//构造叶子C
		BinaryNode<String> c = new BinaryNode<String>("C",null,null);
		BinaryNode<String> d = new BinaryNode<String>("D",null,null);
		BinaryNode<String> f = new BinaryNode<String>("F",null,null);
		
		BinaryNode<String> e = new BinaryNode<String>("E", f, null);		
		BinaryNode<String> b = new BinaryNode<String>("B", c, d);
		
		//根节点a
		BinaryNode<String> a = new BinaryNode<String>("A", b, e);
		
		//构造二叉树
		BinaryTree<String> tree = new BinaryTree<String>(a);
		
		//先序遍历
		System.out.println();
		tree.preOrder();
		
		//中序遍历
		System.out.println();
		tree.inOrder();
		
		//后序遍历
		System.out.println();
		tree.postOrder();
		
		System.out.println();
		System.out.println("二叉树节点数为：" + tree.getCountNode());
		
		//查找E
		System.out.println();
		BinaryNode<String> result = tree.search("E");
		System.out.println("查询结果是:" + result);
		
		System.out.println();
		BinaryNode<String> parentNode = tree.getParentNode(d);
		System.out.println("父类节点:" + parentNode);
		
		
		String[] preorder = {"A", "B", "D", null, "G", null, null, null, "C", "E", null, null, "F", "H"};
		BinaryTree<String> btree = new BinaryTree<String>(preorder);
		System.out.println("先序遍历：");
		btree.preOrder();
		
		BinaryNode<String> find = btree.search("H");
		if(find != null){
			BinaryNode<String> parent = btree.getParentNode(find);
			System.out.println("祖先节点是:");
			while(parent != null){
				System.out.println(" " + parent.data);
				parent = btree.getParentNode(parent);
			}
		}else{
			System.out.println("未找到");
		}
		
		
		//添加左节点
		tree.insert(b, "G");
		tree.preOrder();
	}

}
