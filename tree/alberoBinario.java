package tree;

public class alberoBinario<T> {
	alberoBinario parent;
	alberoBinario left;
	alberoBinario right;
	T value;
	
	
	public alberoBinario(T value) {
		this.parent = null;
		this.left = this.right = null;
		this.value = value;
	}
	
	
	public alberoBinario left() { return left; }
	public alberoBinario right() { return right; }
	
	public void insertLeft(alberoBinario Tree) {
		if (left == null) {
			Tree.parent = this;
			left = Tree;
		}
	}
	
	public void insertRight(alberoBinario Tree) {
		if (right == null) {
			Tree.parent = this;
			right = Tree;
		}
	}
	
	public void deleteLeft() {
		if(left!= null) {
			left.deleteLeft();
			left.deleteRight();
			left = null;
		}
	}
	
	public void deleteRight() {
		if (right!= null) {
			right.deleteRight();
			right.deleteLeft();
			right = null;
		}
	}
	
}
