public class ArvBinBusca <T extends Comparable<T>>{
    Node root;
    private class Node <T extends Comparable<T>>{
        T key;
        Node right;
        Node left;
        private Node (T key){
            this.key = key;
            this.right = null;
            this.left = null;
        }

        public T getKey() {
            return key;
        }

        public void setKey(T key) {
            this.key = key;
        }
    }


    public ArvBinBusca(T key){
        Node root = new Node(key);
        this.root = root;

    }

    public Node search(Node current, T key){
        if (current == null || current.key.compareTo(key) == 0)
            return current;
        return current.key.compareTo(key) < 0
                ? search(current.left, key)
                : search(current.right, key);
    }
    public void insert (Node root, T key){
        Node newNode = new Node(key);
         Node x = this.root;
         Node y = null;

         while (x != null){
             y = x;
             if (x.key.compareTo(key) > 0)
                 x = x.left;
             else
                 x = x.right;
         }
         if (y == null) {
             this.root = newNode;
         }
         else if (y.key.compareTo(key) > 0)
             y.left = newNode;
         else y.right = newNode;

    }
}

