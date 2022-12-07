package DataStructureLab.week11_AVLtree;

public class App {
    public static void main(String[] args) {
        AVL_Tree tree = new AVL_Tree();
        tree.root = tree.insert(tree.root, 15);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

    }
}
