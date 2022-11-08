public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        tree.insert(tree.getRoot(), 5);
        tree.insert(tree.getRoot(), 3);
        tree.insert(tree.getRoot(), 7);
        tree.insert(tree.getRoot(), 6);
        tree.insert(tree.getRoot(), 4);
        tree.insert(tree.getRoot(), 0);

        Object no1 = (tree.search(tree.getRoot(), 10));
        Object no2 = (tree.search(tree.getRoot(), 0));

        //espera-se output:
        //null
        //(endereço de memória do nó 0)
        System.out.println(no1);
        System.out.println(no2);

    }
}