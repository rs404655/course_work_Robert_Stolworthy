import java.util.*;

public class MinHeap {
	
	private ArrayList<Integer> tree;
	
	public MinHeap() {
		
		tree = new ArrayList<Integer>();
		
	}
	
	public void add(int e) {
		
		tree.add(e);
		
		reheapUpward(tree.size() - 1);
		
	}
	
	public void reheapUpward(int i) {
		
		int pos = i;
		
		if(pos <= 0) return;
		
		else {
			
			int parent = (pos - 1)/2;
		
			if(tree.get(pos) < tree.get(parent)) {
				
				int temp = tree.get(parent);
				tree.set(parent, tree.get(i));
				tree.set(pos, temp);
				reheapUpward(parent);
			}
			
			
			
		}
		
	}
	
	public int remove() {
		
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		int ans;
		
		if (tree.size() == 1) {
			
			ans = tree.get(0);
			tree.set(0, null);
			
		}
		
		else {
			ans = tree.get(0);
		
			tree.set(0, tree.get(tree.size() - 1));
	
			tree.remove(tree.size() - 1);
			
			reheapDown(0);
			
		}
		
		return ans;
		
	}
	

	
	public void reheapDown(int i) {
		
		int pos = i;
		int lchild = 2 * i + 1;
		int rchild = 2 * i + 2;
		int index;
		
		if (pos >= tree.size()) return;
		
		if(rchild >= tree.size()) {
			if(lchild >= tree.size()) {
				
				return;
				
			}
			
			else {
				
				index = lchild;
				
			}
			
		}
		
		else {
			if (tree.get(lchild) <= tree.get(rchild)) {
				
				index = lchild;
				
			}
			
			else {
				
				index = rchild;
				
			}
			
		}	
		
		if(tree.get(pos) > tree.get(index)) {
				
			int temp = tree.get(index);
			tree.set(index, tree.get(pos));
			tree.set(pos, temp);
			reheapDown(pos);
			
				
		}
			
			
		
		
	}
	
	public int top() {
		
		return tree.get(0);
		
	}
	
	public static void main(String[] args) {
		
		MinHeap tree1 = new MinHeap();
		
		tree1.add(22);
		
		tree1.add(17);
		
		tree1.add(28);
		
		tree1.add(32);
		
		tree1.add(34);
		
		System.out.println(tree1.tree.get(0));
		System.out.println(tree1.tree.get(1));
		System.out.println(tree1.tree.get(2));
		System.out.println(tree1.tree.get(3));
		System.out.println(tree1.tree.get(4));
		
		System.out.println(tree1.top() + " " + tree1.tree.size());
		
		System.out.println(tree1.remove() + " " + tree1.tree.size() + " " + tree1.top());
		
		System.out.println(tree1.tree.get(0));
		System.out.println(tree1.tree.get(1));
		System.out.println(tree1.tree.get(2));
		System.out.println(tree1.tree.get(3));
	}

}
