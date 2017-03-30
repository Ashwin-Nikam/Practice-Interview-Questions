
public class BST {

	Node root;
	public void addNode(int key, String name){
		Node newNode = new Node(key,name);
		if(root==null)
			root = newNode;
		else{
			Node focusNode = root;
			Node parent;
			while(true){
				parent = focusNode;
				if(newNode.key<focusNode.key){
					focusNode = focusNode.left;
					if(focusNode==null){
						parent.left = newNode;
						return;
					}
				}else{
					focusNode = focusNode.right;
					if(focusNode==null){
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrder(Node focusNode){
		if(focusNode!=null){
			inOrder(focusNode.left);
			System.out.println(focusNode);
			inOrder(focusNode.right);
		}
	}
	
	public void postOrder(Node focusNode){
		if(focusNode!=null){
			inOrder(focusNode.left);
			inOrder(focusNode.right);
			System.out.println(focusNode);
		}
	}
	
	public void preOrder(Node focusNode){
		if(focusNode!=null){
			System.out.println(focusNode);
			inOrder(focusNode.left);
			inOrder(focusNode.right);
		}
	}
	
	public Node findNode(int key){
		Node focusNode = root;
		Node parent=null;
		while(key!=focusNode.key){
			parent =focusNode;
			if(key<focusNode.key)
				focusNode = focusNode.left;
			else
				focusNode = focusNode.right;
			if(focusNode==null)
				return null;
		}
		
		return parent;
	}
	
	
	public static void main(String args[]){
		BST bt = new BST();
		bt.addNode(5, "a");
		bt.addNode(2, "b");
		bt.addNode(6, "c");
		bt.addNode(7, "d");
		bt.addNode(1, "e");
		bt.addNode(3, "f");
		//bt.inOrder(bt.root);
		System.out.println(bt.findNode(7));
	}
	
}

class Node{
	int key;
	Node left;
	Node right;
	String name;
	Node(int key,String name){
		this.key = key;
		this.name = name;
	}
	
	public String toString(){
		return name+" has key "+key;
	}
}
